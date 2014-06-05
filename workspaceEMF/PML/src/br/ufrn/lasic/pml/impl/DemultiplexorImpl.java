/**
 */
package br.ufrn.lasic.pml.impl;

import br.ufrn.lasic.pml.Behavior;
import br.ufrn.lasic.pml.Demultiplexor;
import br.ufrn.lasic.pml.Input;
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
 * An implementation of the model object '<em><b>Demultiplexor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.ufrn.lasic.pml.impl.DemultiplexorImpl#getBehaviorsDemux <em>Behaviors Demux</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.impl.DemultiplexorImpl#getIndemux <em>Indemux</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.impl.DemultiplexorImpl#getOutdemux <em>Outdemux</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.impl.DemultiplexorImpl#getName <em>Name</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.impl.DemultiplexorImpl#getSeletordemux <em>Seletordemux</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DemultiplexorImpl extends EObjectImpl implements Demultiplexor {
	/**
	 * The cached value of the '{@link #getBehaviorsDemux() <em>Behaviors Demux</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviorsDemux()
	 * @generated
	 * @ordered
	 */
	protected EList<Behavior> behaviorsDemux;

	/**
	 * The cached value of the '{@link #getIndemux() <em>Indemux</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndemux()
	 * @generated
	 * @ordered
	 */
	protected Input indemux;

	/**
	 * The cached value of the '{@link #getOutdemux() <em>Outdemux</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutdemux()
	 * @generated
	 * @ordered
	 */
	protected Output outdemux;

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
	 * The cached value of the '{@link #getSeletordemux() <em>Seletordemux</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeletordemux()
	 * @generated
	 * @ordered
	 */
	protected Seletor seletordemux;

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
		return PMLPackage.Literals.DEMULTIPLEXOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Behavior> getBehaviorsDemux() {
		if (behaviorsDemux == null) {
			behaviorsDemux = new EObjectContainmentEList<Behavior>(Behavior.class, this, PMLPackage.DEMULTIPLEXOR__BEHAVIORS_DEMUX);
		}
		return behaviorsDemux;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Input getIndemux() {
		return indemux;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndemux(Input newIndemux, NotificationChain msgs) {
		Input oldIndemux = indemux;
		indemux = newIndemux;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PMLPackage.DEMULTIPLEXOR__INDEMUX, oldIndemux, newIndemux);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndemux(Input newIndemux) {
		if (newIndemux != indemux) {
			NotificationChain msgs = null;
			if (indemux != null)
				msgs = ((InternalEObject)indemux).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PMLPackage.DEMULTIPLEXOR__INDEMUX, null, msgs);
			if (newIndemux != null)
				msgs = ((InternalEObject)newIndemux).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PMLPackage.DEMULTIPLEXOR__INDEMUX, null, msgs);
			msgs = basicSetIndemux(newIndemux, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PMLPackage.DEMULTIPLEXOR__INDEMUX, newIndemux, newIndemux));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Output getOutdemux() {
		return outdemux;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutdemux(Output newOutdemux, NotificationChain msgs) {
		Output oldOutdemux = outdemux;
		outdemux = newOutdemux;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PMLPackage.DEMULTIPLEXOR__OUTDEMUX, oldOutdemux, newOutdemux);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutdemux(Output newOutdemux) {
		if (newOutdemux != outdemux) {
			NotificationChain msgs = null;
			if (outdemux != null)
				msgs = ((InternalEObject)outdemux).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PMLPackage.DEMULTIPLEXOR__OUTDEMUX, null, msgs);
			if (newOutdemux != null)
				msgs = ((InternalEObject)newOutdemux).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PMLPackage.DEMULTIPLEXOR__OUTDEMUX, null, msgs);
			msgs = basicSetOutdemux(newOutdemux, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PMLPackage.DEMULTIPLEXOR__OUTDEMUX, newOutdemux, newOutdemux));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PMLPackage.DEMULTIPLEXOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Seletor getSeletordemux() {
		return seletordemux;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeletordemux(Seletor newSeletordemux, NotificationChain msgs) {
		Seletor oldSeletordemux = seletordemux;
		seletordemux = newSeletordemux;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PMLPackage.DEMULTIPLEXOR__SELETORDEMUX, oldSeletordemux, newSeletordemux);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeletordemux(Seletor newSeletordemux) {
		if (newSeletordemux != seletordemux) {
			NotificationChain msgs = null;
			if (seletordemux != null)
				msgs = ((InternalEObject)seletordemux).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PMLPackage.DEMULTIPLEXOR__SELETORDEMUX, null, msgs);
			if (newSeletordemux != null)
				msgs = ((InternalEObject)newSeletordemux).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PMLPackage.DEMULTIPLEXOR__SELETORDEMUX, null, msgs);
			msgs = basicSetSeletordemux(newSeletordemux, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PMLPackage.DEMULTIPLEXOR__SELETORDEMUX, newSeletordemux, newSeletordemux));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PMLPackage.DEMULTIPLEXOR__BEHAVIORS_DEMUX:
				return ((InternalEList<?>)getBehaviorsDemux()).basicRemove(otherEnd, msgs);
			case PMLPackage.DEMULTIPLEXOR__INDEMUX:
				return basicSetIndemux(null, msgs);
			case PMLPackage.DEMULTIPLEXOR__OUTDEMUX:
				return basicSetOutdemux(null, msgs);
			case PMLPackage.DEMULTIPLEXOR__SELETORDEMUX:
				return basicSetSeletordemux(null, msgs);
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
			case PMLPackage.DEMULTIPLEXOR__BEHAVIORS_DEMUX:
				return getBehaviorsDemux();
			case PMLPackage.DEMULTIPLEXOR__INDEMUX:
				return getIndemux();
			case PMLPackage.DEMULTIPLEXOR__OUTDEMUX:
				return getOutdemux();
			case PMLPackage.DEMULTIPLEXOR__NAME:
				return getName();
			case PMLPackage.DEMULTIPLEXOR__SELETORDEMUX:
				return getSeletordemux();
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
			case PMLPackage.DEMULTIPLEXOR__BEHAVIORS_DEMUX:
				getBehaviorsDemux().clear();
				getBehaviorsDemux().addAll((Collection<? extends Behavior>)newValue);
				return;
			case PMLPackage.DEMULTIPLEXOR__INDEMUX:
				setIndemux((Input)newValue);
				return;
			case PMLPackage.DEMULTIPLEXOR__OUTDEMUX:
				setOutdemux((Output)newValue);
				return;
			case PMLPackage.DEMULTIPLEXOR__NAME:
				setName((String)newValue);
				return;
			case PMLPackage.DEMULTIPLEXOR__SELETORDEMUX:
				setSeletordemux((Seletor)newValue);
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
			case PMLPackage.DEMULTIPLEXOR__BEHAVIORS_DEMUX:
				getBehaviorsDemux().clear();
				return;
			case PMLPackage.DEMULTIPLEXOR__INDEMUX:
				setIndemux((Input)null);
				return;
			case PMLPackage.DEMULTIPLEXOR__OUTDEMUX:
				setOutdemux((Output)null);
				return;
			case PMLPackage.DEMULTIPLEXOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PMLPackage.DEMULTIPLEXOR__SELETORDEMUX:
				setSeletordemux((Seletor)null);
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
			case PMLPackage.DEMULTIPLEXOR__BEHAVIORS_DEMUX:
				return behaviorsDemux != null && !behaviorsDemux.isEmpty();
			case PMLPackage.DEMULTIPLEXOR__INDEMUX:
				return indemux != null;
			case PMLPackage.DEMULTIPLEXOR__OUTDEMUX:
				return outdemux != null;
			case PMLPackage.DEMULTIPLEXOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PMLPackage.DEMULTIPLEXOR__SELETORDEMUX:
				return seletordemux != null;
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

} //DemultiplexorImpl
