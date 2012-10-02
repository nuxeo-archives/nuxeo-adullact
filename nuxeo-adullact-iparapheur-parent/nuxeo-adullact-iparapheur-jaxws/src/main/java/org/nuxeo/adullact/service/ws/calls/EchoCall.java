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
package org.nuxeo.adullact.service.ws.calls;

import java.rmi.RemoteException;

import javax.xml.namespace.QName;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.apache.axis.description.OperationDesc;
import org.apache.axis.description.ParameterDesc;
import org.nuxeo.ecm.core.api.ClientException;

/**
 * @author <a href="mailto:bjalon@nuxeo.com">Benjamin JALON</a>
 * 
 */
public class EchoCall extends Call implements GenericCallInterface {

	String message;

	public EchoCall(Service service) {
		super(service);

		OperationDesc oper;
		oper = new OperationDesc();
		oper.setName("echo");
		ParameterDesc param = new ParameterDesc(new QName(
				"http://www.adullact.org/spring-ws/iparapheur/1.0",
				"echoRequest"), ParameterDesc.IN, new QName(
				"http://www.adullact.org/spring-ws/iparapheur/1.0",
				">echoRequest"), String.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		oper.setReturnClass(java.lang.String.class);
		oper.setReturnQName(new javax.xml.namespace.QName(
				"http://www.adullact.org/spring-ws/iparapheur/1.0",
				"echoResponse"));
		oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);

		this.setOperation(oper);

		this.setOperationName(new QName("", "echo"));
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public Object invokeCall() throws ClientException {
		try {
			return this.invoke(new Object[] { message });
		} catch (RemoteException e) {
			throw new ClientException(e);
		}
	}
}
