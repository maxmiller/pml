/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.ufrn.lasic.pml.impl;

import br.ufrn.lasic.pml.Behavior;
import br.ufrn.lasic.pml.Decoder;
import br.ufrn.lasic.pml.Input;
import br.ufrn.lasic.pml.Output;
import br.ufrn.lasic.pml.PMLPackage;

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
 * An implementation of the model object '<em><b>Decoder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.ufrn.lasic.pml.impl.DecoderImpl#getName <em>Name</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.impl.DecoderImpl#getOutDecoder <em>Out Decoder</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.impl.DecoderImpl#getInDecoder <em>In Decoder</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.impl.DecoderImpl#getBehaviorDecoder <em>Behavior Decoder</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DecoderImpl extends EObjectImpl implements Decoder {
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
	 * The cached value of the '{@link #getOutDecoder() <em>Out Decoder</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutDecoder()
	 * @generated
	 * @ordered
	 */
	protected EList<Output> outDecoder;

	/**
	 * The cached value of the '{@link #getInDecoder() <em>In Decoder</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInDecoder()
	 * @generated
	 * @ordered
	 */
	protected EList<Input> inDecoder;

	/**
	 * The cached value of the '{@link #getBehaviorDecoder() <em>Behavior Decoder</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviorDecoder()
	 * @generated
	 * @ordered
	 */
	protected EList<Behavior> behaviorDecoder;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DecoderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PMLPackage.Literals.DECODER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PMLPackage.DECODER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Output> getOutDecoder() {
		if (outDecoder == null) {
			outDecoder = new EObjectContainmentEList<Output>(Output.class, this, PMLPackage.DECODER__OUT_DECODER);
		}
		return outDecoder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Input> getInDecoder() {
		if (inDecoder == null) {
			inDecoder = new EObjectContainmentEList<Input>(Input.class, this, PMLPackage.DECODER__IN_DECODER);
		}
		return inDecoder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Behavior> getBehaviorDecoder() {
		if (behaviorDecoder == null) {
			behaviorDecoder = new EObjectContainmentEList<Behavior>(Behavior.class, this, PMLPackage.DECODER__BEHAVIOR_DECODER);
		}
		return behaviorDecoder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PMLPackage.DECODER__OUT_DECODER:
				return ((InternalEList<?>)getOutDecoder()).basicRemove(otherEnd, msgs);
			case PMLPackage.DECODER__IN_DECODER:
				return ((InternalEList<?>)getInDecoder()).basicRemove(otherEnd, msgs);
			case PMLPackage.DECODER__BEHAVIOR_DECODER:
				return ((InternalEList<?>)getBehaviorDecoder()).basicRemove(otherEnd, msgs);
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
			case PMLPackage.DECODER__NAME:
				return getName();
			case PMLPackage.DECODER__OUT_DECODER:
				return getOutDecoder();
			case PMLPackage.DECODER__IN_DECODER:
				return getInDecoder();
			case PMLPackage.DECODER__BEHAVIOR_DECODER:
				return getBehaviorDecoder();
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
			case PMLPackage.DECODER__NAME:
				setName((String)newValue);
				return;
			case PMLPackage.DECODER__OUT_DECODER:
				getOutDecoder().clear();
				getOutDecoder().addAll((Collection<? extends Output>)newValue);
				return;
			case PMLPackage.DECODER__IN_DECODER:
				getInDecoder().clear();
				getInDecoder().addAll((Collection<? extends Input>)newValue);
				return;
			case PMLPackage.DECODER__BEHAVIOR_DECODER:
				getBehaviorDecoder().clear();
				getBehaviorDecoder().addAll((Collection<? extends Behavior>)newValue);
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
			case PMLPackage.DECODER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PMLPackage.DECODER__OUT_DECODER:
				getOutDecoder().clear();
				return;
			case PMLPackage.DECODER__IN_DECODER:
				getInDecoder().clear();
				return;
			case PMLPackage.DECODER__BEHAVIOR_DECODER:
				getBehaviorDecoder().clear();
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
			case PMLPackage.DECODER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PMLPackage.DECODER__OUT_DECODER:
				return outDecoder != null && !outDecoder.isEmpty();
			case PMLPackage.DECODER__IN_DECODER:
				return inDecoder != null && !inDecoder.isEmpty();
			case PMLPackage.DECODER__BEHAVIOR_DECODER:
				return behaviorDecoder != null && !behaviorDecoder.isEmpty();
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

} //DecoderImpl
