/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.ufrn.lasic.pml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.ufrn.lasic.pml.Behavior#getName <em>Name</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.Behavior#getTypeBehavior <em>Type Behavior</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.ufrn.lasic.pml.PMLPackage#getBehavior()
 * @model
 * @generated
 */
public interface Behavior extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see br.ufrn.lasic.pml.PMLPackage#getBehavior_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link br.ufrn.lasic.pml.Behavior#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type Behavior</b></em>' attribute.
	 * The literals are from the enumeration {@link br.ufrn.lasic.pml.TypeData}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Behavior</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Behavior</em>' attribute.
	 * @see br.ufrn.lasic.pml.TypeData
	 * @see #setTypeBehavior(TypeData)
	 * @see br.ufrn.lasic.pml.PMLPackage#getBehavior_TypeBehavior()
	 * @model
	 * @generated
	 */
	TypeData getTypeBehavior();

	/**
	 * Sets the value of the '{@link br.ufrn.lasic.pml.Behavior#getTypeBehavior <em>Type Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Behavior</em>' attribute.
	 * @see br.ufrn.lasic.pml.TypeData
	 * @see #getTypeBehavior()
	 * @generated
	 */
	void setTypeBehavior(TypeData value);

} // Behavior
