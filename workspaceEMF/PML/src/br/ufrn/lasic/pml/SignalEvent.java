/**
 */
package br.ufrn.lasic.pml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.ufrn.lasic.pml.SignalEvent#getName <em>Name</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.SignalEvent#getSignalIn <em>Signal In</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.SignalEvent#getSignalOut <em>Signal Out</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.SignalEvent#getSinalSelector <em>Sinal Selector</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.ufrn.lasic.pml.PMLPackage#getSignalEvent()
 * @model
 * @generated
 */
public interface SignalEvent extends EObject {
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
	 * @see br.ufrn.lasic.pml.PMLPackage#getSignalEvent_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link br.ufrn.lasic.pml.SignalEvent#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Signal In</b></em>' reference list.
	 * The list contents are of type {@link br.ufrn.lasic.pml.Input}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signal In</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signal In</em>' reference list.
	 * @see br.ufrn.lasic.pml.PMLPackage#getSignalEvent_SignalIn()
	 * @model
	 * @generated
	 */
	EList<Input> getSignalIn();

	/**
	 * Returns the value of the '<em><b>Signal Out</b></em>' reference list.
	 * The list contents are of type {@link br.ufrn.lasic.pml.Output}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signal Out</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signal Out</em>' reference list.
	 * @see br.ufrn.lasic.pml.PMLPackage#getSignalEvent_SignalOut()
	 * @model
	 * @generated
	 */
	EList<Output> getSignalOut();

	/**
	 * Returns the value of the '<em><b>Sinal Selector</b></em>' reference list.
	 * The list contents are of type {@link br.ufrn.lasic.pml.Seletor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sinal Selector</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sinal Selector</em>' reference list.
	 * @see br.ufrn.lasic.pml.PMLPackage#getSignalEvent_SinalSelector()
	 * @model
	 * @generated
	 */
	EList<Seletor> getSinalSelector();

} // SignalEvent
