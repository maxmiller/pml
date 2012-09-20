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
 * A representation of the model object '<em><b>Memory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link processor.Memory#getMem <em>Mem</em>}</li>
 *   <li>{@link processor.Memory#getWrite <em>Write</em>}</li>
 *   <li>{@link processor.Memory#getReset <em>Reset</em>}</li>
 *   <li>{@link processor.Memory#getClock <em>Clock</em>}</li>
 *   <li>{@link processor.Memory#getDatai <em>Datai</em>}</li>
 *   <li>{@link processor.Memory#getDatao <em>Datao</em>}</li>
 *   <li>{@link processor.Memory#getAddress <em>Address</em>}</li>
 * </ul>
 * </p>
 *
 * @see processor.ProcessorPackage#getMemory()
 * @model
 * @generated
 */
public interface Memory extends EObject {
	/**
	 * Returns the value of the '<em><b>Mem</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mem</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mem</em>' attribute.
	 * @see #setMem(int[])
	 * @see processor.ProcessorPackage#getMemory_Mem()
	 * @model dataType="processor.ArrayInteger"
	 * @generated
	 */
	int[] getMem();

	/**
	 * Sets the value of the '{@link processor.Memory#getMem <em>Mem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mem</em>' attribute.
	 * @see #getMem()
	 * @generated
	 */
	void setMem(int[] value);

	/**
	 * Returns the value of the '<em><b>Write</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Write</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Write</em>' reference.
	 * @see #setWrite(Write)
	 * @see processor.ProcessorPackage#getMemory_Write()
	 * @model required="true"
	 * @generated
	 */
	Write getWrite();

	/**
	 * Sets the value of the '{@link processor.Memory#getWrite <em>Write</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Write</em>' reference.
	 * @see #getWrite()
	 * @generated
	 */
	void setWrite(Write value);

	/**
	 * Returns the value of the '<em><b>Reset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reset</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reset</em>' reference.
	 * @see #setReset(Reset)
	 * @see processor.ProcessorPackage#getMemory_Reset()
	 * @model required="true"
	 * @generated
	 */
	Reset getReset();

	/**
	 * Sets the value of the '{@link processor.Memory#getReset <em>Reset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reset</em>' reference.
	 * @see #getReset()
	 * @generated
	 */
	void setReset(Reset value);

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
	 * @see processor.ProcessorPackage#getMemory_Clock()
	 * @model required="true"
	 * @generated
	 */
	Clock getClock();

	/**
	 * Sets the value of the '{@link processor.Memory#getClock <em>Clock</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clock</em>' reference.
	 * @see #getClock()
	 * @generated
	 */
	void setClock(Clock value);

	/**
	 * Returns the value of the '<em><b>Datai</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datai</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datai</em>' reference.
	 * @see #setDatai(InputMemory)
	 * @see processor.ProcessorPackage#getMemory_Datai()
	 * @model required="true"
	 * @generated
	 */
	InputMemory getDatai();

	/**
	 * Sets the value of the '{@link processor.Memory#getDatai <em>Datai</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datai</em>' reference.
	 * @see #getDatai()
	 * @generated
	 */
	void setDatai(InputMemory value);

	/**
	 * Returns the value of the '<em><b>Datao</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datao</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datao</em>' reference.
	 * @see #setDatao(OutputMemory)
	 * @see processor.ProcessorPackage#getMemory_Datao()
	 * @model required="true"
	 * @generated
	 */
	OutputMemory getDatao();

	/**
	 * Sets the value of the '{@link processor.Memory#getDatao <em>Datao</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datao</em>' reference.
	 * @see #getDatao()
	 * @generated
	 */
	void setDatao(OutputMemory value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' reference.
	 * @see #setAddress(AddressMemory)
	 * @see processor.ProcessorPackage#getMemory_Address()
	 * @model required="true"
	 * @generated
	 */
	AddressMemory getAddress();

	/**
	 * Sets the value of the '{@link processor.Memory#getAddress <em>Address</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' reference.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(AddressMemory value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void t_sync_mem();

} // Memory
