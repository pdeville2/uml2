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
 * $Id: ExceptionHandlerImplTest.java,v 1.1 2004/04/29 14:56:46 khussey Exp $
 */
package org.eclipse.uml2.impl.tests;

import junit.textui.TestRunner;

import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.impl.ExceptionHandlerImpl;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Exception Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.ExceptionHandlerImpl#getOwner() <em>Get Owner</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class ExceptionHandlerImplTest extends ElementImplTest {

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
		TestRunner.run(ExceptionHandlerImplTest.class);
	}

	/**
	 * Constructs a new Exception Handler test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExceptionHandlerImplTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Exception Handler test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ExceptionHandlerImpl getFixture() {
		return (ExceptionHandlerImpl) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture((ExceptionHandlerImpl) UML2Factory.eINSTANCE.createExceptionHandler());
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

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ExceptionHandlerImpl#getOwner() <em>Get Owner</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ExceptionHandlerImpl#getOwner()
	 * @generated NOT
	 */
	public void testGetOwner() {
		super.testGetOwner();

		assertSame(getFixture().getProtectedNode(), getFixture().getOwner());
	}

	/**
	 * @see org.eclipse.uml2.impl.tests.ElementImplTest#setUpOwner()
	 */
	protected void setUpOwner() {
		UML2Factory.eINSTANCE.createAction().getHandlers().add(getFixture());
	}

} //ExceptionHandlerImplTest
