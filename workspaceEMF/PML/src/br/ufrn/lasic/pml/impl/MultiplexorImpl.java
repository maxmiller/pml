/**
 */
package br.ufrn.lasic.pml.impl;

import br.ufrn.lasic.pml.Behavior;
import br.ufrn.lasic.pml.Input;
import br.ufrn.lasic.pml.Multiplexor;
import br.ufrn.lasic.pml.Output;
import br.ufrn.lasic.pml.PMLPackage;
import br.ufrn.lasic.pml.Seletor;

import java.util.Collection;

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
 * An implementation of the model object '<em><b>Multiplexor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.ufrn.lasic.pml.impl.MultiplexorImpl#getBehaviormux <em>Behaviormux</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.impl.MultiplexorImpl#getOutmux <em>Outmux</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.impl.MultiplexorImpl#getInmux <em>Inmux</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.impl.MultiplexorImpl#getName <em>Name</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.impl.MultiplexorImpl#getSeletormux <em>Seletormux</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MultiplexorImpl extends EObjectImpl implements Multiplexor {
	/**
	 * The cached value of the '{@link #getBehaviormux() <em>Behaviormux</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviormux()
	 * @generated
	 * @ordered
	 */
	protected EList<Behavior> behaviormux;

	/**
	 * The cached value of the '{@link #getOutmux() <em>Outmux</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutmux()
	 * @generated
	 * @ordered
	 */
	protected Output outmux;

	/**
	 * The cached value of the '{@link #getInmux() <em>Inmux</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInmux()
	 * @generated
	 * @ordered
	 */
	protected Input inmux;

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
	 * The cached value of the '{@link #getSeletormux() <em>Seletormux</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeletormux()
	 * @generated
	 * @ordered
	 */
	protected Seletor seletormux;

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
		return PMLPackage.Literals.MULTIPLEXOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Behavior> getBehaviormux() {
		if (behaviormux == null) {
			behaviormux = new EObjectContainmentEList<Behavior>(Behavior.class, this, PMLPackage.MULTIPLEXOR__BEHAVIORMUX);
		}
		return behaviormux;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Output getOutmux() {
		return outmux;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutmux(Output newOutmux, NotificationChain msgs) {
		Output oldOutmux = outmux;
		outmux = newOutmux;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PMLPackage.MULTIPLEXOR__OUTMUX, oldOutmux, newOutmux);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutmux(Output newOutmux) {
		if (newOutmux != outmux) {
			NotificationChain msgs = null;
			if (outmux != null)
				msgs = ((InternalEObject)outmux).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PMLPackage.MULTIPLEXOR__OUTMUX, null, msgs);
			if (newOutmux != null)
				msgs = ((InternalEObject)newOutmux).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PMLPackage.MULTIPLEXOR__OUTMUX, null, msgs);
			msgs = basicSetOutmux(newOutmux, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PMLPackage.MULTIPLEXOR__OUTMUX, newOutmux, newOutmux));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Input getInmux() {
		return inmux;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInmux(Input newInmux, NotificationChain msgs) {
		Input oldInmux = inmux;
		inmux = newInmux;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PMLPackage.MULTIPLEXOR__INMUX, oldInmux, newInmux);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInmux(Input newInmux) {
		if (newInmux != inmux) {
			NotificationChain msgs = null;
			if (inmux != null)
				msgs = ((InternalEObject)inmux).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PMLPackage.MULTIPLEXOR__INMUX, null, msgs);
			if (newInmux != null)
				msgs = ((InternalEObject)newInmux).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PMLPackage.MULTIPLEXOR__INMUX, null, msgs);
			msgs = basicSetInmux(newInmux, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PMLPackage.MULTIPLEXOR__INMUX, newInmux, newInmux));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PMLPackage.MULTIPLEXOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Seletor getSeletormux() {
		return seletormux;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeletormux(Seletor newSeletormux, NotificationChain msgs) {
		Seletor oldSeletormux = seletormux;
		seletormux = newSeletormux;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PMLPackage.MULTIPLEXOR__SELETORMUX, oldSeletormux, newSeletormux);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeletormux(Seletor newSeletormux) {
		if (newSeletormux != seletormux) {
			NotificationChain msgs = null;
			if (seletormux != null)
				msgs = ((InternalEObject)seletormux).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PMLPackage.MULTIPLEXOR__SELETORMUX, null, msgs);
			if (newSeletormux != null)
				msgs = ((InternalEObject)newSeletormux).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PMLPackage.MULTIPLEXOR__SELETORMUX, null, msgs);
			msgs = basicSetSeletormux(newSeletormux, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PMLPackage.MULTIPLEXOR__SELETORMUX, newSeletormux, newSeletormux));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PMLPackage.MULTIPLEXOR__BEHAVIORMUX:
				return ((InternalEList<?>)getBehaviormux()).basicRemove(otherEnd, msgs);
			case PMLPackage.MULTIPLEXOR__OUTMUX:
				return basicSetOutmux(null, msgs);
			case PMLPackage.MULTIPLEXOR__INMUX:
				return basicSetInmux(null, msgs);
			case PMLPackage.MULTIPLEXOR__SELETORMUX:
				return basicSetSeletormux(null, msgs);
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
			case PMLPackage.MULTIPLEXOR__BEHAVIORMUX:
				return getBehaviormux();
			case PMLPackage.MULTIPLEXOR__OUTMUX:
				return getOutmux();
			case PMLPackage.MULTIPLEXOR__INMUX:
				return getInmux();
			case PMLPackage.MULTIPLEXOR__NAME:
				return getName();
			case PMLPackage.MULTIPLEXOR__SELETORMUX:
				return getSeletormux();
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
			case PMLPackage.MULTIPLEXOR__BEHAVIORMUX:
				getBehaviormux().clear();
				getBehaviormux().addAll((Collection<? extends Behavior>)newValue);
				return;
			case PMLPackage.MULTIPLEXOR__OUTMUX:
				setOutmux((Output)newValue);
				return;
			case PMLPackage.MULTIPLEXOR__INMUX:
				setInmux((Input)newValue);
				return;
			case PMLPackage.MULTIPLEXOR__NAME:
				setName((String)newValue);
				return;
			case PMLPackage.MULTIPLEXOR__SELETORMUX:
				setSeletormux((Seletor)newValue);
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
			case PMLPackage.MULTIPLEXOR__BEHAVIORMUX:
				getBehaviormux().clear();
				return;
			case PMLPackage.MULTIPLEXOR__OUTMUX:
				setOutmux((Output)null);
				return;
			case PMLPackage.MULTIPLEXOR__INMUX:
				setInmux((Input)null);
				return;
			case PMLPackage.MULTIPLEXOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PMLPackage.MULTIPLEXOR__SELETORMUX:
				setSeletormux((Seletor)null);
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
			case PMLPackage.MULTIPLEXOR__BEHAVIORMUX:
				return behaviormux != null && !behaviormux.isEmpty();
			case PMLPackage.MULTIPLEXOR__OUTMUX:
				return outmux != null;
			case PMLPackage.MULTIPLEXOR__INMUX:
				return inmux != null;
			case PMLPackage.MULTIPLEXOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PMLPackage.MULTIPLEXOR__SELETORMUX:
				return seletormux != null;
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

} //MultiplexorImpl
