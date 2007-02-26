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
 * $Id: InformationFlowImpl.java,v 1.15 2007/02/26 16:17:55 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.ActivityEdge;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.DirectedRelationship;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.InformationFlow;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Relationship;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.InformationFlowOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Information Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InformationFlowImpl#getRelatedElements <em>Related Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InformationFlowImpl#getSources <em>Source</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InformationFlowImpl#getTargets <em>Target</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InformationFlowImpl#getRealizations <em>Realization</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InformationFlowImpl#getConveyeds <em>Conveyed</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InformationFlowImpl#getInformationSources <em>Information Source</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InformationFlowImpl#getInformationTargets <em>Information Target</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InformationFlowImpl#getRealizingActivityEdges <em>Realizing Activity Edge</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InformationFlowImpl#getRealizingConnectors <em>Realizing Connector</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InformationFlowImpl#getRealizingMessages <em>Realizing Message</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InformationFlowImpl
		extends PackageableElementImpl
		implements InformationFlow {

	/**
	 * The cached value of the '{@link #getRealizations() <em>Realization</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizations()
	 * @generated
	 * @ordered
	 */
	protected EList<Relationship> realizations;

	/**
	 * The cached value of the '{@link #getConveyeds() <em>Conveyed</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConveyeds()
	 * @generated
	 * @ordered
	 */
	protected EList<Classifier> conveyeds;

	/**
	 * The cached value of the '{@link #getInformationSources() <em>Information Source</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformationSources()
	 * @generated
	 * @ordered
	 */
	protected EList<NamedElement> informationSources;

	/**
	 * The cached value of the '{@link #getInformationTargets() <em>Information Target</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformationTargets()
	 * @generated
	 * @ordered
	 */
	protected EList<NamedElement> informationTargets;

	/**
	 * The cached value of the '{@link #getRealizingActivityEdges() <em>Realizing Activity Edge</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizingActivityEdges()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityEdge> realizingActivityEdges;

	/**
	 * The cached value of the '{@link #getRealizingConnectors() <em>Realizing Connector</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizingConnectors()
	 * @generated
	 * @ordered
	 */
	protected EList<Connector> realizingConnectors;

	/**
	 * The cached value of the '{@link #getRealizingMessages() <em>Realizing Message</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizingMessages()
	 * @generated
	 * @ordered
	 */
	protected EList<Message> realizingMessages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InformationFlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.INFORMATION_FLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getRelatedElements() {

		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<Element> relatedElements = (EList<Element>) cache.get(
				eResource, this,
				UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
			if (relatedElements == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT,
					relatedElements = new DerivedUnionEObjectEList<Element>(
						Element.class, this,
						UMLPackage.INFORMATION_FLOW__RELATED_ELEMENT,
						RELATED_ELEMENT_ESUBSETS));
			}
			return relatedElements;
		}
		return new DerivedUnionEObjectEList<Element>(Element.class, this,
			UMLPackage.INFORMATION_FLOW__RELATED_ELEMENT,
			RELATED_ELEMENT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getSources() {

		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<Element> sources = (EList<Element>) cache.get(eResource,
				this, UMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE);
			if (sources == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE,
					sources = new DerivedUnionEObjectEList<Element>(
						Element.class, this,
						UMLPackage.INFORMATION_FLOW__SOURCE, SOURCE_ESUBSETS));
			}
			return sources;
		}
		return new DerivedUnionEObjectEList<Element>(Element.class, this,
			UMLPackage.INFORMATION_FLOW__SOURCE, SOURCE_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getTargets() {

		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<Element> targets = (EList<Element>) cache.get(eResource,
				this, UMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET);
			if (targets == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET,
					targets = new DerivedUnionEObjectEList<Element>(
						Element.class, this,
						UMLPackage.INFORMATION_FLOW__TARGET, TARGET_ESUBSETS));
			}
			return targets;
		}
		return new DerivedUnionEObjectEList<Element>(Element.class, this,
			UMLPackage.INFORMATION_FLOW__TARGET, TARGET_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relationship> getRealizations() {
		if (realizations == null) {
			realizations = new EObjectResolvingEList<Relationship>(
				Relationship.class, this,
				UMLPackage.INFORMATION_FLOW__REALIZATION);
		}
		return realizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getConveyeds() {
		if (conveyeds == null) {
			conveyeds = new EObjectResolvingEList<Classifier>(Classifier.class,
				this, UMLPackage.INFORMATION_FLOW__CONVEYED);
		}
		return conveyeds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getConveyed(String name) {
		return getConveyed(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getConveyed(String name, boolean ignoreCase, EClass eClass) {
		conveyedLoop : for (Classifier conveyed : getConveyeds()) {
			if (eClass != null && !eClass.isInstance(conveyed))
				continue conveyedLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(conveyed.getName())
				: name.equals(conveyed.getName())))
				continue conveyedLoop;
			return conveyed;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedElement> getInformationSources() {
		if (informationSources == null) {
			informationSources = new EObjectResolvingEList<NamedElement>(
				NamedElement.class, this,
				UMLPackage.INFORMATION_FLOW__INFORMATION_SOURCE);
		}
		return informationSources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement getInformationSource(String name) {
		return getInformationSource(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement getInformationSource(String name, boolean ignoreCase,
			EClass eClass) {
		informationSourceLoop : for (NamedElement informationSource : getInformationSources()) {
			if (eClass != null && !eClass.isInstance(informationSource))
				continue informationSourceLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(informationSource.getName())
				: name.equals(informationSource.getName())))
				continue informationSourceLoop;
			return informationSource;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedElement> getInformationTargets() {
		if (informationTargets == null) {
			informationTargets = new EObjectResolvingEList<NamedElement>(
				NamedElement.class, this,
				UMLPackage.INFORMATION_FLOW__INFORMATION_TARGET);
		}
		return informationTargets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement getInformationTarget(String name) {
		return getInformationTarget(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement getInformationTarget(String name, boolean ignoreCase,
			EClass eClass) {
		informationTargetLoop : for (NamedElement informationTarget : getInformationTargets()) {
			if (eClass != null && !eClass.isInstance(informationTarget))
				continue informationTargetLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(informationTarget.getName())
				: name.equals(informationTarget.getName())))
				continue informationTargetLoop;
			return informationTarget;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityEdge> getRealizingActivityEdges() {
		if (realizingActivityEdges == null) {
			realizingActivityEdges = new EObjectResolvingEList<ActivityEdge>(
				ActivityEdge.class, this,
				UMLPackage.INFORMATION_FLOW__REALIZING_ACTIVITY_EDGE);
		}
		return realizingActivityEdges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityEdge getRealizingActivityEdge(String name) {
		return getRealizingActivityEdge(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityEdge getRealizingActivityEdge(String name,
			boolean ignoreCase, EClass eClass) {
		realizingActivityEdgeLoop : for (ActivityEdge realizingActivityEdge : getRealizingActivityEdges()) {
			if (eClass != null && !eClass.isInstance(realizingActivityEdge))
				continue realizingActivityEdgeLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(realizingActivityEdge.getName())
				: name.equals(realizingActivityEdge.getName())))
				continue realizingActivityEdgeLoop;
			return realizingActivityEdge;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connector> getRealizingConnectors() {
		if (realizingConnectors == null) {
			realizingConnectors = new EObjectResolvingEList<Connector>(
				Connector.class, this,
				UMLPackage.INFORMATION_FLOW__REALIZING_CONNECTOR);
		}
		return realizingConnectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector getRealizingConnector(String name) {
		return getRealizingConnector(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector getRealizingConnector(String name, boolean ignoreCase) {
		realizingConnectorLoop : for (Connector realizingConnector : getRealizingConnectors()) {
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(realizingConnector.getName())
				: name.equals(realizingConnector.getName())))
				continue realizingConnectorLoop;
			return realizingConnector;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Message> getRealizingMessages() {
		if (realizingMessages == null) {
			realizingMessages = new EObjectResolvingEList<Message>(
				Message.class, this,
				UMLPackage.INFORMATION_FLOW__REALIZING_MESSAGE);
		}
		return realizingMessages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message getRealizingMessage(String name) {
		return getRealizingMessage(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message getRealizingMessage(String name, boolean ignoreCase) {
		realizingMessageLoop : for (Message realizingMessage : getRealizingMessages()) {
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(realizingMessage.getName())
				: name.equals(realizingMessage.getName())))
				continue realizingMessageLoop;
			return realizingMessage;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSourcesAndTargetsKind(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return InformationFlowOperations.validateSourcesAndTargetsKind(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMustConform(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return InformationFlowOperations.validateMustConform(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConveyClassifiers(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return InformationFlowOperations.validateConveyClassifiers(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.INFORMATION_FLOW__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.INFORMATION_FLOW__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.INFORMATION_FLOW__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.INFORMATION_FLOW__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.INFORMATION_FLOW__NAME :
				return getName();
			case UMLPackage.INFORMATION_FLOW__VISIBILITY :
				return getVisibility();
			case UMLPackage.INFORMATION_FLOW__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.INFORMATION_FLOW__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.INFORMATION_FLOW__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.INFORMATION_FLOW__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.INFORMATION_FLOW__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.INFORMATION_FLOW__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.INFORMATION_FLOW__RELATED_ELEMENT :
				return getRelatedElements();
			case UMLPackage.INFORMATION_FLOW__SOURCE :
				return getSources();
			case UMLPackage.INFORMATION_FLOW__TARGET :
				return getTargets();
			case UMLPackage.INFORMATION_FLOW__REALIZATION :
				return getRealizations();
			case UMLPackage.INFORMATION_FLOW__CONVEYED :
				return getConveyeds();
			case UMLPackage.INFORMATION_FLOW__INFORMATION_SOURCE :
				return getInformationSources();
			case UMLPackage.INFORMATION_FLOW__INFORMATION_TARGET :
				return getInformationTargets();
			case UMLPackage.INFORMATION_FLOW__REALIZING_ACTIVITY_EDGE :
				return getRealizingActivityEdges();
			case UMLPackage.INFORMATION_FLOW__REALIZING_CONNECTOR :
				return getRealizingConnectors();
			case UMLPackage.INFORMATION_FLOW__REALIZING_MESSAGE :
				return getRealizingMessages();
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
			case UMLPackage.INFORMATION_FLOW__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll(
					(Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.INFORMATION_FLOW__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll(
					(Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.INFORMATION_FLOW__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.INFORMATION_FLOW__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.INFORMATION_FLOW__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll(
					(Collection<? extends Dependency>) newValue);
				return;
			case UMLPackage.INFORMATION_FLOW__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.INFORMATION_FLOW__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.INFORMATION_FLOW__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.INFORMATION_FLOW__REALIZATION :
				getRealizations().clear();
				getRealizations().addAll(
					(Collection<? extends Relationship>) newValue);
				return;
			case UMLPackage.INFORMATION_FLOW__CONVEYED :
				getConveyeds().clear();
				getConveyeds().addAll(
					(Collection<? extends Classifier>) newValue);
				return;
			case UMLPackage.INFORMATION_FLOW__INFORMATION_SOURCE :
				getInformationSources().clear();
				getInformationSources().addAll(
					(Collection<? extends NamedElement>) newValue);
				return;
			case UMLPackage.INFORMATION_FLOW__INFORMATION_TARGET :
				getInformationTargets().clear();
				getInformationTargets().addAll(
					(Collection<? extends NamedElement>) newValue);
				return;
			case UMLPackage.INFORMATION_FLOW__REALIZING_ACTIVITY_EDGE :
				getRealizingActivityEdges().clear();
				getRealizingActivityEdges().addAll(
					(Collection<? extends ActivityEdge>) newValue);
				return;
			case UMLPackage.INFORMATION_FLOW__REALIZING_CONNECTOR :
				getRealizingConnectors().clear();
				getRealizingConnectors().addAll(
					(Collection<? extends Connector>) newValue);
				return;
			case UMLPackage.INFORMATION_FLOW__REALIZING_MESSAGE :
				getRealizingMessages().clear();
				getRealizingMessages().addAll(
					(Collection<? extends Message>) newValue);
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
			case UMLPackage.INFORMATION_FLOW__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.INFORMATION_FLOW__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.INFORMATION_FLOW__NAME :
				unsetName();
				return;
			case UMLPackage.INFORMATION_FLOW__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.INFORMATION_FLOW__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.INFORMATION_FLOW__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.INFORMATION_FLOW__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.INFORMATION_FLOW__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.INFORMATION_FLOW__REALIZATION :
				getRealizations().clear();
				return;
			case UMLPackage.INFORMATION_FLOW__CONVEYED :
				getConveyeds().clear();
				return;
			case UMLPackage.INFORMATION_FLOW__INFORMATION_SOURCE :
				getInformationSources().clear();
				return;
			case UMLPackage.INFORMATION_FLOW__INFORMATION_TARGET :
				getInformationTargets().clear();
				return;
			case UMLPackage.INFORMATION_FLOW__REALIZING_ACTIVITY_EDGE :
				getRealizingActivityEdges().clear();
				return;
			case UMLPackage.INFORMATION_FLOW__REALIZING_CONNECTOR :
				getRealizingConnectors().clear();
				return;
			case UMLPackage.INFORMATION_FLOW__REALIZING_MESSAGE :
				getRealizingMessages().clear();
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
			case UMLPackage.INFORMATION_FLOW__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.INFORMATION_FLOW__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.INFORMATION_FLOW__OWNER :
				return isSetOwner();
			case UMLPackage.INFORMATION_FLOW__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.INFORMATION_FLOW__NAME :
				return isSetName();
			case UMLPackage.INFORMATION_FLOW__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.INFORMATION_FLOW__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.INFORMATION_FLOW__CLIENT_DEPENDENCY :
				return clientDependencies != null
					&& !clientDependencies.isEmpty();
			case UMLPackage.INFORMATION_FLOW__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.INFORMATION_FLOW__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.INFORMATION_FLOW__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.INFORMATION_FLOW__TEMPLATE_PARAMETER :
				return templateParameter != null;
			case UMLPackage.INFORMATION_FLOW__RELATED_ELEMENT :
				return isSetRelatedElements();
			case UMLPackage.INFORMATION_FLOW__SOURCE :
				return isSetSources();
			case UMLPackage.INFORMATION_FLOW__TARGET :
				return isSetTargets();
			case UMLPackage.INFORMATION_FLOW__REALIZATION :
				return realizations != null && !realizations.isEmpty();
			case UMLPackage.INFORMATION_FLOW__CONVEYED :
				return conveyeds != null && !conveyeds.isEmpty();
			case UMLPackage.INFORMATION_FLOW__INFORMATION_SOURCE :
				return informationSources != null
					&& !informationSources.isEmpty();
			case UMLPackage.INFORMATION_FLOW__INFORMATION_TARGET :
				return informationTargets != null
					&& !informationTargets.isEmpty();
			case UMLPackage.INFORMATION_FLOW__REALIZING_ACTIVITY_EDGE :
				return realizingActivityEdges != null
					&& !realizingActivityEdges.isEmpty();
			case UMLPackage.INFORMATION_FLOW__REALIZING_CONNECTOR :
				return realizingConnectors != null
					&& !realizingConnectors.isEmpty();
			case UMLPackage.INFORMATION_FLOW__REALIZING_MESSAGE :
				return realizingMessages != null
					&& !realizingMessages.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Relationship.class) {
			switch (derivedFeatureID) {
				case UMLPackage.INFORMATION_FLOW__RELATED_ELEMENT :
					return UMLPackage.RELATIONSHIP__RELATED_ELEMENT;
				default :
					return -1;
			}
		}
		if (baseClass == DirectedRelationship.class) {
			switch (derivedFeatureID) {
				case UMLPackage.INFORMATION_FLOW__SOURCE :
					return UMLPackage.DIRECTED_RELATIONSHIP__SOURCE;
				case UMLPackage.INFORMATION_FLOW__TARGET :
					return UMLPackage.DIRECTED_RELATIONSHIP__TARGET;
				default :
					return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Relationship.class) {
			switch (baseFeatureID) {
				case UMLPackage.RELATIONSHIP__RELATED_ELEMENT :
					return UMLPackage.INFORMATION_FLOW__RELATED_ELEMENT;
				default :
					return -1;
			}
		}
		if (baseClass == DirectedRelationship.class) {
			switch (baseFeatureID) {
				case UMLPackage.DIRECTED_RELATIONSHIP__SOURCE :
					return UMLPackage.INFORMATION_FLOW__SOURCE;
				case UMLPackage.DIRECTED_RELATIONSHIP__TARGET :
					return UMLPackage.INFORMATION_FLOW__TARGET;
				default :
					return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getRelatedElements() <em>Related Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedElements()
	 * @generated
	 * @ordered
	 */
	protected static final int[] RELATED_ELEMENT_ESUBSETS = new int[]{
		UMLPackage.INFORMATION_FLOW__SOURCE,
		UMLPackage.INFORMATION_FLOW__TARGET};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRelatedElements() {
		return isSetSources() || isSetTargets();
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getSources() <em>Source</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSources()
	 * @generated
	 * @ordered
	 */
	protected static final int[] SOURCE_ESUBSETS = new int[]{UMLPackage.INFORMATION_FLOW__INFORMATION_SOURCE};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSources() {
		return eIsSet(UMLPackage.INFORMATION_FLOW__INFORMATION_SOURCE);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getTargets() <em>Target</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargets()
	 * @generated
	 * @ordered
	 */
	protected static final int[] TARGET_ESUBSETS = new int[]{UMLPackage.INFORMATION_FLOW__INFORMATION_TARGET};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTargets() {
		return eIsSet(UMLPackage.INFORMATION_FLOW__INFORMATION_TARGET);
	}

} //InformationFlowImpl
