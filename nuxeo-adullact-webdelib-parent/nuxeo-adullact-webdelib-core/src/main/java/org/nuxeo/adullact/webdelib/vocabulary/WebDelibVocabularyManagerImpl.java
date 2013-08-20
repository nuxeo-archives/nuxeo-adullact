/*
 * (C) Copyright ${year} Nuxeo SA (http://nuxeo.com/) and contributors.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser General Public License
 * (LGPL) version 2.1 which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl-2.1.html
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * Contributors:
 *     Benjamin JALON<bjalon@nuxeo.com>
 */

package org.nuxeo.adullact.webdelib.vocabulary;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.nuxeo.ecm.core.api.ClientException;
import org.nuxeo.ecm.core.api.DocumentModel;
import org.nuxeo.ecm.directory.BaseSession;
import org.nuxeo.ecm.directory.Session;
import org.nuxeo.ecm.directory.api.DirectoryService;
import org.nuxeo.runtime.api.Framework;
import org.nuxeo.runtime.model.ComponentInstance;
import org.nuxeo.runtime.model.DefaultComponent;

/*
 * @since 5.7.2
 */
public class WebDelibVocabularyManagerImpl extends DefaultComponent implements
        WebDelibVocabularyManager {

    private static final Log log = LogFactory.getLog(WebDelibVocabularyManagerImpl.class);

    private static final Object MAPPING_EXT_PT = "vocabularyMapping";

    private Map<String, WebDelibVocabularyMappingConfiguration> confs = new HashMap<String, WebDelibVocabularyMappingConfiguration>();

    public DirectoryService dirService;

    @Override
    public void registerContribution(Object contribution,
            String extensionPoint, ComponentInstance contributor)
            throws Exception {
        if (!MAPPING_EXT_PT.equals(extensionPoint)) {
            log.error("Extension point name unknown: " + extensionPoint);
            return;
        }
        if (!(contribution instanceof WebDelibVocabularyMappingConfiguration)) {
            log.error("Bad descriptor given by the runtime: "
                    + contribution.getClass());
            return;
        }
        WebDelibVocabularyMappingConfiguration mapping = (WebDelibVocabularyMappingConfiguration) contribution;
        if (!mapping.enabled) {
            if (confs.containsKey(mapping.field)) {
                confs.remove(mapping.field);
                return;
            }
        }
        confs.put(mapping.field, mapping);

    }

    @Override
    public void documentAdded(DocumentModel doc) throws ClientException {
        for (WebDelibVocabularyMappingConfiguration conf : confs.values()) {
            documentAdded(doc, conf);
        }
    }

    @Override
    public void documentRemoved(DocumentModel doc) throws ClientException {
        for (WebDelibVocabularyMappingConfiguration conf : confs.values()) {
            documentRemoved(doc, conf);
        }

    }

    public void documentAdded(DocumentModel doc,
            WebDelibVocabularyMappingConfiguration conf) throws ClientException {
        if (!doc.hasSchema(conf.schema)) {
            return;
        }
        String id = (String) doc.getPropertyValue(conf.field);
        if (id == null || id.trim().isEmpty()) {
            log.debug("Empty value found as id, skipped");
            return;
        }
        long ordering = addEntry(conf.directory, id);
        log.debug("Vocabulary entry added " + conf.directory
                + " (entry number/voca): " + ordering + "/" + id);
    }

    public void documentRemoved(DocumentModel doc,
            WebDelibVocabularyMappingConfiguration conf) throws ClientException {
        if (!doc.hasSchema(conf.schema)) {
            return;
        }
        String id = (String) doc.getPropertyValue(conf.field);
        if (id == null || id.trim().isEmpty()) {
            log.debug("Empty value found as id, skipped");
            return;
        }
        long ordering = removeEntry(conf.directory, id);
        log.debug("Vocabulary entry removed " + conf.directory
                + " (entry number/voca): " + ordering + "/" + id);
    }

    private long removeEntry(String directory, String id)
            throws ClientException {
        Session dirSession = getDirService().open(directory);

        if (dirSession == null) {
            throw new ClientException(
                    "Can't open session on followg directory, please "
                            + "check WebDelib Voca Manager configuration: "
                            + directory);
        }

        DocumentModel entry = null;
        try {
            entry = dirSession.getEntry(id);
            if (entry == null) {
                throw new ClientException(
                        "Vocabulary entry never met and remove ask => problem");
            }
            Long ordering = (Long) entry.getPropertyValue("ordering");
            if (ordering < 1) {
                throw new ClientException(
                        "Vocabulary entry met but without coins and remove ask => problem");
            }
            if (ordering == 1) {
                entry.setPropertyValue("obsolete", new Long(1));
            }
            entry.setPropertyValue("ordering", ordering - 1);
            dirSession.updateEntry(entry);
        } finally {
            dirSession.close();
        }
        return (Long) entry.getPropertyValue("ordering");
    }

    private long addEntry(String directory, String id) throws ClientException {
        if (getDirService() == null) {
            log.error("Can't get the directory service, so can't update directory.");
            return -1;
        }
        Session dirSession = getDirService().open(directory);

        if (dirSession == null) {
            log.error(
                    "Can't open session on followg directory, please "
                            + "check WebDelib Vocabulary Manager configuration: "
                            + directory);
            return -1;
        }

        DocumentModel entry = null;
        try {
            entry = dirSession.getEntry(id);
            if (entry == null) {
                String schema = getDirService().getDirectorySchema(directory);
                Map<String, Object> values = new HashMap<String, Object>();
                values.put("id", id);
                values.put("obsolete", new Long(0));
                values.put("ordering", new Long(1));
                values.put("label", id);
                entry = BaseSession.createEntryModel(null, schema, id, values);
                dirSession.createEntry(entry);
            } else {
                Long ordering = (Long) entry.getPropertyValue("ordering");
                entry.setPropertyValue("ordering", ordering + 1);
                entry.setPropertyValue("obsolete", new Long(0));
                dirSession.updateEntry(entry);
            }
        } finally {
            dirSession.close();
        }
        return (Long) entry.getPropertyValue("ordering");
    }

    public DirectoryService getDirService() throws ClientException {
        if (dirService == null) {
            dirService = Framework.getLocalService(DirectoryService.class);
        }
        return dirService;
    }

}
