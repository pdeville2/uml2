/*
 * Copyright (c) 2004, 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * $Id: UML2Resource.java,v 1.5 2005/01/19 22:55:30 khussey Exp $
 */
package org.eclipse.uml2.util;

import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.uml2.internal.util.UML2ResourceFactoryImpl;

/**
 * 
 */
public interface UML2Resource
		extends XMIResource {

	public static final String copyright = "Copyright (c) 2004, 2005 IBM Corporation and others."; //$NON-NLS-1$

	public interface Factory
			extends Resource.Factory {

		public static final Factory INSTANCE = new UML2ResourceFactoryImpl();

	}

	public abstract class PreProcessor {

		public void preSave(UML2Resource resource, Map options) {
			// do nothing
		}

	}

	public abstract class PostProcessor {

		public void postLoad(UML2Resource resource, Map options) {
			// do nothing
		}

	}

	/**
	 * The scheme for platform URIs.
	 */
	public static final String URI_SCHEME_PLATFORM = "platform"; //$NON-NLS-1$

	/**
	 * The first segment for platform plugin URIs.
	 */
	public static final String URI_SEGMENT_PLUGIN = "plugin"; //$NON-NLS-1$

	public static final String UML2_NS_URI = "http://www.eclipse.org/uml2/1.0.0/UML"; //$NON-NLS-1$

	public static final String FILE_EXTENSION = "uml2"; //$NON-NLS-1$

	public static final String DEFAULT_ENCODING = "UTF-8"; //$NON-NLS-1$

	public static final String OPTION_PRE_PROCESSOR = "PRE_PROCESSOR"; //$NON-NLS-1$

	public static final String OPTION_POST_PROCESSOR = "POST_PROCESSOR"; //$NON-NLS-1$

	public static final String METAMODEL_FILE_EXTENSION = "metamodel." //$NON-NLS-1$
		+ FILE_EXTENSION;

	public static final String METAMODELS_PATHMAP = "pathmap://UML2_METAMODELS/"; //$NON-NLS-1$

	public static final String ECORE_METAMODEL_URI = METAMODELS_PATHMAP
		+ "Ecore." + METAMODEL_FILE_EXTENSION; //$NON-NLS-1$

	public static final String UML2_METAMODEL_URI = METAMODELS_PATHMAP
		+ "UML2." + METAMODEL_FILE_EXTENSION; //$NON-NLS-1$

	public static final String LIBRARY_FILE_EXTENSION = "library." //$NON-NLS-1$
		+ FILE_EXTENSION;

	public static final String LIBRARIES_PATHMAP = "pathmap://UML2_LIBRARIES/"; //$NON-NLS-1$

	public static final String ECORE_PRIMITIVE_TYPES_LIBRARY_URI = LIBRARIES_PATHMAP
		+ "EcorePrimitiveTypes." + LIBRARY_FILE_EXTENSION; //$NON-NLS-1$

	public static final String JAVA_PRIMITIVE_TYPES_LIBRARY_URI = LIBRARIES_PATHMAP
		+ "JavaPrimitiveTypes." + LIBRARY_FILE_EXTENSION; //$NON-NLS-1$

	public static final String UML2_PRIMITIVE_TYPES_LIBRARY_URI = LIBRARIES_PATHMAP
		+ "UML2PrimitiveTypes." + LIBRARY_FILE_EXTENSION; //$NON-NLS-1$

	public static final String PROFILE_FILE_EXTENSION = "profile." //$NON-NLS-1$
		+ FILE_EXTENSION;

	public static final String PROFILES_PATHMAP = "pathmap://UML2_PROFILES/"; //$NON-NLS-1$

	public static final String BASIC_PROFILE_URI = PROFILES_PATHMAP + "Basic." //$NON-NLS-1$
		+ PROFILE_FILE_EXTENSION;

	public static final String INTERMEDIATE_PROFILE_URI = PROFILES_PATHMAP
		+ "Intermediate." + PROFILE_FILE_EXTENSION; //$NON-NLS-1$

	public static final String COMPLETE_PROFILE_URI = PROFILES_PATHMAP
		+ "Complete." + PROFILE_FILE_EXTENSION; //$NON-NLS-1$

	public static final String ECORE_PROFILE_URI = PROFILES_PATHMAP
		+ "Ecore." + PROFILE_FILE_EXTENSION; //$NON-NLS-1$

}
