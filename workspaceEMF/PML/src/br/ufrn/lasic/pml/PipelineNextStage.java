/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.ufrn.lasic.pml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pipeline Next Stage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.ufrn.lasic.pml.PipelineNextStage#getPipelineNext <em>Pipeline Next</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.PipelineNextStage#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.ufrn.lasic.pml.PMLPackage#getPipelineNextStage()
 * @model
 * @generated
 */
public interface PipelineNextStage extends EObject {
	/**
	 * Returns the value of the '<em><b>Pipeline Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pipeline Next</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pipeline Next</em>' containment reference.
	 * @see #setPipelineNext(PipelineNextStage)
	 * @see br.ufrn.lasic.pml.PMLPackage#getPipelineNextStage_PipelineNext()
	 * @model containment="true"
	 * @generated
	 */
	PipelineNextStage getPipelineNext();

	/**
	 * Sets the value of the '{@link br.ufrn.lasic.pml.PipelineNextStage#getPipelineNext <em>Pipeline Next</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pipeline Next</em>' containment reference.
	 * @see #getPipelineNext()
	 * @generated
	 */
	void setPipelineNext(PipelineNextStage value);

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
	 * @see br.ufrn.lasic.pml.PMLPackage#getPipelineNextStage_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link br.ufrn.lasic.pml.PipelineNextStage#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // PipelineNextStage
