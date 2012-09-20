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
 * A representation of the model object '<em><b>Demultiplexor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link processor.Demultiplexor#getNumOutputs <em>Num Outputs</em>}</li>
 *   <li>{@link processor.Demultiplexor#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link processor.Demultiplexor#getInput <em>Input</em>}</li>
 *   <li>{@link processor.Demultiplexor#getOutin <em>Outin</em>}</li>
 *   <li>{@link processor.Demultiplexor#getOutputsDemux <em>Outputs Demux</em>}</li>
 *   <li>{@link processor.Demultiplexor#getInputDemux <em>Input Demux</em>}</li>
 * </ul>
 * </p>
 *
 * @see processor.ProcessorPackage#getDemultiplexor()
 * @model
 * @generated
 */
public interface Demultiplexor extends EObject {
	/**
	 * Returns the value of the '<em><b>Num Outputs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Outputs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Outputs</em>' attribute.
	 * @see #setNumOutputs(int)
	 * @see processor.ProcessorPackage#getDemultiplexor_NumOutputs()
	 * @model
	 * @generated
	 */
	int getNumOutputs();

	/**
	 * Sets the value of the '{@link processor.Demultiplexor#getNumOutputs <em>Num Outputs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Outputs</em>' attribute.
	 * @see #getNumOutputs()
	 * @generated
	 */
	void setNumOutputs(int value);

	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' reference list.
	 * The list contents are of type {@link processor.OutputDemux}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outputs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' reference list.
	 * @see processor.ProcessorPackage#getDemultiplexor_Outputs()
	 * @model required="true"
	 * @generated
	 */
	EList<OutputDemux> getOutputs();

	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' reference.
	 * @see #setInput(InputDemux)
	 * @see processor.ProcessorPackage#getDemultiplexor_Input()
	 * @model required="true"
	 * @generated
	 */
	InputDemux getInput();

	/**
	 * Sets the value of the '{@link processor.Demultiplexor#getInput <em>Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' reference.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(InputDemux value);

	/**
	 * Returns the value of the '<em><b>Outin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outin</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outin</em>' reference.
	 * @see #setOutin(Demultiplexor)
	 * @see processor.ProcessorPackage#getDemultiplexor_Outin()
	 * @model
	 * @generated
	 */
	Demultiplexor getOutin();

	/**
	 * Sets the value of the '{@link processor.Demultiplexor#getOutin <em>Outin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outin</em>' reference.
	 * @see #getOutin()
	 * @generated
	 */
	void setOutin(Demultiplexor value);

	/**
	 * Returns the value of the '<em><b>Outputs Demux</b></em>' reference list.
	 * The list contents are of type {@link processor.OutputDemux}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outputs Demux</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs Demux</em>' reference list.
	 * @see processor.ProcessorPackage#getDemultiplexor_OutputsDemux()
	 * @model required="true"
	 * @generated
	 */
	EList<OutputDemux> getOutputsDemux();

	/**
	 * Returns the value of the '<em><b>Input Demux</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Demux</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Demux</em>' reference.
	 * @see #setInputDemux(InputDemux)
	 * @see processor.ProcessorPackage#getDemultiplexor_InputDemux()
	 * @model required="true"
	 * @generated
	 */
	InputDemux getInputDemux();

	/**
	 * Sets the value of the '{@link processor.Demultiplexor#getInputDemux <em>Input Demux</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Demux</em>' reference.
	 * @see #getInputDemux()
	 * @generated
	 */
	void setInputDemux(InputDemux value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void demultiplexorBehavior();

} // Demultiplexor
