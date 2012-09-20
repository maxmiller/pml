/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.ufrn.lasic.pml.impl;

import br.ufrn.lasic.pml.FinalMicroInstruction;
import br.ufrn.lasic.pml.InitialMicroInstruction;
import br.ufrn.lasic.pml.MicroInstruction;
import br.ufrn.lasic.pml.PMLPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Initial Micro Instruction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.ufrn.lasic.pml.impl.InitialMicroInstructionImpl#getNext <em>Next</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.impl.InitialMicroInstructionImpl#getName <em>Name</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.impl.InitialMicroInstructionImpl#getValue <em>Value</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.impl.InitialMicroInstructionImpl#getDirectFinalMicroInstruction <em>Direct Final Micro Instruction</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InitialMicroInstructionImpl extends EObjectImpl implements InitialMicroInstruction {
	/**
	 * The cached value of the '{@link #getNext() <em>Next</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected MicroInstruction next;

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
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final int VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected int value = VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDirectFinalMicroInstruction() <em>Direct Final Micro Instruction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectFinalMicroInstruction()
	 * @generated
	 * @ordered
	 */
	protected FinalMicroInstruction directFinalMicroInstruction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InitialMicroInstructionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PMLPackage.Literals.INITIAL_MICRO_INSTRUCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MicroInstruction getNext() {
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNext(MicroInstruction newNext, NotificationChain msgs) {
		MicroInstruction oldNext = next;
		next = newNext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PMLPackage.INITIAL_MICRO_INSTRUCTION__NEXT, oldNext, newNext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNext(MicroInstruction newNext) {
		if (newNext != next) {
			NotificationChain msgs = null;
			if (next != null)
				msgs = ((InternalEObject)next).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PMLPackage.INITIAL_MICRO_INSTRUCTION__NEXT, null, msgs);
			if (newNext != null)
				msgs = ((InternalEObject)newNext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PMLPackage.INITIAL_MICRO_INSTRUCTION__NEXT, null, msgs);
			msgs = basicSetNext(newNext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PMLPackage.INITIAL_MICRO_INSTRUCTION__NEXT, newNext, newNext));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PMLPackage.INITIAL_MICRO_INSTRUCTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(int newValue) {
		int oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PMLPackage.INITIAL_MICRO_INSTRUCTION__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinalMicroInstruction getDirectFinalMicroInstruction() {
		return directFinalMicroInstruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDirectFinalMicroInstruction(FinalMicroInstruction newDirectFinalMicroInstruction, NotificationChain msgs) {
		FinalMicroInstruction oldDirectFinalMicroInstruction = directFinalMicroInstruction;
		directFinalMicroInstruction = newDirectFinalMicroInstruction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PMLPackage.INITIAL_MICRO_INSTRUCTION__DIRECT_FINAL_MICRO_INSTRUCTION, oldDirectFinalMicroInstruction, newDirectFinalMicroInstruction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirectFinalMicroInstruction(FinalMicroInstruction newDirectFinalMicroInstruction) {
		if (newDirectFinalMicroInstruction != directFinalMicroInstruction) {
			NotificationChain msgs = null;
			if (directFinalMicroInstruction != null)
				msgs = ((InternalEObject)directFinalMicroInstruction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PMLPackage.INITIAL_MICRO_INSTRUCTION__DIRECT_FINAL_MICRO_INSTRUCTION, null, msgs);
			if (newDirectFinalMicroInstruction != null)
				msgs = ((InternalEObject)newDirectFinalMicroInstruction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PMLPackage.INITIAL_MICRO_INSTRUCTION__DIRECT_FINAL_MICRO_INSTRUCTION, null, msgs);
			msgs = basicSetDirectFinalMicroInstruction(newDirectFinalMicroInstruction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PMLPackage.INITIAL_MICRO_INSTRUCTION__DIRECT_FINAL_MICRO_INSTRUCTION, newDirectFinalMicroInstruction, newDirectFinalMicroInstruction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PMLPackage.INITIAL_MICRO_INSTRUCTION__NEXT:
				return basicSetNext(null, msgs);
			case PMLPackage.INITIAL_MICRO_INSTRUCTION__DIRECT_FINAL_MICRO_INSTRUCTION:
				return basicSetDirectFinalMicroInstruction(null, msgs);
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
			case PMLPackage.INITIAL_MICRO_INSTRUCTION__NEXT:
				return getNext();
			case PMLPackage.INITIAL_MICRO_INSTRUCTION__NAME:
				return getName();
			case PMLPackage.INITIAL_MICRO_INSTRUCTION__VALUE:
				return getValue();
			case PMLPackage.INITIAL_MICRO_INSTRUCTION__DIRECT_FINAL_MICRO_INSTRUCTION:
				return getDirectFinalMicroInstruction();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PMLPackage.INITIAL_MICRO_INSTRUCTION__NEXT:
				setNext((MicroInstruction)newValue);
				return;
			case PMLPackage.INITIAL_MICRO_INSTRUCTION__NAME:
				setName((String)newValue);
				return;
			case PMLPackage.INITIAL_MICRO_INSTRUCTION__VALUE:
				setValue((Integer)newValue);
				return;
			case PMLPackage.INITIAL_MICRO_INSTRUCTION__DIRECT_FINAL_MICRO_INSTRUCTION:
				setDirectFinalMicroInstruction((FinalMicroInstruction)newValue);
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
			case PMLPackage.INITIAL_MICRO_INSTRUCTION__NEXT:
				setNext((MicroInstruction)null);
				return;
			case PMLPackage.INITIAL_MICRO_INSTRUCTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PMLPackage.INITIAL_MICRO_INSTRUCTION__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case PMLPackage.INITIAL_MICRO_INSTRUCTION__DIRECT_FINAL_MICRO_INSTRUCTION:
				setDirectFinalMicroInstruction((FinalMicroInstruction)null);
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
			case PMLPackage.INITIAL_MICRO_INSTRUCTION__NEXT:
				return next != null;
			case PMLPackage.INITIAL_MICRO_INSTRUCTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PMLPackage.INITIAL_MICRO_INSTRUCTION__VALUE:
				return value != VALUE_EDEFAULT;
			case PMLPackage.INITIAL_MICRO_INSTRUCTION__DIRECT_FINAL_MICRO_INSTRUCTION:
				return directFinalMicroInstruction != null;
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
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //InitialMicroInstructionImpl
