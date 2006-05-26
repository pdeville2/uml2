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
 * $Id: InteractionOperand.java,v 1.7 2006/05/26 16:34:03 khussey Exp $
 */
package org.eclipse.uml2.uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction Operand</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An interaction operand is contained in a combined fragment. An interaction operand represents one operand of the expression given by the enclosing combined fragment.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.InteractionOperand#getGuard <em>Guard</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.InteractionOperand#getFragments <em>Fragment</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getInteractionOperand()
 * @model
 * @generated
 */
public interface InteractionOperand
		extends Namespace, InteractionFragment {

	/**
	 * Returns the value of the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Constraint of the operand.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Guard</em>' containment reference.
	 * @see #setGuard(InteractionConstraint)
	 * @see org.eclipse.uml2.uml.UMLPackage#getInteractionOperand_Guard()
	 * @model containment="true" resolveProxies="true" ordered="false"
	 * @generated
	 */
	InteractionConstraint getGuard();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.InteractionOperand#getGuard <em>Guard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard</em>' containment reference.
	 * @see #getGuard()
	 * @generated
	 */
	void setGuard(InteractionConstraint value);

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.InteractionConstraint},with the specified '<em><b>Name</b></em>', and sets the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.InteractionConstraint}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.InteractionConstraint}.
	 * @see #getGuard()
	 * @generated
	 */
	InteractionConstraint createGuard(String name);

	/**
	 * Returns the value of the '<em><b>Fragment</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.InteractionFragment}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.InteractionFragment#getEnclosingOperand <em>Enclosing Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The fragments of the operand.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fragment</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getInteractionOperand_Fragment()
	 * @see org.eclipse.uml2.uml.InteractionFragment#getEnclosingOperand
	 * @model type="org.eclipse.uml2.uml.InteractionFragment" opposite="enclosingOperand" containment="true" resolveProxies="true"
	 * @generated
	 */
	EList getFragments();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.InteractionFragment}, with the specified '<em><b>Name</b></em>', and appends it to the '<em><b>Fragment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.InteractionFragment}, or <code>null</code>.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.InteractionFragment} to create.
	 * @return The new {@link org.eclipse.uml2.uml.InteractionFragment}.
	 * @see #getFragments()
	 * @generated
	 */
	InteractionFragment createFragment(String name, EClass eClass);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.InteractionFragment} with the specified '<em><b>Name</b></em>' from the '<em><b>Fragment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.InteractionFragment} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.InteractionFragment} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getFragments()
	 * @generated
	 */
	InteractionFragment getFragment(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.InteractionFragment} with the specified '<em><b>Name</b></em>' from the '<em><b>Fragment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.InteractionFragment} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.InteractionFragment} to retrieve, or <code>null</code>.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.InteractionFragment} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.InteractionFragment} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getFragments()
	 * @generated
	 */
	InteractionFragment getFragment(String name, boolean ignoreCase,
			EClass eClass, boolean createOnDemand);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The guard must be placed directly prior to (above) the OccurrenceSpecification that will become the first OccurrenceSpecification within this InteractionOperand.
	 * true
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateGuardDirectlyPrior(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The guard must contain only references to values local to the Lifeline on which it resides, or values global to the whole Interaction.
	 * true
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateGuardContainReferences(DiagnosticChain diagnostics,
			Map context);

} // InteractionOperand
