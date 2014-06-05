/**
 */
package br.ufrn.lasic.pml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Register</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.ufrn.lasic.pml.Register#getBehaviorRegister <em>Behavior Register</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.Register#getOutputRegister <em>Output Register</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.Register#getInputRegister <em>Input Register</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.Register#getName <em>Name</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.Register#getLength <em>Length</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.ufrn.lasic.pml.PMLPackage#getRegister()
 * @model
 * @generated
 */
public interface Register extends EObject {
	/**
	 * Returns the value of the '<em><b>Behavior Register</b></em>' containment reference list.
	 * The list contents are of type {@link br.ufrn.lasic.pml.Behavior}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behavior Register</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behavior Register</em>' containment reference list.
	 * @see br.ufrn.lasic.pml.PMLPackage#getRegister_BehaviorRegister()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Behavior> getBehaviorRegister();

	/**
	 * Returns the value of the '<em><b>Output Register</b></em>' containment reference list.
	 * The list contents are of type {@link br.ufrn.lasic.pml.Output}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Register</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Register</em>' containment reference list.
	 * @see br.ufrn.lasic.pml.PMLPackage#getRegister_OutputRegister()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Output> getOutputRegister();

	/**
	 * Returns the value of the '<em><b>Input Register</b></em>' containment reference list.
	 * The list contents are of type {@link br.ufrn.lasic.pml.Input}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Register</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Register</em>' containment reference list.
	 * @see br.ufrn.lasic.pml.PMLPackage#getRegister_InputRegister()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Input> getInputRegister();

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
	 * @see br.ufrn.lasic.pml.PMLPackage#getRegister_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link br.ufrn.lasic.pml.Register#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(int)
	 * @see br.ufrn.lasic.pml.PMLPackage#getRegister_Length()
	 * @model
	 * @generated
	 */
	int getLength();

	/**
	 * Sets the value of the '{@link br.ufrn.lasic.pml.Register#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(int value);

} // Register
