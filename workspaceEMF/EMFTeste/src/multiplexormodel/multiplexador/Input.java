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
 * A representation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link multiplexormodel.multiplexador.Input#getInputs <em>Inputs</em>}</li>
 *   <li>{@link multiplexormodel.multiplexador.Input#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see multiplexormodel.multiplexador.MultiplexadorPackage#getInput()
 * @model
 * @generated
 */
public interface Input extends EObject {
	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link multiplexormodel.multiplexador.Multiplexer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference list.
	 * @see multiplexormodel.multiplexador.MultiplexadorPackage#getInput_Inputs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Multiplexer> getInputs();

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
	 * @see multiplexormodel.multiplexador.MultiplexadorPackage#getInput_Value()
	 * @model default="0"
	 *        extendedMetaData="kind='group' affiliation='#numInputs'"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link multiplexormodel.multiplexador.Input#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

} // Input
