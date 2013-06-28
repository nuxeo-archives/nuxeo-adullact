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
package org.nuxeo.adullact.webdelib;

/**
 * @since 5.7.1
 *
 */
public class WebDelibConstants {

    public static final String DOC_TYPE_DOMAIN = "WebDelibDomain";

    public static final String DOC_TYPE_STRUCTURE = "WebDelibStructure";

    public static final String DOC_TYPE_SEANCE = "WebDelibSeance";

    public static final String DOC_TYPE_ACTE = "WebDelibActe";

    public static final String DOC_TYPE_SIGNATURE = "WebDelibSignature";

    public static final String DOC_TYPE_ARCHIVE_CONTAINER = "WebDelibArchiveContainer";

    public static final String DOC_TYPE_ARCHIVE = "WebDelibArchive";

    public static final String DOMAIN_NAME = "webdelib-referentiel";

    public static final String DOMAIN_PATH = "/" + DOMAIN_NAME;

    public static final String ARCHIVE_CONTAINER_NAME = "webdelib-archive";

    public static final String ARCHIVE_CONTAINER_PATH = DOMAIN_PATH + "/"
            + ARCHIVE_CONTAINER_NAME;

    public static final String ARCHIVE_ZIP_FIELD = "file:content";

    public static final String STUDIO_SYMBOLIC_NAME = "studio.extensions.adullact-webdelib";

}
