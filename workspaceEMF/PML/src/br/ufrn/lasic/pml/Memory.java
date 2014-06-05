/**
 */
package br.ufrn.lasic.pml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Memory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.ufrn.lasic.pml.Memory#getBehaviorsMemory <em>Behaviors Memory</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.Memory#getInputMemory <em>Input Memory</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.Memory#getOutputMemory <em>Output Memory</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.Memory#getName <em>Name</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.Memory#getLength <em>Length</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.ufrn.lasic.pml.PMLPackage#getMemory()
 * @model
 * @generated
 */
public interface Memory extends EObject {
	/**
	 * Returns the value of the '<em><b>Behaviors Memory</b></em>' containment reference list.
	 * The list contents are of type {@link br.ufrn.lasic.pml.Behavior}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behaviors Memory</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behaviors Memory</em>' containment reference list.
	 * @see br.ufrn.lasic.pml.PMLPackage#getMemory_BehaviorsMemory()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Behavior> getBehaviorsMemory();

	/**
	 * Returns the value of the '<em><b>Input Memory</b></em>' containment reference list.
	 * The list contents are of type {@link br.ufrn.lasic.pml.Input}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Memory</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Memory</em>' containment reference list.
	 * @see br.ufrn.lasic.pml.PMLPackage#getMemory_InputMemory()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Input> getInputMemory();

	/**
	 * Returns the value of the '<em><b>Output Memory</b></em>' containment reference list.
	 * The list contents are of type {@link br.ufrn.lasic.pml.Output}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Memory</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Memory</em>' containment reference list.
	 * @see br.ufrn.lasic.pml.PMLPackage#getMemory_OutputMemory()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Output> getOutputMemory();

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
	 * @see br.ufrn.lasic.pml.PMLPackage#getMemory_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link br.ufrn.lasic.pml.Memory#getName <em>Name</em>}' attribute.
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
	 * @see br.ufrn.lasic.pml.PMLPackage#getMemory_Length()
	 * @model required="true"
	 * @generated
	 */
	int getLength();

	/**
	 * Sets the value of the '{@link br.ufrn.lasic.pml.Memory#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(int value);

} // Memory
