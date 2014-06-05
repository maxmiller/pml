/**
 */
package br.ufrn.lasic.pml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decoder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.ufrn.lasic.pml.Decoder#getName <em>Name</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.Decoder#getOutDecoder <em>Out Decoder</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.Decoder#getInDecoder <em>In Decoder</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.Decoder#getBehaviorDecoder <em>Behavior Decoder</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.ufrn.lasic.pml.PMLPackage#getDecoder()
 * @model
 * @generated
 */
public interface Decoder extends EObject {
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
	 * @see br.ufrn.lasic.pml.PMLPackage#getDecoder_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link br.ufrn.lasic.pml.Decoder#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Out Decoder</b></em>' containment reference list.
	 * The list contents are of type {@link br.ufrn.lasic.pml.Output}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Decoder</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Decoder</em>' containment reference list.
	 * @see br.ufrn.lasic.pml.PMLPackage#getDecoder_OutDecoder()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Output> getOutDecoder();

	/**
	 * Returns the value of the '<em><b>In Decoder</b></em>' containment reference list.
	 * The list contents are of type {@link br.ufrn.lasic.pml.Input}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Decoder</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Decoder</em>' containment reference list.
	 * @see br.ufrn.lasic.pml.PMLPackage#getDecoder_InDecoder()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Input> getInDecoder();

	/**
	 * Returns the value of the '<em><b>Behavior Decoder</b></em>' containment reference list.
	 * The list contents are of type {@link br.ufrn.lasic.pml.Behavior}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behavior Decoder</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behavior Decoder</em>' containment reference list.
	 * @see br.ufrn.lasic.pml.PMLPackage#getDecoder_BehaviorDecoder()
	 * @model containment="true"
	 * @generated
	 */
	EList<Behavior> getBehaviorDecoder();

} // Decoder
