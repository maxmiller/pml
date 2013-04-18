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
 * A representation of the model object '<em><b>Seletor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.ufrn.lasic.pml.Seletor#getName <em>Name</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.Seletor#getType <em>Type</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.Seletor#getLengh <em>Lengh</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.Seletor#getBit <em>Bit</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.ufrn.lasic.pml.PMLPackage#getSeletor()
 * @model
 * @generated
 */
public interface Seletor extends EObject {
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
	 * @see br.ufrn.lasic.pml.PMLPackage#getSeletor_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link br.ufrn.lasic.pml.Seletor#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link br.ufrn.lasic.pml.TypeData}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see br.ufrn.lasic.pml.TypeData
	 * @see #setType(TypeData)
	 * @see br.ufrn.lasic.pml.PMLPackage#getSeletor_Type()
	 * @model
	 * @generated
	 */
	TypeData getType();

	/**
	 * Sets the value of the '{@link br.ufrn.lasic.pml.Seletor#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see br.ufrn.lasic.pml.TypeData
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeData value);

	/**
	 * Returns the value of the '<em><b>Lengh</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lengh</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lengh</em>' attribute.
	 * @see #setLengh(int)
	 * @see br.ufrn.lasic.pml.PMLPackage#getSeletor_Lengh()
	 * @model
	 * @generated
	 */
	int getLengh();

	/**
	 * Sets the value of the '{@link br.ufrn.lasic.pml.Seletor#getLengh <em>Lengh</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lengh</em>' attribute.
	 * @see #getLengh()
	 * @generated
	 */
	void setLengh(int value);

	/**
	 * Returns the value of the '<em><b>Bit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bit</em>' attribute.
	 * @see #setBit(int)
	 * @see br.ufrn.lasic.pml.PMLPackage#getSeletor_Bit()
	 * @model
	 * @generated
	 */
	int getBit();

	/**
	 * Sets the value of the '{@link br.ufrn.lasic.pml.Seletor#getBit <em>Bit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bit</em>' attribute.
	 * @see #getBit()
	 * @generated
	 */
	void setBit(int value);

} // Seletor
