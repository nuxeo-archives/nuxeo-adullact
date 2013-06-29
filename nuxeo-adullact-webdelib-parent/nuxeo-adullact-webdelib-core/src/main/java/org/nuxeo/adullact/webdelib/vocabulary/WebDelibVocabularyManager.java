/*
* (C) Copyright 2013 Nuxeo SA (http://nuxeo.com/) and contributors.
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

import org.nuxeo.ecm.core.api.ClientException;
import org.nuxeo.ecm.core.api.DocumentModel;

/**
 * @since 5.7.2
 *
 */
public interface WebDelibVocabularyManager {


    public void documentAdded(DocumentModel doc) throws ClientException;

    public void documentRemoved(DocumentModel doc) throws ClientException;

}
