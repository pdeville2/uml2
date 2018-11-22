/*
 * Copyright (c) 2006, 2018 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey - 535301
 *
 */
package org.eclipse.uml2.uml.internal.resource;

import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.xml.sax.helpers.DefaultHandler;

public class UML22UMLLoadImpl
		extends UMLLoadImpl {

	public UML22UMLLoadImpl(XMLHelper helper) {
		super(helper);
	}

	@Override
	protected DefaultHandler makeDefaultHandler() {
		return new UML22UMLHandler(resource, helper, options);
	}

}
