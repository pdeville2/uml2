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
 * $Id: ExtensionImplTest.java,v 1.1 2004/04/29 14:56:47 khussey Exp $
 */
package org.eclipse.uml2.impl.tests;

import junit.textui.TestRunner;

import org.eclipse.uml2.ExtensionEnd;
import org.eclipse.uml2.LiteralInteger;
import org.eclipse.uml2.Property;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.impl.ExtensionImpl;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Extension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.ExtensionImpl#isRequired() <em>Is Required</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ExtensionImpl#getMetaclass() <em>Metaclass</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.ExtensionImpl#getOwnedEnds() <em>Get Owned Ends</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class ExtensionImplTest extends AssociationImplTest {

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
		TestRunner.run(ExtensionImplTest.class);
	}

	/**
	 * Constructs a new Extension test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionImplTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Extension test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ExtensionImpl getFixture() {
		return (ExtensionImpl) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture((ExtensionImpl) UML2Factory.eINSTANCE.createExtension());
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
	 * Tests the '{@link org.eclipse.uml2.impl.ExtensionImpl#isRequired() <em>Is Required</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ExtensionImpl#isRequired()
	 * @generated NOT
	 */
	public void testIsRequired() {
		assertFalse(getFixture().isRequired());

		ExtensionEnd extensionEnd = UML2Factory.eINSTANCE.createExtensionEnd();
		getFixture().getOwnedEnds().add(extensionEnd);

		assertTrue(getFixture().isRequired());

		extensionEnd.setLowerValue(UML2Factory.eINSTANCE.createLiteralInteger());
		((LiteralInteger) extensionEnd.getLowerValue()).setValue(0);

		assertFalse(getFixture().isRequired());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ExtensionImpl#getMetaclass() <em>Metaclass</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ExtensionImpl#getMetaclass()
	 * @generated NOT
	 */
	public void testGetMetaclass() {
		Property property = UML2Factory.eINSTANCE.createProperty();
		property.setType(UML2Factory.eINSTANCE.createClass());
		getFixture().getMemberEnds().add(property);

		ExtensionEnd extensionEnd = UML2Factory.eINSTANCE.createExtensionEnd();
		extensionEnd.setType(UML2Factory.eINSTANCE.createStereotype());
		getFixture().getMemberEnds().add(extensionEnd);
		getFixture().getOwnedEnds().add(extensionEnd);

		assertSame(property.getType(), getFixture().getMetaclass());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ExtensionImpl#getOwnedEnds() <em>Get Owned Ends</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ExtensionImpl#getOwnedEnds()
	 * @generated NOT
	 */
	public void testGetOwnedEnds() {

		try {
			getFixture().getOwnedEnds().add(UML2Factory.eINSTANCE.createProperty());

			fail();
		} catch (Exception e) {
			getFixture().getOwnedEnds().add(UML2Factory.eINSTANCE.createExtensionEnd());

			assertEquals(1, getFixture().getOwnedEnds().size());
		}
	}

	/**
	 * @see org.eclipse.uml2.impl.tests.AssociationImplTest#testGetEndTypes()
	 */
	public void testGetEndTypes() {
		Property property = UML2Factory.eINSTANCE.createProperty();
		property.setType(UML2Factory.eINSTANCE.createClass());
		getFixture().getMemberEnds().add(property);

		ExtensionEnd extensionEnd = UML2Factory.eINSTANCE.createExtensionEnd();
		extensionEnd.setType(UML2Factory.eINSTANCE.createStereotype());
		getFixture().getMemberEnds().add(extensionEnd);
		getFixture().getOwnedEnds().add(extensionEnd);

		assertTrue(getFixture().getEndTypes().contains(property.getType()));
		assertTrue(getFixture().getEndTypes().contains(extensionEnd.getType()));
	}

	/**
	 * @see org.eclipse.uml2.impl.tests.AssociationImplTest#testGetRelatedElements()
	 */
	public void testGetRelatedElements() {
		Property property = UML2Factory.eINSTANCE.createProperty();
		property.setType(UML2Factory.eINSTANCE.createClass());
		getFixture().getMemberEnds().add(property);

		ExtensionEnd extensionEnd = UML2Factory.eINSTANCE.createExtensionEnd();
		extensionEnd.setType(UML2Factory.eINSTANCE.createStereotype());
		getFixture().getMemberEnds().add(extensionEnd);

		assertTrue(getFixture().getRelatedElements().containsAll(getFixture().getEndTypes()));
	}

	/**
	 * @see org.eclipse.uml2.impl.tests.NamespaceImplTest#setUpOwnedMembers()
	 */
	protected void setUpOwnedMembers() {
		getFixture().getOwnedRules().add(UML2Factory.eINSTANCE.createConstraint());
		getFixture().getOwnedRules().add(UML2Factory.eINSTANCE.createConstraint());

		getFixture().getOwnedUseCases().add(UML2Factory.eINSTANCE.createUseCase());
		getFixture().getOwnedUseCases().add(UML2Factory.eINSTANCE.createUseCase());

		getFixture().getOwnedEnds().add(UML2Factory.eINSTANCE.createExtensionEnd());
	}

	/**
	 * @see org.eclipse.uml2.impl.tests.ClassifierImplTest#setUpFeatures()
	 */
	protected void setUpFeatures() {
		getFixture().getOwnedEnds().add(UML2Factory.eINSTANCE.createExtensionEnd());
	}

	/**
	 * @see org.eclipse.uml2.impl.tests.NamespaceImplTest#setUpMembers()
	 */
	protected void setUpMembers() {
		getFixture().getMemberEnds().add(UML2Factory.eINSTANCE.createProperty());
		getFixture().getMemberEnds().add(UML2Factory.eINSTANCE.createExtensionEnd());
	}

} //ExtensionImplTest
