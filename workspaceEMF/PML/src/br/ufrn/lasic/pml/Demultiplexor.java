/**
 */
package br.ufrn.lasic.pml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Demultiplexor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.ufrn.lasic.pml.Demultiplexor#getBehaviorsDemux <em>Behaviors Demux</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.Demultiplexor#getIndemux <em>Indemux</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.Demultiplexor#getOutdemux <em>Outdemux</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.Demultiplexor#getName <em>Name</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.Demultiplexor#getSeletordemux <em>Seletordemux</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.ufrn.lasic.pml.PMLPackage#getDemultiplexor()
 * @model
 * @generated
 */
public interface Demultiplexor extends EObject {
	/**
	 * Returns the value of the '<em><b>Behaviors Demux</b></em>' containment reference list.
	 * The list contents are of type {@link br.ufrn.lasic.pml.Behavior}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behaviors Demux</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behaviors Demux</em>' containment reference list.
	 * @see br.ufrn.lasic.pml.PMLPackage#getDemultiplexor_BehaviorsDemux()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Behavior> getBehaviorsDemux();

	/**
	 * Returns the value of the '<em><b>Indemux</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Indemux</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indemux</em>' containment reference.
	 * @see #setIndemux(Input)
	 * @see br.ufrn.lasic.pml.PMLPackage#getDemultiplexor_Indemux()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Input getIndemux();

	/**
	 * Sets the value of the '{@link br.ufrn.lasic.pml.Demultiplexor#getIndemux <em>Indemux</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indemux</em>' containment reference.
	 * @see #getIndemux()
	 * @generated
	 */
	void setIndemux(Input value);

	/**
	 * Returns the value of the '<em><b>Outdemux</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outdemux</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outdemux</em>' containment reference.
	 * @see #setOutdemux(Output)
	 * @see br.ufrn.lasic.pml.PMLPackage#getDemultiplexor_Outdemux()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Output getOutdemux();

	/**
	 * Sets the value of the '{@link br.ufrn.lasic.pml.Demultiplexor#getOutdemux <em>Outdemux</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outdemux</em>' containment reference.
	 * @see #getOutdemux()
	 * @generated
	 */
	void setOutdemux(Output value);

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
	 * @see br.ufrn.lasic.pml.PMLPackage#getDemultiplexor_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link br.ufrn.lasic.pml.Demultiplexor#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Seletordemux</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seletordemux</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seletordemux</em>' containment reference.
	 * @see #setSeletordemux(Seletor)
	 * @see br.ufrn.lasic.pml.PMLPackage#getDemultiplexor_Seletordemux()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Seletor getSeletordemux();

	/**
	 * Sets the value of the '{@link br.ufrn.lasic.pml.Demultiplexor#getSeletordemux <em>Seletordemux</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seletordemux</em>' containment reference.
	 * @see #getSeletordemux()
	 * @generated
	 */
	void setSeletordemux(Seletor value);

} // Demultiplexor
