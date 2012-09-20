/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.ufrn.lasic.pml.impl;

import br.ufrn.lasic.pml.FinalMicroInstruction;
import br.ufrn.lasic.pml.MicroInstruction;
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
 * An implementation of the model object '<em><b>Micro Instruction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.ufrn.lasic.pml.impl.MicroInstructionImpl#getName <em>Name</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.impl.MicroInstructionImpl#getValue <em>Value</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.impl.MicroInstructionImpl#getNextMicroinstruction <em>Next Microinstruction</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.impl.MicroInstructionImpl#getFinal <em>Final</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MicroInstructionImpl extends EObjectImpl implements MicroInstruction {
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
	 * The cached value of the '{@link #getNextMicroinstruction() <em>Next Microinstruction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextMicroinstruction()
	 * @generated
	 * @ordered
	 */
	protected EList<MicroInstruction> nextMicroinstruction;

	/**
	 * The cached value of the '{@link #getFinal() <em>Final</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinal()
	 * @generated
	 * @ordered
	 */
	protected FinalMicroInstruction final_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MicroInstructionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PMLPackage.Literals.MICRO_INSTRUCTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PMLPackage.MICRO_INSTRUCTION__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PMLPackage.MICRO_INSTRUCTION__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MicroInstruction> getNextMicroinstruction() {
		if (nextMicroinstruction == null) {
			nextMicroinstruction = new EObjectContainmentEList<MicroInstruction>(MicroInstruction.class, this, PMLPackage.MICRO_INSTRUCTION__NEXT_MICROINSTRUCTION);
		}
		return nextMicroinstruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinalMicroInstruction getFinal() {
		return final_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFinal(FinalMicroInstruction newFinal, NotificationChain msgs) {
		FinalMicroInstruction oldFinal = final_;
		final_ = newFinal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PMLPackage.MICRO_INSTRUCTION__FINAL, oldFinal, newFinal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinal(FinalMicroInstruction newFinal) {
		if (newFinal != final_) {
			NotificationChain msgs = null;
			if (final_ != null)
				msgs = ((InternalEObject)final_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PMLPackage.MICRO_INSTRUCTION__FINAL, null, msgs);
			if (newFinal != null)
				msgs = ((InternalEObject)newFinal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PMLPackage.MICRO_INSTRUCTION__FINAL, null, msgs);
			msgs = basicSetFinal(newFinal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PMLPackage.MICRO_INSTRUCTION__FINAL, newFinal, newFinal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PMLPackage.MICRO_INSTRUCTION__NEXT_MICROINSTRUCTION:
				return ((InternalEList<?>)getNextMicroinstruction()).basicRemove(otherEnd, msgs);
			case PMLPackage.MICRO_INSTRUCTION__FINAL:
				return basicSetFinal(null, msgs);
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
			case PMLPackage.MICRO_INSTRUCTION__NAME:
				return getName();
			case PMLPackage.MICRO_INSTRUCTION__VALUE:
				return getValue();
			case PMLPackage.MICRO_INSTRUCTION__NEXT_MICROINSTRUCTION:
				return getNextMicroinstruction();
			case PMLPackage.MICRO_INSTRUCTION__FINAL:
				return getFinal();
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
			case PMLPackage.MICRO_INSTRUCTION__NAME:
				setName((String)newValue);
				return;
			case PMLPackage.MICRO_INSTRUCTION__VALUE:
				setValue((Integer)newValue);
				return;
			case PMLPackage.MICRO_INSTRUCTION__NEXT_MICROINSTRUCTION:
				getNextMicroinstruction().clear();
				getNextMicroinstruction().addAll((Collection<? extends MicroInstruction>)newValue);
				return;
			case PMLPackage.MICRO_INSTRUCTION__FINAL:
				setFinal((FinalMicroInstruction)newValue);
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
			case PMLPackage.MICRO_INSTRUCTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PMLPackage.MICRO_INSTRUCTION__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case PMLPackage.MICRO_INSTRUCTION__NEXT_MICROINSTRUCTION:
				getNextMicroinstruction().clear();
				return;
			case PMLPackage.MICRO_INSTRUCTION__FINAL:
				setFinal((FinalMicroInstruction)null);
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
			case PMLPackage.MICRO_INSTRUCTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PMLPackage.MICRO_INSTRUCTION__VALUE:
				return value != VALUE_EDEFAULT;
			case PMLPackage.MICRO_INSTRUCTION__NEXT_MICROINSTRUCTION:
				return nextMicroinstruction != null && !nextMicroinstruction.isEmpty();
			case PMLPackage.MICRO_INSTRUCTION__FINAL:
				return final_ != null;
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

} //MicroInstructionImpl
