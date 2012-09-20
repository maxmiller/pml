/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package multiplexormodel.multiplexador.impl;

import java.util.Collection;

import multiplexormodel.multiplexador.Input;
import multiplexormodel.multiplexador.MultiplexadorPackage;
import multiplexormodel.multiplexador.Multiplexer;
import multiplexormodel.multiplexador.Output;
import multiplexormodel.multiplexador.Seletor;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multiplexer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link multiplexormodel.multiplexador.impl.MultiplexerImpl#getNumInputs <em>Num Inputs</em>}</li>
 *   <li>{@link multiplexormodel.multiplexador.impl.MultiplexerImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link multiplexormodel.multiplexador.impl.MultiplexerImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link multiplexormodel.multiplexador.impl.MultiplexerImpl#getSel <em>Sel</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MultiplexerImpl extends EObjectImpl implements Multiplexer {
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
	 * The cached value of the '{@link #getInputs() <em>Inputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<Input> inputs;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected Output output;

	/**
	 * The cached value of the '{@link #getSel() <em>Sel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSel()
	 * @generated
	 * @ordered
	 */
	protected Seletor sel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiplexerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MultiplexadorPackage.Literals.MULTIPLEXER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MultiplexadorPackage.MULTIPLEXER__NUM_INPUTS, oldNumInputs, numInputs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Input> getInputs() {
		if (inputs == null) {
			inputs = new EObjectContainmentEList<Input>(Input.class, this, MultiplexadorPackage.MULTIPLEXER__INPUTS);
		}
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Output getOutput() {
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutput(Output newOutput, NotificationChain msgs) {
		Output oldOutput = output;
		output = newOutput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MultiplexadorPackage.MULTIPLEXER__OUTPUT, oldOutput, newOutput);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput(Output newOutput) {
		if (newOutput != output) {
			NotificationChain msgs = null;
			if (output != null)
				msgs = ((InternalEObject)output).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MultiplexadorPackage.MULTIPLEXER__OUTPUT, null, msgs);
			if (newOutput != null)
				msgs = ((InternalEObject)newOutput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MultiplexadorPackage.MULTIPLEXER__OUTPUT, null, msgs);
			msgs = basicSetOutput(newOutput, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MultiplexadorPackage.MULTIPLEXER__OUTPUT, newOutput, newOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Seletor getSel() {
		return sel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSel(Seletor newSel, NotificationChain msgs) {
		Seletor oldSel = sel;
		sel = newSel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MultiplexadorPackage.MULTIPLEXER__SEL, oldSel, newSel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSel(Seletor newSel) {
		if (newSel != sel) {
			NotificationChain msgs = null;
			if (sel != null)
				msgs = ((InternalEObject)sel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MultiplexadorPackage.MULTIPLEXER__SEL, null, msgs);
			if (newSel != null)
				msgs = ((InternalEObject)newSel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MultiplexadorPackage.MULTIPLEXER__SEL, null, msgs);
			msgs = basicSetSel(newSel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MultiplexadorPackage.MULTIPLEXER__SEL, newSel, newSel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void multiplexerBehavior() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void Multiplexer(int numInputs) {
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MultiplexadorPackage.MULTIPLEXER__INPUTS:
				return ((InternalEList<?>)getInputs()).basicRemove(otherEnd, msgs);
			case MultiplexadorPackage.MULTIPLEXER__OUTPUT:
				return basicSetOutput(null, msgs);
			case MultiplexadorPackage.MULTIPLEXER__SEL:
				return basicSetSel(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MultiplexadorPackage.MULTIPLEXER__NUM_INPUTS:
				return getNumInputs();
			case MultiplexadorPackage.MULTIPLEXER__INPUTS:
				return getInputs();
			case MultiplexadorPackage.MULTIPLEXER__OUTPUT:
				return getOutput();
			case MultiplexadorPackage.MULTIPLEXER__SEL:
				return getSel();
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
			case MultiplexadorPackage.MULTIPLEXER__NUM_INPUTS:
				setNumInputs((Integer)newValue);
				return;
			case MultiplexadorPackage.MULTIPLEXER__INPUTS:
				getInputs().clear();
				getInputs().addAll((Collection<? extends Input>)newValue);
				return;
			case MultiplexadorPackage.MULTIPLEXER__OUTPUT:
				setOutput((Output)newValue);
				return;
			case MultiplexadorPackage.MULTIPLEXER__SEL:
				setSel((Seletor)newValue);
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
			case MultiplexadorPackage.MULTIPLEXER__NUM_INPUTS:
				setNumInputs(NUM_INPUTS_EDEFAULT);
				return;
			case MultiplexadorPackage.MULTIPLEXER__INPUTS:
				getInputs().clear();
				return;
			case MultiplexadorPackage.MULTIPLEXER__OUTPUT:
				setOutput((Output)null);
				return;
			case MultiplexadorPackage.MULTIPLEXER__SEL:
				setSel((Seletor)null);
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
			case MultiplexadorPackage.MULTIPLEXER__NUM_INPUTS:
				return numInputs != NUM_INPUTS_EDEFAULT;
			case MultiplexadorPackage.MULTIPLEXER__INPUTS:
				return inputs != null && !inputs.isEmpty();
			case MultiplexadorPackage.MULTIPLEXER__OUTPUT:
				return output != null;
			case MultiplexadorPackage.MULTIPLEXER__SEL:
				return sel != null;
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

} //MultiplexerImpl
