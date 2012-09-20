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
 * A representation of the model object '<em><b>Multiplexor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.ufrn.lasic.pml.Multiplexor#getBehaviormux <em>Behaviormux</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.Multiplexor#getOutmux <em>Outmux</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.Multiplexor#getInmux <em>Inmux</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.Multiplexor#getName <em>Name</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.Multiplexor#getSeletormux <em>Seletormux</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.ufrn.lasic.pml.PMLPackage#getMultiplexor()
 * @model
 * @generated
 */
public interface Multiplexor extends EObject {
	/**
	 * Returns the value of the '<em><b>Behaviormux</b></em>' containment reference list.
	 * The list contents are of type {@link br.ufrn.lasic.pml.Behavior}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behaviormux</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behaviormux</em>' containment reference list.
	 * @see br.ufrn.lasic.pml.PMLPackage#getMultiplexor_Behaviormux()
	 * @model containment="true"
	 * @generated
	 */
	EList<Behavior> getBehaviormux();

	/**
	 * Returns the value of the '<em><b>Outmux</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outmux</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outmux</em>' containment reference.
	 * @see #setOutmux(Output)
	 * @see br.ufrn.lasic.pml.PMLPackage#getMultiplexor_Outmux()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Output getOutmux();

	/**
	 * Sets the value of the '{@link br.ufrn.lasic.pml.Multiplexor#getOutmux <em>Outmux</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outmux</em>' containment reference.
	 * @see #getOutmux()
	 * @generated
	 */
	void setOutmux(Output value);

	/**
	 * Returns the value of the '<em><b>Inmux</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inmux</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inmux</em>' containment reference.
	 * @see #setInmux(Input)
	 * @see br.ufrn.lasic.pml.PMLPackage#getMultiplexor_Inmux()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Input getInmux();

	/**
	 * Sets the value of the '{@link br.ufrn.lasic.pml.Multiplexor#getInmux <em>Inmux</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inmux</em>' containment reference.
	 * @see #getInmux()
	 * @generated
	 */
	void setInmux(Input value);

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
	 * @see br.ufrn.lasic.pml.PMLPackage#getMultiplexor_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link br.ufrn.lasic.pml.Multiplexor#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Seletormux</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seletormux</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seletormux</em>' containment reference.
	 * @see #setSeletormux(Seletor)
	 * @see br.ufrn.lasic.pml.PMLPackage#getMultiplexor_Seletormux()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Seletor getSeletormux();

	/**
	 * Sets the value of the '{@link br.ufrn.lasic.pml.Multiplexor#getSeletormux <em>Seletormux</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seletormux</em>' containment reference.
	 * @see #getSeletormux()
	 * @generated
	 */
	void setSeletormux(Seletor value);

} // Multiplexor
