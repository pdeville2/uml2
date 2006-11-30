/*
 * Copyright (c) 2005, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: UMLResource.java,v 1.6 2006/11/30 05:16:55 khussey Exp $
 */
package org.eclipse.uml2.uml.resource;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.uml2.uml.internal.resource.UMLResourceFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * The resource associated with the '<em><b>uml</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public interface UMLResource
		extends XMIResource {

	/**
	 * <!-- begin-user-doc -->
	 * The factory for '<em><b>uml</b></em>' resources.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public interface Factory
			extends Resource.Factory {

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final Factory INSTANCE = new UMLResourceFactoryImpl();

	}

	/**
	 * <!-- begin-user-doc -->
	 * The file extension for '<em><b>uml</b></em>' resources.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String FILE_EXTENSION = "uml"; //$NON-NLS-1$

	/**
	 * <!-- begin-user-doc -->
	 * The default encoding for '<em><b>uml</b></em>' resources.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String DEFAULT_ENCODING = "UTF-8"; //$NON-NLS-1$

	String LIBRARY_FILE_EXTENSION = "library." + FILE_EXTENSION; //$NON-NLS-1$

	String LIBRARIES_PATHMAP = "pathmap://UML_LIBRARIES/"; //$NON-NLS-1$

	String ECORE_PRIMITIVE_TYPES_LIBRARY_URI = LIBRARIES_PATHMAP + "EcorePrimitiveTypes." + LIBRARY_FILE_EXTENSION; //$NON-NLS-1$

	String XML_PRIMITIVE_TYPES_LIBRARY_URI = LIBRARIES_PATHMAP + "XMLPrimitiveTypes." + LIBRARY_FILE_EXTENSION; //$NON-NLS-1$

	String JAVA_PRIMITIVE_TYPES_LIBRARY_URI = LIBRARIES_PATHMAP + "JavaPrimitiveTypes." + LIBRARY_FILE_EXTENSION; //$NON-NLS-1$

	String UML_PRIMITIVE_TYPES_LIBRARY_URI = LIBRARIES_PATHMAP + "UMLPrimitiveTypes." + LIBRARY_FILE_EXTENSION; //$NON-NLS-1$

	String METAMODEL_FILE_EXTENSION = "metamodel." + FILE_EXTENSION; //$NON-NLS-1$

	String METAMODELS_PATHMAP = "pathmap://UML_METAMODELS/"; //$NON-NLS-1$

	String ECORE_METAMODEL_URI = METAMODELS_PATHMAP + "Ecore." + METAMODEL_FILE_EXTENSION; //$NON-NLS-1$

	String UML_METAMODEL_URI = METAMODELS_PATHMAP + "UML." + METAMODEL_FILE_EXTENSION; //$NON-NLS-1$

	String PROFILE_FILE_EXTENSION = "profile." + FILE_EXTENSION; //$NON-NLS-1$

	String PROFILES_PATHMAP = "pathmap://UML_PROFILES/"; //$NON-NLS-1$

	String ECORE_PROFILE_NS_URI = "http://www.eclipse.org/uml2/schemas/Ecore/3"; //$NON-NLS-1$

	String ECORE_PROFILE_URI = PROFILES_PATHMAP + "Ecore." + PROFILE_FILE_EXTENSION; //$NON-NLS-1$

	String STANDARD_PROFILE_NS_URI = "http://www.eclipse.org/uml2/schemas/Standard/1"; //$NON-NLS-1$

	String STANDARD_PROFILE_URI = PROFILES_PATHMAP + "Standard." + PROFILE_FILE_EXTENSION; //$NON-NLS-1$

} // UMLResource
