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
 * $Id: RemoveStructuralFeatureValueActionImpl.java,v 1.23 2006/12/14 15:49:29 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.ActivityEdge;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.ActivityPartition;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.ExceptionHandler;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.InterruptibleActivityRegion;
import org.eclipse.uml2.uml.RemoveStructuralFeatureValueAction;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.StructuralFeature;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.RemoveStructuralFeatureValueActionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Remove Structural Feature Value Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.RemoveStructuralFeatureValueActionImpl#getInputs <em>Input</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.RemoveStructuralFeatureValueActionImpl#isRemoveDuplicates <em>Is Remove Duplicates</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.RemoveStructuralFeatureValueActionImpl#getRemoveAt <em>Remove At</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RemoveStructuralFeatureValueActionImpl
		extends WriteStructuralFeatureActionImpl
		implements RemoveStructuralFeatureValueAction {

	/**
	 * The default value of the '{@link #isRemoveDuplicates() <em>Is Remove Duplicates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRemoveDuplicates()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_REMOVE_DUPLICATES_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isRemoveDuplicates() <em>Is Remove Duplicates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRemoveDuplicates()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_REMOVE_DUPLICATES_EFLAG = 1 << 11;

	/**
	 * The cached value of the '{@link #getRemoveAt() <em>Remove At</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoveAt()
	 * @generated
	 * @ordered
	 */
	protected InputPin removeAt = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RemoveStructuralFeatureValueActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputPin> getInputs() {

		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<InputPin> inputs = (EList<InputPin>) cache.get(eResource,
				this, UMLPackage.Literals.ACTION__INPUT);
			if (inputs == null) {
				cache
					.put(
						eResource,
						this,
						UMLPackage.Literals.ACTION__INPUT,
						inputs = new DerivedUnionEObjectEList<InputPin>(
							InputPin.class,
							this,
							UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__INPUT,
							INPUT_ESUBSETS));
			}
			return inputs;
		}
		return new DerivedUnionEObjectEList<InputPin>(InputPin.class, this,
			UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__INPUT,
			INPUT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRemoveDuplicates() {
		return (eFlags & IS_REMOVE_DUPLICATES_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsRemoveDuplicates(boolean newIsRemoveDuplicates) {

		boolean oldIsRemoveDuplicates = (eFlags & IS_REMOVE_DUPLICATES_EFLAG) != 0;
		if (newIsRemoveDuplicates)
			eFlags |= IS_REMOVE_DUPLICATES_EFLAG;
		else
			eFlags &= ~IS_REMOVE_DUPLICATES_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
				this,
				Notification.SET,
				UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__IS_REMOVE_DUPLICATES,
				oldIsRemoveDuplicates, newIsRemoveDuplicates));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin getRemoveAt() {
		if (removeAt != null && removeAt.eIsProxy()) {
			InternalEObject oldRemoveAt = (InternalEObject) removeAt;
			removeAt = (InputPin) eResolveProxy(oldRemoveAt);
			if (removeAt != oldRemoveAt) {
				InternalEObject newRemoveAt = (InternalEObject) removeAt;
				NotificationChain msgs = oldRemoveAt
					.eInverseRemove(
						this,
						EOPPOSITE_FEATURE_BASE
							- UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__REMOVE_AT,
						null, null);
				if (newRemoveAt.eInternalContainer() == null) {
					msgs = newRemoveAt
						.eInverseAdd(
							this,
							EOPPOSITE_FEATURE_BASE
								- UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__REMOVE_AT,
							null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
						this,
						Notification.RESOLVE,
						UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__REMOVE_AT,
						oldRemoveAt, removeAt));
			}
		}
		return removeAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin basicGetRemoveAt() {
		return removeAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRemoveAt(InputPin newRemoveAt,
			NotificationChain msgs) {
		InputPin oldRemoveAt = removeAt;
		removeAt = newRemoveAt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET,
				UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__REMOVE_AT,
				oldRemoveAt, newRemoveAt);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemoveAt(InputPin newRemoveAt) {

		if (newRemoveAt != removeAt) {
			NotificationChain msgs = null;
			if (removeAt != null)
				msgs = ((InternalEObject) removeAt)
					.eInverseRemove(
						this,
						EOPPOSITE_FEATURE_BASE
							- UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__REMOVE_AT,
						null, msgs);
			if (newRemoveAt != null)
				msgs = ((InternalEObject) newRemoveAt)
					.eInverseAdd(
						this,
						EOPPOSITE_FEATURE_BASE
							- UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__REMOVE_AT,
						null, msgs);
			msgs = basicSetRemoveAt(newRemoveAt, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__REMOVE_AT,
				newRemoveAt, newRemoveAt));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin createRemoveAt(String name, Type type, EClass eClass) {
		InputPin newRemoveAt = (InputPin) create(eClass);
		setRemoveAt(newRemoveAt);
		if (name != null)
			newRemoveAt.setName(name);
		if (type != null)
			newRemoveAt.setType(type);
		return newRemoveAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin createRemoveAt(String name, Type type) {
		return createRemoveAt(name, type, UMLPackage.Literals.INPUT_PIN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonUniqueRemoval(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return RemoveStructuralFeatureValueActionOperations
			.validateNonUniqueRemoval(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__CLIENT_DEPENDENCY :
				return ((InternalEList<?>) getClientDependencies())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__IN_STRUCTURED_NODE :
				return basicSetInStructuredNode(null, msgs);
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__ACTIVITY :
				return basicSetActivity(null, msgs);
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__OUTGOING :
				return ((InternalEList<?>) getOutgoings()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__INCOMING :
				return ((InternalEList<?>) getIncomings()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__IN_PARTITION :
				return ((InternalEList<?>) getInPartitions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__IN_INTERRUPTIBLE_REGION :
				return ((InternalEList<?>) getInInterruptibleRegions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__HANDLER :
				return ((InternalEList<?>) getHandlers()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__LOCAL_PRECONDITION :
				return ((InternalEList<?>) getLocalPreconditions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__LOCAL_POSTCONDITION :
				return ((InternalEList<?>) getLocalPostconditions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__OBJECT :
				return basicSetObject(null, msgs);
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__VALUE :
				return basicSetValue(null, msgs);
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__REMOVE_AT :
				return basicSetRemoveAt(null, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__NAME :
				return getName();
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__VISIBILITY :
				return getVisibility();
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__IN_STRUCTURED_NODE :
				if (resolve)
					return getInStructuredNode();
				return basicGetInStructuredNode();
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__ACTIVITY :
				if (resolve)
					return getActivity();
				return basicGetActivity();
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__OUTGOING :
				return getOutgoings();
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__INCOMING :
				return getIncomings();
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__IN_PARTITION :
				return getInPartitions();
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__IN_INTERRUPTIBLE_REGION :
				return getInInterruptibleRegions();
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__IN_GROUP :
				return getInGroups();
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__REDEFINED_NODE :
				return getRedefinedNodes();
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__HANDLER :
				return getHandlers();
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__OUTPUT :
				return getOutputs();
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__INPUT :
				return getInputs();
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__CONTEXT :
				if (resolve)
					return getContext();
				return basicGetContext();
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__LOCAL_PRECONDITION :
				return getLocalPreconditions();
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__LOCAL_POSTCONDITION :
				return getLocalPostconditions();
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__STRUCTURAL_FEATURE :
				if (resolve)
					return getStructuralFeature();
				return basicGetStructuralFeature();
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__OBJECT :
				if (resolve)
					return getObject();
				return basicGetObject();
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__VALUE :
				if (resolve)
					return getValue();
				return basicGetValue();
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__IS_REMOVE_DUPLICATES :
				return isRemoveDuplicates()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__REMOVE_AT :
				if (resolve)
					return getRemoveAt();
				return basicGetRemoveAt();
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
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll(
					(Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll(
					(Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll(
					(Collection<? extends Dependency>) newValue);
				return;
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__IS_LEAF :
				setIsLeaf(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) newValue);
				return;
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__ACTIVITY :
				setActivity((Activity) newValue);
				return;
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__OUTGOING :
				getOutgoings().clear();
				getOutgoings().addAll(
					(Collection<? extends ActivityEdge>) newValue);
				return;
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__INCOMING :
				getIncomings().clear();
				getIncomings().addAll(
					(Collection<? extends ActivityEdge>) newValue);
				return;
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__IN_PARTITION :
				getInPartitions().clear();
				getInPartitions().addAll(
					(Collection<? extends ActivityPartition>) newValue);
				return;
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				getInInterruptibleRegions()
					.addAll(
						(Collection<? extends InterruptibleActivityRegion>) newValue);
				return;
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__REDEFINED_NODE :
				getRedefinedNodes().clear();
				getRedefinedNodes().addAll(
					(Collection<? extends ActivityNode>) newValue);
				return;
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__HANDLER :
				getHandlers().clear();
				getHandlers().addAll(
					(Collection<? extends ExceptionHandler>) newValue);
				return;
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				getLocalPreconditions().addAll(
					(Collection<? extends Constraint>) newValue);
				return;
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				getLocalPostconditions().addAll(
					(Collection<? extends Constraint>) newValue);
				return;
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__STRUCTURAL_FEATURE :
				setStructuralFeature((StructuralFeature) newValue);
				return;
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__OBJECT :
				setObject((InputPin) newValue);
				return;
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__VALUE :
				setValue((InputPin) newValue);
				return;
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__IS_REMOVE_DUPLICATES :
				setIsRemoveDuplicates(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__REMOVE_AT :
				setRemoveAt((InputPin) newValue);
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
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__NAME :
				unsetName();
				return;
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) null);
				return;
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__ACTIVITY :
				setActivity((Activity) null);
				return;
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__OUTGOING :
				getOutgoings().clear();
				return;
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__INCOMING :
				getIncomings().clear();
				return;
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__IN_PARTITION :
				getInPartitions().clear();
				return;
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				return;
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__REDEFINED_NODE :
				getRedefinedNodes().clear();
				return;
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__HANDLER :
				getHandlers().clear();
				return;
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				return;
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				return;
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__STRUCTURAL_FEATURE :
				setStructuralFeature((StructuralFeature) null);
				return;
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__OBJECT :
				setObject((InputPin) null);
				return;
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__VALUE :
				setValue((InputPin) null);
				return;
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__IS_REMOVE_DUPLICATES :
				setIsRemoveDuplicates(IS_REMOVE_DUPLICATES_EDEFAULT);
				return;
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__REMOVE_AT :
				setRemoveAt((InputPin) null);
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
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__OWNER :
				return isSetOwner();
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__NAME :
				return isSetName();
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__CLIENT_DEPENDENCY :
				return clientDependencies != null
					&& !clientDependencies.isEmpty();
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__IN_STRUCTURED_NODE :
				return basicGetInStructuredNode() != null;
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__ACTIVITY :
				return basicGetActivity() != null;
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__OUTGOING :
				return outgoings != null && !outgoings.isEmpty();
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__INCOMING :
				return incomings != null && !incomings.isEmpty();
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__IN_PARTITION :
				return inPartitions != null && !inPartitions.isEmpty();
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__IN_INTERRUPTIBLE_REGION :
				return inInterruptibleRegions != null
					&& !inInterruptibleRegions.isEmpty();
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__IN_GROUP :
				return isSetInGroups();
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__REDEFINED_NODE :
				return redefinedNodes != null && !redefinedNodes.isEmpty();
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__HANDLER :
				return handlers != null && !handlers.isEmpty();
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__OUTPUT :
				return isSetOutputs();
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__INPUT :
				return isSetInputs();
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__CONTEXT :
				return basicGetContext() != null;
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__LOCAL_PRECONDITION :
				return localPreconditions != null
					&& !localPreconditions.isEmpty();
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__LOCAL_POSTCONDITION :
				return localPostconditions != null
					&& !localPostconditions.isEmpty();
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__STRUCTURAL_FEATURE :
				return structuralFeature != null;
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__OBJECT :
				return object != null;
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__VALUE :
				return value != null;
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__IS_REMOVE_DUPLICATES :
				return ((eFlags & IS_REMOVE_DUPLICATES_EFLAG) != 0) != IS_REMOVE_DUPLICATES_EDEFAULT;
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__REMOVE_AT :
				return removeAt != null;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isRemoveDuplicates: "); //$NON-NLS-1$
		result.append((eFlags & IS_REMOVE_DUPLICATES_EFLAG) != 0);
		result.append(')');
		return result.toString();
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getInputs() <em>Input</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected static final int[] INPUT_ESUBSETS = new int[]{
		UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__OBJECT,
		UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__VALUE,
		UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__REMOVE_AT};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetInputs() {
		return super.isSetInputs()
			|| eIsSet(UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__REMOVE_AT);
	}

} //RemoveStructuralFeatureValueActionImpl
