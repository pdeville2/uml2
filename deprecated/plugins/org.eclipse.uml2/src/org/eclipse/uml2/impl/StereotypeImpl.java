/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * $Id: StereotypeImpl.java,v 1.22 2004/06/18 04:34:32 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Set;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.Behavior;
import org.eclipse.uml2.CollaborationOccurrence;
import org.eclipse.uml2.Extension;
import org.eclipse.uml2.Profile;
import org.eclipse.uml2.Stereotype;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateParameter;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;
import org.eclipse.uml2.internal.operation.StereotypeOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stereotype</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class StereotypeImpl extends ClassImpl implements Stereotype {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StereotypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getStereotype();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.STEREOTYPE__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
				case UML2Package.STEREOTYPE__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicAdd(otherEnd, msgs);
				case UML2Package.STEREOTYPE__OWNED_TEMPLATE_SIGNATURE:
					if (ownedTemplateSignature != null)
						msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.STEREOTYPE__OWNED_TEMPLATE_SIGNATURE, null, msgs);
					return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
				case UML2Package.STEREOTYPE__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicAdd(otherEnd, msgs);
				case UML2Package.STEREOTYPE__OWNED_RULE:
					return ((InternalEList)getOwnedRules()).basicAdd(otherEnd, msgs);
				case UML2Package.STEREOTYPE__ELEMENT_IMPORT:
					return ((InternalEList)getElementImports()).basicAdd(otherEnd, msgs);
				case UML2Package.STEREOTYPE__PACKAGE_IMPORT:
					return ((InternalEList)getPackageImports()).basicAdd(otherEnd, msgs);
				case UML2Package.STEREOTYPE__TEMPLATE_PARAMETER:
					if (templateParameter != null)
						msgs = ((InternalEObject)templateParameter).eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
					return basicSetTemplateParameter((TemplateParameter)otherEnd, msgs);
				case UML2Package.STEREOTYPE__OWNING_PARAMETER:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.STEREOTYPE__OWNING_PARAMETER, msgs);
				case UML2Package.STEREOTYPE__GENERALIZATION:
					return ((InternalEList)getGeneralizations()).basicAdd(otherEnd, msgs);
				case UML2Package.STEREOTYPE__SUBSTITUTION:
					return ((InternalEList)getSubstitutions()).basicAdd(otherEnd, msgs);
				case UML2Package.STEREOTYPE__POWERTYPE_EXTENT:
					return ((InternalEList)getPowertypeExtents()).basicAdd(otherEnd, msgs);
				case UML2Package.STEREOTYPE__USE_CASE:
					return ((InternalEList)getUseCases()).basicAdd(otherEnd, msgs);
				case UML2Package.STEREOTYPE__OWNED_BEHAVIOR:
					return ((InternalEList)getOwnedBehaviors()).basicAdd(otherEnd, msgs);
				case UML2Package.STEREOTYPE__IMPLEMENTATION:
					return ((InternalEList)getImplementations()).basicAdd(otherEnd, msgs);
				case UML2Package.STEREOTYPE__OWNED_STATE_MACHINE:
					return ((InternalEList)getOwnedStateMachines()).basicAdd(otherEnd, msgs);
				case UML2Package.STEREOTYPE__OWNED_OPERATION:
					return ((InternalEList)getOwnedOperations()).basicAdd(otherEnd, msgs);
				default:
					return eDynamicInverseAdd(otherEnd, featureID, baseClass, msgs);
			}
		}
		if (eContainer != null)
			msgs = eBasicRemoveFromContainer(msgs);
		return eBasicSetContainer(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.STEREOTYPE__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case UML2Package.STEREOTYPE__OWNED_COMMENT:
					return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
				case UML2Package.STEREOTYPE__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
				case UML2Package.STEREOTYPE__OWNED_TEMPLATE_SIGNATURE:
					return basicSetOwnedTemplateSignature(null, msgs);
				case UML2Package.STEREOTYPE__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
				case UML2Package.STEREOTYPE__NAME_EXPRESSION:
					return basicSetNameExpression(null, msgs);
				case UML2Package.STEREOTYPE__OWNED_RULE:
					return ((InternalEList)getOwnedRules()).basicRemove(otherEnd, msgs);
				case UML2Package.STEREOTYPE__ELEMENT_IMPORT:
					return ((InternalEList)getElementImports()).basicRemove(otherEnd, msgs);
				case UML2Package.STEREOTYPE__PACKAGE_IMPORT:
					return ((InternalEList)getPackageImports()).basicRemove(otherEnd, msgs);
				case UML2Package.STEREOTYPE__TEMPLATE_PARAMETER:
					return basicSetTemplateParameter(null, msgs);
				case UML2Package.STEREOTYPE__OWNING_PARAMETER:
					return eBasicSetContainer(null, UML2Package.STEREOTYPE__OWNING_PARAMETER, msgs);
				case UML2Package.STEREOTYPE__GENERALIZATION:
					return ((InternalEList)getGeneralizations()).basicRemove(otherEnd, msgs);
				case UML2Package.STEREOTYPE__SUBSTITUTION:
					return ((InternalEList)getSubstitutions()).basicRemove(otherEnd, msgs);
				case UML2Package.STEREOTYPE__POWERTYPE_EXTENT:
					return ((InternalEList)getPowertypeExtents()).basicRemove(otherEnd, msgs);
				case UML2Package.STEREOTYPE__OWNED_USE_CASE:
					return ((InternalEList)getOwnedUseCases()).basicRemove(otherEnd, msgs);
				case UML2Package.STEREOTYPE__USE_CASE:
					return ((InternalEList)getUseCases()).basicRemove(otherEnd, msgs);
				case UML2Package.STEREOTYPE__OCCURRENCE:
					return ((InternalEList)getOccurrences()).basicRemove(otherEnd, msgs);
				case UML2Package.STEREOTYPE__OWNED_BEHAVIOR:
					return ((InternalEList)getOwnedBehaviors()).basicRemove(otherEnd, msgs);
				case UML2Package.STEREOTYPE__IMPLEMENTATION:
					return ((InternalEList)getImplementations()).basicRemove(otherEnd, msgs);
				case UML2Package.STEREOTYPE__OWNED_TRIGGER:
					return ((InternalEList)getOwnedTriggers()).basicRemove(otherEnd, msgs);
				case UML2Package.STEREOTYPE__OWNED_STATE_MACHINE:
					return ((InternalEList)getOwnedStateMachines()).basicRemove(otherEnd, msgs);
				case UML2Package.STEREOTYPE__OWNED_ATTRIBUTE:
					return ((InternalEList)getOwnedAttributes()).basicRemove(otherEnd, msgs);
				case UML2Package.STEREOTYPE__OWNED_CONNECTOR:
					return ((InternalEList)getOwnedConnectors()).basicRemove(otherEnd, msgs);
				case UML2Package.STEREOTYPE__OWNED_PORT:
					return ((InternalEList)getOwnedPorts()).basicRemove(otherEnd, msgs);
				case UML2Package.STEREOTYPE__OWNED_OPERATION:
					return ((InternalEList)getOwnedOperations()).basicRemove(otherEnd, msgs);
				case UML2Package.STEREOTYPE__NESTED_CLASSIFIER:
					return ((InternalEList)getNestedClassifiers()).basicRemove(otherEnd, msgs);
				case UML2Package.STEREOTYPE__OWNED_RECEPTION:
					return ((InternalEList)getOwnedReceptions()).basicRemove(otherEnd, msgs);
				default:
					return eDynamicInverseRemove(otherEnd, featureID, baseClass, msgs);
			}
		}
		return eBasicSetContainer(null, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainer(NotificationChain msgs) {
		if (eContainerFeatureID >= 0) {
			switch (eContainerFeatureID) {
				case UML2Package.STEREOTYPE__OWNING_PARAMETER:
					return eContainer.eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
				default:
					return eDynamicBasicRemoveFromContainer(msgs);
			}
		}
		return eContainer.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - eContainerFeatureID, null, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.STEREOTYPE__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.STEREOTYPE__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.STEREOTYPE__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.STEREOTYPE__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.STEREOTYPE__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.STEREOTYPE__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.STEREOTYPE__NAME:
				return getName();
			case UML2Package.STEREOTYPE__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.STEREOTYPE__VISIBILITY:
				return getVisibility();
			case UML2Package.STEREOTYPE__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.STEREOTYPE__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.STEREOTYPE__MEMBER:
				return getMembers();
			case UML2Package.STEREOTYPE__OWNED_RULE:
				return getOwnedRules();
			case UML2Package.STEREOTYPE__IMPORTED_MEMBER:
				return getImportedMembers();
			case UML2Package.STEREOTYPE__ELEMENT_IMPORT:
				return getElementImports();
			case UML2Package.STEREOTYPE__PACKAGE_IMPORT:
				return getPackageImports();
			case UML2Package.STEREOTYPE__TEMPLATE_PARAMETER:
				if (resolve) return getTemplateParameter();
				return basicGetTemplateParameter();
			case UML2Package.STEREOTYPE__OWNING_PARAMETER:
				return getOwningParameter();
			case UML2Package.STEREOTYPE__PACKAGEABLE_ELEMENT_VISIBILITY:
				return getPackageableElement_visibility();
			case UML2Package.STEREOTYPE__PACKAGE:
				if (resolve) return getPackage();
				return basicGetPackage();
			case UML2Package.STEREOTYPE__REDEFINITION_CONTEXT:
				return getRedefinitionContexts();
			case UML2Package.STEREOTYPE__IS_LEAF:
				return isLeaf() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.STEREOTYPE__FEATURE:
				return getFeatures();
			case UML2Package.STEREOTYPE__IS_ABSTRACT:
				return isAbstract() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.STEREOTYPE__INHERITED_MEMBER:
				return getInheritedMembers();
			case UML2Package.STEREOTYPE__GENERAL:
				return getGenerals();
			case UML2Package.STEREOTYPE__GENERALIZATION:
				return getGeneralizations();
			case UML2Package.STEREOTYPE__ATTRIBUTE:
				return getAttributes();
			case UML2Package.STEREOTYPE__REDEFINED_CLASSIFIER:
				return getRedefinedClassifiers();
			case UML2Package.STEREOTYPE__SUBSTITUTION:
				return getSubstitutions();
			case UML2Package.STEREOTYPE__POWERTYPE_EXTENT:
				return getPowertypeExtents();
			case UML2Package.STEREOTYPE__OWNED_USE_CASE:
				return getOwnedUseCases();
			case UML2Package.STEREOTYPE__USE_CASE:
				return getUseCases();
			case UML2Package.STEREOTYPE__REPRESENTATION:
				return getRepresentation();
			case UML2Package.STEREOTYPE__OCCURRENCE:
				return getOccurrences();
			case UML2Package.STEREOTYPE__OWNED_BEHAVIOR:
				return getOwnedBehaviors();
			case UML2Package.STEREOTYPE__CLASSIFIER_BEHAVIOR:
				return getClassifierBehavior();
			case UML2Package.STEREOTYPE__IMPLEMENTATION:
				return getImplementations();
			case UML2Package.STEREOTYPE__OWNED_TRIGGER:
				return getOwnedTriggers();
			case UML2Package.STEREOTYPE__OWNED_STATE_MACHINE:
				return getOwnedStateMachines();
			case UML2Package.STEREOTYPE__OWNED_ATTRIBUTE:
				return getOwnedAttributes();
			case UML2Package.STEREOTYPE__PART:
				return getParts();
			case UML2Package.STEREOTYPE__ROLE:
				return getRoles();
			case UML2Package.STEREOTYPE__OWNED_CONNECTOR:
				return getOwnedConnectors();
			case UML2Package.STEREOTYPE__OWNED_PORT:
				return getOwnedPorts();
			case UML2Package.STEREOTYPE__OWNED_OPERATION:
				return getOwnedOperations();
			case UML2Package.STEREOTYPE__SUPER_CLASS:
				return getSuperClasses();
			case UML2Package.STEREOTYPE__EXTENSION:
				return getExtensions();
			case UML2Package.STEREOTYPE__NESTED_CLASSIFIER:
				return getNestedClassifiers();
			case UML2Package.STEREOTYPE__IS_ACTIVE:
				return isActive() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.STEREOTYPE__OWNED_RECEPTION:
				return getOwnedReceptions();
		}
		return eDynamicGet(eFeature, resolve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(EStructuralFeature eFeature, Object newValue) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.STEREOTYPE__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.STEREOTYPE__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.STEREOTYPE__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.STEREOTYPE__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.STEREOTYPE__NAME:
				setName((String)newValue);
				return;
			case UML2Package.STEREOTYPE__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.STEREOTYPE__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.STEREOTYPE__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.STEREOTYPE__OWNED_RULE:
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection)newValue);
				return;
			case UML2Package.STEREOTYPE__ELEMENT_IMPORT:
				getElementImports().clear();
				getElementImports().addAll((Collection)newValue);
				return;
			case UML2Package.STEREOTYPE__PACKAGE_IMPORT:
				getPackageImports().clear();
				getPackageImports().addAll((Collection)newValue);
				return;
			case UML2Package.STEREOTYPE__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)newValue);
				return;
			case UML2Package.STEREOTYPE__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)newValue);
				return;
			case UML2Package.STEREOTYPE__PACKAGEABLE_ELEMENT_VISIBILITY:
				setPackageableElement_visibility((VisibilityKind)newValue);
				return;
			case UML2Package.STEREOTYPE__IS_LEAF:
				setIsLeaf(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.STEREOTYPE__IS_ABSTRACT:
				setIsAbstract(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.STEREOTYPE__GENERALIZATION:
				getGeneralizations().clear();
				getGeneralizations().addAll((Collection)newValue);
				return;
			case UML2Package.STEREOTYPE__REDEFINED_CLASSIFIER:
				getRedefinedClassifiers().clear();
				getRedefinedClassifiers().addAll((Collection)newValue);
				return;
			case UML2Package.STEREOTYPE__SUBSTITUTION:
				getSubstitutions().clear();
				getSubstitutions().addAll((Collection)newValue);
				return;
			case UML2Package.STEREOTYPE__POWERTYPE_EXTENT:
				getPowertypeExtents().clear();
				getPowertypeExtents().addAll((Collection)newValue);
				return;
			case UML2Package.STEREOTYPE__OWNED_USE_CASE:
				getOwnedUseCases().clear();
				getOwnedUseCases().addAll((Collection)newValue);
				return;
			case UML2Package.STEREOTYPE__USE_CASE:
				getUseCases().clear();
				getUseCases().addAll((Collection)newValue);
				return;
			case UML2Package.STEREOTYPE__REPRESENTATION:
				setRepresentation((CollaborationOccurrence)newValue);
				return;
			case UML2Package.STEREOTYPE__OCCURRENCE:
				getOccurrences().clear();
				getOccurrences().addAll((Collection)newValue);
				return;
			case UML2Package.STEREOTYPE__OWNED_BEHAVIOR:
				getOwnedBehaviors().clear();
				getOwnedBehaviors().addAll((Collection)newValue);
				return;
			case UML2Package.STEREOTYPE__CLASSIFIER_BEHAVIOR:
				setClassifierBehavior((Behavior)newValue);
				return;
			case UML2Package.STEREOTYPE__IMPLEMENTATION:
				getImplementations().clear();
				getImplementations().addAll((Collection)newValue);
				return;
			case UML2Package.STEREOTYPE__OWNED_TRIGGER:
				getOwnedTriggers().clear();
				getOwnedTriggers().addAll((Collection)newValue);
				return;
			case UML2Package.STEREOTYPE__OWNED_STATE_MACHINE:
				getOwnedStateMachines().clear();
				getOwnedStateMachines().addAll((Collection)newValue);
				return;
			case UML2Package.STEREOTYPE__OWNED_ATTRIBUTE:
				getOwnedAttributes().clear();
				getOwnedAttributes().addAll((Collection)newValue);
				return;
			case UML2Package.STEREOTYPE__OWNED_CONNECTOR:
				getOwnedConnectors().clear();
				getOwnedConnectors().addAll((Collection)newValue);
				return;
			case UML2Package.STEREOTYPE__OWNED_PORT:
				getOwnedPorts().clear();
				getOwnedPorts().addAll((Collection)newValue);
				return;
			case UML2Package.STEREOTYPE__OWNED_OPERATION:
				getOwnedOperations().clear();
				getOwnedOperations().addAll((Collection)newValue);
				return;
			case UML2Package.STEREOTYPE__NESTED_CLASSIFIER:
				getNestedClassifiers().clear();
				getNestedClassifiers().addAll((Collection)newValue);
				return;
			case UML2Package.STEREOTYPE__IS_ACTIVE:
				setIsActive(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.STEREOTYPE__OWNED_RECEPTION:
				getOwnedReceptions().clear();
				getOwnedReceptions().addAll((Collection)newValue);
				return;
		}
		eDynamicSet(eFeature, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.STEREOTYPE__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.STEREOTYPE__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.STEREOTYPE__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.STEREOTYPE__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.STEREOTYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.STEREOTYPE__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.STEREOTYPE__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.STEREOTYPE__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.STEREOTYPE__OWNED_RULE:
				getOwnedRules().clear();
				return;
			case UML2Package.STEREOTYPE__ELEMENT_IMPORT:
				getElementImports().clear();
				return;
			case UML2Package.STEREOTYPE__PACKAGE_IMPORT:
				getPackageImports().clear();
				return;
			case UML2Package.STEREOTYPE__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)null);
				return;
			case UML2Package.STEREOTYPE__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)null);
				return;
			case UML2Package.STEREOTYPE__PACKAGEABLE_ELEMENT_VISIBILITY:
				setPackageableElement_visibility(PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT);
				return;
			case UML2Package.STEREOTYPE__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UML2Package.STEREOTYPE__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case UML2Package.STEREOTYPE__GENERALIZATION:
				getGeneralizations().clear();
				return;
			case UML2Package.STEREOTYPE__REDEFINED_CLASSIFIER:
				getRedefinedClassifiers().clear();
				return;
			case UML2Package.STEREOTYPE__SUBSTITUTION:
				getSubstitutions().clear();
				return;
			case UML2Package.STEREOTYPE__POWERTYPE_EXTENT:
				getPowertypeExtents().clear();
				return;
			case UML2Package.STEREOTYPE__OWNED_USE_CASE:
				getOwnedUseCases().clear();
				return;
			case UML2Package.STEREOTYPE__USE_CASE:
				getUseCases().clear();
				return;
			case UML2Package.STEREOTYPE__REPRESENTATION:
				setRepresentation((CollaborationOccurrence)null);
				return;
			case UML2Package.STEREOTYPE__OCCURRENCE:
				getOccurrences().clear();
				return;
			case UML2Package.STEREOTYPE__OWNED_BEHAVIOR:
				getOwnedBehaviors().clear();
				return;
			case UML2Package.STEREOTYPE__CLASSIFIER_BEHAVIOR:
				setClassifierBehavior((Behavior)null);
				return;
			case UML2Package.STEREOTYPE__IMPLEMENTATION:
				getImplementations().clear();
				return;
			case UML2Package.STEREOTYPE__OWNED_TRIGGER:
				getOwnedTriggers().clear();
				return;
			case UML2Package.STEREOTYPE__OWNED_STATE_MACHINE:
				getOwnedStateMachines().clear();
				return;
			case UML2Package.STEREOTYPE__OWNED_ATTRIBUTE:
				getOwnedAttributes().clear();
				return;
			case UML2Package.STEREOTYPE__OWNED_CONNECTOR:
				getOwnedConnectors().clear();
				return;
			case UML2Package.STEREOTYPE__OWNED_PORT:
				getOwnedPorts().clear();
				return;
			case UML2Package.STEREOTYPE__OWNED_OPERATION:
				getOwnedOperations().clear();
				return;
			case UML2Package.STEREOTYPE__NESTED_CLASSIFIER:
				getNestedClassifiers().clear();
				return;
			case UML2Package.STEREOTYPE__IS_ACTIVE:
				setIsActive(IS_ACTIVE_EDEFAULT);
				return;
			case UML2Package.STEREOTYPE__OWNED_RECEPTION:
				getOwnedReceptions().clear();
				return;
		}
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.STEREOTYPE__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.STEREOTYPE__OWNED_ELEMENT:
				return !getOwnedElements().isEmpty();
			case UML2Package.STEREOTYPE__OWNER:
				return basicGetOwner() != null;
			case UML2Package.STEREOTYPE__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.STEREOTYPE__TEMPLATE_BINDING:
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.STEREOTYPE__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.STEREOTYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.STEREOTYPE__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.STEREOTYPE__VISIBILITY:
				return getVisibility() != VISIBILITY_EDEFAULT;
			case UML2Package.STEREOTYPE__CLIENT_DEPENDENCY:
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.STEREOTYPE__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.STEREOTYPE__MEMBER:
				return !getMembers().isEmpty();
			case UML2Package.STEREOTYPE__OWNED_RULE:
				return ownedRule != null && !ownedRule.isEmpty();
			case UML2Package.STEREOTYPE__IMPORTED_MEMBER:
				return !getImportedMembers().isEmpty();
			case UML2Package.STEREOTYPE__ELEMENT_IMPORT:
				return elementImport != null && !elementImport.isEmpty();
			case UML2Package.STEREOTYPE__PACKAGE_IMPORT:
				return packageImport != null && !packageImport.isEmpty();
			case UML2Package.STEREOTYPE__TEMPLATE_PARAMETER:
				return templateParameter != null;
			case UML2Package.STEREOTYPE__OWNING_PARAMETER:
				return getOwningParameter() != null;
			case UML2Package.STEREOTYPE__PACKAGEABLE_ELEMENT_VISIBILITY:
				return packageableElement_visibility != PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT;
			case UML2Package.STEREOTYPE__PACKAGE:
				return basicGetPackage() != null;
			case UML2Package.STEREOTYPE__REDEFINITION_CONTEXT:
				return !getRedefinitionContexts().isEmpty();
			case UML2Package.STEREOTYPE__IS_LEAF:
				return isLeaf != IS_LEAF_EDEFAULT;
			case UML2Package.STEREOTYPE__FEATURE:
				return !getFeatures().isEmpty();
			case UML2Package.STEREOTYPE__IS_ABSTRACT:
				return isAbstract() != IS_ABSTRACT_EDEFAULT;
			case UML2Package.STEREOTYPE__INHERITED_MEMBER:
				return !getInheritedMembers().isEmpty();
			case UML2Package.STEREOTYPE__GENERAL:
				return !getGenerals().isEmpty();
			case UML2Package.STEREOTYPE__GENERALIZATION:
				return generalization != null && !generalization.isEmpty();
			case UML2Package.STEREOTYPE__ATTRIBUTE:
				return !getAttributes().isEmpty();
			case UML2Package.STEREOTYPE__REDEFINED_CLASSIFIER:
				return redefinedClassifier != null && !redefinedClassifier.isEmpty();
			case UML2Package.STEREOTYPE__SUBSTITUTION:
				return substitution != null && !substitution.isEmpty();
			case UML2Package.STEREOTYPE__POWERTYPE_EXTENT:
				return powertypeExtent != null && !powertypeExtent.isEmpty();
			case UML2Package.STEREOTYPE__OWNED_USE_CASE:
				return ownedUseCase != null && !ownedUseCase.isEmpty();
			case UML2Package.STEREOTYPE__USE_CASE:
				return useCase != null && !useCase.isEmpty();
			case UML2Package.STEREOTYPE__REPRESENTATION:
				return representation != null;
			case UML2Package.STEREOTYPE__OCCURRENCE:
				return occurrence != null && !occurrence.isEmpty();
			case UML2Package.STEREOTYPE__OWNED_BEHAVIOR:
				return ownedBehavior != null && !ownedBehavior.isEmpty();
			case UML2Package.STEREOTYPE__CLASSIFIER_BEHAVIOR:
				return classifierBehavior != null;
			case UML2Package.STEREOTYPE__IMPLEMENTATION:
				return implementation != null && !implementation.isEmpty();
			case UML2Package.STEREOTYPE__OWNED_TRIGGER:
				return ownedTrigger != null && !ownedTrigger.isEmpty();
			case UML2Package.STEREOTYPE__OWNED_STATE_MACHINE:
				return ownedStateMachine != null && !ownedStateMachine.isEmpty();
			case UML2Package.STEREOTYPE__OWNED_ATTRIBUTE:
				return !getOwnedAttributes().isEmpty();
			case UML2Package.STEREOTYPE__PART:
				return !getParts().isEmpty();
			case UML2Package.STEREOTYPE__ROLE:
				return !getRoles().isEmpty();
			case UML2Package.STEREOTYPE__OWNED_CONNECTOR:
				return ownedConnector != null && !ownedConnector.isEmpty();
			case UML2Package.STEREOTYPE__OWNED_PORT:
				return ownedPort != null && !ownedPort.isEmpty();
			case UML2Package.STEREOTYPE__OWNED_OPERATION:
				return ownedOperation != null && !ownedOperation.isEmpty();
			case UML2Package.STEREOTYPE__SUPER_CLASS:
				return !getSuperClasses().isEmpty();
			case UML2Package.STEREOTYPE__EXTENSION:
				return !getExtensions().isEmpty();
			case UML2Package.STEREOTYPE__NESTED_CLASSIFIER:
				return nestedClassifier != null && !nestedClassifier.isEmpty();
			case UML2Package.STEREOTYPE__IS_ACTIVE:
				return isActive != IS_ACTIVE_EDEFAULT;
			case UML2Package.STEREOTYPE__OWNED_RECEPTION:
				return ownedReception != null && !ownedReception.isEmpty();
		}
		return eDynamicIsSet(eFeature);
	}

	// <!-- begin-custom-operations -->

	private static Method GET_ALL_EXTENDED_E_CLASSES_METHOD = null;

	static {
		try {
			GET_ALL_EXTENDED_E_CLASSES_METHOD = StereotypeImpl.class.getMethod(
				"getAllExtendedEClasses", null); //$NON-NLS-1$
		} catch (Exception e) {
			// ignore
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.Stereotype#createExtension(org.eclipse.emf.ecore.EClass,
	 *      boolean)
	 */
	public Extension createExtension(EClass eClass, boolean required) {
		return StereotypeOperations.createExtension(this, eClass, required);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.Stereotype#getExtendedEClasses()
	 */
	public Set getAllExtendedEClasses() {
		Set allExtendedEClasses = (Set) getCacheAdapter().get(this,
			GET_ALL_EXTENDED_E_CLASSES_METHOD);

		if (null == allExtendedEClasses) {
			allExtendedEClasses = StereotypeOperations
				.getAllExtendedEClasses(this);
			getCacheAdapter().put(this, GET_ALL_EXTENDED_E_CLASSES_METHOD,
				allExtendedEClasses);
		}

		return allExtendedEClasses;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.Stereotype#getProfile()
	 */
	public Profile getProfile() {
		return StereotypeOperations.getProfile(this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.Stereotype#getKeyword()
	 */
	public String getKeyword() {
		return StereotypeOperations.getKeyword(this);
	}
	
	// <!-- end-custom-operations -->

} //StereotypeImpl
