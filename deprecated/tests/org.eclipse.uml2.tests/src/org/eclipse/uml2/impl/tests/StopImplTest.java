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
 * $Id: StopImplTest.java,v 1.1 2004/04/29 14:56:48 khussey Exp $
 */
package org.eclipse.uml2.impl.tests;

import junit.textui.TestRunner;

import org.eclipse.uml2.UML2Factory;

import org.eclipse.uml2.impl.StopImpl;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Stop</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StopImplTest extends EventOccurrenceImplTest {

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
	public static void main(String[] args) {
		TestRunner.run(StopImplTest.class);
	}

	/**
	 * Constructs a new Stop test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StopImplTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Stop test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private StopImpl getFixture() {
		return (StopImpl) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture((StopImpl) UML2Factory.eINSTANCE.createStop());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //StopImplTest
