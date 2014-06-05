/**
 */
package br.ufrn.lasic.pml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Final Micro Instruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.ufrn.lasic.pml.FinalMicroInstruction#getName <em>Name</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.FinalMicroInstruction#getValue <em>Value</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.FinalMicroInstruction#getFinalFSM <em>Final FSM</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.ufrn.lasic.pml.PMLPackage#getFinalMicroInstruction()
 * @model
 * @generated
 */
public interface FinalMicroInstruction extends EObject {
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
	 * @see br.ufrn.lasic.pml.PMLPackage#getFinalMicroInstruction_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link br.ufrn.lasic.pml.FinalMicroInstruction#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see br.ufrn.lasic.pml.PMLPackage#getFinalMicroInstruction_Value()
	 * @model
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link br.ufrn.lasic.pml.FinalMicroInstruction#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

	/**
	 * Returns the value of the '<em><b>Final FSM</b></em>' reference list.
	 * The list contents are of type {@link br.ufrn.lasic.pml.Instructions}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Final FSM</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final FSM</em>' reference list.
	 * @see br.ufrn.lasic.pml.PMLPackage#getFinalMicroInstruction_FinalFSM()
	 * @model
	 * @generated
	 */
	EList<Instructions> getFinalFSM();

} // FinalMicroInstruction
