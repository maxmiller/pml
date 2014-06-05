/**
 */
package br.ufrn.lasic.pml.impl;

import br.ufrn.lasic.pml.FinalMicroInstruction;
import br.ufrn.lasic.pml.Instructions;
import br.ufrn.lasic.pml.PMLPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Final Micro Instruction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.ufrn.lasic.pml.impl.FinalMicroInstructionImpl#getName <em>Name</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.impl.FinalMicroInstructionImpl#getValue <em>Value</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.impl.FinalMicroInstructionImpl#getFinalFSM <em>Final FSM</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FinalMicroInstructionImpl extends EObjectImpl implements FinalMicroInstruction {
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
	 * The cached value of the '{@link #getFinalFSM() <em>Final FSM</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalFSM()
	 * @generated
	 * @ordered
	 */
	protected EList<Instructions> finalFSM;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FinalMicroInstructionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PMLPackage.Literals.FINAL_MICRO_INSTRUCTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PMLPackage.FINAL_MICRO_INSTRUCTION__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PMLPackage.FINAL_MICRO_INSTRUCTION__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Instructions> getFinalFSM() {
		if (finalFSM == null) {
			finalFSM = new EObjectResolvingEList<Instructions>(Instructions.class, this, PMLPackage.FINAL_MICRO_INSTRUCTION__FINAL_FSM);
		}
		return finalFSM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PMLPackage.FINAL_MICRO_INSTRUCTION__NAME:
				return getName();
			case PMLPackage.FINAL_MICRO_INSTRUCTION__VALUE:
				return getValue();
			case PMLPackage.FINAL_MICRO_INSTRUCTION__FINAL_FSM:
				return getFinalFSM();
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
			case PMLPackage.FINAL_MICRO_INSTRUCTION__NAME:
				setName((String)newValue);
				return;
			case PMLPackage.FINAL_MICRO_INSTRUCTION__VALUE:
				setValue((Integer)newValue);
				return;
			case PMLPackage.FINAL_MICRO_INSTRUCTION__FINAL_FSM:
				getFinalFSM().clear();
				getFinalFSM().addAll((Collection<? extends Instructions>)newValue);
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
			case PMLPackage.FINAL_MICRO_INSTRUCTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PMLPackage.FINAL_MICRO_INSTRUCTION__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case PMLPackage.FINAL_MICRO_INSTRUCTION__FINAL_FSM:
				getFinalFSM().clear();
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
			case PMLPackage.FINAL_MICRO_INSTRUCTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PMLPackage.FINAL_MICRO_INSTRUCTION__VALUE:
				return value != VALUE_EDEFAULT;
			case PMLPackage.FINAL_MICRO_INSTRUCTION__FINAL_FSM:
				return finalFSM != null && !finalFSM.isEmpty();
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

} //FinalMicroInstructionImpl
