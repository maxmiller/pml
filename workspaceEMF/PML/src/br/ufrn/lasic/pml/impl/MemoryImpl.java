/**
 */
package br.ufrn.lasic.pml.impl;

import br.ufrn.lasic.pml.Behavior;
import br.ufrn.lasic.pml.Input;
import br.ufrn.lasic.pml.Memory;
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
 * An implementation of the model object '<em><b>Memory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.ufrn.lasic.pml.impl.MemoryImpl#getBehaviorsMemory <em>Behaviors Memory</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.impl.MemoryImpl#getInputMemory <em>Input Memory</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.impl.MemoryImpl#getOutputMemory <em>Output Memory</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.impl.MemoryImpl#getName <em>Name</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.impl.MemoryImpl#getLength <em>Length</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MemoryImpl extends EObjectImpl implements Memory {
	/**
	 * The cached value of the '{@link #getBehaviorsMemory() <em>Behaviors Memory</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviorsMemory()
	 * @generated
	 * @ordered
	 */
	protected EList<Behavior> behaviorsMemory;

	/**
	 * The cached value of the '{@link #getInputMemory() <em>Input Memory</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputMemory()
	 * @generated
	 * @ordered
	 */
	protected EList<Input> inputMemory;

	/**
	 * The cached value of the '{@link #getOutputMemory() <em>Output Memory</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputMemory()
	 * @generated
	 * @ordered
	 */
	protected EList<Output> outputMemory;

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
	protected MemoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PMLPackage.Literals.MEMORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Behavior> getBehaviorsMemory() {
		if (behaviorsMemory == null) {
			behaviorsMemory = new EObjectContainmentEList<Behavior>(Behavior.class, this, PMLPackage.MEMORY__BEHAVIORS_MEMORY);
		}
		return behaviorsMemory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Input> getInputMemory() {
		if (inputMemory == null) {
			inputMemory = new EObjectContainmentEList<Input>(Input.class, this, PMLPackage.MEMORY__INPUT_MEMORY);
		}
		return inputMemory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Output> getOutputMemory() {
		if (outputMemory == null) {
			outputMemory = new EObjectContainmentEList<Output>(Output.class, this, PMLPackage.MEMORY__OUTPUT_MEMORY);
		}
		return outputMemory;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PMLPackage.MEMORY__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PMLPackage.MEMORY__LENGTH, oldLength, length));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PMLPackage.MEMORY__BEHAVIORS_MEMORY:
				return ((InternalEList<?>)getBehaviorsMemory()).basicRemove(otherEnd, msgs);
			case PMLPackage.MEMORY__INPUT_MEMORY:
				return ((InternalEList<?>)getInputMemory()).basicRemove(otherEnd, msgs);
			case PMLPackage.MEMORY__OUTPUT_MEMORY:
				return ((InternalEList<?>)getOutputMemory()).basicRemove(otherEnd, msgs);
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
			case PMLPackage.MEMORY__BEHAVIORS_MEMORY:
				return getBehaviorsMemory();
			case PMLPackage.MEMORY__INPUT_MEMORY:
				return getInputMemory();
			case PMLPackage.MEMORY__OUTPUT_MEMORY:
				return getOutputMemory();
			case PMLPackage.MEMORY__NAME:
				return getName();
			case PMLPackage.MEMORY__LENGTH:
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
			case PMLPackage.MEMORY__BEHAVIORS_MEMORY:
				getBehaviorsMemory().clear();
				getBehaviorsMemory().addAll((Collection<? extends Behavior>)newValue);
				return;
			case PMLPackage.MEMORY__INPUT_MEMORY:
				getInputMemory().clear();
				getInputMemory().addAll((Collection<? extends Input>)newValue);
				return;
			case PMLPackage.MEMORY__OUTPUT_MEMORY:
				getOutputMemory().clear();
				getOutputMemory().addAll((Collection<? extends Output>)newValue);
				return;
			case PMLPackage.MEMORY__NAME:
				setName((String)newValue);
				return;
			case PMLPackage.MEMORY__LENGTH:
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
			case PMLPackage.MEMORY__BEHAVIORS_MEMORY:
				getBehaviorsMemory().clear();
				return;
			case PMLPackage.MEMORY__INPUT_MEMORY:
				getInputMemory().clear();
				return;
			case PMLPackage.MEMORY__OUTPUT_MEMORY:
				getOutputMemory().clear();
				return;
			case PMLPackage.MEMORY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PMLPackage.MEMORY__LENGTH:
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
			case PMLPackage.MEMORY__BEHAVIORS_MEMORY:
				return behaviorsMemory != null && !behaviorsMemory.isEmpty();
			case PMLPackage.MEMORY__INPUT_MEMORY:
				return inputMemory != null && !inputMemory.isEmpty();
			case PMLPackage.MEMORY__OUTPUT_MEMORY:
				return outputMemory != null && !outputMemory.isEmpty();
			case PMLPackage.MEMORY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PMLPackage.MEMORY__LENGTH:
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

} //MemoryImpl
