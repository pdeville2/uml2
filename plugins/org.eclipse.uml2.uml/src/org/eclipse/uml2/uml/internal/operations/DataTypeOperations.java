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
 * $Id: DataTypeOperations.java,v 1.11 2006/12/14 15:49:26 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;

import org.eclipse.uml2.uml.RedefinableElement;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Data Type</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.DataType#createOwnedOperation(java.lang.String, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, org.eclipse.uml2.uml.Type) <em>Create Owned Operation</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.DataType#createOwnedAttribute(java.lang.String, org.eclipse.uml2.uml.Type, int, int) <em>Create Owned Attribute</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.DataType#inherit(org.eclipse.emf.common.util.EList) <em>Inherit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataTypeOperations
		extends ClassifierOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataTypeOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static Operation createOwnedOperation(DataType dataType,
			String name, EList<String> parameterNames,
			EList<Type> parameterTypes, Type returnType) {
		return TypeOperations.createOwnedOperation(dataType, name,
			parameterNames, parameterTypes, returnType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static Property createOwnedAttribute(DataType dataType, String name,
			Type type, int lower, int upper) {
		return TypeOperations.createOwnedAttribute(dataType, name, type, lower,
			upper);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The inherit operation is overridden to exclude redefined properties.
	 * result = inhs->excluding(inh | ownedMember->select(oclIsKindOf(RedefinableElement))->select(redefinedElement->includes(inh)))
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<NamedElement> inherit(DataType dataType,
			EList<NamedElement> inhs) {
		EList<NamedElement> inherit = new UniqueEList.FastCompare<NamedElement>();
		EList<NamedElement> redefinedElements = new UniqueEList.FastCompare<NamedElement>();

		for (NamedElement ownedMember : dataType.getOwnedMembers()) {

			if (ownedMember instanceof RedefinableElement) {
				redefinedElements.addAll(((RedefinableElement) ownedMember)
					.getRedefinedElements());
			}
		}

		for (NamedElement inh : inhs) {

			if (!redefinedElements.contains(inh)) {
				inherit.add(inh);
			}
		}

		return ECollections.unmodifiableEList(inherit);
	}

} // DataTypeOperations