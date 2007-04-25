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
 * $Id: ActionExecutionSpecificationImpl.java,v 1.16 2007/04/25 17:47:03 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.Action;
import org.eclipse.uml2.uml.ActionExecutionSpecification;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.GeneralOrdering;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.InteractionOperand;
import org.eclipse.uml2.uml.Lifeline;
import org.eclipse.uml2.uml.OccurrenceSpecification;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.ActionExecutionSpecificationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Execution Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActionExecutionSpecificationImpl#getAction <em>Action</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionExecutionSpecificationImpl
		extends ExecutionSpecificationImpl
		implements ActionExecutionSpecification {

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected Action action;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionExecutionSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.ACTION_EXECUTION_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getAction() {
		if (action != null && action.eIsProxy()) {
			InternalEObject oldAction = (InternalEObject) action;
			action = (Action) eResolveProxy(oldAction);
			if (action != oldAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.ACTION_EXECUTION_SPECIFICATION__ACTION,
						oldAction, action));
			}
		}
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action basicGetAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(Action newAction) {
		Action oldAction = action;
		action = newAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.ACTION_EXECUTION_SPECIFICATION__ACTION, oldAction,
				action));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionReferenced(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ActionExecutionSpecificationOperations.validateActionReferenced(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__NAME :
				return getName();
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__VISIBILITY :
				return getVisibility();
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__COVERED :
				return getCovereds();
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__GENERAL_ORDERING :
				return getGeneralOrderings();
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__ENCLOSING_INTERACTION :
				if (resolve)
					return getEnclosingInteraction();
				return basicGetEnclosingInteraction();
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__ENCLOSING_OPERAND :
				if (resolve)
					return getEnclosingOperand();
				return basicGetEnclosingOperand();
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__START :
				if (resolve)
					return getStart();
				return basicGetStart();
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__FINISH :
				if (resolve)
					return getFinish();
				return basicGetFinish();
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__ACTION :
				if (resolve)
					return getAction();
				return basicGetAction();
		}
		return eDynamicGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll(
					(Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll(
					(Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll(
					(Collection<? extends Dependency>) newValue);
				return;
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__COVERED :
				getCovereds().clear();
				getCovereds().addAll((Collection<? extends Lifeline>) newValue);
				return;
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__GENERAL_ORDERING :
				getGeneralOrderings().clear();
				getGeneralOrderings().addAll(
					(Collection<? extends GeneralOrdering>) newValue);
				return;
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__ENCLOSING_INTERACTION :
				setEnclosingInteraction((Interaction) newValue);
				return;
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__ENCLOSING_OPERAND :
				setEnclosingOperand((InteractionOperand) newValue);
				return;
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__START :
				setStart((OccurrenceSpecification) newValue);
				return;
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__FINISH :
				setFinish((OccurrenceSpecification) newValue);
				return;
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__ACTION :
				setAction((Action) newValue);
				return;
		}
		eDynamicSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__NAME :
				unsetName();
				return;
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__COVERED :
				getCovereds().clear();
				return;
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__GENERAL_ORDERING :
				getGeneralOrderings().clear();
				return;
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__ENCLOSING_INTERACTION :
				setEnclosingInteraction((Interaction) null);
				return;
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__ENCLOSING_OPERAND :
				setEnclosingOperand((InteractionOperand) null);
				return;
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__START :
				setStart((OccurrenceSpecification) null);
				return;
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__FINISH :
				setFinish((OccurrenceSpecification) null);
				return;
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__ACTION :
				setAction((Action) null);
				return;
		}
		eDynamicUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__OWNER :
				return isSetOwner();
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__NAME :
				return isSetName();
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__CLIENT_DEPENDENCY :
				return clientDependencies != null
					&& !clientDependencies.isEmpty();
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__COVERED :
				return covereds != null && !covereds.isEmpty();
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__GENERAL_ORDERING :
				return generalOrderings != null && !generalOrderings.isEmpty();
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__ENCLOSING_INTERACTION :
				return basicGetEnclosingInteraction() != null;
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__ENCLOSING_OPERAND :
				return basicGetEnclosingOperand() != null;
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__START :
				return start != null;
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__FINISH :
				return finish != null;
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__ACTION :
				return action != null;
		}
		return eDynamicIsSet(featureID);
	}

} //ActionExecutionSpecificationImpl
