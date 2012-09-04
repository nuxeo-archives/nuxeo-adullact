/*
 * (C) Copyright 2012 Nuxeo SA (http://nuxeo.com/) and contributors.
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
 *     Benjamin JALON
 */
package org.nuxeo.adullact;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

import org.nuxeo.ecm.core.api.Blob;

/**
 * @author <a href="mailto:bjalon@nuxeo.com">Benjamin JALON</a>
 * 
 */
public class AdullactBlob implements Blob {

	private Blob main;

	private Blob signature;

	public AdullactBlob(Blob main, Blob signature) {
		this.signature = signature;
		this.main = main;
	}
	
	public AdullactBlob(Blob main) {
		this(main, null);
	}

	@Override
	public long getLength() {
		return main.getLength();
	}

	@Override
	public String getEncoding() {
		return main.getEncoding();
	}

	@Override
	public String getMimeType() {
		return main.getMimeType();
	}

	@Override
	public String getFilename() {
		return main.getFilename();
	}

	@Override
	public String getDigest() {
		return main.getDigest();
	}

	@Override
	public void setDigest(String digest) {
		main.setDigest(digest);
	}

	@Override
	public void setFilename(String filename) {
		main.setFilename(filename);
	}

	@Override
	public void setMimeType(String mimeType) {
		main.setMimeType(mimeType);
	}

	@Override
	public void setEncoding(String encoding) {
		main.setEncoding(encoding);
	}

	@Override
	public InputStream getStream() throws IOException {
		return main.getStream();
	}

	@Override
	public Reader getReader() throws IOException {
		return main.getReader();
	}

	@Override
	public byte[] getByteArray() throws IOException {
		return main.getByteArray();
	}

	@Override
	public String getString() throws IOException {
		return main.getString();
	}

	@Override
	public void transferTo(OutputStream out) throws IOException {
		main.transferTo(out);
	}

	@Override
	public void transferTo(Writer out) throws IOException {
		main.transferTo(out);
	}

	@Override
	public void transferTo(File file) throws IOException {
		main.transferTo(file);
	}

	@Override
	public Blob persist() throws IOException {
		return main.persist();
	}

	@Override
	public boolean isPersistent() {
		return main.isPersistent();
	}

	public Blob getSignature() {
		return signature;
	}

}
