/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package processor;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Register File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link processor.RegisterFile#getSel <em>Sel</em>}</li>
 *   <li>{@link processor.RegisterFile#getRwBit <em>Rw Bit</em>}</li>
 *   <li>{@link processor.RegisterFile#getClock <em>Clock</em>}</li>
 *   <li>{@link processor.RegisterFile#getRegisters <em>Registers</em>}</li>
 *   <li>{@link processor.RegisterFile#getInRf <em>In Rf</em>}</li>
 *   <li>{@link processor.RegisterFile#getOutRf <em>Out Rf</em>}</li>
 * </ul>
 * </p>
 *
 * @see processor.ProcessorPackage#getRegisterFile()
 * @model
 * @generated
 */
public interface RegisterFile extends EObject {
	/**
	 * Returns the value of the '<em><b>Sel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sel</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sel</em>' reference.
	 * @see #setSel(SeletorRegisterFile)
	 * @see processor.ProcessorPackage#getRegisterFile_Sel()
	 * @model required="true"
	 * @generated
	 */
	SeletorRegisterFile getSel();

	/**
	 * Sets the value of the '{@link processor.RegisterFile#getSel <em>Sel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sel</em>' reference.
	 * @see #getSel()
	 * @generated
	 */
	void setSel(SeletorRegisterFile value);

	/**
	 * Returns the value of the '<em><b>Rw Bit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rw Bit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rw Bit</em>' reference.
	 * @see #setRwBit(ReadWrite)
	 * @see processor.ProcessorPackage#getRegisterFile_RwBit()
	 * @model required="true"
	 * @generated
	 */
	ReadWrite getRwBit();

	/**
	 * Sets the value of the '{@link processor.RegisterFile#getRwBit <em>Rw Bit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rw Bit</em>' reference.
	 * @see #getRwBit()
	 * @generated
	 */
	void setRwBit(ReadWrite value);

	/**
	 * Returns the value of the '<em><b>Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clock</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clock</em>' reference.
	 * @see #setClock(Clock)
	 * @see processor.ProcessorPackage#getRegisterFile_Clock()
	 * @model required="true"
	 * @generated
	 */
	Clock getClock();

	/**
	 * Sets the value of the '{@link processor.RegisterFile#getClock <em>Clock</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clock</em>' reference.
	 * @see #getClock()
	 * @generated
	 */
	void setClock(Clock value);

	/**
	 * Returns the value of the '<em><b>Registers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registers</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registers</em>' attribute.
	 * @see #setRegisters(int[])
	 * @see processor.ProcessorPackage#getRegisterFile_Registers()
	 * @model dataType="processor.ArrayInteger"
	 * @generated
	 */
	int[] getRegisters();

	/**
	 * Sets the value of the '{@link processor.RegisterFile#getRegisters <em>Registers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registers</em>' attribute.
	 * @see #getRegisters()
	 * @generated
	 */
	void setRegisters(int[] value);

	/**
	 * Returns the value of the '<em><b>In Rf</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Rf</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Rf</em>' reference.
	 * @see #setInRf(InputRegisterFile)
	 * @see processor.ProcessorPackage#getRegisterFile_InRf()
	 * @model required="true"
	 * @generated
	 */
	InputRegisterFile getInRf();

	/**
	 * Sets the value of the '{@link processor.RegisterFile#getInRf <em>In Rf</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Rf</em>' reference.
	 * @see #getInRf()
	 * @generated
	 */
	void setInRf(InputRegisterFile value);

	/**
	 * Returns the value of the '<em><b>Out Rf</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Rf</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Rf</em>' reference.
	 * @see #setOutRf(OutputRegisterFile)
	 * @see processor.ProcessorPackage#getRegisterFile_OutRf()
	 * @model required="true"
	 * @generated
	 */
	OutputRegisterFile getOutRf();

	/**
	 * Sets the value of the '{@link processor.RegisterFile#getOutRf <em>Out Rf</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out Rf</em>' reference.
	 * @see #getOutRf()
	 * @generated
	 */
	void setOutRf(OutputRegisterFile value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void registerFileBehavior();

} // RegisterFile
