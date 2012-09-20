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
 * A representation of the model object '<em><b>Processor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.ufrn.lasic.pml.Processor#getDemux <em>Demux</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.Processor#getUlas <em>Ulas</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.Processor#getRegisters <em>Registers</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.Processor#getMemories <em>Memories</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.Processor#getMux <em>Mux</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.Processor#getControlUnits <em>Control Units</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.Processor#getName <em>Name</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.Processor#getDecoders <em>Decoders</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.ufrn.lasic.pml.PMLPackage#getProcessor()
 * @model
 * @generated
 */
public interface Processor extends EObject {
	/**
	 * Returns the value of the '<em><b>Demux</b></em>' containment reference list.
	 * The list contents are of type {@link br.ufrn.lasic.pml.Demultiplexor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Demux</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Demux</em>' containment reference list.
	 * @see br.ufrn.lasic.pml.PMLPackage#getProcessor_Demux()
	 * @model containment="true"
	 * @generated
	 */
	EList<Demultiplexor> getDemux();

	/**
	 * Returns the value of the '<em><b>Ulas</b></em>' containment reference list.
	 * The list contents are of type {@link br.ufrn.lasic.pml.ULA}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ulas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ulas</em>' containment reference list.
	 * @see br.ufrn.lasic.pml.PMLPackage#getProcessor_Ulas()
	 * @model containment="true"
	 * @generated
	 */
	EList<ULA> getUlas();

	/**
	 * Returns the value of the '<em><b>Registers</b></em>' containment reference list.
	 * The list contents are of type {@link br.ufrn.lasic.pml.Register}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registers</em>' containment reference list.
	 * @see br.ufrn.lasic.pml.PMLPackage#getProcessor_Registers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Register> getRegisters();

	/**
	 * Returns the value of the '<em><b>Memories</b></em>' containment reference list.
	 * The list contents are of type {@link br.ufrn.lasic.pml.Memory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memories</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memories</em>' containment reference list.
	 * @see br.ufrn.lasic.pml.PMLPackage#getProcessor_Memories()
	 * @model containment="true"
	 * @generated
	 */
	EList<Memory> getMemories();

	/**
	 * Returns the value of the '<em><b>Mux</b></em>' containment reference list.
	 * The list contents are of type {@link br.ufrn.lasic.pml.Multiplexor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mux</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mux</em>' containment reference list.
	 * @see br.ufrn.lasic.pml.PMLPackage#getProcessor_Mux()
	 * @model containment="true"
	 * @generated
	 */
	EList<Multiplexor> getMux();

	/**
	 * Returns the value of the '<em><b>Control Units</b></em>' containment reference list.
	 * The list contents are of type {@link br.ufrn.lasic.pml.ControlUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control Units</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Units</em>' containment reference list.
	 * @see br.ufrn.lasic.pml.PMLPackage#getProcessor_ControlUnits()
	 * @model containment="true"
	 * @generated
	 */
	EList<ControlUnit> getControlUnits();

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
	 * @see br.ufrn.lasic.pml.PMLPackage#getProcessor_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link br.ufrn.lasic.pml.Processor#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Decoders</b></em>' containment reference list.
	 * The list contents are of type {@link br.ufrn.lasic.pml.Decoder}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decoders</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decoders</em>' containment reference list.
	 * @see br.ufrn.lasic.pml.PMLPackage#getProcessor_Decoders()
	 * @model containment="true"
	 * @generated
	 */
	EList<Decoder> getDecoders();

} // Processor
