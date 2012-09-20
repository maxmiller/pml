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
 * A representation of the model object '<em><b>Register Assync Reset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link processor.RegisterAssyncReset#getInternalData <em>Internal Data</em>}</li>
 *   <li>{@link processor.RegisterAssyncReset#getOutRa <em>Out Ra</em>}</li>
 *   <li>{@link processor.RegisterAssyncReset#getInRa <em>In Ra</em>}</li>
 *   <li>{@link processor.RegisterAssyncReset#getReset <em>Reset</em>}</li>
 *   <li>{@link processor.RegisterAssyncReset#getClock <em>Clock</em>}</li>
 *   <li>{@link processor.RegisterAssyncReset#getLoad <em>Load</em>}</li>
 * </ul>
 * </p>
 *
 * @see processor.ProcessorPackage#getRegisterAssyncReset()
 * @model
 * @generated
 */
public interface RegisterAssyncReset extends EObject {
	/**
	 * Returns the value of the '<em><b>Internal Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Internal Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Data</em>' attribute.
	 * @see #setInternalData(int)
	 * @see processor.ProcessorPackage#getRegisterAssyncReset_InternalData()
	 * @model
	 * @generated
	 */
	int getInternalData();

	/**
	 * Sets the value of the '{@link processor.RegisterAssyncReset#getInternalData <em>Internal Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Data</em>' attribute.
	 * @see #getInternalData()
	 * @generated
	 */
	void setInternalData(int value);

	/**
	 * Returns the value of the '<em><b>Out Ra</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Ra</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Ra</em>' reference.
	 * @see #setOutRa(OutputRegisterAssync)
	 * @see processor.ProcessorPackage#getRegisterAssyncReset_OutRa()
	 * @model required="true"
	 * @generated
	 */
	OutputRegisterAssync getOutRa();

	/**
	 * Sets the value of the '{@link processor.RegisterAssyncReset#getOutRa <em>Out Ra</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out Ra</em>' reference.
	 * @see #getOutRa()
	 * @generated
	 */
	void setOutRa(OutputRegisterAssync value);

	/**
	 * Returns the value of the '<em><b>In Ra</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Ra</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Ra</em>' reference.
	 * @see #setInRa(InputRegisterAssync)
	 * @see processor.ProcessorPackage#getRegisterAssyncReset_InRa()
	 * @model required="true"
	 * @generated
	 */
	InputRegisterAssync getInRa();

	/**
	 * Sets the value of the '{@link processor.RegisterAssyncReset#getInRa <em>In Ra</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Ra</em>' reference.
	 * @see #getInRa()
	 * @generated
	 */
	void setInRa(InputRegisterAssync value);

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
	 * @see processor.ProcessorPackage#getRegisterAssyncReset_Reset()
	 * @model required="true"
	 * @generated
	 */
	Reset getReset();

	/**
	 * Sets the value of the '{@link processor.RegisterAssyncReset#getReset <em>Reset</em>}' reference.
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
	 * @see processor.ProcessorPackage#getRegisterAssyncReset_Clock()
	 * @model required="true"
	 * @generated
	 */
	Clock getClock();

	/**
	 * Sets the value of the '{@link processor.RegisterAssyncReset#getClock <em>Clock</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clock</em>' reference.
	 * @see #getClock()
	 * @generated
	 */
	void setClock(Clock value);

	/**
	 * Returns the value of the '<em><b>Load</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Load</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load</em>' reference.
	 * @see #setLoad(Load)
	 * @see processor.ProcessorPackage#getRegisterAssyncReset_Load()
	 * @model required="true"
	 * @generated
	 */
	Load getLoad();

	/**
	 * Sets the value of the '{@link processor.RegisterAssyncReset#getLoad <em>Load</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load</em>' reference.
	 * @see #getLoad()
	 * @generated
	 */
	void setLoad(Load value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void RegisterBehaviour();

} // RegisterAssyncReset
