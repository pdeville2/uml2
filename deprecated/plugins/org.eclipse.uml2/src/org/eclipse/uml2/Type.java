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
 * $Id: Type.java,v 1.3 2004/06/03 02:59:18 khussey Exp $
 */
package org.eclipse.uml2;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A type serves as a constraint on the range of values represented by a typed element. Type is an abstract metaclass. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.Type#getPackage <em>Package</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getType()
 * @model abstract="true"
 * @generated
 */
public interface Type extends PackageableElement{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Package</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.Package#getOwnedTypes <em>Owned Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' reference.
	 * @see org.eclipse.uml2.UML2Package#getType_Package()
	 * @see org.eclipse.uml2.Package#getOwnedTypes
	 * @model opposite="ownedType" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	org.eclipse.uml2.Package getPackage();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A query based on the following OCL expression:
	 * <code>
	 * false
	 * </code>
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.Boolean" 
	 * @generated
	 */
	boolean conformsTo(Type other);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 * @generated
	 */
	Namespace getNamespace();

	// <!-- begin-custom-operations -->

	/**
	 * Creates a(n) (binary) association between this type and the specified
	 * other type, with the specified navigabilities, aggregations, names, lower
	 * bounds, and upper bounds, and owned by this type's package.
	 * 
	 * @param thisEndIsNavigable The navigability of this end.
	 * @param thisEndAggregation The aggregation of this end.
	 * @param thisEndName The name of this end.
	 * @param thisEndLowerBound The lower bound of this end.
	 * @param thisEndUpperBound The upper bound of this end.
	 * @param otherType The type at the other end.
	 * @param otherEndIsNavigable The navigability of the other end.
	 * @param otherEndAggregation The aggregation of the other end.
	 * @param otherEndName The name of the other end.
	 * @param otherEndLowerBound The lower bound of the other end.
	 * @param otherEndUpperBound The upper bound of the other end.
	 * @return The new (binary) association.
	 * @exception IllegalArgumentException If any of the navigabilities, lower
	 *                                     bounds, or upper bounds are invalid.
	 */
	public Association createAssociation(
		boolean thisEndIsNavigable,
		AggregationKind thisEndAggregation,
		String thisEndName,
		int thisEndLowerBound,
		int thisEndUpperBound,
		Type otherType,
		boolean otherEndIsNavigable,
		AggregationKind otherEndAggregation,
		String otherEndName,
		int otherEndLowerBound,
		int otherEndUpperBound);

	// <!-- end-custom-operations -->

} // Type
