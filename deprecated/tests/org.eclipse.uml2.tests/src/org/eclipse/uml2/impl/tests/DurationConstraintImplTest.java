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
 * $Id: DurationConstraintImplTest.java,v 1.1 2004/04/29 14:56:47 khussey Exp $
 */
package org.eclipse.uml2.impl.tests;

import junit.textui.TestRunner;

import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.impl.DurationConstraintImpl;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Duration Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.DurationConstraintImpl#getSpecification() <em>Get Specification</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.DurationConstraintImpl#setSpecification(ValueSpecification) <em>Set Specification</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class DurationConstraintImplTest extends IntervalConstraintImplTest {

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
		TestRunner.run(DurationConstraintImplTest.class);
	}

	/**
	 * Constructs a new Duration Constraint test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DurationConstraintImplTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Duration Constraint test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private DurationConstraintImpl getFixture() {
		return (DurationConstraintImpl) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture((DurationConstraintImpl) UML2Factory.eINSTANCE.createDurationConstraint());
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
	 * Tests the '{@link org.eclipse.uml2.impl.DurationConstraintImpl#getSpecification() <em>Get Specification</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.DurationConstraintImpl#getSpecification()
	 * @generated NOT
	 */
	public void testGetSpecification() {
		assertTrue(true);
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.DurationConstraintImpl#setSpecification(ValueSpecification) <em>Set Specification</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.DurationConstraintImpl#setSpecification(ValueSpecification)
	 * @generated NOT
	 */
	public void testSetSpecification__ValueSpecification() {
		try {
			getFixture().setSpecification(UML2Factory.eINSTANCE.createLiteralString());
			fail();
		} catch (Exception e) {
			getFixture().setSpecification(UML2Factory.eINSTANCE.createDurationInterval());
		}
	}

	/**
	 * @see org.eclipse.uml2.impl.tests.ElementImplTest#setUpOwnedElements()
	 */
	protected void setUpOwnedElements() {
		getFixture().getOwnedComments().add(UML2Factory.eINSTANCE.createComment());
		getFixture().getOwnedComments().add(UML2Factory.eINSTANCE.createComment());

		getFixture().getTemplateBindings().add(UML2Factory.eINSTANCE.createTemplateBinding());
		getFixture().getTemplateBindings().add(UML2Factory.eINSTANCE.createTemplateBinding());

		getFixture().setNameExpression(UML2Factory.eINSTANCE.createStringExpression());

		getFixture().setSpecification(UML2Factory.eINSTANCE.createDurationInterval());
	}

} //DurationConstraintImplTest
