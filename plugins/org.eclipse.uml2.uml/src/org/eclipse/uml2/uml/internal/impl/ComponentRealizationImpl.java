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
 * $Id: ComponentRealizationImpl.java,v 1.18 2007/02/26 16:17:56 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.SubsetSupersetEObjectResolvingEList;
import org.eclipse.uml2.common.util.SubsetSupersetEObjectWithInverseResolvingEList;

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.ComponentRealization;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.OpaqueExpression;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Realization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ComponentRealizationImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ComponentRealizationImpl#getClients <em>Client</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ComponentRealizationImpl#getSuppliers <em>Supplier</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ComponentRealizationImpl#getAbstraction <em>Abstraction</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ComponentRealizationImpl#getRealizingClassifier <em>Realizing Classifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentRealizationImpl
		extends RealizationImpl
		implements ComponentRealization {

	/**
	 * The cached value of the '{@link #getRealizingClassifier() <em>Realizing Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizingClassifier()
	 * @generated
	 * @ordered
	 */
	protected Classifier realizingClassifier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentRealizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.COMPONENT_REALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element getOwner() {
		Element owner = basicGetOwner();
		return owner != null && owner.eIsProxy()
			? (Element) eResolveProxy((InternalEObject) owner)
			: owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NamedElement> getClients() {
		if (clients == null) {
			clients = new SubsetSupersetEObjectWithInverseResolvingEList.ManyInverse<NamedElement>(
				NamedElement.class, this,
				UMLPackage.COMPONENT_REALIZATION__CLIENT, null,
				CLIENT_ESUBSETS, UMLPackage.NAMED_ELEMENT__CLIENT_DEPENDENCY);
		}
		return clients;
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getClients() <em>Client</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClients()
	 * @generated
	 * @ordered
	 */
	protected static final int[] CLIENT_ESUBSETS = new int[]{UMLPackage.COMPONENT_REALIZATION__ABSTRACTION};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NamedElement> getSuppliers() {
		if (suppliers == null) {
			suppliers = new SubsetSupersetEObjectResolvingEList<NamedElement>(
				NamedElement.class, this,
				UMLPackage.COMPONENT_REALIZATION__SUPPLIER, null,
				SUPPLIER_ESUBSETS);
		}
		return suppliers;
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getSuppliers() <em>Supplier</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuppliers()
	 * @generated
	 * @ordered
	 */
	protected static final int[] SUPPLIER_ESUBSETS = new int[]{UMLPackage.COMPONENT_REALIZATION__REALIZING_CLASSIFIER};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getAbstraction() {
		if (eContainerFeatureID != UMLPackage.COMPONENT_REALIZATION__ABSTRACTION)
			return null;
		return (Component) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetAbstraction() {
		if (eContainerFeatureID != UMLPackage.COMPONENT_REALIZATION__ABSTRACTION)
			return null;
		return (Component) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstraction(Component newAbstraction,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newAbstraction,
			UMLPackage.COMPONENT_REALIZATION__ABSTRACTION, msgs);

		Resource.Internal eInternalResource = eInternalResource();
		if (eInternalResource == null || !eInternalResource.isLoading()) {
			if (newAbstraction != null) {
				EList<NamedElement> clients = getClients();
				if (!clients.contains(newAbstraction)) {
					clients.add(newAbstraction);
				}
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstraction(Component newAbstraction) {

		if (newAbstraction != eInternalContainer()
			|| (eContainerFeatureID != UMLPackage.COMPONENT_REALIZATION__ABSTRACTION && newAbstraction != null)) {
			if (EcoreUtil.isAncestor(this, newAbstraction))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAbstraction != null)
				msgs = ((InternalEObject) newAbstraction).eInverseAdd(this,
					UMLPackage.COMPONENT__REALIZATION, Component.class, msgs);
			msgs = basicSetAbstraction(newAbstraction, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.COMPONENT_REALIZATION__ABSTRACTION, newAbstraction,
				newAbstraction));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getRealizingClassifier() {
		if (realizingClassifier != null && realizingClassifier.eIsProxy()) {
			InternalEObject oldRealizingClassifier = (InternalEObject) realizingClassifier;
			realizingClassifier = (Classifier) eResolveProxy(oldRealizingClassifier);
			if (realizingClassifier != oldRealizingClassifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.COMPONENT_REALIZATION__REALIZING_CLASSIFIER,
						oldRealizingClassifier, realizingClassifier));
			}
		}
		return realizingClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier basicGetRealizingClassifier() {
		return realizingClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRealizingClassifier(Classifier newRealizingClassifier) {

		Classifier oldRealizingClassifier = realizingClassifier;
		realizingClassifier = newRealizingClassifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.COMPONENT_REALIZATION__REALIZING_CLASSIFIER,
				oldRealizingClassifier, realizingClassifier));

		Resource.Internal eInternalResource = eInternalResource();
		if (eInternalResource == null || !eInternalResource.isLoading()) {
			if (newRealizingClassifier != null) {
				EList<NamedElement> suppliers = getSuppliers();
				if (!suppliers.contains(newRealizingClassifier)) {
					suppliers.add(newRealizingClassifier);
				}
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.COMPONENT_REALIZATION__EANNOTATIONS :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getEAnnotations())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.COMPONENT_REALIZATION__CLIENT_DEPENDENCY :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getClientDependencies())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.COMPONENT_REALIZATION__OWNING_TEMPLATE_PARAMETER :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningTemplateParameter(
					(TemplateParameter) otherEnd, msgs);
			case UMLPackage.COMPONENT_REALIZATION__TEMPLATE_PARAMETER :
				if (templateParameter != null)
					msgs = ((InternalEObject) templateParameter)
						.eInverseRemove(this,
							UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
							TemplateParameter.class, msgs);
				return basicSetTemplateParameter((TemplateParameter) otherEnd,
					msgs);
			case UMLPackage.COMPONENT_REALIZATION__CLIENT :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getClients())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.COMPONENT_REALIZATION__ABSTRACTION :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAbstraction((Component) otherEnd, msgs);
		}
		return eDynamicInverseAdd(otherEnd, featureID, msgs);
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
			case UMLPackage.COMPONENT_REALIZATION__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.COMPONENT_REALIZATION__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.COMPONENT_REALIZATION__CLIENT_DEPENDENCY :
				return ((InternalEList<?>) getClientDependencies())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.COMPONENT_REALIZATION__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.COMPONENT_REALIZATION__OWNING_TEMPLATE_PARAMETER :
				return basicSetOwningTemplateParameter(null, msgs);
			case UMLPackage.COMPONENT_REALIZATION__TEMPLATE_PARAMETER :
				return basicSetTemplateParameter(null, msgs);
			case UMLPackage.COMPONENT_REALIZATION__CLIENT :
				return ((InternalEList<?>) getClients()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.COMPONENT_REALIZATION__MAPPING :
				return basicSetMapping(null, msgs);
			case UMLPackage.COMPONENT_REALIZATION__ABSTRACTION :
				return basicSetAbstraction(null, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(
			NotificationChain msgs) {
		switch (eContainerFeatureID) {
			case UMLPackage.COMPONENT_REALIZATION__OWNING_TEMPLATE_PARAMETER :
				return eInternalContainer().eInverseRemove(this,
					UMLPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
					TemplateParameter.class, msgs);
			case UMLPackage.COMPONENT_REALIZATION__ABSTRACTION :
				return eInternalContainer().eInverseRemove(this,
					UMLPackage.COMPONENT__REALIZATION, Component.class, msgs);
		}
		return eDynamicBasicRemoveFromContainer(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.COMPONENT_REALIZATION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.COMPONENT_REALIZATION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.COMPONENT_REALIZATION__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.COMPONENT_REALIZATION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.COMPONENT_REALIZATION__NAME :
				return getName();
			case UMLPackage.COMPONENT_REALIZATION__VISIBILITY :
				return getVisibility();
			case UMLPackage.COMPONENT_REALIZATION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.COMPONENT_REALIZATION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.COMPONENT_REALIZATION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.COMPONENT_REALIZATION__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.COMPONENT_REALIZATION__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.COMPONENT_REALIZATION__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.COMPONENT_REALIZATION__RELATED_ELEMENT :
				return getRelatedElements();
			case UMLPackage.COMPONENT_REALIZATION__SOURCE :
				return getSources();
			case UMLPackage.COMPONENT_REALIZATION__TARGET :
				return getTargets();
			case UMLPackage.COMPONENT_REALIZATION__SUPPLIER :
				return getSuppliers();
			case UMLPackage.COMPONENT_REALIZATION__CLIENT :
				return getClients();
			case UMLPackage.COMPONENT_REALIZATION__MAPPING :
				if (resolve)
					return getMapping();
				return basicGetMapping();
			case UMLPackage.COMPONENT_REALIZATION__ABSTRACTION :
				if (resolve)
					return getAbstraction();
				return basicGetAbstraction();
			case UMLPackage.COMPONENT_REALIZATION__REALIZING_CLASSIFIER :
				if (resolve)
					return getRealizingClassifier();
				return basicGetRealizingClassifier();
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
			case UMLPackage.COMPONENT_REALIZATION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll(
					(Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.COMPONENT_REALIZATION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll(
					(Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.COMPONENT_REALIZATION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.COMPONENT_REALIZATION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.COMPONENT_REALIZATION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll(
					(Collection<? extends Dependency>) newValue);
				return;
			case UMLPackage.COMPONENT_REALIZATION__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.COMPONENT_REALIZATION__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.COMPONENT_REALIZATION__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.COMPONENT_REALIZATION__SUPPLIER :
				getSuppliers().clear();
				getSuppliers().addAll(
					(Collection<? extends NamedElement>) newValue);
				return;
			case UMLPackage.COMPONENT_REALIZATION__CLIENT :
				getClients().clear();
				getClients().addAll(
					(Collection<? extends NamedElement>) newValue);
				return;
			case UMLPackage.COMPONENT_REALIZATION__MAPPING :
				setMapping((OpaqueExpression) newValue);
				return;
			case UMLPackage.COMPONENT_REALIZATION__ABSTRACTION :
				setAbstraction((Component) newValue);
				return;
			case UMLPackage.COMPONENT_REALIZATION__REALIZING_CLASSIFIER :
				setRealizingClassifier((Classifier) newValue);
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
			case UMLPackage.COMPONENT_REALIZATION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.COMPONENT_REALIZATION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.COMPONENT_REALIZATION__NAME :
				unsetName();
				return;
			case UMLPackage.COMPONENT_REALIZATION__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.COMPONENT_REALIZATION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.COMPONENT_REALIZATION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.COMPONENT_REALIZATION__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.COMPONENT_REALIZATION__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.COMPONENT_REALIZATION__SUPPLIER :
				getSuppliers().clear();
				return;
			case UMLPackage.COMPONENT_REALIZATION__CLIENT :
				getClients().clear();
				return;
			case UMLPackage.COMPONENT_REALIZATION__MAPPING :
				setMapping((OpaqueExpression) null);
				return;
			case UMLPackage.COMPONENT_REALIZATION__ABSTRACTION :
				setAbstraction((Component) null);
				return;
			case UMLPackage.COMPONENT_REALIZATION__REALIZING_CLASSIFIER :
				setRealizingClassifier((Classifier) null);
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
			case UMLPackage.COMPONENT_REALIZATION__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.COMPONENT_REALIZATION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.COMPONENT_REALIZATION__OWNER :
				return isSetOwner();
			case UMLPackage.COMPONENT_REALIZATION__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.COMPONENT_REALIZATION__NAME :
				return isSetName();
			case UMLPackage.COMPONENT_REALIZATION__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.COMPONENT_REALIZATION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.COMPONENT_REALIZATION__CLIENT_DEPENDENCY :
				return clientDependencies != null
					&& !clientDependencies.isEmpty();
			case UMLPackage.COMPONENT_REALIZATION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.COMPONENT_REALIZATION__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.COMPONENT_REALIZATION__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.COMPONENT_REALIZATION__TEMPLATE_PARAMETER :
				return templateParameter != null;
			case UMLPackage.COMPONENT_REALIZATION__RELATED_ELEMENT :
				return isSetRelatedElements();
			case UMLPackage.COMPONENT_REALIZATION__SOURCE :
				return isSetSources();
			case UMLPackage.COMPONENT_REALIZATION__TARGET :
				return isSetTargets();
			case UMLPackage.COMPONENT_REALIZATION__SUPPLIER :
				return suppliers != null && !suppliers.isEmpty();
			case UMLPackage.COMPONENT_REALIZATION__CLIENT :
				return clients != null && !clients.isEmpty();
			case UMLPackage.COMPONENT_REALIZATION__MAPPING :
				return mapping != null;
			case UMLPackage.COMPONENT_REALIZATION__ABSTRACTION :
				return basicGetAbstraction() != null;
			case UMLPackage.COMPONENT_REALIZATION__REALIZING_CLASSIFIER :
				return realizingClassifier != null;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element basicGetOwner() {

		Component abstraction = basicGetAbstraction();
		if (abstraction != null) {
			return abstraction;
		}
		return super.basicGetOwner();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwner() {
		return super.isSetOwner()
			|| eIsSet(UMLPackage.COMPONENT_REALIZATION__ABSTRACTION);
	}

} //ComponentRealizationImpl
