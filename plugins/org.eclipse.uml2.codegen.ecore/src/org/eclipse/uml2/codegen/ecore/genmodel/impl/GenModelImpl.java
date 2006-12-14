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
 * $Id: GenModelImpl.java,v 1.13 2006/12/14 15:45:13 khussey Exp $
 */
package org.eclipse.uml2.codegen.ecore.genmodel.impl;

import java.util.List;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenDataType;
import org.eclipse.emf.codegen.ecore.genmodel.GenEnum;
import org.eclipse.emf.codegen.ecore.genmodel.GenEnumLiteral;
import org.eclipse.emf.codegen.ecore.genmodel.GenFeature;
import org.eclipse.emf.codegen.ecore.genmodel.GenOperation;
import org.eclipse.emf.codegen.ecore.genmodel.GenParameter;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.codegen.ecore.genmodel.GenModel;
import org.eclipse.uml2.codegen.ecore.genmodel.GenModelFactory;
import org.eclipse.uml2.codegen.ecore.genmodel.GenModelPackage;

import org.eclipse.uml2.codegen.ecore.genmodel.util.UML2GenModelUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GenModel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.codegen.ecore.genmodel.impl.GenModelImpl#isFactoryMethods <em>Factory Methods</em>}</li>
 *   <li>{@link org.eclipse.uml2.codegen.ecore.genmodel.impl.GenModelImpl#isPluralizedGetters <em>Pluralized Getters</em>}</li>
 *   <li>{@link org.eclipse.uml2.codegen.ecore.genmodel.impl.GenModelImpl#isCacheAdapterSupport <em>Cache Adapter Support</em>}</li>
 *   <li>{@link org.eclipse.uml2.codegen.ecore.genmodel.impl.GenModelImpl#isSafeStrings <em>Safe Strings</em>}</li>
 *   <li>{@link org.eclipse.uml2.codegen.ecore.genmodel.impl.GenModelImpl#getInvariantPrefix <em>Invariant Prefix</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenModelImpl
		extends org.eclipse.emf.codegen.ecore.genmodel.impl.GenModelImpl
		implements GenModel {

	/**
	 * The default value of the '{@link #isFactoryMethods() <em>Factory Methods</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFactoryMethods()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FACTORY_METHODS_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isFactoryMethods() <em>Factory Methods</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFactoryMethods()
	 * @generated
	 * @ordered
	 */
	protected static final int FACTORY_METHODS_EFLAG = 1 << 8;

	/**
	 * The default value of the '{@link #isPluralizedGetters() <em>Pluralized Getters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPluralizedGetters()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PLURALIZED_GETTERS_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isPluralizedGetters() <em>Pluralized Getters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPluralizedGetters()
	 * @generated
	 * @ordered
	 */
	protected static final int PLURALIZED_GETTERS_EFLAG = 1 << 9;

	/**
	 * The default value of the '{@link #isCacheAdapterSupport() <em>Cache Adapter Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCacheAdapterSupport()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CACHE_ADAPTER_SUPPORT_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isCacheAdapterSupport() <em>Cache Adapter Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCacheAdapterSupport()
	 * @generated
	 * @ordered
	 */
	protected static final int CACHE_ADAPTER_SUPPORT_EFLAG = 1 << 10;

	/**
	 * The default value of the '{@link #isSafeStrings() <em>Safe Strings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSafeStrings()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SAFE_STRINGS_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isSafeStrings() <em>Safe Strings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSafeStrings()
	 * @generated
	 * @ordered
	 */
	protected static final int SAFE_STRINGS_EFLAG = 1 << 11;

	/**
	 * The default value of the '{@link #getInvariantPrefix() <em>Invariant Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvariantPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String INVARIANT_PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInvariantPrefix() <em>Invariant Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvariantPrefix()
	 * @generated
	 * @ordered
	 */
	protected String invariantPrefix = INVARIANT_PREFIX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenModelPackage.Literals.GEN_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFactoryMethods() {
		return (eFlags & FACTORY_METHODS_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFactoryMethods(boolean newFactoryMethods) {
		boolean oldFactoryMethods = (eFlags & FACTORY_METHODS_EFLAG) != 0;
		if (newFactoryMethods)
			eFlags |= FACTORY_METHODS_EFLAG;
		else
			eFlags &= ~FACTORY_METHODS_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				GenModelPackage.GEN_MODEL__FACTORY_METHODS, oldFactoryMethods,
				newFactoryMethods));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPluralizedGetters() {
		return (eFlags & PLURALIZED_GETTERS_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPluralizedGetters(boolean newPluralizedGetters) {
		boolean oldPluralizedGetters = (eFlags & PLURALIZED_GETTERS_EFLAG) != 0;
		if (newPluralizedGetters)
			eFlags |= PLURALIZED_GETTERS_EFLAG;
		else
			eFlags &= ~PLURALIZED_GETTERS_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				GenModelPackage.GEN_MODEL__PLURALIZED_GETTERS,
				oldPluralizedGetters, newPluralizedGetters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCacheAdapterSupport() {
		return (eFlags & CACHE_ADAPTER_SUPPORT_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCacheAdapterSupport(boolean newCacheAdapterSupport) {
		boolean oldCacheAdapterSupport = (eFlags & CACHE_ADAPTER_SUPPORT_EFLAG) != 0;
		if (newCacheAdapterSupport)
			eFlags |= CACHE_ADAPTER_SUPPORT_EFLAG;
		else
			eFlags &= ~CACHE_ADAPTER_SUPPORT_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				GenModelPackage.GEN_MODEL__CACHE_ADAPTER_SUPPORT,
				oldCacheAdapterSupport, newCacheAdapterSupport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSafeStrings() {
		return (eFlags & SAFE_STRINGS_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSafeStrings(boolean newSafeStrings) {
		boolean oldSafeStrings = (eFlags & SAFE_STRINGS_EFLAG) != 0;
		if (newSafeStrings)
			eFlags |= SAFE_STRINGS_EFLAG;
		else
			eFlags &= ~SAFE_STRINGS_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				GenModelPackage.GEN_MODEL__SAFE_STRINGS, oldSafeStrings,
				newSafeStrings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInvariantPrefix() {
		return invariantPrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvariantPrefix(String newInvariantPrefix) {
		String oldInvariantPrefix = invariantPrefix;
		invariantPrefix = newInvariantPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				GenModelPackage.GEN_MODEL__INVARIANT_PREFIX,
				oldInvariantPrefix, invariantPrefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenModelPackage.GEN_MODEL__FACTORY_METHODS :
				return isFactoryMethods()
					? Boolean.TRUE
					: Boolean.FALSE;
			case GenModelPackage.GEN_MODEL__PLURALIZED_GETTERS :
				return isPluralizedGetters()
					? Boolean.TRUE
					: Boolean.FALSE;
			case GenModelPackage.GEN_MODEL__CACHE_ADAPTER_SUPPORT :
				return isCacheAdapterSupport()
					? Boolean.TRUE
					: Boolean.FALSE;
			case GenModelPackage.GEN_MODEL__SAFE_STRINGS :
				return isSafeStrings()
					? Boolean.TRUE
					: Boolean.FALSE;
			case GenModelPackage.GEN_MODEL__INVARIANT_PREFIX :
				return getInvariantPrefix();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GenModelPackage.GEN_MODEL__FACTORY_METHODS :
				setFactoryMethods(((Boolean) newValue).booleanValue());
				return;
			case GenModelPackage.GEN_MODEL__PLURALIZED_GETTERS :
				setPluralizedGetters(((Boolean) newValue).booleanValue());
				return;
			case GenModelPackage.GEN_MODEL__CACHE_ADAPTER_SUPPORT :
				setCacheAdapterSupport(((Boolean) newValue).booleanValue());
				return;
			case GenModelPackage.GEN_MODEL__SAFE_STRINGS :
				setSafeStrings(((Boolean) newValue).booleanValue());
				return;
			case GenModelPackage.GEN_MODEL__INVARIANT_PREFIX :
				setInvariantPrefix((String) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GenModelPackage.GEN_MODEL__FACTORY_METHODS :
				setFactoryMethods(FACTORY_METHODS_EDEFAULT);
				return;
			case GenModelPackage.GEN_MODEL__PLURALIZED_GETTERS :
				setPluralizedGetters(PLURALIZED_GETTERS_EDEFAULT);
				return;
			case GenModelPackage.GEN_MODEL__CACHE_ADAPTER_SUPPORT :
				setCacheAdapterSupport(CACHE_ADAPTER_SUPPORT_EDEFAULT);
				return;
			case GenModelPackage.GEN_MODEL__SAFE_STRINGS :
				setSafeStrings(SAFE_STRINGS_EDEFAULT);
				return;
			case GenModelPackage.GEN_MODEL__INVARIANT_PREFIX :
				setInvariantPrefix(INVARIANT_PREFIX_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GenModelPackage.GEN_MODEL__FACTORY_METHODS :
				return ((eFlags & FACTORY_METHODS_EFLAG) != 0) != FACTORY_METHODS_EDEFAULT;
			case GenModelPackage.GEN_MODEL__PLURALIZED_GETTERS :
				return ((eFlags & PLURALIZED_GETTERS_EFLAG) != 0) != PLURALIZED_GETTERS_EDEFAULT;
			case GenModelPackage.GEN_MODEL__CACHE_ADAPTER_SUPPORT :
				return ((eFlags & CACHE_ADAPTER_SUPPORT_EFLAG) != 0) != CACHE_ADAPTER_SUPPORT_EDEFAULT;
			case GenModelPackage.GEN_MODEL__SAFE_STRINGS :
				return ((eFlags & SAFE_STRINGS_EFLAG) != 0) != SAFE_STRINGS_EDEFAULT;
			case GenModelPackage.GEN_MODEL__INVARIANT_PREFIX :
				return INVARIANT_PREFIX_EDEFAULT == null
					? invariantPrefix != null
					: !INVARIANT_PREFIX_EDEFAULT.equals(invariantPrefix);
		}
		return super.eIsSet(featureID);
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
		result.append(" (factoryMethods: "); //$NON-NLS-1$
		result.append((eFlags & FACTORY_METHODS_EFLAG) != 0);
		result.append(", pluralizedGetters: "); //$NON-NLS-1$
		result.append((eFlags & PLURALIZED_GETTERS_EFLAG) != 0);
		result.append(", cacheAdapterSupport: "); //$NON-NLS-1$
		result.append((eFlags & CACHE_ADAPTER_SUPPORT_EFLAG) != 0);
		result.append(", safeStrings: "); //$NON-NLS-1$
		result.append((eFlags & SAFE_STRINGS_EFLAG) != 0);
		result.append(", invariantPrefix: "); //$NON-NLS-1$
		result.append(invariantPrefix);
		result.append(')');
		return result.toString();
	}

	public GenClass createGenClass() {
		return GenModelFactory.eINSTANCE.createGenClass();
	}

	public GenDataType createGenDataType() {
		return GenModelFactory.eINSTANCE.createGenDataType();
	}

	public GenEnum createGenEnum() {
		return GenModelFactory.eINSTANCE.createGenEnum();
	}

	public GenEnumLiteral createGenEnumLiteral() {
		return GenModelFactory.eINSTANCE.createGenEnumLiteral();
	}

	public GenFeature createGenFeature() {
		GenFeatureImpl genFeature = new GenFeatureImpl();
		genFeature.setGenModel(this);
		return genFeature;
	}

	public org.eclipse.emf.codegen.ecore.genmodel.GenModel createGenModel() {
		return GenModelFactory.eINSTANCE.createGenModel();
	}

	public GenOperation createGenOperation() {
		GenOperationImpl genOperation = new GenOperationImpl();
		genOperation.setGenModel(this);
		return genOperation;
	}

	public org.eclipse.emf.codegen.ecore.genmodel.GenPackage createGenPackage() {
		return GenModelFactory.eINSTANCE.createGenPackage();
	}

	public GenParameter createGenParameter() {
		return GenModelFactory.eINSTANCE.createGenParameter();
	}

	public List getEditRequiredPlugins() {
		List result = super.getEditRequiredPlugins();
		result.add("org.eclipse.uml2.common.edit"); //$NON-NLS-1$
		return result;
	}

	public List getModelRequiredPlugins() {
		List result = super.getModelRequiredPlugins();
		result.add("org.eclipse.uml2.common"); //$NON-NLS-1$
		return result;
	}

	protected void reconcileSettings(
			org.eclipse.emf.codegen.ecore.genmodel.GenModel oldGenModelVersion) {
		super.reconcileSettings(oldGenModelVersion);

		setCacheAdapterSupport(UML2GenModelUtil
			.isCacheAdapterSupport(oldGenModelVersion));
		setFactoryMethods(UML2GenModelUtil.isFactoryMethods(oldGenModelVersion));
		setInvariantPrefix(UML2GenModelUtil
			.getInvariantPrefix(oldGenModelVersion));
		setPluralizedGetters(UML2GenModelUtil
			.isPluralizedGetters(oldGenModelVersion));
		setSafeStrings(UML2GenModelUtil.isSafeStrings(oldGenModelVersion));
	}

}
