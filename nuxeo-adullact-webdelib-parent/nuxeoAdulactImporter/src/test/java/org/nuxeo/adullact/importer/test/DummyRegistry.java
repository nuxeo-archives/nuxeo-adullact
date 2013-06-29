/*
 * (C) Copyright 2002-2013 Nuxeo SAS (http://nuxeo.com/) and contributors.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser General Public License
 * (LGPL) version 2.1 which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl.html
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * Contributors:
 *     Nuxeo - initial API and implementation
 *
 */

package org.nuxeo.adullact.importer.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.nuxeo.adullact.importer.AttributeConfig;
import org.nuxeo.adullact.importer.DocConfig;
import org.nuxeo.adullact.importer.ParserConfigRegistry;

/**
 * Hard coded config used for testing imported outside of service / extension
 * point infrastructure
 *
 * @author <a href="mailto:tdelprat@nuxeo.com">Tiry</a>
 *
 */
public class DummyRegistry implements ParserConfigRegistry {

    protected List<AttributeConfig> attConfig = null;

    protected List<DocConfig> docConfig = null;

    @Override
    public List<AttributeConfig> getAttributConfigs() {
        if (attConfig == null) {
            attConfig = new ArrayList<AttributeConfig>();

            attConfig.add(new AttributeConfig("titre", "dc:title", "text()",
                    null)); // use xpath
            attConfig.add(new AttributeConfig("dossierActe", "dc:source",
                    "#{'Seance ' + currentDocument.name}", null)); // MVEL

            attConfig.add(new AttributeConfig("document", "dc:title", "@nom",
                    null));
            attConfig.add(new AttributeConfig("document", "dc:source", "@type",
                    null));

            attConfig.add(new AttributeConfig("signature", "dc:format",
                    "@formatSignature", null));

            Map<String, String> complex = new HashMap<String, String>();
            complex.put("filename", "@nom");
            complex.put("mimetype", "mimetype/text()");
            complex.put("content", "@nom");

            attConfig.add(new AttributeConfig("document", "file:content",
                    complex, null));

        }

        return attConfig;
    }

    @Override
    public List<DocConfig> getDocCreationConfigs() {
        if (docConfig == null) {
            docConfig = new ArrayList<DocConfig>();
            docConfig.add(new DocConfig("seance", "Workspace", null,
                    "@idSeance")); // pure xpath

            String findParent = "#{"
                    + "nodes = currentElement.selectNodes('@refSeance');"
                    + "if (nodes.size()>0) {"
                    + "  String seanceRef = nodes.get(0).getText();"
                    + "  String parentRef = '//seance[@idSeance=\"' + seanceRef + '\"]';"
                    + "  return xml.selectNodes(parentRef).get(0);"
                    + " } else {" + "  return root.getPathAsString();" + " }"
                    + "}";

            // xpath resolution inside String + complex MVEL Parent resolution
            docConfig.add(new DocConfig("dossierActe", "Folder", findParent,
                    "Acte-{{@idActe}}"));
            docConfig.add(new DocConfig("document", "File", "..", "@nom"));
        }
        return docConfig;
    }
}
