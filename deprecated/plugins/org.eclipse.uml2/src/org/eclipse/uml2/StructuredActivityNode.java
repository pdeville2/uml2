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
 * $Id: StructuredActivityNode.java,v 1.4 2004/10/01 19:36:29 khussey Exp $
 */
package org.eclipse.uml2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structured Activity Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.StructuredActivityNode#getVariables <em>Variable</em>}</li>
 *   <li>{@link org.eclipse.uml2.StructuredActivityNode#getContainedNodes <em>Contained Node</em>}</li>
 *   <li>{@link org.eclipse.uml2.StructuredActivityNode#getContainedEdges <em>Contained Edge</em>}</li>
 *   <li>{@link org.eclipse.uml2.StructuredActivityNode#isMustIsolate <em>Must Isolate</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getStructuredActivityNode()
 * @model 
 * @generated
 */
public interface StructuredActivityNode extends Action, Namespace, ActivityGroup{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Must Isolate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Must Isolate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Must Isolate</em>' attribute.
	 * @see #setMustIsolate(boolean)
	 * @see org.eclipse.uml2.UML2Package#getStructuredActivityNode_MustIsolate()
	 * @model dataType="org.eclipse.uml2.Boolean" volatile="true"
	 * @generated
	 */
	boolean isMustIsolate();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.StructuredActivityNode#isMustIsolate <em>Must Isolate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Must Isolate</em>' attribute.
	 * @see #isMustIsolate()
	 * @generated
	 */
	void setMustIsolate(boolean value);

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Variable}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.Variable#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getStructuredActivityNode_Variable()
	 * @see org.eclipse.uml2.Variable#getScope
	 * @model type="org.eclipse.uml2.Variable" opposite="scope" containment="true" ordered="false"
	 * @generated
	 */
	EList getVariables();

    /**
     * Retrieves the {@link org.eclipse.uml2.Variable} with the specified name from the '<em><b>Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.Variable} to retrieve.
	 * @return The {@link org.eclipse.uml2.Variable} with the specified name, or <code>null</code>.
	 * @see #getVariables()
	 * @generated
     */
    Variable getVariable(String unqualifiedName);
      
    /**
     * Creates a {@link org.eclipse.uml2.Variable} and appends it to the '<em><b>Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.Variable} to create.
	 * @return The new {@link org.eclipse.uml2.Variable}.
	 * @see #getVariables()
	 * @generated
     */
    Variable createVariable(EClass eClass);

	/**
	 * Returns the value of the '<em><b>Contained Node</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.ActivityNode}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.ActivityNode#getInStructuredNode <em>In Structured Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Node</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Node</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getStructuredActivityNode_ContainedNode()
	 * @see org.eclipse.uml2.ActivityNode#getInStructuredNode
	 * @model type="org.eclipse.uml2.ActivityNode" opposite="inStructuredNode" containment="true"
	 * @generated
	 */
	EList getContainedNodes();

    /**
     * Retrieves the {@link org.eclipse.uml2.ActivityNode} with the specified name from the '<em><b>Contained Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.ActivityNode} to retrieve.
	 * @return The {@link org.eclipse.uml2.ActivityNode} with the specified name, or <code>null</code>.
	 * @see #getContainedNodes()
	 * @generated
     */
    ActivityNode getContainedNode(String unqualifiedName);
      
    /**
     * Creates a {@link org.eclipse.uml2.ActivityNode} and appends it to the '<em><b>Contained Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.ActivityNode} to create.
	 * @return The new {@link org.eclipse.uml2.ActivityNode}.
	 * @see #getContainedNodes()
	 * @generated
     */
    ActivityNode createContainedNode(EClass eClass);

	/**
	 * Returns the value of the '<em><b>Contained Edge</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.ActivityEdge}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.ActivityEdge#getInStructuredNode <em>In Structured Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Edge</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Edge</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getStructuredActivityNode_ContainedEdge()
	 * @see org.eclipse.uml2.ActivityEdge#getInStructuredNode
	 * @model type="org.eclipse.uml2.ActivityEdge" opposite="inStructuredNode" containment="true"
	 * @generated
	 */
	EList getContainedEdges();

    /**
     * Retrieves the {@link org.eclipse.uml2.ActivityEdge} with the specified name from the '<em><b>Contained Edge</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.ActivityEdge} to retrieve.
	 * @return The {@link org.eclipse.uml2.ActivityEdge} with the specified name, or <code>null</code>.
	 * @see #getContainedEdges()
	 * @generated
     */
    ActivityEdge getContainedEdge(String unqualifiedName);
      
    /**
     * Creates a {@link org.eclipse.uml2.ActivityEdge} and appends it to the '<em><b>Contained Edge</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.ActivityEdge} to create.
	 * @return The new {@link org.eclipse.uml2.ActivityEdge}.
	 * @see #getContainedEdges()
	 * @generated
     */
    ActivityEdge createContainedEdge(EClass eClass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 * @generated
	 */
	Activity getActivity();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model 
	 * @generated
	 */
	void setActivity(Activity value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 * @generated
	 */
	Activity getActivityGroup_activity();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model 
	 * @generated
	 */
	void setActivityGroup_activity(Activity value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 * @generated
	 */
	EList getOwnedMembers();

} // StructuredActivityNode
