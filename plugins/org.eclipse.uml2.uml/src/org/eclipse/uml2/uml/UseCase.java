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
 * $Id: UseCase.java,v 1.7 2006/05/26 16:34:03 khussey Exp $
 */
package org.eclipse.uml2.uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Use Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A use case is the specification of a set of actions performed by a system, which yields an observable result that is, typically, of value for one or more actors or other stakeholders of the system.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.UseCase#getIncludes <em>Include</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.UseCase#getExtends <em>Extend</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.UseCase#getExtensionPoints <em>Extension Point</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.UseCase#getSubjects <em>Subject</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getUseCase()
 * @model
 * @generated
 */
public interface UseCase
		extends BehavioredClassifier {

	/**
	 * Returns the value of the '<em><b>Include</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Include}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.Include#getIncludingCase <em>Including Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the Include relationships owned by this use case.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getUseCase_Include()
	 * @see org.eclipse.uml2.uml.Include#getIncludingCase
	 * @model type="org.eclipse.uml2.uml.Include" opposite="includingCase" containment="true" resolveProxies="true" ordered="false"
	 * @generated
	 */
	EList getIncludes();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.Include}, with the specified '<em><b>Name</b></em>', and '<em><b>Addition</b></em>', and appends it to the '<em><b>Include</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.Include}, or <code>null</code>.
	 * @param addition The '<em><b>Addition</b></em>' for the new {@link org.eclipse.uml2.uml.Include}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.Include}.
	 * @see #getIncludes()
	 * @generated
	 */
	Include createInclude(String name, UseCase addition);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Include} with the specified '<em><b>Name</b></em>', and '<em><b>Addition</b></em>' from the '<em><b>Include</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Include} to retrieve, or <code>null</code>.
	 * @param addition The '<em><b>Addition</b></em>' of the {@link org.eclipse.uml2.uml.Include} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Include} with the specified '<em><b>Name</b></em>', and '<em><b>Addition</b></em>', or <code>null</code>.
	 * @see #getIncludes()
	 * @generated
	 */
	Include getInclude(String name, UseCase addition);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Include} with the specified '<em><b>Name</b></em>', and '<em><b>Addition</b></em>' from the '<em><b>Include</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Include} to retrieve, or <code>null</code>.
	 * @param addition The '<em><b>Addition</b></em>' of the {@link org.eclipse.uml2.uml.Include} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.Include} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.Include} with the specified '<em><b>Name</b></em>', and '<em><b>Addition</b></em>', or <code>null</code>.
	 * @see #getIncludes()
	 * @generated
	 */
	Include getInclude(String name, UseCase addition, boolean ignoreCase,
			boolean createOnDemand);

	/**
	 * Returns the value of the '<em><b>Extend</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Extend}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.Extend#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the Extend relationships owned by this use case.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extend</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getUseCase_Extend()
	 * @see org.eclipse.uml2.uml.Extend#getExtension
	 * @model type="org.eclipse.uml2.uml.Extend" opposite="extension" containment="true" resolveProxies="true" ordered="false"
	 * @generated
	 */
	EList getExtends();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.Extend}, with the specified '<em><b>Name</b></em>', and '<em><b>Extended Case</b></em>', and appends it to the '<em><b>Extend</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.Extend}, or <code>null</code>.
	 * @param extendedCase The '<em><b>Extended Case</b></em>' for the new {@link org.eclipse.uml2.uml.Extend}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.Extend}.
	 * @see #getExtends()
	 * @generated
	 */
	Extend createExtend(String name, UseCase extendedCase);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Extend} with the specified '<em><b>Name</b></em>', and '<em><b>Extended Case</b></em>' from the '<em><b>Extend</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Extend} to retrieve, or <code>null</code>.
	 * @param extendedCase The '<em><b>Extended Case</b></em>' of the {@link org.eclipse.uml2.uml.Extend} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Extend} with the specified '<em><b>Name</b></em>', and '<em><b>Extended Case</b></em>', or <code>null</code>.
	 * @see #getExtends()
	 * @generated
	 */
	Extend getExtend(String name, UseCase extendedCase);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Extend} with the specified '<em><b>Name</b></em>', and '<em><b>Extended Case</b></em>' from the '<em><b>Extend</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Extend} to retrieve, or <code>null</code>.
	 * @param extendedCase The '<em><b>Extended Case</b></em>' of the {@link org.eclipse.uml2.uml.Extend} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.Extend} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.Extend} with the specified '<em><b>Name</b></em>', and '<em><b>Extended Case</b></em>', or <code>null</code>.
	 * @see #getExtends()
	 * @generated
	 */
	Extend getExtend(String name, UseCase extendedCase, boolean ignoreCase,
			boolean createOnDemand);

	/**
	 * Returns the value of the '<em><b>Extension Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.ExtensionPoint}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.ExtensionPoint#getUseCase <em>Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the ExtensionPoints owned by the use case.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extension Point</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getUseCase_ExtensionPoint()
	 * @see org.eclipse.uml2.uml.ExtensionPoint#getUseCase
	 * @model type="org.eclipse.uml2.uml.ExtensionPoint" opposite="useCase" containment="true" resolveProxies="true" ordered="false"
	 * @generated
	 */
	EList getExtensionPoints();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.ExtensionPoint}, with the specified '<em><b>Name</b></em>', and appends it to the '<em><b>Extension Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.ExtensionPoint}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.ExtensionPoint}.
	 * @see #getExtensionPoints()
	 * @generated
	 */
	ExtensionPoint createExtensionPoint(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ExtensionPoint} with the specified '<em><b>Name</b></em>' from the '<em><b>Extension Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ExtensionPoint} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.ExtensionPoint} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getExtensionPoints()
	 * @generated
	 */
	ExtensionPoint getExtensionPoint(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ExtensionPoint} with the specified '<em><b>Name</b></em>' from the '<em><b>Extension Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ExtensionPoint} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.ExtensionPoint} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.ExtensionPoint} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getExtensionPoints()
	 * @generated
	 */
	ExtensionPoint getExtensionPoint(String name, boolean ignoreCase,
			boolean createOnDemand);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Classifier}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.Classifier#getUseCases <em>Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the subjects to which this use case applies. The subject or its parts realize all the use cases that apply to this subject. Use cases need not be attached to any specific subject, however. The subject may, but need not, own the use cases that apply to it.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getUseCase_Subject()
	 * @see org.eclipse.uml2.uml.Classifier#getUseCases
	 * @model type="org.eclipse.uml2.uml.Classifier" opposite="useCase" ordered="false"
	 * @generated
	 */
	EList getSubjects();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Classifier} with the specified '<em><b>Name</b></em>' from the '<em><b>Subject</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Classifier} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Classifier} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getSubjects()
	 * @generated
	 */
	Classifier getSubject(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Classifier} with the specified '<em><b>Name</b></em>' from the '<em><b>Subject</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Classifier} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.Classifier} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Classifier} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getSubjects()
	 * @generated
	 */
	Classifier getSubject(String name, boolean ignoreCase, EClass eClass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A UseCase must have a name.
	 * self.name -> notEmpty ()
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateMustHaveName(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UseCases can only be involved in binary Associations.
	 * true
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateBinaryAssociations(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UseCases can not have Associations to UseCases specifying the same subject.
	 * true
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateNoAssociationToUseCase(DiagnosticChain diagnostics,
			Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A use case cannot include use cases that directly or indirectly include it.
	 * not self.allIncludedUseCases()->includes(self)
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateCannotIncludeSelf(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query allIncludedUseCases() returns the transitive closure of all use cases (directly or indirectly) included by this use case.
	 * result = self.include->union(self.include->collect(in | in.allIncludedUseCases()))
	 * <!-- end-model-doc -->
	 * @model type="org.eclipse.uml2.uml.UseCase" ordered="false"
	 * @generated
	 */
	EList allIncludedUseCases();

} // UseCase
