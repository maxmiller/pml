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
 * A representation of the model object '<em><b>Control Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.ufrn.lasic.pml.ControlUnit#getBehaviorsControlUnit <em>Behaviors Control Unit</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.ControlUnit#getInputsControlUnit <em>Inputs Control Unit</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.ControlUnit#getOutputsControlUnit <em>Outputs Control Unit</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.ControlUnit#getName <em>Name</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.ControlUnit#getIntructions <em>Intructions</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.ufrn.lasic.pml.PMLPackage#getControlUnit()
 * @model
 * @generated
 */
public interface ControlUnit extends EObject {
	/**
	 * Returns the value of the '<em><b>Behaviors Control Unit</b></em>' containment reference list.
	 * The list contents are of type {@link br.ufrn.lasic.pml.Behavior}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behaviors Control Unit</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behaviors Control Unit</em>' containment reference list.
	 * @see br.ufrn.lasic.pml.PMLPackage#getControlUnit_BehaviorsControlUnit()
	 * @model containment="true"
	 * @generated
	 */
	EList<Behavior> getBehaviorsControlUnit();

	/**
	 * Returns the value of the '<em><b>Inputs Control Unit</b></em>' containment reference list.
	 * The list contents are of type {@link br.ufrn.lasic.pml.Input}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputs Control Unit</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs Control Unit</em>' containment reference list.
	 * @see br.ufrn.lasic.pml.PMLPackage#getControlUnit_InputsControlUnit()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Input> getInputsControlUnit();

	/**
	 * Returns the value of the '<em><b>Outputs Control Unit</b></em>' containment reference list.
	 * The list contents are of type {@link br.ufrn.lasic.pml.Output}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outputs Control Unit</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs Control Unit</em>' containment reference list.
	 * @see br.ufrn.lasic.pml.PMLPackage#getControlUnit_OutputsControlUnit()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Output> getOutputsControlUnit();

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
	 * @see br.ufrn.lasic.pml.PMLPackage#getControlUnit_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link br.ufrn.lasic.pml.ControlUnit#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Intructions</b></em>' containment reference list.
	 * The list contents are of type {@link br.ufrn.lasic.pml.Instructions}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intructions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intructions</em>' containment reference list.
	 * @see br.ufrn.lasic.pml.PMLPackage#getControlUnit_Intructions()
	 * @model containment="true" required="true"
	 *        extendedMetaData="namespace='' group='#instructionsULA'"
	 * @generated
	 */
	EList<Instructions> getIntructions();

} // ControlUnit
