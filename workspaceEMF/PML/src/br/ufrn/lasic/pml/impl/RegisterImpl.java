/**
 */
package br.ufrn.lasic.pml.impl;

import br.ufrn.lasic.pml.Behavior;
import br.ufrn.lasic.pml.Input;
import br.ufrn.lasic.pml.Output;
import br.ufrn.lasic.pml.PMLPackage;
import br.ufrn.lasic.pml.Register;

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
 * An implementation of the model object '<em><b>Register</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.ufrn.lasic.pml.impl.RegisterImpl#getBehaviorRegister <em>Behavior Register</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.impl.RegisterImpl#getOutputRegister <em>Output Register</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.impl.RegisterImpl#getInputRegister <em>Input Register</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.impl.RegisterImpl#getName <em>Name</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.impl.RegisterImpl#getLength <em>Length</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RegisterImpl extends EObjectImpl implements Register {
	/**
	 * The cached value of the '{@link #getBehaviorRegister() <em>Behavior Register</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviorRegister()
	 * @generated
	 * @ordered
	 */
	protected EList<Behavior> behaviorRegister;

	/**
	 * The cached value of the '{@link #getOutputRegister() <em>Output Register</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputRegister()
	 * @generated
	 * @ordered
	 */
	protected EList<Output> outputRegister;

	/**
	 * The cached value of the '{@link #getInputRegister() <em>Input Register</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputRegister()
	 * @generated
	 * @ordered
	 */
	protected EList<Input> inputRegister;

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
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected static final int LENGTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected int length = LENGTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegisterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PMLPackage.Literals.REGISTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Behavior> getBehaviorRegister() {
		if (behaviorRegister == null) {
			behaviorRegister = new EObjectContainmentEList<Behavior>(Behavior.class, this, PMLPackage.REGISTER__BEHAVIOR_REGISTER);
		}
		return behaviorRegister;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Output> getOutputRegister() {
		if (outputRegister == null) {
			outputRegister = new EObjectContainmentEList<Output>(Output.class, this, PMLPackage.REGISTER__OUTPUT_REGISTER);
		}
		return outputRegister;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Input> getInputRegister() {
		if (inputRegister == null) {
			inputRegister = new EObjectContainmentEList<Input>(Input.class, this, PMLPackage.REGISTER__INPUT_REGISTER);
		}
		return inputRegister;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PMLPackage.REGISTER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLength(int newLength) {
		int oldLength = length;
		length = newLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PMLPackage.REGISTER__LENGTH, oldLength, length));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PMLPackage.REGISTER__BEHAVIOR_REGISTER:
				return ((InternalEList<?>)getBehaviorRegister()).basicRemove(otherEnd, msgs);
			case PMLPackage.REGISTER__OUTPUT_REGISTER:
				return ((InternalEList<?>)getOutputRegister()).basicRemove(otherEnd, msgs);
			case PMLPackage.REGISTER__INPUT_REGISTER:
				return ((InternalEList<?>)getInputRegister()).basicRemove(otherEnd, msgs);
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
			case PMLPackage.REGISTER__BEHAVIOR_REGISTER:
				return getBehaviorRegister();
			case PMLPackage.REGISTER__OUTPUT_REGISTER:
				return getOutputRegister();
			case PMLPackage.REGISTER__INPUT_REGISTER:
				return getInputRegister();
			case PMLPackage.REGISTER__NAME:
				return getName();
			case PMLPackage.REGISTER__LENGTH:
				return getLength();
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
			case PMLPackage.REGISTER__BEHAVIOR_REGISTER:
				getBehaviorRegister().clear();
				getBehaviorRegister().addAll((Collection<? extends Behavior>)newValue);
				return;
			case PMLPackage.REGISTER__OUTPUT_REGISTER:
				getOutputRegister().clear();
				getOutputRegister().addAll((Collection<? extends Output>)newValue);
				return;
			case PMLPackage.REGISTER__INPUT_REGISTER:
				getInputRegister().clear();
				getInputRegister().addAll((Collection<? extends Input>)newValue);
				return;
			case PMLPackage.REGISTER__NAME:
				setName((String)newValue);
				return;
			case PMLPackage.REGISTER__LENGTH:
				setLength((Integer)newValue);
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
			case PMLPackage.REGISTER__BEHAVIOR_REGISTER:
				getBehaviorRegister().clear();
				return;
			case PMLPackage.REGISTER__OUTPUT_REGISTER:
				getOutputRegister().clear();
				return;
			case PMLPackage.REGISTER__INPUT_REGISTER:
				getInputRegister().clear();
				return;
			case PMLPackage.REGISTER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PMLPackage.REGISTER__LENGTH:
				setLength(LENGTH_EDEFAULT);
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
			case PMLPackage.REGISTER__BEHAVIOR_REGISTER:
				return behaviorRegister != null && !behaviorRegister.isEmpty();
			case PMLPackage.REGISTER__OUTPUT_REGISTER:
				return outputRegister != null && !outputRegister.isEmpty();
			case PMLPackage.REGISTER__INPUT_REGISTER:
				return inputRegister != null && !inputRegister.isEmpty();
			case PMLPackage.REGISTER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PMLPackage.REGISTER__LENGTH:
				return length != LENGTH_EDEFAULT;
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
		result.append(", length: ");
		result.append(length);
		result.append(')');
		return result.toString();
	}

} //RegisterImpl
