/**
 */
package br.ufrn.lasic.pml.impl;

import br.ufrn.lasic.pml.Input;
import br.ufrn.lasic.pml.Output;
import br.ufrn.lasic.pml.PMLPackage;
import br.ufrn.lasic.pml.Seletor;
import br.ufrn.lasic.pml.SignalEvent;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signal Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.ufrn.lasic.pml.impl.SignalEventImpl#getName <em>Name</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.impl.SignalEventImpl#getSignalIn <em>Signal In</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.impl.SignalEventImpl#getSignalOut <em>Signal Out</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.impl.SignalEventImpl#getSinalSelector <em>Sinal Selector</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SignalEventImpl extends EObjectImpl implements SignalEvent {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSignalIn() <em>Signal In</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalIn()
	 * @generated
	 * @ordered
	 */
	protected EList<Input> signalIn;

	/**
	 * The cached value of the '{@link #getSignalOut() <em>Signal Out</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalOut()
	 * @generated
	 * @ordered
	 */
	protected EList<Output> signalOut;

	/**
	 * The cached value of the '{@link #getSinalSelector() <em>Sinal Selector</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSinalSelector()
	 * @generated
	 * @ordered
	 */
	protected EList<Seletor> sinalSelector;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignalEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PMLPackage.Literals.SIGNAL_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PMLPackage.SIGNAL_EVENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Input> getSignalIn() {
		if (signalIn == null) {
			signalIn = new EObjectResolvingEList<Input>(Input.class, this, PMLPackage.SIGNAL_EVENT__SIGNAL_IN);
		}
		return signalIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Output> getSignalOut() {
		if (signalOut == null) {
			signalOut = new EObjectResolvingEList<Output>(Output.class, this, PMLPackage.SIGNAL_EVENT__SIGNAL_OUT);
		}
		return signalOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Seletor> getSinalSelector() {
		if (sinalSelector == null) {
			sinalSelector = new EObjectResolvingEList<Seletor>(Seletor.class, this, PMLPackage.SIGNAL_EVENT__SINAL_SELECTOR);
		}
		return sinalSelector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PMLPackage.SIGNAL_EVENT__NAME:
				return getName();
			case PMLPackage.SIGNAL_EVENT__SIGNAL_IN:
				return getSignalIn();
			case PMLPackage.SIGNAL_EVENT__SIGNAL_OUT:
				return getSignalOut();
			case PMLPackage.SIGNAL_EVENT__SINAL_SELECTOR:
				return getSinalSelector();
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
			case PMLPackage.SIGNAL_EVENT__NAME:
				setName((String)newValue);
				return;
			case PMLPackage.SIGNAL_EVENT__SIGNAL_IN:
				getSignalIn().clear();
				getSignalIn().addAll((Collection<? extends Input>)newValue);
				return;
			case PMLPackage.SIGNAL_EVENT__SIGNAL_OUT:
				getSignalOut().clear();
				getSignalOut().addAll((Collection<? extends Output>)newValue);
				return;
			case PMLPackage.SIGNAL_EVENT__SINAL_SELECTOR:
				getSinalSelector().clear();
				getSinalSelector().addAll((Collection<? extends Seletor>)newValue);
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
			case PMLPackage.SIGNAL_EVENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PMLPackage.SIGNAL_EVENT__SIGNAL_IN:
				getSignalIn().clear();
				return;
			case PMLPackage.SIGNAL_EVENT__SIGNAL_OUT:
				getSignalOut().clear();
				return;
			case PMLPackage.SIGNAL_EVENT__SINAL_SELECTOR:
				getSinalSelector().clear();
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
			case PMLPackage.SIGNAL_EVENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PMLPackage.SIGNAL_EVENT__SIGNAL_IN:
				return signalIn != null && !signalIn.isEmpty();
			case PMLPackage.SIGNAL_EVENT__SIGNAL_OUT:
				return signalOut != null && !signalOut.isEmpty();
			case PMLPackage.SIGNAL_EVENT__SINAL_SELECTOR:
				return sinalSelector != null && !sinalSelector.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SignalEventImpl
