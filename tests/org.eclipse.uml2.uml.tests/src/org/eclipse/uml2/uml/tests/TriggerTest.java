/*
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: TriggerTest.java,v 1.1 2006/02/21 16:32:28 khussey Exp $
 */
package org.eclipse.uml2.uml.tests;

import junit.textui.TestRunner;

import org.eclipse.uml2.uml.Trigger;
import org.eclipse.uml2.uml.UMLFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Trigger</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TriggerTest
		extends NamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TriggerTest.class);
	}

	/**
	 * Constructs a new Trigger test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Trigger test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Trigger getFixture() {
		return (Trigger) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp()
			throws Exception {
		setFixture(UMLFactory.eINSTANCE.createTrigger());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	protected void tearDown()
			throws Exception {
		setFixture(null);
	}

} //TriggerTest
