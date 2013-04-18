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
 * A representation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.ufrn.lasic.pml.Input#getName <em>Name</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.Input#getType <em>Type</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.Input#getLength <em>Length</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.Input#getInout <em>Inout</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.Input#isSensitive <em>Sensitive</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.Input#getBit <em>Bit</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.ufrn.lasic.pml.PMLPackage#getInput()
 * @model
 * @generated
 */
public interface Input extends EObject {
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
	 * @see br.ufrn.lasic.pml.PMLPackage#getInput_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link br.ufrn.lasic.pml.Input#getName <em>Name</em>}' attribute.
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
	 * @see br.ufrn.lasic.pml.PMLPackage#getInput_Type()
	 * @model
	 * @generated
	 */
	TypeData getType();

	/**
	 * Sets the value of the '{@link br.ufrn.lasic.pml.Input#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see br.ufrn.lasic.pml.TypeData
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeData value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(int)
	 * @see br.ufrn.lasic.pml.PMLPackage#getInput_Length()
	 * @model
	 * @generated
	 */
	int getLength();

	/**
	 * Sets the value of the '{@link br.ufrn.lasic.pml.Input#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(int value);

	/**
	 * Returns the value of the '<em><b>Inout</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inout</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inout</em>' reference.
	 * @see #setInout(Output)
	 * @see br.ufrn.lasic.pml.PMLPackage#getInput_Inout()
	 * @model
	 * @generated
	 */
	Output getInout();

	/**
	 * Sets the value of the '{@link br.ufrn.lasic.pml.Input#getInout <em>Inout</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inout</em>' reference.
	 * @see #getInout()
	 * @generated
	 */
	void setInout(Output value);

	/**
	 * Returns the value of the '<em><b>Sensitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensitive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensitive</em>' attribute.
	 * @see #setSensitive(boolean)
	 * @see br.ufrn.lasic.pml.PMLPackage#getInput_Sensitive()
	 * @model
	 * @generated
	 */
	boolean isSensitive();

	/**
	 * Sets the value of the '{@link br.ufrn.lasic.pml.Input#isSensitive <em>Sensitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensitive</em>' attribute.
	 * @see #isSensitive()
	 * @generated
	 */
	void setSensitive(boolean value);

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
	 * @see br.ufrn.lasic.pml.PMLPackage#getInput_Bit()
	 * @model
	 * @generated
	 */
	int getBit();

	/**
	 * Sets the value of the '{@link br.ufrn.lasic.pml.Input#getBit <em>Bit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bit</em>' attribute.
	 * @see #getBit()
	 * @generated
	 */
	void setBit(int value);

} // Input
