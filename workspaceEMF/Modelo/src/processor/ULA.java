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
 * A representation of the model object '<em><b>ULA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link processor.ULA#getOpSel <em>Op Sel</em>}</li>
 *   <li>{@link processor.ULA#getUlastatus <em>Ulastatus</em>}</li>
 *   <li>{@link processor.ULA#getOperations <em>Operations</em>}</li>
 *   <li>{@link processor.ULA#getOpSelUla <em>Op Sel Ula</em>}</li>
 *   <li>{@link processor.ULA#getUlaOut <em>Ula Out</em>}</li>
 * </ul>
 * </p>
 *
 * @see processor.ProcessorPackage#getULA()
 * @model
 * @generated
 */
public interface ULA extends EObject {
	/**
	 * Returns the value of the '<em><b>Op Sel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op Sel</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op Sel</em>' containment reference.
	 * @see #setOpSel(SeletorRegisterFile)
	 * @see processor.ProcessorPackage#getULA_OpSel()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SeletorRegisterFile getOpSel();

	/**
	 * Sets the value of the '{@link processor.ULA#getOpSel <em>Op Sel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op Sel</em>' containment reference.
	 * @see #getOpSel()
	 * @generated
	 */
	void setOpSel(SeletorRegisterFile value);

	/**
	 * Returns the value of the '<em><b>Ulastatus</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ulastatus</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ulastatus</em>' reference.
	 * @see #setUlastatus(Status)
	 * @see processor.ProcessorPackage#getULA_Ulastatus()
	 * @model required="true"
	 * @generated
	 */
	Status getUlastatus();

	/**
	 * Sets the value of the '{@link processor.ULA#getUlastatus <em>Ulastatus</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ulastatus</em>' reference.
	 * @see #getUlastatus()
	 * @generated
	 */
	void setUlastatus(Status value);

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' reference list.
	 * The list contents are of type {@link processor.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' reference list.
	 * @see processor.ProcessorPackage#getULA_Operations()
	 * @model required="true"
	 * @generated
	 */
	EList<Operation> getOperations();

	/**
	 * Returns the value of the '<em><b>Op Sel Ula</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op Sel Ula</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op Sel Ula</em>' reference.
	 * @see #setOpSelUla(SeletorULA)
	 * @see processor.ProcessorPackage#getULA_OpSelUla()
	 * @model required="true"
	 * @generated
	 */
	SeletorULA getOpSelUla();

	/**
	 * Sets the value of the '{@link processor.ULA#getOpSelUla <em>Op Sel Ula</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op Sel Ula</em>' reference.
	 * @see #getOpSelUla()
	 * @generated
	 */
	void setOpSelUla(SeletorULA value);

	/**
	 * Returns the value of the '<em><b>Ula Out</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ula Out</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ula Out</em>' reference.
	 * @see #setUlaOut(OutputULA)
	 * @see processor.ProcessorPackage#getULA_UlaOut()
	 * @model required="true"
	 * @generated
	 */
	OutputULA getUlaOut();

	/**
	 * Sets the value of the '{@link processor.ULA#getUlaOut <em>Ula Out</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ula Out</em>' reference.
	 * @see #getUlaOut()
	 * @generated
	 */
	void setUlaOut(OutputULA value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void ULABehavior();

} // ULA
