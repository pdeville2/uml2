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
 * $Id: InteractionConstraint.java,v 1.7 2006/12/14 15:49:27 khussey Exp $
 */
package org.eclipse.uml2.uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An interaction constraint is a Boolean expression that guards an operand in a combined fragment.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.InteractionConstraint#getMinint <em>Minint</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.InteractionConstraint#getMaxint <em>Maxint</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getInteractionConstraint()
 * @model
 * @generated
 */
public interface InteractionConstraint
		extends Constraint {

	/**
	 * Returns the value of the '<em><b>Minint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The minimum number of iterations of a loop
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Minint</em>' containment reference.
	 * @see #setMinint(ValueSpecification)
	 * @see org.eclipse.uml2.uml.UMLPackage#getInteractionConstraint_Minint()
	 * @model containment="true" resolveProxies="true" ordered="false"
	 * @generated
	 */
	ValueSpecification getMinint();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.InteractionConstraint#getMinint <em>Minint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minint</em>' containment reference.
	 * @see #getMinint()
	 * @generated
	 */
	void setMinint(ValueSpecification value);

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.ValueSpecification}, with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', and sets the '<em><b>Minint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.ValueSpecification}, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' for the new {@link org.eclipse.uml2.uml.ValueSpecification}, or <code>null</code>.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.ValueSpecification} to create.
	 * @return The new {@link org.eclipse.uml2.uml.ValueSpecification}.
	 * @see #getMinint()
	 * @generated
	 */
	ValueSpecification createMinint(String name, Type type, EClass eClass);

	/**
	 * Returns the value of the '<em><b>Maxint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum number of iterations of a loop
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maxint</em>' containment reference.
	 * @see #setMaxint(ValueSpecification)
	 * @see org.eclipse.uml2.uml.UMLPackage#getInteractionConstraint_Maxint()
	 * @model containment="true" resolveProxies="true" ordered="false"
	 * @generated
	 */
	ValueSpecification getMaxint();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.InteractionConstraint#getMaxint <em>Maxint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maxint</em>' containment reference.
	 * @see #getMaxint()
	 * @generated
	 */
	void setMaxint(ValueSpecification value);

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.ValueSpecification}, with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', and sets the '<em><b>Maxint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.ValueSpecification}, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' for the new {@link org.eclipse.uml2.uml.ValueSpecification}, or <code>null</code>.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.ValueSpecification} to create.
	 * @return The new {@link org.eclipse.uml2.uml.ValueSpecification}.
	 * @see #getMaxint()
	 * @generated
	 */
	ValueSpecification createMaxint(String name, Type type, EClass eClass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The dynamic variables that take part in the constraint must be owned by the ConnectableElement corresponding to the covered Lifeline.
	 * true
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateDynamicVariables(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The constraint may contain references to global data or write-once data.
	 * true
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateGlobalData(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Minint/maxint can only be present if the InteractionConstraint is associated with the operand of a loop CombinedFragment.
	 * true
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateMinintMaxint(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If minint is specified, then the expression must evaluate to a non-negative integer.
	 * true
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateMinintNonNegative(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If maxint is specified, then the expression must evaluate to a positive integer.
	 * true
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateMaxintPositive(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If maxint is specified, then minint must be specified and the evaluation of maxint must be >= the evaluation of minint
	 * true
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateMaxintGreaterEqualMinint(DiagnosticChain diagnostics,
			Map<Object, Object> context);

} // InteractionConstraint
