/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package multiplexormodel.multiplexador;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link multiplexormodel.multiplexador.Output#getOutput <em>Output</em>}</li>
 *   <li>{@link multiplexormodel.multiplexador.Output#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see multiplexormodel.multiplexador.MultiplexadorPackage#getOutput()
 * @model
 * @generated
 */
public interface Output extends EObject {
	/**
	 * Returns the value of the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' containment reference.
	 * @see #setOutput(Multiplexer)
	 * @see multiplexormodel.multiplexador.MultiplexadorPackage#getOutput_Output()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Multiplexer getOutput();

	/**
	 * Sets the value of the '{@link multiplexormodel.multiplexador.Output#getOutput <em>Output</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' containment reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(Multiplexer value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see multiplexormodel.multiplexador.MultiplexadorPackage#getOutput_Value()
	 * @model default="0"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link multiplexormodel.multiplexador.Output#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

} // Output
