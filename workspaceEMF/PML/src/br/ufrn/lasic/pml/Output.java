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
 * A representation of the model object '<em><b>Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.ufrn.lasic.pml.Output#getName <em>Name</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.Output#getType <em>Type</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.Output#getOutin <em>Outin</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.Output#isSensitive <em>Sensitive</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.Output#getLength <em>Length</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.ufrn.lasic.pml.PMLPackage#getOutput()
 * @model
 * @generated
 */
public interface Output extends EObject {
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
	 * @see br.ufrn.lasic.pml.PMLPackage#getOutput_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link br.ufrn.lasic.pml.Output#getName <em>Name</em>}' attribute.
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
	 * @see br.ufrn.lasic.pml.PMLPackage#getOutput_Type()
	 * @model
	 * @generated
	 */
	TypeData getType();

	/**
	 * Sets the value of the '{@link br.ufrn.lasic.pml.Output#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see br.ufrn.lasic.pml.TypeData
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeData value);

	/**
	 * Returns the value of the '<em><b>Outin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outin</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outin</em>' reference.
	 * @see #setOutin(Input)
	 * @see br.ufrn.lasic.pml.PMLPackage#getOutput_Outin()
	 * @model
	 * @generated
	 */
	Input getOutin();

	/**
	 * Sets the value of the '{@link br.ufrn.lasic.pml.Output#getOutin <em>Outin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outin</em>' reference.
	 * @see #getOutin()
	 * @generated
	 */
	void setOutin(Input value);

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
	 * @see br.ufrn.lasic.pml.PMLPackage#getOutput_Sensitive()
	 * @model
	 * @generated
	 */
	boolean isSensitive();

	/**
	 * Sets the value of the '{@link br.ufrn.lasic.pml.Output#isSensitive <em>Sensitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensitive</em>' attribute.
	 * @see #isSensitive()
	 * @generated
	 */
	void setSensitive(boolean value);

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
	 * @see br.ufrn.lasic.pml.PMLPackage#getOutput_Length()
	 * @model
	 * @generated
	 */
	int getLength();

	/**
	 * Sets the value of the '{@link br.ufrn.lasic.pml.Output#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(int value);

} // Output
