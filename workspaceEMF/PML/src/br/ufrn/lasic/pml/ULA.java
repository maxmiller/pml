/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.ufrn.lasic.pml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ULA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.ufrn.lasic.pml.ULA#getName <em>Name</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.ULA#getBehavirosULA <em>Behaviros ULA</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.ULA#getOutputsULA <em>Outputs ULA</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.ULA#getInputsULA <em>Inputs ULA</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.ULA#getOperationsULA <em>Operations ULA</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.ULA#getSeletorULA <em>Seletor ULA</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.ufrn.lasic.pml.PMLPackage#getULA()
 * @model
 * @generated
 */
public interface ULA extends EObject {
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
	 * @see br.ufrn.lasic.pml.PMLPackage#getULA_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link br.ufrn.lasic.pml.ULA#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Behaviros ULA</b></em>' containment reference list.
	 * The list contents are of type {@link br.ufrn.lasic.pml.Behavior}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behaviros ULA</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behaviros ULA</em>' containment reference list.
	 * @see br.ufrn.lasic.pml.PMLPackage#getULA_BehavirosULA()
	 * @model containment="true"
	 * @generated
	 */
	EList<Behavior> getBehavirosULA();

	/**
	 * Returns the value of the '<em><b>Outputs ULA</b></em>' containment reference list.
	 * The list contents are of type {@link br.ufrn.lasic.pml.Output}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outputs ULA</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs ULA</em>' containment reference list.
	 * @see br.ufrn.lasic.pml.PMLPackage#getULA_OutputsULA()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Output> getOutputsULA();

	/**
	 * Returns the value of the '<em><b>Inputs ULA</b></em>' containment reference list.
	 * The list contents are of type {@link br.ufrn.lasic.pml.Input}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputs ULA</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs ULA</em>' containment reference list.
	 * @see br.ufrn.lasic.pml.PMLPackage#getULA_InputsULA()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<Input> getInputsULA();

	/**
	 * Returns the value of the '<em><b>Operations ULA</b></em>' containment reference list.
	 * The list contents are of type {@link br.ufrn.lasic.pml.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operations ULA</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations ULA</em>' containment reference list.
	 * @see br.ufrn.lasic.pml.PMLPackage#getULA_OperationsULA()
	 * @model containment="true"
	 * @generated
	 */
	EList<Operation> getOperationsULA();

	/**
	 * Returns the value of the '<em><b>Seletor ULA</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seletor ULA</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seletor ULA</em>' containment reference.
	 * @see #setSeletorULA(Seletor)
	 * @see br.ufrn.lasic.pml.PMLPackage#getULA_SeletorULA()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Seletor getSeletorULA();

	/**
	 * Sets the value of the '{@link br.ufrn.lasic.pml.ULA#getSeletorULA <em>Seletor ULA</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seletor ULA</em>' containment reference.
	 * @see #getSeletorULA()
	 * @generated
	 */
	void setSeletorULA(Seletor value);

} // ULA
