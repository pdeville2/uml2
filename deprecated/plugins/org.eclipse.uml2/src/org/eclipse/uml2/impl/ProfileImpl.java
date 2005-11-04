/*
 * Copyright (c) 2003, 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: ProfileImpl.java,v 1.24 2005/11/04 22:22:59 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.Classifier;
import org.eclipse.uml2.ElementImport;
import org.eclipse.uml2.Model;
import org.eclipse.uml2.PackageImport;
import org.eclipse.uml2.PackageableElement;
import org.eclipse.uml2.Profile;
import org.eclipse.uml2.Stereotype;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateParameter;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedSubsetEObjectEList;
import org.eclipse.uml2.common.util.SubsetEObjectEList;
import org.eclipse.uml2.common.util.SupersetEObjectContainmentWithInverseEList;

import org.eclipse.uml2.internal.operation.ProfileOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Profile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.ProfileImpl#getOwnedMembers <em>Owned Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ProfileImpl#getElementImports <em>Element Import</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ProfileImpl#getPackageImports <em>Package Import</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ProfileImpl#getOwnedStereotypes <em>Owned Stereotype</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ProfileImpl#getMetaclassReferences <em>Metaclass Reference</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ProfileImpl#getMetamodelReferences <em>Metamodel Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProfileImpl extends PackageImpl implements Profile {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getMetaclassReferences() <em>Metaclass Reference</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaclassReferences()
	 * @generated
	 * @ordered
	 */
	protected EList metaclassReference = null;

	/**
	 * The cached value of the '{@link #getMetamodelReferences() <em>Metamodel Reference</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetamodelReferences()
	 * @generated
	 * @ordered
	 */
	protected EList metamodelReference = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProfileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getProfile();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedMembers() {
		if (ownedMember == null) {
			ownedMember = new EObjectContainmentEList(PackageableElement.class, this, UML2Package.PROFILE__OWNED_MEMBER);
		}
		return ownedMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedMembers() {
		return ownedMember != null && !ownedMember.isEmpty();
	}

	protected EList ownedStereotype = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList getOwnedStereotypes() {
		if (ownedStereotype == null) {
			ownedStereotype = new DerivedSubsetEObjectEList(Stereotype.class, this, UML2Package.PROFILE__OWNED_STEREOTYPE, new EStructuralFeature[] {UML2Package.eINSTANCE.getPackage_OwnedMember()});
		}
		return ownedStereotype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Stereotype getOwnedStereotype(String name) {
		for (Iterator i = getOwnedStereotypes().iterator(); i.hasNext(); ) {
			Stereotype ownedStereotype = (Stereotype) i.next();
			if (name.equals(ownedStereotype.getName())) {
				return ownedStereotype;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getMetaclassReferences() {
		if (metaclassReference == null) {
			metaclassReference = new SubsetEObjectEList(ElementImport.class, this, UML2Package.PROFILE__METACLASS_REFERENCE, new int[] {UML2Package.PROFILE__ELEMENT_IMPORT});
		}
		return metaclassReference;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getMetamodelReferences() {
		if (metamodelReference == null) {
			metamodelReference = new SubsetEObjectEList(PackageImport.class, this, UML2Package.PROFILE__METAMODEL_REFERENCE, new int[] {UML2Package.PROFILE__PACKAGE_IMPORT});
		}
		return metamodelReference;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getElementImports() {
		if (elementImport == null) {
			elementImport = new SupersetEObjectContainmentWithInverseEList(ElementImport.class, this, UML2Package.PROFILE__ELEMENT_IMPORT, new int[] {UML2Package.PROFILE__METACLASS_REFERENCE}, UML2Package.ELEMENT_IMPORT__IMPORTING_NAMESPACE);
		}
		return elementImport;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPackageImports() {
		if (packageImport == null) {
			packageImport = new SupersetEObjectContainmentWithInverseEList(PackageImport.class, this, UML2Package.PROFILE__PACKAGE_IMPORT, new int[] {UML2Package.PROFILE__APPLIED_PROFILE, UML2Package.PROFILE__METAMODEL_REFERENCE}, UML2Package.PACKAGE_IMPORT__IMPORTING_NAMESPACE);
		}
		return packageImport;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.PROFILE__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
				case UML2Package.PROFILE__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicAdd(otherEnd, msgs);
				case UML2Package.PROFILE__OWNED_TEMPLATE_SIGNATURE:
					if (ownedTemplateSignature != null)
						msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.PROFILE__OWNED_TEMPLATE_SIGNATURE, null, msgs);
					return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
				case UML2Package.PROFILE__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicAdd(otherEnd, msgs);
				case UML2Package.PROFILE__OWNED_RULE:
					return ((InternalEList)getOwnedRules()).basicAdd(otherEnd, msgs);
				case UML2Package.PROFILE__ELEMENT_IMPORT:
					return ((InternalEList)getElementImports()).basicAdd(otherEnd, msgs);
				case UML2Package.PROFILE__PACKAGE_IMPORT:
					return ((InternalEList)getPackageImports()).basicAdd(otherEnd, msgs);
				case UML2Package.PROFILE__TEMPLATE_PARAMETER:
					if (templateParameter != null)
						msgs = ((InternalEObject)templateParameter).eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
					return basicSetTemplateParameter((TemplateParameter)otherEnd, msgs);
				case UML2Package.PROFILE__OWNING_PARAMETER:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.PROFILE__OWNING_PARAMETER, msgs);
				case UML2Package.PROFILE__PACKAGE_MERGE:
					return ((InternalEList)getPackageMerges()).basicAdd(otherEnd, msgs);
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
				case UML2Package.PROFILE__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case UML2Package.PROFILE__OWNED_COMMENT:
					return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
				case UML2Package.PROFILE__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
				case UML2Package.PROFILE__OWNED_TEMPLATE_SIGNATURE:
					return basicSetOwnedTemplateSignature(null, msgs);
				case UML2Package.PROFILE__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
				case UML2Package.PROFILE__NAME_EXPRESSION:
					return basicSetNameExpression(null, msgs);
				case UML2Package.PROFILE__OWNED_RULE:
					return ((InternalEList)getOwnedRules()).basicRemove(otherEnd, msgs);
				case UML2Package.PROFILE__ELEMENT_IMPORT:
					return ((InternalEList)getElementImports()).basicRemove(otherEnd, msgs);
				case UML2Package.PROFILE__PACKAGE_IMPORT:
					return ((InternalEList)getPackageImports()).basicRemove(otherEnd, msgs);
				case UML2Package.PROFILE__TEMPLATE_PARAMETER:
					return basicSetTemplateParameter(null, msgs);
				case UML2Package.PROFILE__OWNING_PARAMETER:
					return eBasicSetContainer(null, UML2Package.PROFILE__OWNING_PARAMETER, msgs);
				case UML2Package.PROFILE__OWNED_MEMBER:
					return ((InternalEList)getOwnedMembers()).basicRemove(otherEnd, msgs);
				case UML2Package.PROFILE__PACKAGE_MERGE:
					return ((InternalEList)getPackageMerges()).basicRemove(otherEnd, msgs);
				case UML2Package.PROFILE__PACKAGE_EXTENSION:
					return ((InternalEList)getPackageExtensions()).basicRemove(otherEnd, msgs);
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
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.PROFILE__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.PROFILE__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.PROFILE__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.PROFILE__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.PROFILE__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.PROFILE__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.PROFILE__NAME:
				return getName();
			case UML2Package.PROFILE__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.PROFILE__VISIBILITY:
				return getVisibility();
			case UML2Package.PROFILE__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.PROFILE__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.PROFILE__MEMBER:
				return getMembers();
			case UML2Package.PROFILE__OWNED_RULE:
				return getOwnedRules();
			case UML2Package.PROFILE__IMPORTED_MEMBER:
				return getImportedMembers();
			case UML2Package.PROFILE__ELEMENT_IMPORT:
				return getElementImports();
			case UML2Package.PROFILE__PACKAGE_IMPORT:
				return getPackageImports();
			case UML2Package.PROFILE__TEMPLATE_PARAMETER:
				if (resolve) return getTemplateParameter();
				return basicGetTemplateParameter();
			case UML2Package.PROFILE__OWNING_PARAMETER:
				return getOwningParameter();
			case UML2Package.PROFILE__PACKAGEABLE_ELEMENT_VISIBILITY:
				return getPackageableElement_visibility();
			case UML2Package.PROFILE__NESTED_PACKAGE:
				return getNestedPackages();
			case UML2Package.PROFILE__NESTING_PACKAGE:
				return getNestingPackage();
			case UML2Package.PROFILE__OWNED_TYPE:
				return getOwnedTypes();
			case UML2Package.PROFILE__OWNED_MEMBER:
				return getOwnedMembers();
			case UML2Package.PROFILE__PACKAGE_MERGE:
				return getPackageMerges();
			case UML2Package.PROFILE__APPLIED_PROFILE:
				return getAppliedProfiles();
			case UML2Package.PROFILE__PACKAGE_EXTENSION:
				return getPackageExtensions();
			case UML2Package.PROFILE__OWNED_STEREOTYPE:
				return getOwnedStereotypes();
			case UML2Package.PROFILE__METACLASS_REFERENCE:
				return getMetaclassReferences();
			case UML2Package.PROFILE__METAMODEL_REFERENCE:
				return getMetamodelReferences();
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
			case UML2Package.PROFILE__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.PROFILE__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.PROFILE__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.PROFILE__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.PROFILE__NAME:
				setName((String)newValue);
				return;
			case UML2Package.PROFILE__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.PROFILE__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.PROFILE__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.PROFILE__OWNED_RULE:
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection)newValue);
				return;
			case UML2Package.PROFILE__ELEMENT_IMPORT:
				getElementImports().clear();
				getElementImports().addAll((Collection)newValue);
				return;
			case UML2Package.PROFILE__PACKAGE_IMPORT:
				getPackageImports().clear();
				getPackageImports().addAll((Collection)newValue);
				return;
			case UML2Package.PROFILE__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)newValue);
				return;
			case UML2Package.PROFILE__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)newValue);
				return;
			case UML2Package.PROFILE__PACKAGEABLE_ELEMENT_VISIBILITY:
				setPackageableElement_visibility((VisibilityKind)newValue);
				return;
			case UML2Package.PROFILE__OWNED_MEMBER:
				getOwnedMembers().clear();
				getOwnedMembers().addAll((Collection)newValue);
				return;
			case UML2Package.PROFILE__PACKAGE_MERGE:
				getPackageMerges().clear();
				getPackageMerges().addAll((Collection)newValue);
				return;
			case UML2Package.PROFILE__APPLIED_PROFILE:
				getAppliedProfiles().clear();
				getAppliedProfiles().addAll((Collection)newValue);
				return;
			case UML2Package.PROFILE__PACKAGE_EXTENSION:
				getPackageExtensions().clear();
				getPackageExtensions().addAll((Collection)newValue);
				return;
			case UML2Package.PROFILE__METACLASS_REFERENCE:
				getMetaclassReferences().clear();
				getMetaclassReferences().addAll((Collection)newValue);
				return;
			case UML2Package.PROFILE__METAMODEL_REFERENCE:
				getMetamodelReferences().clear();
				getMetamodelReferences().addAll((Collection)newValue);
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
			case UML2Package.PROFILE__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.PROFILE__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.PROFILE__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.PROFILE__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.PROFILE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.PROFILE__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.PROFILE__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.PROFILE__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.PROFILE__OWNED_RULE:
				getOwnedRules().clear();
				return;
			case UML2Package.PROFILE__ELEMENT_IMPORT:
				getElementImports().clear();
				return;
			case UML2Package.PROFILE__PACKAGE_IMPORT:
				getPackageImports().clear();
				return;
			case UML2Package.PROFILE__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)null);
				return;
			case UML2Package.PROFILE__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)null);
				return;
			case UML2Package.PROFILE__PACKAGEABLE_ELEMENT_VISIBILITY:
				setPackageableElement_visibility(PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT);
				return;
			case UML2Package.PROFILE__OWNED_MEMBER:
				getOwnedMembers().clear();
				return;
			case UML2Package.PROFILE__PACKAGE_MERGE:
				getPackageMerges().clear();
				return;
			case UML2Package.PROFILE__APPLIED_PROFILE:
				getAppliedProfiles().clear();
				return;
			case UML2Package.PROFILE__PACKAGE_EXTENSION:
				getPackageExtensions().clear();
				return;
			case UML2Package.PROFILE__METACLASS_REFERENCE:
				getMetaclassReferences().clear();
				return;
			case UML2Package.PROFILE__METAMODEL_REFERENCE:
				getMetamodelReferences().clear();
				return;
		}
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSetGen(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.PROFILE__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.PROFILE__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.PROFILE__OWNER:
				return isSetOwner();
			case UML2Package.PROFILE__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.PROFILE__TEMPLATE_BINDING:
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.PROFILE__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.PROFILE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.PROFILE__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.PROFILE__VISIBILITY:
				return getVisibility() != VISIBILITY_EDEFAULT;
			case UML2Package.PROFILE__CLIENT_DEPENDENCY:
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.PROFILE__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.PROFILE__MEMBER:
				return isSetMembers();
			case UML2Package.PROFILE__OWNED_RULE:
				return ownedRule != null && !ownedRule.isEmpty();
			case UML2Package.PROFILE__IMPORTED_MEMBER:
				return !getImportedMembers().isEmpty();
			case UML2Package.PROFILE__ELEMENT_IMPORT:
				return elementImport != null && !elementImport.isEmpty();
			case UML2Package.PROFILE__PACKAGE_IMPORT:
				return packageImport != null && !packageImport.isEmpty();
			case UML2Package.PROFILE__TEMPLATE_PARAMETER:
				return templateParameter != null;
			case UML2Package.PROFILE__OWNING_PARAMETER:
				return getOwningParameter() != null;
			case UML2Package.PROFILE__PACKAGEABLE_ELEMENT_VISIBILITY:
				return isSetPackageableElement_visibility();
			case UML2Package.PROFILE__NESTED_PACKAGE:
				return !getNestedPackages().isEmpty();
			case UML2Package.PROFILE__NESTING_PACKAGE:
				return getNestingPackage() != null;
			case UML2Package.PROFILE__OWNED_TYPE:
				return !getOwnedTypes().isEmpty();
			case UML2Package.PROFILE__OWNED_MEMBER:
				return isSetOwnedMembers();
			case UML2Package.PROFILE__PACKAGE_MERGE:
				return packageMerge != null && !packageMerge.isEmpty();
			case UML2Package.PROFILE__APPLIED_PROFILE:
				return appliedProfile != null && !appliedProfile.isEmpty();
			case UML2Package.PROFILE__PACKAGE_EXTENSION:
				return packageExtension != null && !packageExtension.isEmpty();
			case UML2Package.PROFILE__OWNED_STEREOTYPE:
				return !getOwnedStereotypes().isEmpty();
			case UML2Package.PROFILE__METACLASS_REFERENCE:
				return metaclassReference != null && !metaclassReference.isEmpty();
			case UML2Package.PROFILE__METAMODEL_REFERENCE:
				return metamodelReference != null && !metamodelReference.isEmpty();
		}
		return eDynamicIsSet(eFeature);
	}


	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.PROFILE__VISIBILITY:
				return false;
		}
		return eIsSetGen(eFeature);
	}

	// <!-- begin-custom-operations -->

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.Profile#define()
	 */
	public void define() {
		ProfileOperations.define(this);
	}

	private static Method GET_REFERENCED_METACLASSES = null;

	static {
		try {
			GET_REFERENCED_METACLASSES = ProfileImpl.class.getMethod(
				"getReferencedMetaclasses", null); //$NON-NLS-1$
		} catch (Exception e) {
			// ignore
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.Profile#getReferencedMetaclasses()
	 */
	public Set getReferencedMetaclasses() {
		CacheAdapter cache = getCacheAdapter();

		if (cache != null) {
			Set result = (Set) cache.get(eResource(), this,
				GET_REFERENCED_METACLASSES);

			if (result == null) {
				getCacheAdapter().put(
					eResource(),
					this,
					GET_REFERENCED_METACLASSES,
					result = Collections.unmodifiableSet(ProfileOperations
						.getReferencedMetaclasses(this)));
			}

			return result;
		}

		return Collections.unmodifiableSet(ProfileOperations
			.getReferencedMetaclasses(this));
	}

	private static Method GET_REFERENCED_METAMODELS = null;

	static {
		try {
			GET_REFERENCED_METAMODELS = ProfileImpl.class.getMethod(
				"getReferencedMetamodels", null); //$NON-NLS-1$
		} catch (Exception e) {
			// ignore
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.Profile#getReferencedMetamodels()
	 */
	public Set getReferencedMetamodels() {
		CacheAdapter cache = getCacheAdapter();

		if (cache != null) {
			Set result = (Set) cache.get(eResource(), this,
				GET_REFERENCED_METAMODELS);

			if (result == null) {
				getCacheAdapter().put(
					eResource(),
					this,
					GET_REFERENCED_METAMODELS,
					result = Collections.unmodifiableSet(ProfileOperations
						.getReferencedMetamodels(this)));
			}

			return result;
		}

		return Collections.unmodifiableSet(ProfileOperations
			.getReferencedMetamodels(this));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.Profile#getVersion()
	 */
	public String getVersion() {
		return ProfileOperations.getVersion(this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.Profile#isDefined()
	 */
	public boolean isDefined() {
		return ProfileOperations.isDefined(this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.Profile#referenceMetaclass(org.eclipse.uml2.Class)
	 */
	public void referenceMetaclass(org.eclipse.uml2.Class class_) {
		ProfileOperations.referenceMetaclass(this, class_);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.Profile#referenceMetamodel(org.eclipse.uml2.Model)
	 */
	public void referenceMetamodel(Model model) {
		ProfileOperations.referenceMetamodel(this, model);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.Profile#create(org.eclipse.uml2.Classifier)
	 */
	public EObject create(Classifier classifier) {
		return ProfileOperations.create(this, classifier);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.Profile#createOwnedStereotype(java.lang.String,
	 *      boolean)
	 */
	public Stereotype createOwnedStereotype(String name, boolean isAbstract) {
		return ProfileOperations.createOwnedStereotype(this, name, isAbstract);
	}
	
	// <!-- end-custom-operations -->

} //ProfileImpl
