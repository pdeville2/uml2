/*
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: Extension.java,v 1.12 2007/04/25 17:47:05 khussey Exp $
 */
package org.eclipse.uml2.uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An extension is used to indicate that the properties of a metaclass are extended through a stereotype, and gives the ability to flexibly add (and later remove) stereotypes to classes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Extension#isRequired <em>Is Required</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Extension#getMetaclass <em>Metaclass</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getExtension()
 * @model
 * @generated
 */
public interface Extension
		extends Association {

	/**
	 * Returns the value of the '<em><b>Is Required</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether an instance of the extending stereotype must be created when an instance of the extended class is created. The attribute value is derived from the multiplicity of the Property referenced by Extension::ownedEnd; a multiplicity of 1 means that isRequired is true, but otherwise it is false. Since the default multiplicity of an ExtensionEnd is 0..1, the default value of isRequired is false.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Required</em>' attribute.
	 * @see org.eclipse.uml2.uml.UMLPackage#getExtension_IsRequired()
	 * @model default="false" dataType="org.eclipse.uml2.uml.Boolean" required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	boolean isRequired();

	/**
	 * Returns the value of the '<em><b>Metaclass</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.Class#getExtensions <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the Class that is extended through an Extension. The property is derived from the type of the memberEnd that is not the ownedEnd.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Metaclass</em>' reference.
	 * @see org.eclipse.uml2.uml.UMLPackage#getExtension_Metaclass()
	 * @see org.eclipse.uml2.uml.Class#getExtensions
	 * @model opposite="extension" required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getMetaclass();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The non-owned end of an Extension is typed by a Class.
	 * metaclassEnd()->notEmpty() and metaclass()->oclIsKindOf(Class)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateNonOwnedEnd(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An Extension is binary, i.e., it has only two memberEnds.
	 * memberEnd->size() = 2
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateIsBinary(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the extension end that is typed by a stereotype (as opposed to a metaclass).
	 * <!-- end-model-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	Property getStereotypeEnd();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the stereotype that extends a metaclass through this extension.
	 * <!-- end-model-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	Stereotype getStereotype();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query metaclassEnd() returns the Property that is typed by a metaclass (as opposed to a stereotype).
	 * result = memberEnd->reject(ownedEnd)
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Property metaclassEnd();

	/**
	 * The prefix for metaclass role names.
	 */
	String METACLASS_ROLE_PREFIX = "base_"; //$NON-NLS-1$

	/**
	 * The prefix for stereotype role names.
	 */
	String STEREOTYPE_ROLE_PREFIX = "extension_"; //$NON-NLS-1$

} // Extension
