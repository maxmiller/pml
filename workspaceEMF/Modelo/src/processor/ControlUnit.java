/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package processor;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link processor.ControlUnit#getLoads <em>Loads</em>}</li>
 *   <li>{@link processor.ControlUnit#getWriteMemory <em>Write Memory</em>}</li>
 *   <li>{@link processor.ControlUnit#getReadwritebit <em>Readwritebit</em>}</li>
 *   <li>{@link processor.ControlUnit#getSelControlUnit <em>Sel Control Unit</em>}</li>
 *   <li>{@link processor.ControlUnit#getState <em>State</em>}</li>
 *   <li>{@link processor.ControlUnit#getInstructionSubstate <em>Instruction Substate</em>}</li>
 * </ul>
 * </p>
 *
 * @see processor.ProcessorPackage#getControlUnit()
 * @model
 * @generated
 */
public interface ControlUnit extends EObject {
	/**
	 * Returns the value of the '<em><b>Loads</b></em>' reference list.
	 * The list contents are of type {@link processor.LoadControlUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loads</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loads</em>' reference list.
	 * @see processor.ProcessorPackage#getControlUnit_Loads()
	 * @model required="true"
	 * @generated
	 */
	EList<LoadControlUnit> getLoads();

	/**
	 * Returns the value of the '<em><b>Write Memory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Write Memory</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Write Memory</em>' reference.
	 * @see #setWriteMemory(Write)
	 * @see processor.ProcessorPackage#getControlUnit_WriteMemory()
	 * @model required="true"
	 * @generated
	 */
	Write getWriteMemory();

	/**
	 * Sets the value of the '{@link processor.ControlUnit#getWriteMemory <em>Write Memory</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Write Memory</em>' reference.
	 * @see #getWriteMemory()
	 * @generated
	 */
	void setWriteMemory(Write value);

	/**
	 * Returns the value of the '<em><b>Readwritebit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Readwritebit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Readwritebit</em>' reference.
	 * @see #setReadwritebit(ReadWrite)
	 * @see processor.ProcessorPackage#getControlUnit_Readwritebit()
	 * @model required="true"
	 * @generated
	 */
	ReadWrite getReadwritebit();

	/**
	 * Sets the value of the '{@link processor.ControlUnit#getReadwritebit <em>Readwritebit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Readwritebit</em>' reference.
	 * @see #getReadwritebit()
	 * @generated
	 */
	void setReadwritebit(ReadWrite value);

	/**
	 * Returns the value of the '<em><b>Sel Control Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sel Control Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sel Control Unit</em>' reference.
	 * @see #setSelControlUnit(SeletorControlUnit)
	 * @see processor.ProcessorPackage#getControlUnit_SelControlUnit()
	 * @model required="true"
	 * @generated
	 */
	SeletorControlUnit getSelControlUnit();

	/**
	 * Sets the value of the '{@link processor.ControlUnit#getSelControlUnit <em>Sel Control Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sel Control Unit</em>' reference.
	 * @see #getSelControlUnit()
	 * @generated
	 */
	void setSelControlUnit(SeletorControlUnit value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see #setState(int)
	 * @see processor.ProcessorPackage#getControlUnit_State()
	 * @model
	 * @generated
	 */
	int getState();

	/**
	 * Sets the value of the '{@link processor.ControlUnit#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see #getState()
	 * @generated
	 */
	void setState(int value);

	/**
	 * Returns the value of the '<em><b>Instruction Substate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instruction Substate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instruction Substate</em>' attribute.
	 * @see #setInstructionSubstate(int)
	 * @see processor.ProcessorPackage#getControlUnit_InstructionSubstate()
	 * @model
	 * @generated
	 */
	int getInstructionSubstate();

	/**
	 * Sets the value of the '{@link processor.ControlUnit#getInstructionSubstate <em>Instruction Substate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instruction Substate</em>' attribute.
	 * @see #getInstructionSubstate()
	 * @generated
	 */
	void setInstructionSubstate(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void controlUnitBehavior();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void processInstruction();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void processMiscellaneousInstruction();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void processControlInstruction();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void processRegisterInstruction();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void processMemoryInstruction();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void resetAllLoads();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void incrementPC();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void loadsARWithPc();

} // ControlUnit
