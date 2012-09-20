/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package processor.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import processor.Clock;
import processor.InputRegisterFile;
import processor.OutputRegisterFile;
import processor.ProcessorPackage;
import processor.ReadWrite;
import processor.RegisterFile;
import processor.SeletorRegisterFile;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Register File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link processor.impl.RegisterFileImpl#getSel <em>Sel</em>}</li>
 *   <li>{@link processor.impl.RegisterFileImpl#getRwBit <em>Rw Bit</em>}</li>
 *   <li>{@link processor.impl.RegisterFileImpl#getClock <em>Clock</em>}</li>
 *   <li>{@link processor.impl.RegisterFileImpl#getRegisters <em>Registers</em>}</li>
 *   <li>{@link processor.impl.RegisterFileImpl#getInRf <em>In Rf</em>}</li>
 *   <li>{@link processor.impl.RegisterFileImpl#getOutRf <em>Out Rf</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RegisterFileImpl extends EObjectImpl implements RegisterFile {
	/**
	 * The cached value of the '{@link #getSel() <em>Sel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSel()
	 * @generated
	 * @ordered
	 */
	protected SeletorRegisterFile sel;

	/**
	 * The cached value of the '{@link #getRwBit() <em>Rw Bit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRwBit()
	 * @generated
	 * @ordered
	 */
	protected ReadWrite rwBit;

	/**
	 * The cached value of the '{@link #getClock() <em>Clock</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClock()
	 * @generated
	 * @ordered
	 */
	protected Clock clock;

	/**
	 * The default value of the '{@link #getRegisters() <em>Registers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegisters()
	 * @generated
	 * @ordered
	 */
	protected static final int[] REGISTERS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegisters() <em>Registers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegisters()
	 * @generated
	 * @ordered
	 */
	protected int[] registers = REGISTERS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInRf() <em>In Rf</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInRf()
	 * @generated
	 * @ordered
	 */
	protected InputRegisterFile inRf;

	/**
	 * The cached value of the '{@link #getOutRf() <em>Out Rf</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutRf()
	 * @generated
	 * @ordered
	 */
	protected OutputRegisterFile outRf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegisterFileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProcessorPackage.Literals.REGISTER_FILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeletorRegisterFile getSel() {
		if (sel != null && sel.eIsProxy()) {
			InternalEObject oldSel = (InternalEObject)sel;
			sel = (SeletorRegisterFile)eResolveProxy(oldSel);
			if (sel != oldSel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessorPackage.REGISTER_FILE__SEL, oldSel, sel));
			}
		}
		return sel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeletorRegisterFile basicGetSel() {
		return sel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSel(SeletorRegisterFile newSel) {
		SeletorRegisterFile oldSel = sel;
		sel = newSel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessorPackage.REGISTER_FILE__SEL, oldSel, sel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadWrite getRwBit() {
		if (rwBit != null && rwBit.eIsProxy()) {
			InternalEObject oldRwBit = (InternalEObject)rwBit;
			rwBit = (ReadWrite)eResolveProxy(oldRwBit);
			if (rwBit != oldRwBit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessorPackage.REGISTER_FILE__RW_BIT, oldRwBit, rwBit));
			}
		}
		return rwBit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadWrite basicGetRwBit() {
		return rwBit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRwBit(ReadWrite newRwBit) {
		ReadWrite oldRwBit = rwBit;
		rwBit = newRwBit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessorPackage.REGISTER_FILE__RW_BIT, oldRwBit, rwBit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clock getClock() {
		if (clock != null && clock.eIsProxy()) {
			InternalEObject oldClock = (InternalEObject)clock;
			clock = (Clock)eResolveProxy(oldClock);
			if (clock != oldClock) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessorPackage.REGISTER_FILE__CLOCK, oldClock, clock));
			}
		}
		return clock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clock basicGetClock() {
		return clock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClock(Clock newClock) {
		Clock oldClock = clock;
		clock = newClock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessorPackage.REGISTER_FILE__CLOCK, oldClock, clock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int[] getRegisters() {
		return registers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegisters(int[] newRegisters) {
		int[] oldRegisters = registers;
		registers = newRegisters;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessorPackage.REGISTER_FILE__REGISTERS, oldRegisters, registers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputRegisterFile getInRf() {
		if (inRf != null && inRf.eIsProxy()) {
			InternalEObject oldInRf = (InternalEObject)inRf;
			inRf = (InputRegisterFile)eResolveProxy(oldInRf);
			if (inRf != oldInRf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessorPackage.REGISTER_FILE__IN_RF, oldInRf, inRf));
			}
		}
		return inRf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputRegisterFile basicGetInRf() {
		return inRf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInRf(InputRegisterFile newInRf) {
		InputRegisterFile oldInRf = inRf;
		inRf = newInRf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessorPackage.REGISTER_FILE__IN_RF, oldInRf, inRf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputRegisterFile getOutRf() {
		if (outRf != null && outRf.eIsProxy()) {
			InternalEObject oldOutRf = (InternalEObject)outRf;
			outRf = (OutputRegisterFile)eResolveProxy(oldOutRf);
			if (outRf != oldOutRf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessorPackage.REGISTER_FILE__OUT_RF, oldOutRf, outRf));
			}
		}
		return outRf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputRegisterFile basicGetOutRf() {
		return outRf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutRf(OutputRegisterFile newOutRf) {
		OutputRegisterFile oldOutRf = outRf;
		outRf = newOutRf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessorPackage.REGISTER_FILE__OUT_RF, oldOutRf, outRf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerFileBehavior() {
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
			case ProcessorPackage.REGISTER_FILE__SEL:
				if (resolve) return getSel();
				return basicGetSel();
			case ProcessorPackage.REGISTER_FILE__RW_BIT:
				if (resolve) return getRwBit();
				return basicGetRwBit();
			case ProcessorPackage.REGISTER_FILE__CLOCK:
				if (resolve) return getClock();
				return basicGetClock();
			case ProcessorPackage.REGISTER_FILE__REGISTERS:
				return getRegisters();
			case ProcessorPackage.REGISTER_FILE__IN_RF:
				if (resolve) return getInRf();
				return basicGetInRf();
			case ProcessorPackage.REGISTER_FILE__OUT_RF:
				if (resolve) return getOutRf();
				return basicGetOutRf();
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
			case ProcessorPackage.REGISTER_FILE__SEL:
				setSel((SeletorRegisterFile)newValue);
				return;
			case ProcessorPackage.REGISTER_FILE__RW_BIT:
				setRwBit((ReadWrite)newValue);
				return;
			case ProcessorPackage.REGISTER_FILE__CLOCK:
				setClock((Clock)newValue);
				return;
			case ProcessorPackage.REGISTER_FILE__REGISTERS:
				setRegisters((int[])newValue);
				return;
			case ProcessorPackage.REGISTER_FILE__IN_RF:
				setInRf((InputRegisterFile)newValue);
				return;
			case ProcessorPackage.REGISTER_FILE__OUT_RF:
				setOutRf((OutputRegisterFile)newValue);
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
			case ProcessorPackage.REGISTER_FILE__SEL:
				setSel((SeletorRegisterFile)null);
				return;
			case ProcessorPackage.REGISTER_FILE__RW_BIT:
				setRwBit((ReadWrite)null);
				return;
			case ProcessorPackage.REGISTER_FILE__CLOCK:
				setClock((Clock)null);
				return;
			case ProcessorPackage.REGISTER_FILE__REGISTERS:
				setRegisters(REGISTERS_EDEFAULT);
				return;
			case ProcessorPackage.REGISTER_FILE__IN_RF:
				setInRf((InputRegisterFile)null);
				return;
			case ProcessorPackage.REGISTER_FILE__OUT_RF:
				setOutRf((OutputRegisterFile)null);
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
			case ProcessorPackage.REGISTER_FILE__SEL:
				return sel != null;
			case ProcessorPackage.REGISTER_FILE__RW_BIT:
				return rwBit != null;
			case ProcessorPackage.REGISTER_FILE__CLOCK:
				return clock != null;
			case ProcessorPackage.REGISTER_FILE__REGISTERS:
				return REGISTERS_EDEFAULT == null ? registers != null : !REGISTERS_EDEFAULT.equals(registers);
			case ProcessorPackage.REGISTER_FILE__IN_RF:
				return inRf != null;
			case ProcessorPackage.REGISTER_FILE__OUT_RF:
				return outRf != null;
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
		result.append(" (registers: ");
		result.append(registers);
		result.append(')');
		return result.toString();
	}

} //RegisterFileImpl
