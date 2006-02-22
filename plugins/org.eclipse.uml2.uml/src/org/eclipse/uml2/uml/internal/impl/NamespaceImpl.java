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
 * $Id: NamespaceImpl.java,v 1.14 2006/02/22 23:07:15 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.NamespaceOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Namespace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.NamespaceImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.NamespaceImpl#getOwnedMembers <em>Owned Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.NamespaceImpl#getMembers <em>Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.NamespaceImpl#getElementImports <em>Element Import</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.NamespaceImpl#getPackageImports <em>Package Import</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.NamespaceImpl#getOwnedRules <em>Owned Rule</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.NamespaceImpl#getImportedMembers <em>Imported Member</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class NamespaceImpl
		extends NamedElementImpl
		implements Namespace {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamespaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.NAMESPACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedElements() {
		EList ownedElement = (EList) eVirtualGet(UMLPackage.NAMESPACE__OWNED_ELEMENT);
		if (ownedElement == null) {
			eVirtualSet(UMLPackage.NAMESPACE__OWNED_ELEMENT,
				ownedElement = new DerivedUnionEObjectEList(Element.class,
					this, UMLPackage.NAMESPACE__OWNED_ELEMENT, new int[]{
						UMLPackage.NAMESPACE__OWNED_COMMENT,
						UMLPackage.NAMESPACE__NAME_EXPRESSION,
						UMLPackage.NAMESPACE__ELEMENT_IMPORT,
						UMLPackage.NAMESPACE__PACKAGE_IMPORT,
						UMLPackage.NAMESPACE__OWNED_MEMBER}));
		}
		return ownedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedMembers() {
		EList ownedMember = (EList) eVirtualGet(UMLPackage.NAMESPACE__OWNED_MEMBER);
		if (ownedMember == null) {
			eVirtualSet(UMLPackage.NAMESPACE__OWNED_MEMBER,
				ownedMember = new DerivedUnionEObjectEList(NamedElement.class,
					this, UMLPackage.NAMESPACE__OWNED_MEMBER,
					new int[]{UMLPackage.NAMESPACE__OWNED_RULE}));
		}
		return ownedMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement getOwnedMember(String name) {
		return getOwnedMember(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement getOwnedMember(String name, boolean ignoreCase,
			EClass eClass) {
		ownedMemberLoop : for (Iterator i = getOwnedMembers().iterator(); i
			.hasNext();) {
			NamedElement ownedMember = (NamedElement) i.next();
			if (eClass != null && !eClass.isInstance(ownedMember))
				continue ownedMemberLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(ownedMember.getName())
				: name.equals(ownedMember.getName())))
				continue ownedMemberLoop;
			return ownedMember;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getMembers() {
		EList member = (EList) eVirtualGet(UMLPackage.NAMESPACE__MEMBER);
		if (member == null) {
			eVirtualSet(UMLPackage.NAMESPACE__MEMBER,
				member = new DerivedUnionEObjectEList(NamedElement.class, this,
					UMLPackage.NAMESPACE__MEMBER, new int[]{
						UMLPackage.NAMESPACE__IMPORTED_MEMBER,
						UMLPackage.NAMESPACE__OWNED_MEMBER}));
		}
		return member;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement getMember(String name) {
		return getMember(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement getMember(String name, boolean ignoreCase, EClass eClass) {
		memberLoop : for (Iterator i = getMembers().iterator(); i.hasNext();) {
			NamedElement member = (NamedElement) i.next();
			if (eClass != null && !eClass.isInstance(member))
				continue memberLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(member.getName())
				: name.equals(member.getName())))
				continue memberLoop;
			return member;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getElementImports() {
		EList elementImport = (EList) eVirtualGet(UMLPackage.NAMESPACE__ELEMENT_IMPORT);
		if (elementImport == null) {
			eVirtualSet(
				UMLPackage.NAMESPACE__ELEMENT_IMPORT,
				elementImport = new EObjectContainmentWithInverseEList.Resolving(
					ElementImport.class, this,
					UMLPackage.NAMESPACE__ELEMENT_IMPORT,
					UMLPackage.ELEMENT_IMPORT__IMPORTING_NAMESPACE));
		}
		return elementImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementImport createElementImport(PackageableElement importedElement) {
		ElementImport newElementImport = UMLFactory.eINSTANCE
			.createElementImport();
		newElementImport.setImportedElement(importedElement);
		getElementImports().add(newElementImport);
		return newElementImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementImport getElementImport(PackageableElement importedElement) {
		return getElementImport(importedElement, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementImport getElementImport(PackageableElement importedElement,
			boolean createOnDemand) {
		elementImportLoop : for (Iterator i = getElementImports().iterator(); i
			.hasNext();) {
			ElementImport elementImport = (ElementImport) i.next();
			if (importedElement != null
				&& !importedElement.equals(elementImport.getImportedElement()))
				continue elementImportLoop;
			return elementImport;
		}
		return createOnDemand
			? createElementImport(importedElement)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPackageImports() {
		EList packageImport = (EList) eVirtualGet(UMLPackage.NAMESPACE__PACKAGE_IMPORT);
		if (packageImport == null) {
			eVirtualSet(
				UMLPackage.NAMESPACE__PACKAGE_IMPORT,
				packageImport = new EObjectContainmentWithInverseEList.Resolving(
					PackageImport.class, this,
					UMLPackage.NAMESPACE__PACKAGE_IMPORT,
					UMLPackage.PACKAGE_IMPORT__IMPORTING_NAMESPACE));
		}
		return packageImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageImport createPackageImport(
			org.eclipse.uml2.uml.Package importedPackage) {
		PackageImport newPackageImport = UMLFactory.eINSTANCE
			.createPackageImport();
		newPackageImport.setImportedPackage(importedPackage);
		getPackageImports().add(newPackageImport);
		return newPackageImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageImport getPackageImport(
			org.eclipse.uml2.uml.Package importedPackage) {
		return getPackageImport(importedPackage, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageImport getPackageImport(
			org.eclipse.uml2.uml.Package importedPackage, boolean createOnDemand) {
		packageImportLoop : for (Iterator i = getPackageImports().iterator(); i
			.hasNext();) {
			PackageImport packageImport = (PackageImport) i.next();
			if (importedPackage != null
				&& !importedPackage.equals(packageImport.getImportedPackage()))
				continue packageImportLoop;
			return packageImport;
		}
		return createOnDemand
			? createPackageImport(importedPackage)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedRules() {
		EList ownedRule = (EList) eVirtualGet(UMLPackage.NAMESPACE__OWNED_RULE);
		if (ownedRule == null) {
			eVirtualSet(UMLPackage.NAMESPACE__OWNED_RULE,
				ownedRule = new EObjectContainmentWithInverseEList.Resolving(
					Constraint.class, this, UMLPackage.NAMESPACE__OWNED_RULE,
					UMLPackage.CONSTRAINT__CONTEXT));
		}
		return ownedRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createOwnedRule(String name, EClass eClass) {
		Constraint newOwnedRule = (Constraint) EcoreUtil.create(eClass);
		if (name != null)
			newOwnedRule.setName(name);
		getOwnedRules().add(newOwnedRule);
		return newOwnedRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createOwnedRule(String name) {
		Constraint newOwnedRule = UMLFactory.eINSTANCE.createConstraint();
		newOwnedRule.setName(name);
		getOwnedRules().add(newOwnedRule);
		return newOwnedRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getOwnedRule(String name) {
		return getOwnedRule(name, false, null, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getOwnedRule(String name, boolean ignoreCase,
			EClass eClass, boolean createOnDemand) {
		ownedRuleLoop : for (Iterator i = getOwnedRules().iterator(); i
			.hasNext();) {
			Constraint ownedRule = (Constraint) i.next();
			if (eClass != null && !eClass.isInstance(ownedRule))
				continue ownedRuleLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(ownedRule.getName())
				: name.equals(ownedRule.getName())))
				continue ownedRuleLoop;
			return ownedRule;
		}
		return createOnDemand && eClass != null
			? createOwnedRule(name, eClass)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getImportedMembers() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			EList result = (EList) cache.get(this,
				UMLPackage.Literals.NAMESPACE__IMPORTED_MEMBER);
			if (result == null) {
				cache.put(this, UMLPackage.Literals.NAMESPACE__IMPORTED_MEMBER,
					result = NamespaceOperations.getImportedMembers(this));
			}
			return result;
		}
		return NamespaceOperations.getImportedMembers(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageableElement getImportedMember(String name) {
		return getImportedMember(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageableElement getImportedMember(String name,
			boolean ignoreCase, EClass eClass) {
		importedMemberLoop : for (Iterator i = getImportedMembers().iterator(); i
			.hasNext();) {
			PackageableElement importedMember = (PackageableElement) i.next();
			if (eClass != null && !eClass.isInstance(importedMember))
				continue importedMemberLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(importedMember.getName())
				: name.equals(importedMember.getName())))
				continue importedMemberLoop;
			return importedMember;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMembersDistinguishable(DiagnosticChain diagnostics,
			Map context) {
		return NamespaceOperations.validateMembersDistinguishable(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementImport createElementImport(PackageableElement element,
			VisibilityKind visibility) {
		return NamespaceOperations.createElementImport(this, element,
			visibility);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageImport createPackageImport(
			org.eclipse.uml2.uml.Package package_, VisibilityKind visibility) {
		return NamespaceOperations.createPackageImport(this, package_,
			visibility);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getImportedElements() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			EList result = (EList) cache.get(eResource(), this,
				UMLPackage.Literals.NAMESPACE.getEOperations().get(3));
			if (result == null) {
				cache.put(eResource(), this, UMLPackage.Literals.NAMESPACE
					.getEOperations().get(3), result = NamespaceOperations
					.getImportedElements(this));
			}
			return result;
		}
		return NamespaceOperations.getImportedElements(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getImportedPackages() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			EList result = (EList) cache.get(eResource(), this,
				UMLPackage.Literals.NAMESPACE.getEOperations().get(4));
			if (result == null) {
				cache.put(eResource(), this, UMLPackage.Literals.NAMESPACE
					.getEOperations().get(4), result = NamespaceOperations
					.getImportedPackages(this));
			}
			return result;
		}
		return NamespaceOperations.getImportedPackages(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getNamesOfMember(NamedElement element) {
		return NamespaceOperations.getNamesOfMember(this, element);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean membersAreDistinguishable() {
		return NamespaceOperations.membersAreDistinguishable(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList importMembers(EList imps) {
		return NamespaceOperations.importMembers(this, imps);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList excludeCollisions(EList imps) {
		return NamespaceOperations.excludeCollisions(this, imps);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.NAMESPACE__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.NAMESPACE__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.NAMESPACE__ELEMENT_IMPORT :
				return ((InternalEList) getElementImports()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.NAMESPACE__PACKAGE_IMPORT :
				return ((InternalEList) getPackageImports()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.NAMESPACE__OWNED_RULE :
				return ((InternalEList) getOwnedRules()).basicAdd(otherEnd,
					msgs);
		}
		return eDynamicInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.NAMESPACE__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.NAMESPACE__OWNED_COMMENT :
				return ((InternalEList) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.NAMESPACE__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.NAMESPACE__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.NAMESPACE__ELEMENT_IMPORT :
				return ((InternalEList) getElementImports()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.NAMESPACE__PACKAGE_IMPORT :
				return ((InternalEList) getPackageImports()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.NAMESPACE__OWNED_RULE :
				return ((InternalEList) getOwnedRules()).basicRemove(otherEnd,
					msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.NAMESPACE__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.NAMESPACE__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.NAMESPACE__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.NAMESPACE__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.NAMESPACE__NAME :
				return getName();
			case UMLPackage.NAMESPACE__VISIBILITY :
				return getVisibility();
			case UMLPackage.NAMESPACE__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.NAMESPACE__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.NAMESPACE__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.NAMESPACE__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.NAMESPACE__ELEMENT_IMPORT :
				return getElementImports();
			case UMLPackage.NAMESPACE__PACKAGE_IMPORT :
				return getPackageImports();
			case UMLPackage.NAMESPACE__OWNED_RULE :
				return getOwnedRules();
			case UMLPackage.NAMESPACE__MEMBER :
				return getMembers();
			case UMLPackage.NAMESPACE__IMPORTED_MEMBER :
				return getImportedMembers();
			case UMLPackage.NAMESPACE__OWNED_MEMBER :
				return getOwnedMembers();
		}
		return eDynamicGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UMLPackage.NAMESPACE__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.NAMESPACE__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.NAMESPACE__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.NAMESPACE__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.NAMESPACE__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.NAMESPACE__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.NAMESPACE__ELEMENT_IMPORT :
				getElementImports().clear();
				getElementImports().addAll((Collection) newValue);
				return;
			case UMLPackage.NAMESPACE__PACKAGE_IMPORT :
				getPackageImports().clear();
				getPackageImports().addAll((Collection) newValue);
				return;
			case UMLPackage.NAMESPACE__OWNED_RULE :
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection) newValue);
				return;
		}
		eDynamicSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case UMLPackage.NAMESPACE__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.NAMESPACE__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.NAMESPACE__NAME :
				unsetName();
				return;
			case UMLPackage.NAMESPACE__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.NAMESPACE__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.NAMESPACE__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.NAMESPACE__ELEMENT_IMPORT :
				getElementImports().clear();
				return;
			case UMLPackage.NAMESPACE__PACKAGE_IMPORT :
				getPackageImports().clear();
				return;
			case UMLPackage.NAMESPACE__OWNED_RULE :
				getOwnedRules().clear();
				return;
		}
		eDynamicUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UMLPackage.NAMESPACE__EANNOTATIONS :
				EList eAnnotations = (EList) eVirtualGet(UMLPackage.NAMESPACE__EANNOTATIONS);
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.NAMESPACE__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.NAMESPACE__OWNER :
				return isSetOwner();
			case UMLPackage.NAMESPACE__OWNED_COMMENT :
				EList ownedComment = (EList) eVirtualGet(UMLPackage.NAMESPACE__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.NAMESPACE__NAME :
				return isSetName();
			case UMLPackage.NAMESPACE__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.NAMESPACE__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.NAMESPACE__CLIENT_DEPENDENCY :
				EList clientDependency = (EList) eVirtualGet(UMLPackage.NAMESPACE__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.NAMESPACE__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.NAMESPACE__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.NAMESPACE__NAME_EXPRESSION) != null;
			case UMLPackage.NAMESPACE__ELEMENT_IMPORT :
				EList elementImport = (EList) eVirtualGet(UMLPackage.NAMESPACE__ELEMENT_IMPORT);
				return elementImport != null && !elementImport.isEmpty();
			case UMLPackage.NAMESPACE__PACKAGE_IMPORT :
				EList packageImport = (EList) eVirtualGet(UMLPackage.NAMESPACE__PACKAGE_IMPORT);
				return packageImport != null && !packageImport.isEmpty();
			case UMLPackage.NAMESPACE__OWNED_RULE :
				EList ownedRule = (EList) eVirtualGet(UMLPackage.NAMESPACE__OWNED_RULE);
				return ownedRule != null && !ownedRule.isEmpty();
			case UMLPackage.NAMESPACE__MEMBER :
				return isSetMembers();
			case UMLPackage.NAMESPACE__IMPORTED_MEMBER :
				return !getImportedMembers().isEmpty();
			case UMLPackage.NAMESPACE__OWNED_MEMBER :
				return isSetOwnedMembers();
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UMLPackage.NAMESPACE__ELEMENT_IMPORT)
			|| eIsSet(UMLPackage.NAMESPACE__PACKAGE_IMPORT)
			|| isSetOwnedMembers();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedMembers() {
		return eIsSet(UMLPackage.NAMESPACE__OWNED_RULE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMembers() {
		return eIsSet(UMLPackage.NAMESPACE__IMPORTED_MEMBER)
			|| isSetOwnedMembers();
	}

} //NamespaceImpl
