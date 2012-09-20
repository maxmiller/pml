/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package multiplexormodel.multiplexador;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiplexer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link multiplexormodel.multiplexador.Multiplexer#getNumInputs <em>Num Inputs</em>}</li>
 *   <li>{@link multiplexormodel.multiplexador.Multiplexer#getInputs <em>Inputs</em>}</li>
 *   <li>{@link multiplexormodel.multiplexador.Multiplexer#getOutput <em>Output</em>}</li>
 *   <li>{@link multiplexormodel.multiplexador.Multiplexer#getSel <em>Sel</em>}</li>
 * </ul>
 * </p>
 *
 * @see multiplexormodel.multiplexador.MultiplexadorPackage#getMultiplexer()
 * @model
 * @generated
 */
public interface Multiplexer extends EObject {
	/**
	 * Returns the value of the '<em><b>Num Inputs</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Inputs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Inputs</em>' attribute.
	 * @see #setNumInputs(int)
	 * @see multiplexormodel.multiplexador.MultiplexadorPackage#getMultiplexer_NumInputs()
	 * @model default="0"
	 * @generated
	 */
	int getNumInputs();

	/**
	 * Sets the value of the '{@link multiplexormodel.multiplexador.Multiplexer#getNumInputs <em>Num Inputs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Inputs</em>' attribute.
	 * @see #getNumInputs()
	 * @generated
	 */
	void setNumInputs(int value);

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link multiplexormodel.multiplexador.Input}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference list.
	 * @see multiplexormodel.multiplexador.MultiplexadorPackage#getMultiplexer_Inputs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Input> getInputs();

	/**
	 * Returns the value of the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' containment reference.
	 * @see #setOutput(Output)
	 * @see multiplexormodel.multiplexador.MultiplexadorPackage#getMultiplexer_Output()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Output getOutput();

	/**
	 * Sets the value of the '{@link multiplexormodel.multiplexador.Multiplexer#getOutput <em>Output</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' containment reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(Output value);

	/**
	 * Returns the value of the '<em><b>Sel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sel</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sel</em>' containment reference.
	 * @see #setSel(Seletor)
	 * @see multiplexormodel.multiplexador.MultiplexadorPackage#getMultiplexer_Sel()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Seletor getSel();

	/**
	 * Sets the value of the '{@link multiplexormodel.multiplexador.Multiplexer#getSel <em>Sel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sel</em>' containment reference.
	 * @see #getSel()
	 * @generated
	 */
	void setSel(Seletor value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void multiplexerBehavior();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void Multiplexer(int numInputs);

} // Multiplexer
