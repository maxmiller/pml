/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package processor.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import processor.Demultiplexor;
import processor.InputDemux;
import processor.OutputDemux;
import processor.ProcessorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Demultiplexor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link processor.impl.DemultiplexorImpl#getNumOutputs <em>Num Outputs</em>}</li>
 *   <li>{@link processor.impl.DemultiplexorImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link processor.impl.DemultiplexorImpl#getInput <em>Input</em>}</li>
 *   <li>{@link processor.impl.DemultiplexorImpl#getOutin <em>Outin</em>}</li>
 *   <li>{@link processor.impl.DemultiplexorImpl#getOutputsDemux <em>Outputs Demux</em>}</li>
 *   <li>{@link processor.impl.DemultiplexorImpl#getInputDemux <em>Input Demux</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DemultiplexorImpl extends EObjectImpl implements Demultiplexor {
	/**
	 * The default value of the '{@link #getNumOutputs() <em>Num Outputs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumOutputs()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_OUTPUTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumOutputs() <em>Num Outputs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumOutputs()
	 * @generated
	 * @ordered
	 */
	protected int numOutputs = NUM_OUTPUTS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputs()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputDemux> outputs;

	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected InputDemux input;

	/**
	 * The cached value of the '{@link #getOutin() <em>Outin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutin()
	 * @generated
	 * @ordered
	 */
	protected Demultiplexor outin;

	/**
	 * The cached value of the '{@link #getOutputsDemux() <em>Outputs Demux</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputsDemux()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputDemux> outputsDemux;

	/**
	 * The cached value of the '{@link #getInputDemux() <em>Input Demux</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputDemux()
	 * @generated
	 * @ordered
	 */
	protected InputDemux inputDemux;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DemultiplexorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProcessorPackage.Literals.DEMULTIPLEXOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumOutputs() {
		return numOutputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumOutputs(int newNumOutputs) {
		int oldNumOutputs = numOutputs;
		numOutputs = newNumOutputs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessorPackage.DEMULTIPLEXOR__NUM_OUTPUTS, oldNumOutputs, numOutputs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputDemux> getOutputs() {
		if (outputs == null) {
			outputs = new EObjectResolvingEList<OutputDemux>(OutputDemux.class, this, ProcessorPackage.DEMULTIPLEXOR__OUTPUTS);
		}
		return outputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputDemux getInput() {
		if (input != null && input.eIsProxy()) {
			InternalEObject oldInput = (InternalEObject)input;
			input = (InputDemux)eResolveProxy(oldInput);
			if (input != oldInput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessorPackage.DEMULTIPLEXOR__INPUT, oldInput, input));
			}
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputDemux basicGetInput() {
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput(InputDemux newInput) {
		InputDemux oldInput = input;
		input = newInput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessorPackage.DEMULTIPLEXOR__INPUT, oldInput, input));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Demultiplexor getOutin() {
		if (outin != null && outin.eIsProxy()) {
			InternalEObject oldOutin = (InternalEObject)outin;
			outin = (Demultiplexor)eResolveProxy(oldOutin);
			if (outin != oldOutin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessorPackage.DEMULTIPLEXOR__OUTIN, oldOutin, outin));
			}
		}
		return outin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Demultiplexor basicGetOutin() {
		return outin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutin(Demultiplexor newOutin) {
		Demultiplexor oldOutin = outin;
		outin = newOutin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessorPackage.DEMULTIPLEXOR__OUTIN, oldOutin, outin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputDemux> getOutputsDemux() {
		if (outputsDemux == null) {
			outputsDemux = new EObjectResolvingEList<OutputDemux>(OutputDemux.class, this, ProcessorPackage.DEMULTIPLEXOR__OUTPUTS_DEMUX);
		}
		return outputsDemux;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputDemux getInputDemux() {
		if (inputDemux != null && inputDemux.eIsProxy()) {
			InternalEObject oldInputDemux = (InternalEObject)inputDemux;
			inputDemux = (InputDemux)eResolveProxy(oldInputDemux);
			if (inputDemux != oldInputDemux) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessorPackage.DEMULTIPLEXOR__INPUT_DEMUX, oldInputDemux, inputDemux));
			}
		}
		return inputDemux;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputDemux basicGetInputDemux() {
		return inputDemux;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputDemux(InputDemux newInputDemux) {
		InputDemux oldInputDemux = inputDemux;
		inputDemux = newInputDemux;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessorPackage.DEMULTIPLEXOR__INPUT_DEMUX, oldInputDemux, inputDemux));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void demultiplexorBehavior() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProcessorPackage.DEMULTIPLEXOR__NUM_OUTPUTS:
				return getNumOutputs();
			case ProcessorPackage.DEMULTIPLEXOR__OUTPUTS:
				return getOutputs();
			case ProcessorPackage.DEMULTIPLEXOR__INPUT:
				if (resolve) return getInput();
				return basicGetInput();
			case ProcessorPackage.DEMULTIPLEXOR__OUTIN:
				if (resolve) return getOutin();
				return basicGetOutin();
			case ProcessorPackage.DEMULTIPLEXOR__OUTPUTS_DEMUX:
				return getOutputsDemux();
			case ProcessorPackage.DEMULTIPLEXOR__INPUT_DEMUX:
				if (resolve) return getInputDemux();
				return basicGetInputDemux();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ProcessorPackage.DEMULTIPLEXOR__NUM_OUTPUTS:
				setNumOutputs((Integer)newValue);
				return;
			case ProcessorPackage.DEMULTIPLEXOR__OUTPUTS:
				getOutputs().clear();
				getOutputs().addAll((Collection<? extends OutputDemux>)newValue);
				return;
			case ProcessorPackage.DEMULTIPLEXOR__INPUT:
				setInput((InputDemux)newValue);
				return;
			case ProcessorPackage.DEMULTIPLEXOR__OUTIN:
				setOutin((Demultiplexor)newValue);
				return;
			case ProcessorPackage.DEMULTIPLEXOR__OUTPUTS_DEMUX:
				getOutputsDemux().clear();
				getOutputsDemux().addAll((Collection<? extends OutputDemux>)newValue);
				return;
			case ProcessorPackage.DEMULTIPLEXOR__INPUT_DEMUX:
				setInputDemux((InputDemux)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ProcessorPackage.DEMULTIPLEXOR__NUM_OUTPUTS:
				setNumOutputs(NUM_OUTPUTS_EDEFAULT);
				return;
			case ProcessorPackage.DEMULTIPLEXOR__OUTPUTS:
				getOutputs().clear();
				return;
			case ProcessorPackage.DEMULTIPLEXOR__INPUT:
				setInput((InputDemux)null);
				return;
			case ProcessorPackage.DEMULTIPLEXOR__OUTIN:
				setOutin((Demultiplexor)null);
				return;
			case ProcessorPackage.DEMULTIPLEXOR__OUTPUTS_DEMUX:
				getOutputsDemux().clear();
				return;
			case ProcessorPackage.DEMULTIPLEXOR__INPUT_DEMUX:
				setInputDemux((InputDemux)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ProcessorPackage.DEMULTIPLEXOR__NUM_OUTPUTS:
				return numOutputs != NUM_OUTPUTS_EDEFAULT;
			case ProcessorPackage.DEMULTIPLEXOR__OUTPUTS:
				return outputs != null && !outputs.isEmpty();
			case ProcessorPackage.DEMULTIPLEXOR__INPUT:
				return input != null;
			case ProcessorPackage.DEMULTIPLEXOR__OUTIN:
				return outin != null;
			case ProcessorPackage.DEMULTIPLEXOR__OUTPUTS_DEMUX:
				return outputsDemux != null && !outputsDemux.isEmpty();
			case ProcessorPackage.DEMULTIPLEXOR__INPUT_DEMUX:
				return inputDemux != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (numOutputs: ");
		result.append(numOutputs);
		result.append(')');
		return result.toString();
	}

} //DemultiplexorImpl
