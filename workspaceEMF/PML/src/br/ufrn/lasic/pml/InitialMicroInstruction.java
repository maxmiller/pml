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
 * A representation of the model object '<em><b>Initial Micro Instruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.ufrn.lasic.pml.InitialMicroInstruction#getNext <em>Next</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.InitialMicroInstruction#getName <em>Name</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.InitialMicroInstruction#getValue <em>Value</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.InitialMicroInstruction#getDirectFinalMicroInstruction <em>Direct Final Micro Instruction</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.ufrn.lasic.pml.PMLPackage#getInitialMicroInstruction()
 * @model
 * @generated
 */
public interface InitialMicroInstruction extends EObject {
	/**
	 * Returns the value of the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' containment reference.
	 * @see #setNext(MicroInstruction)
	 * @see br.ufrn.lasic.pml.PMLPackage#getInitialMicroInstruction_Next()
	 * @model containment="true"
	 * @generated
	 */
	MicroInstruction getNext();

	/**
	 * Sets the value of the '{@link br.ufrn.lasic.pml.InitialMicroInstruction#getNext <em>Next</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' containment reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(MicroInstruction value);

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
	 * @see br.ufrn.lasic.pml.PMLPackage#getInitialMicroInstruction_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link br.ufrn.lasic.pml.InitialMicroInstruction#getName <em>Name</em>}' attribute.
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
	 * @see br.ufrn.lasic.pml.PMLPackage#getInitialMicroInstruction_Value()
	 * @model
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link br.ufrn.lasic.pml.InitialMicroInstruction#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

	/**
	 * Returns the value of the '<em><b>Direct Final Micro Instruction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direct Final Micro Instruction</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direct Final Micro Instruction</em>' containment reference.
	 * @see #setDirectFinalMicroInstruction(FinalMicroInstruction)
	 * @see br.ufrn.lasic.pml.PMLPackage#getInitialMicroInstruction_DirectFinalMicroInstruction()
	 * @model containment="true"
	 * @generated
	 */
	FinalMicroInstruction getDirectFinalMicroInstruction();

	/**
	 * Sets the value of the '{@link br.ufrn.lasic.pml.InitialMicroInstruction#getDirectFinalMicroInstruction <em>Direct Final Micro Instruction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direct Final Micro Instruction</em>' containment reference.
	 * @see #getDirectFinalMicroInstruction()
	 * @generated
	 */
	void setDirectFinalMicroInstruction(FinalMicroInstruction value);

} // InitialMicroInstruction
