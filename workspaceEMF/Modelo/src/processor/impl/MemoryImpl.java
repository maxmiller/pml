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

import processor.AddressMemory;
import processor.Clock;
import processor.InputMemory;
import processor.Memory;
import processor.OutputMemory;
import processor.ProcessorPackage;
import processor.Reset;
import processor.Write;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Memory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link processor.impl.MemoryImpl#getMem <em>Mem</em>}</li>
 *   <li>{@link processor.impl.MemoryImpl#getWrite <em>Write</em>}</li>
 *   <li>{@link processor.impl.MemoryImpl#getReset <em>Reset</em>}</li>
 *   <li>{@link processor.impl.MemoryImpl#getClock <em>Clock</em>}</li>
 *   <li>{@link processor.impl.MemoryImpl#getDatai <em>Datai</em>}</li>
 *   <li>{@link processor.impl.MemoryImpl#getDatao <em>Datao</em>}</li>
 *   <li>{@link processor.impl.MemoryImpl#getAddress <em>Address</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MemoryImpl extends EObjectImpl implements Memory {
	/**
	 * The default value of the '{@link #getMem() <em>Mem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMem()
	 * @generated
	 * @ordered
	 */
	protected static final int[] MEM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMem() <em>Mem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMem()
	 * @generated
	 * @ordered
	 */
	protected int[] mem = MEM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWrite() <em>Write</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrite()
	 * @generated
	 * @ordered
	 */
	protected Write write;

	/**
	 * The cached value of the '{@link #getReset() <em>Reset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReset()
	 * @generated
	 * @ordered
	 */
	protected Reset reset;

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
	 * The cached value of the '{@link #getDatai() <em>Datai</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatai()
	 * @generated
	 * @ordered
	 */
	protected InputMemory datai;

	/**
	 * The cached value of the '{@link #getDatao() <em>Datao</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatao()
	 * @generated
	 * @ordered
	 */
	protected OutputMemory datao;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected AddressMemory address;

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
		return ProcessorPackage.Literals.MEMORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int[] getMem() {
		return mem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMem(int[] newMem) {
		int[] oldMem = mem;
		mem = newMem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessorPackage.MEMORY__MEM, oldMem, mem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Write getWrite() {
		if (write != null && write.eIsProxy()) {
			InternalEObject oldWrite = (InternalEObject)write;
			write = (Write)eResolveProxy(oldWrite);
			if (write != oldWrite) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessorPackage.MEMORY__WRITE, oldWrite, write));
			}
		}
		return write;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Write basicGetWrite() {
		return write;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWrite(Write newWrite) {
		Write oldWrite = write;
		write = newWrite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessorPackage.MEMORY__WRITE, oldWrite, write));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reset getReset() {
		if (reset != null && reset.eIsProxy()) {
			InternalEObject oldReset = (InternalEObject)reset;
			reset = (Reset)eResolveProxy(oldReset);
			if (reset != oldReset) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessorPackage.MEMORY__RESET, oldReset, reset));
			}
		}
		return reset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reset basicGetReset() {
		return reset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReset(Reset newReset) {
		Reset oldReset = reset;
		reset = newReset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessorPackage.MEMORY__RESET, oldReset, reset));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessorPackage.MEMORY__CLOCK, oldClock, clock));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessorPackage.MEMORY__CLOCK, oldClock, clock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputMemory getDatai() {
		if (datai != null && datai.eIsProxy()) {
			InternalEObject oldDatai = (InternalEObject)datai;
			datai = (InputMemory)eResolveProxy(oldDatai);
			if (datai != oldDatai) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessorPackage.MEMORY__DATAI, oldDatai, datai));
			}
		}
		return datai;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputMemory basicGetDatai() {
		return datai;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatai(InputMemory newDatai) {
		InputMemory oldDatai = datai;
		datai = newDatai;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessorPackage.MEMORY__DATAI, oldDatai, datai));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputMemory getDatao() {
		if (datao != null && datao.eIsProxy()) {
			InternalEObject oldDatao = (InternalEObject)datao;
			datao = (OutputMemory)eResolveProxy(oldDatao);
			if (datao != oldDatao) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessorPackage.MEMORY__DATAO, oldDatao, datao));
			}
		}
		return datao;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputMemory basicGetDatao() {
		return datao;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatao(OutputMemory newDatao) {
		OutputMemory oldDatao = datao;
		datao = newDatao;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessorPackage.MEMORY__DATAO, oldDatao, datao));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressMemory getAddress() {
		if (address != null && address.eIsProxy()) {
			InternalEObject oldAddress = (InternalEObject)address;
			address = (AddressMemory)eResolveProxy(oldAddress);
			if (address != oldAddress) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessorPackage.MEMORY__ADDRESS, oldAddress, address));
			}
		}
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressMemory basicGetAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(AddressMemory newAddress) {
		AddressMemory oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessorPackage.MEMORY__ADDRESS, oldAddress, address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void t_sync_mem() {
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
			case ProcessorPackage.MEMORY__MEM:
				return getMem();
			case ProcessorPackage.MEMORY__WRITE:
				if (resolve) return getWrite();
				return basicGetWrite();
			case ProcessorPackage.MEMORY__RESET:
				if (resolve) return getReset();
				return basicGetReset();
			case ProcessorPackage.MEMORY__CLOCK:
				if (resolve) return getClock();
				return basicGetClock();
			case ProcessorPackage.MEMORY__DATAI:
				if (resolve) return getDatai();
				return basicGetDatai();
			case ProcessorPackage.MEMORY__DATAO:
				if (resolve) return getDatao();
				return basicGetDatao();
			case ProcessorPackage.MEMORY__ADDRESS:
				if (resolve) return getAddress();
				return basicGetAddress();
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
			case ProcessorPackage.MEMORY__MEM:
				setMem((int[])newValue);
				return;
			case ProcessorPackage.MEMORY__WRITE:
				setWrite((Write)newValue);
				return;
			case ProcessorPackage.MEMORY__RESET:
				setReset((Reset)newValue);
				return;
			case ProcessorPackage.MEMORY__CLOCK:
				setClock((Clock)newValue);
				return;
			case ProcessorPackage.MEMORY__DATAI:
				setDatai((InputMemory)newValue);
				return;
			case ProcessorPackage.MEMORY__DATAO:
				setDatao((OutputMemory)newValue);
				return;
			case ProcessorPackage.MEMORY__ADDRESS:
				setAddress((AddressMemory)newValue);
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
			case ProcessorPackage.MEMORY__MEM:
				setMem(MEM_EDEFAULT);
				return;
			case ProcessorPackage.MEMORY__WRITE:
				setWrite((Write)null);
				return;
			case ProcessorPackage.MEMORY__RESET:
				setReset((Reset)null);
				return;
			case ProcessorPackage.MEMORY__CLOCK:
				setClock((Clock)null);
				return;
			case ProcessorPackage.MEMORY__DATAI:
				setDatai((InputMemory)null);
				return;
			case ProcessorPackage.MEMORY__DATAO:
				setDatao((OutputMemory)null);
				return;
			case ProcessorPackage.MEMORY__ADDRESS:
				setAddress((AddressMemory)null);
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
			case ProcessorPackage.MEMORY__MEM:
				return MEM_EDEFAULT == null ? mem != null : !MEM_EDEFAULT.equals(mem);
			case ProcessorPackage.MEMORY__WRITE:
				return write != null;
			case ProcessorPackage.MEMORY__RESET:
				return reset != null;
			case ProcessorPackage.MEMORY__CLOCK:
				return clock != null;
			case ProcessorPackage.MEMORY__DATAI:
				return datai != null;
			case ProcessorPackage.MEMORY__DATAO:
				return datao != null;
			case ProcessorPackage.MEMORY__ADDRESS:
				return address != null;
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
		result.append(" (mem: ");
		result.append(mem);
		result.append(')');
		return result.toString();
	}

} //MemoryImpl
