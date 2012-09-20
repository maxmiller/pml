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

import processor.InputMultiplexor;
import processor.Multiplexor;
import processor.OutputMultiplexor;
import processor.ProcessorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multiplexor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link processor.impl.MultiplexorImpl#getNumInputs <em>Num Inputs</em>}</li>
 *   <li>{@link processor.impl.MultiplexorImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link processor.impl.MultiplexorImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link processor.impl.MultiplexorImpl#getInout <em>Inout</em>}</li>
 *   <li>{@link processor.impl.MultiplexorImpl#getInputsMul <em>Inputs Mul</em>}</li>
 *   <li>{@link processor.impl.MultiplexorImpl#getOutputMul <em>Output Mul</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MultiplexorImpl extends EObjectImpl implements Multiplexor {
	/**
	 * The default value of the '{@link #getNumInputs() <em>Num Inputs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumInputs()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_INPUTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumInputs() <em>Num Inputs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumInputs()
	 * @generated
	 * @ordered
	 */
	protected int numInputs = NUM_INPUTS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInputs() <em>Inputs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<InputMultiplexor> inputs;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected OutputMultiplexor output;

	/**
	 * The cached value of the '{@link #getInout() <em>Inout</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInout()
	 * @generated
	 * @ordered
	 */
	protected Multiplexor inout;

	/**
	 * The cached value of the '{@link #getInputsMul() <em>Inputs Mul</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputsMul()
	 * @generated
	 * @ordered
	 */
	protected EList<InputMultiplexor> inputsMul;

	/**
	 * The cached value of the '{@link #getOutputMul() <em>Output Mul</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputMul()
	 * @generated
	 * @ordered
	 */
	protected OutputMultiplexor outputMul;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiplexorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProcessorPackage.Literals.MULTIPLEXOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumInputs() {
		return numInputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumInputs(int newNumInputs) {
		int oldNumInputs = numInputs;
		numInputs = newNumInputs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessorPackage.MULTIPLEXOR__NUM_INPUTS, oldNumInputs, numInputs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputMultiplexor> getInputs() {
		if (inputs == null) {
			inputs = new EObjectResolvingEList<InputMultiplexor>(InputMultiplexor.class, this, ProcessorPackage.MULTIPLEXOR__INPUTS);
		}
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputMultiplexor getOutput() {
		if (output != null && output.eIsProxy()) {
			InternalEObject oldOutput = (InternalEObject)output;
			output = (OutputMultiplexor)eResolveProxy(oldOutput);
			if (output != oldOutput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessorPackage.MULTIPLEXOR__OUTPUT, oldOutput, output));
			}
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputMultiplexor basicGetOutput() {
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput(OutputMultiplexor newOutput) {
		OutputMultiplexor oldOutput = output;
		output = newOutput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessorPackage.MULTIPLEXOR__OUTPUT, oldOutput, output));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Multiplexor getInout() {
		if (inout != null && inout.eIsProxy()) {
			InternalEObject oldInout = (InternalEObject)inout;
			inout = (Multiplexor)eResolveProxy(oldInout);
			if (inout != oldInout) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessorPackage.MULTIPLEXOR__INOUT, oldInout, inout));
			}
		}
		return inout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Multiplexor basicGetInout() {
		return inout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInout(Multiplexor newInout) {
		Multiplexor oldInout = inout;
		inout = newInout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessorPackage.MULTIPLEXOR__INOUT, oldInout, inout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputMultiplexor> getInputsMul() {
		if (inputsMul == null) {
			inputsMul = new EObjectResolvingEList<InputMultiplexor>(InputMultiplexor.class, this, ProcessorPackage.MULTIPLEXOR__INPUTS_MUL);
		}
		return inputsMul;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputMultiplexor getOutputMul() {
		if (outputMul != null && outputMul.eIsProxy()) {
			InternalEObject oldOutputMul = (InternalEObject)outputMul;
			outputMul = (OutputMultiplexor)eResolveProxy(oldOutputMul);
			if (outputMul != oldOutputMul) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessorPackage.MULTIPLEXOR__OUTPUT_MUL, oldOutputMul, outputMul));
			}
		}
		return outputMul;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputMultiplexor basicGetOutputMul() {
		return outputMul;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputMul(OutputMultiplexor newOutputMul) {
		OutputMultiplexor oldOutputMul = outputMul;
		outputMul = newOutputMul;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessorPackage.MULTIPLEXOR__OUTPUT_MUL, oldOutputMul, outputMul));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void multiplexorBehavior() {
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
			case ProcessorPackage.MULTIPLEXOR__NUM_INPUTS:
				return getNumInputs();
			case ProcessorPackage.MULTIPLEXOR__INPUTS:
				return getInputs();
			case ProcessorPackage.MULTIPLEXOR__OUTPUT:
				if (resolve) return getOutput();
				return basicGetOutput();
			case ProcessorPackage.MULTIPLEXOR__INOUT:
				if (resolve) return getInout();
				return basicGetInout();
			case ProcessorPackage.MULTIPLEXOR__INPUTS_MUL:
				return getInputsMul();
			case ProcessorPackage.MULTIPLEXOR__OUTPUT_MUL:
				if (resolve) return getOutputMul();
				return basicGetOutputMul();
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
			case ProcessorPackage.MULTIPLEXOR__NUM_INPUTS:
				setNumInputs((Integer)newValue);
				return;
			case ProcessorPackage.MULTIPLEXOR__INPUTS:
				getInputs().clear();
				getInputs().addAll((Collection<? extends InputMultiplexor>)newValue);
				return;
			case ProcessorPackage.MULTIPLEXOR__OUTPUT:
				setOutput((OutputMultiplexor)newValue);
				return;
			case ProcessorPackage.MULTIPLEXOR__INOUT:
				setInout((Multiplexor)newValue);
				return;
			case ProcessorPackage.MULTIPLEXOR__INPUTS_MUL:
				getInputsMul().clear();
				getInputsMul().addAll((Collection<? extends InputMultiplexor>)newValue);
				return;
			case ProcessorPackage.MULTIPLEXOR__OUTPUT_MUL:
				setOutputMul((OutputMultiplexor)newValue);
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
			case ProcessorPackage.MULTIPLEXOR__NUM_INPUTS:
				setNumInputs(NUM_INPUTS_EDEFAULT);
				return;
			case ProcessorPackage.MULTIPLEXOR__INPUTS:
				getInputs().clear();
				return;
			case ProcessorPackage.MULTIPLEXOR__OUTPUT:
				setOutput((OutputMultiplexor)null);
				return;
			case ProcessorPackage.MULTIPLEXOR__INOUT:
				setInout((Multiplexor)null);
				return;
			case ProcessorPackage.MULTIPLEXOR__INPUTS_MUL:
				getInputsMul().clear();
				return;
			case ProcessorPackage.MULTIPLEXOR__OUTPUT_MUL:
				setOutputMul((OutputMultiplexor)null);
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
			case ProcessorPackage.MULTIPLEXOR__NUM_INPUTS:
				return numInputs != NUM_INPUTS_EDEFAULT;
			case ProcessorPackage.MULTIPLEXOR__INPUTS:
				return inputs != null && !inputs.isEmpty();
			case ProcessorPackage.MULTIPLEXOR__OUTPUT:
				return output != null;
			case ProcessorPackage.MULTIPLEXOR__INOUT:
				return inout != null;
			case ProcessorPackage.MULTIPLEXOR__INPUTS_MUL:
				return inputsMul != null && !inputsMul.isEmpty();
			case ProcessorPackage.MULTIPLEXOR__OUTPUT_MUL:
				return outputMul != null;
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
		result.append(" (numInputs: ");
		result.append(numInputs);
		result.append(')');
		return result.toString();
	}

} //MultiplexorImpl
