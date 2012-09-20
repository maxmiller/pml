/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package processor;

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
 *   <li>{@link processor.Multiplexor#getNumInputs <em>Num Inputs</em>}</li>
 *   <li>{@link processor.Multiplexor#getInputs <em>Inputs</em>}</li>
 *   <li>{@link processor.Multiplexor#getOutput <em>Output</em>}</li>
 *   <li>{@link processor.Multiplexor#getInout <em>Inout</em>}</li>
 *   <li>{@link processor.Multiplexor#getInputsMul <em>Inputs Mul</em>}</li>
 *   <li>{@link processor.Multiplexor#getOutputMul <em>Output Mul</em>}</li>
 * </ul>
 * </p>
 *
 * @see processor.ProcessorPackage#getMultiplexor()
 * @model
 * @generated
 */
public interface Multiplexor extends EObject {
	/**
	 * Returns the value of the '<em><b>Num Inputs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Inputs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Inputs</em>' attribute.
	 * @see #setNumInputs(int)
	 * @see processor.ProcessorPackage#getMultiplexor_NumInputs()
	 * @model
	 * @generated
	 */
	int getNumInputs();

	/**
	 * Sets the value of the '{@link processor.Multiplexor#getNumInputs <em>Num Inputs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Inputs</em>' attribute.
	 * @see #getNumInputs()
	 * @generated
	 */
	void setNumInputs(int value);

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' reference list.
	 * The list contents are of type {@link processor.InputMultiplexor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' reference list.
	 * @see processor.ProcessorPackage#getMultiplexor_Inputs()
	 * @model required="true"
	 * @generated
	 */
	EList<InputMultiplexor> getInputs();

	/**
	 * Returns the value of the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' reference.
	 * @see #setOutput(OutputMultiplexor)
	 * @see processor.ProcessorPackage#getMultiplexor_Output()
	 * @model required="true"
	 * @generated
	 */
	OutputMultiplexor getOutput();

	/**
	 * Sets the value of the '{@link processor.Multiplexor#getOutput <em>Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(OutputMultiplexor value);

	/**
	 * Returns the value of the '<em><b>Inout</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inout</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inout</em>' reference.
	 * @see #setInout(Multiplexor)
	 * @see processor.ProcessorPackage#getMultiplexor_Inout()
	 * @model
	 * @generated
	 */
	Multiplexor getInout();

	/**
	 * Sets the value of the '{@link processor.Multiplexor#getInout <em>Inout</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inout</em>' reference.
	 * @see #getInout()
	 * @generated
	 */
	void setInout(Multiplexor value);

	/**
	 * Returns the value of the '<em><b>Inputs Mul</b></em>' reference list.
	 * The list contents are of type {@link processor.InputMultiplexor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputs Mul</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs Mul</em>' reference list.
	 * @see processor.ProcessorPackage#getMultiplexor_InputsMul()
	 * @model required="true"
	 * @generated
	 */
	EList<InputMultiplexor> getInputsMul();

	/**
	 * Returns the value of the '<em><b>Output Mul</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Mul</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Mul</em>' reference.
	 * @see #setOutputMul(OutputMultiplexor)
	 * @see processor.ProcessorPackage#getMultiplexor_OutputMul()
	 * @model required="true"
	 * @generated
	 */
	OutputMultiplexor getOutputMul();

	/**
	 * Sets the value of the '{@link processor.Multiplexor#getOutputMul <em>Output Mul</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Mul</em>' reference.
	 * @see #getOutputMul()
	 * @generated
	 */
	void setOutputMul(OutputMultiplexor value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void multiplexorBehavior();

} // Multiplexor
