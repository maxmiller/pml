/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package processor.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import processor.ControlUnit;
import processor.LoadControlUnit;
import processor.ProcessorPackage;
import processor.ReadWrite;
import processor.SeletorControlUnit;
import processor.Write;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link processor.impl.ControlUnitImpl#getLoads <em>Loads</em>}</li>
 *   <li>{@link processor.impl.ControlUnitImpl#getWriteMemory <em>Write Memory</em>}</li>
 *   <li>{@link processor.impl.ControlUnitImpl#getReadwritebit <em>Readwritebit</em>}</li>
 *   <li>{@link processor.impl.ControlUnitImpl#getSelControlUnit <em>Sel Control Unit</em>}</li>
 *   <li>{@link processor.impl.ControlUnitImpl#getState <em>State</em>}</li>
 *   <li>{@link processor.impl.ControlUnitImpl#getInstructionSubstate <em>Instruction Substate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ControlUnitImpl extends EObjectImpl implements ControlUnit {
	/**
	 * The cached value of the '{@link #getLoads() <em>Loads</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoads()
	 * @generated
	 * @ordered
	 */
	protected EList<LoadControlUnit> loads;

	/**
	 * The cached value of the '{@link #getWriteMemory() <em>Write Memory</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteMemory()
	 * @generated
	 * @ordered
	 */
	protected Write writeMemory;

	/**
	 * The cached value of the '{@link #getReadwritebit() <em>Readwritebit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadwritebit()
	 * @generated
	 * @ordered
	 */
	protected ReadWrite readwritebit;

	/**
	 * The cached value of the '{@link #getSelControlUnit() <em>Sel Control Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelControlUnit()
	 * @generated
	 * @ordered
	 */
	protected SeletorControlUnit selControlUnit;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final int STATE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected int state = STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInstructionSubstate() <em>Instruction Substate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructionSubstate()
	 * @generated
	 * @ordered
	 */
	protected static final int INSTRUCTION_SUBSTATE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getInstructionSubstate() <em>Instruction Substate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructionSubstate()
	 * @generated
	 * @ordered
	 */
	protected int instructionSubstate = INSTRUCTION_SUBSTATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProcessorPackage.Literals.CONTROL_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LoadControlUnit> getLoads() {
		if (loads == null) {
			loads = new EObjectResolvingEList<LoadControlUnit>(LoadControlUnit.class, this, ProcessorPackage.CONTROL_UNIT__LOADS);
		}
		return loads;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Write getWriteMemory() {
		if (writeMemory != null && writeMemory.eIsProxy()) {
			InternalEObject oldWriteMemory = (InternalEObject)writeMemory;
			writeMemory = (Write)eResolveProxy(oldWriteMemory);
			if (writeMemory != oldWriteMemory) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessorPackage.CONTROL_UNIT__WRITE_MEMORY, oldWriteMemory, writeMemory));
			}
		}
		return writeMemory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Write basicGetWriteMemory() {
		return writeMemory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWriteMemory(Write newWriteMemory) {
		Write oldWriteMemory = writeMemory;
		writeMemory = newWriteMemory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessorPackage.CONTROL_UNIT__WRITE_MEMORY, oldWriteMemory, writeMemory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadWrite getReadwritebit() {
		if (readwritebit != null && readwritebit.eIsProxy()) {
			InternalEObject oldReadwritebit = (InternalEObject)readwritebit;
			readwritebit = (ReadWrite)eResolveProxy(oldReadwritebit);
			if (readwritebit != oldReadwritebit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessorPackage.CONTROL_UNIT__READWRITEBIT, oldReadwritebit, readwritebit));
			}
		}
		return readwritebit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadWrite basicGetReadwritebit() {
		return readwritebit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadwritebit(ReadWrite newReadwritebit) {
		ReadWrite oldReadwritebit = readwritebit;
		readwritebit = newReadwritebit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessorPackage.CONTROL_UNIT__READWRITEBIT, oldReadwritebit, readwritebit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeletorControlUnit getSelControlUnit() {
		if (selControlUnit != null && selControlUnit.eIsProxy()) {
			InternalEObject oldSelControlUnit = (InternalEObject)selControlUnit;
			selControlUnit = (SeletorControlUnit)eResolveProxy(oldSelControlUnit);
			if (selControlUnit != oldSelControlUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessorPackage.CONTROL_UNIT__SEL_CONTROL_UNIT, oldSelControlUnit, selControlUnit));
			}
		}
		return selControlUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeletorControlUnit basicGetSelControlUnit() {
		return selControlUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelControlUnit(SeletorControlUnit newSelControlUnit) {
		SeletorControlUnit oldSelControlUnit = selControlUnit;
		selControlUnit = newSelControlUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessorPackage.CONTROL_UNIT__SEL_CONTROL_UNIT, oldSelControlUnit, selControlUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(int newState) {
		int oldState = state;
		state = newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessorPackage.CONTROL_UNIT__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getInstructionSubstate() {
		return instructionSubstate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstructionSubstate(int newInstructionSubstate) {
		int oldInstructionSubstate = instructionSubstate;
		instructionSubstate = newInstructionSubstate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessorPackage.CONTROL_UNIT__INSTRUCTION_SUBSTATE, oldInstructionSubstate, instructionSubstate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void controlUnitBehavior() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void processInstruction() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void processMiscellaneousInstruction() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void processControlInstruction() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void processRegisterInstruction() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void processMemoryInstruction() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void resetAllLoads() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void incrementPC() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadsARWithPc() {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProcessorPackage.CONTROL_UNIT__LOADS:
				return getLoads();
			case ProcessorPackage.CONTROL_UNIT__WRITE_MEMORY:
				if (resolve) return getWriteMemory();
				return basicGetWriteMemory();
			case ProcessorPackage.CONTROL_UNIT__READWRITEBIT:
				if (resolve) return getReadwritebit();
				return basicGetReadwritebit();
			case ProcessorPackage.CONTROL_UNIT__SEL_CONTROL_UNIT:
				if (resolve) return getSelControlUnit();
				return basicGetSelControlUnit();
			case ProcessorPackage.CONTROL_UNIT__STATE:
				return getState();
			case ProcessorPackage.CONTROL_UNIT__INSTRUCTION_SUBSTATE:
				return getInstructionSubstate();
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
			case ProcessorPackage.CONTROL_UNIT__LOADS:
				getLoads().clear();
				getLoads().addAll((Collection<? extends LoadControlUnit>)newValue);
				return;
			case ProcessorPackage.CONTROL_UNIT__WRITE_MEMORY:
				setWriteMemory((Write)newValue);
				return;
			case ProcessorPackage.CONTROL_UNIT__READWRITEBIT:
				setReadwritebit((ReadWrite)newValue);
				return;
			case ProcessorPackage.CONTROL_UNIT__SEL_CONTROL_UNIT:
				setSelControlUnit((SeletorControlUnit)newValue);
				return;
			case ProcessorPackage.CONTROL_UNIT__STATE:
				setState((Integer)newValue);
				return;
			case ProcessorPackage.CONTROL_UNIT__INSTRUCTION_SUBSTATE:
				setInstructionSubstate((Integer)newValue);
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
			case ProcessorPackage.CONTROL_UNIT__LOADS:
				getLoads().clear();
				return;
			case ProcessorPackage.CONTROL_UNIT__WRITE_MEMORY:
				setWriteMemory((Write)null);
				return;
			case ProcessorPackage.CONTROL_UNIT__READWRITEBIT:
				setReadwritebit((ReadWrite)null);
				return;
			case ProcessorPackage.CONTROL_UNIT__SEL_CONTROL_UNIT:
				setSelControlUnit((SeletorControlUnit)null);
				return;
			case ProcessorPackage.CONTROL_UNIT__STATE:
				setState(STATE_EDEFAULT);
				return;
			case ProcessorPackage.CONTROL_UNIT__INSTRUCTION_SUBSTATE:
				setInstructionSubstate(INSTRUCTION_SUBSTATE_EDEFAULT);
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
			case ProcessorPackage.CONTROL_UNIT__LOADS:
				return loads != null && !loads.isEmpty();
			case ProcessorPackage.CONTROL_UNIT__WRITE_MEMORY:
				return writeMemory != null;
			case ProcessorPackage.CONTROL_UNIT__READWRITEBIT:
				return readwritebit != null;
			case ProcessorPackage.CONTROL_UNIT__SEL_CONTROL_UNIT:
				return selControlUnit != null;
			case ProcessorPackage.CONTROL_UNIT__STATE:
				return state != STATE_EDEFAULT;
			case ProcessorPackage.CONTROL_UNIT__INSTRUCTION_SUBSTATE:
				return instructionSubstate != INSTRUCTION_SUBSTATE_EDEFAULT;
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
		result.append(" (state: ");
		result.append(state);
		result.append(", instructionSubstate: ");
		result.append(instructionSubstate);
		result.append(')');
		return result.toString();
	}

} //ControlUnitImpl
