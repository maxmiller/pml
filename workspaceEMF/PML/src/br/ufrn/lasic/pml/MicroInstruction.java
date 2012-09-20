/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.ufrn.lasic.pml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Micro Instruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.ufrn.lasic.pml.MicroInstruction#getName <em>Name</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.MicroInstruction#getValue <em>Value</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.MicroInstruction#getNextMicroinstruction <em>Next Microinstruction</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.MicroInstruction#getFinal <em>Final</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.ufrn.lasic.pml.PMLPackage#getMicroInstruction()
 * @model
 * @generated
 */
public interface MicroInstruction extends EObject {
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
	 * @see br.ufrn.lasic.pml.PMLPackage#getMicroInstruction_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link br.ufrn.lasic.pml.MicroInstruction#getName <em>Name</em>}' attribute.
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
	 * @see br.ufrn.lasic.pml.PMLPackage#getMicroInstruction_Value()
	 * @model
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link br.ufrn.lasic.pml.MicroInstruction#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

	/**
	 * Returns the value of the '<em><b>Next Microinstruction</b></em>' containment reference list.
	 * The list contents are of type {@link br.ufrn.lasic.pml.MicroInstruction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Microinstruction</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Microinstruction</em>' containment reference list.
	 * @see br.ufrn.lasic.pml.PMLPackage#getMicroInstruction_NextMicroinstruction()
	 * @model containment="true"
	 * @generated
	 */
	EList<MicroInstruction> getNextMicroinstruction();

	/**
	 * Returns the value of the '<em><b>Final</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Final</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final</em>' containment reference.
	 * @see #setFinal(FinalMicroInstruction)
	 * @see br.ufrn.lasic.pml.PMLPackage#getMicroInstruction_Final()
	 * @model containment="true"
	 * @generated
	 */
	FinalMicroInstruction getFinal();

	/**
	 * Sets the value of the '{@link br.ufrn.lasic.pml.MicroInstruction#getFinal <em>Final</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final</em>' containment reference.
	 * @see #getFinal()
	 * @generated
	 */
	void setFinal(FinalMicroInstruction value);

} // MicroInstruction
