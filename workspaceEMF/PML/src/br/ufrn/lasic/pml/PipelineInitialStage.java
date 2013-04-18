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
 * A representation of the model object '<em><b>Pipeline Initial Stage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.ufrn.lasic.pml.PipelineInitialStage#getName <em>Name</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.PipelineInitialStage#getNextStatePipeline <em>Next State Pipeline</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.ufrn.lasic.pml.PMLPackage#getPipelineInitialStage()
 * @model
 * @generated
 */
public interface PipelineInitialStage extends EObject {
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
	 * @see br.ufrn.lasic.pml.PMLPackage#getPipelineInitialStage_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link br.ufrn.lasic.pml.PipelineInitialStage#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Next State Pipeline</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next State Pipeline</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next State Pipeline</em>' containment reference.
	 * @see #setNextStatePipeline(PipelineNextStage)
	 * @see br.ufrn.lasic.pml.PMLPackage#getPipelineInitialStage_NextStatePipeline()
	 * @model containment="true"
	 * @generated
	 */
	PipelineNextStage getNextStatePipeline();

	/**
	 * Sets the value of the '{@link br.ufrn.lasic.pml.PipelineInitialStage#getNextStatePipeline <em>Next State Pipeline</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next State Pipeline</em>' containment reference.
	 * @see #getNextStatePipeline()
	 * @generated
	 */
	void setNextStatePipeline(PipelineNextStage value);

} // PipelineInitialStage
