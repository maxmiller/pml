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
import processor.InputRegisterAssync;
import processor.Load;
import processor.OutputRegisterAssync;
import processor.ProcessorPackage;
import processor.RegisterAssyncReset;
import processor.Reset;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Register Assync Reset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link processor.impl.RegisterAssyncResetImpl#getInternalData <em>Internal Data</em>}</li>
 *   <li>{@link processor.impl.RegisterAssyncResetImpl#getOutRa <em>Out Ra</em>}</li>
 *   <li>{@link processor.impl.RegisterAssyncResetImpl#getInRa <em>In Ra</em>}</li>
 *   <li>{@link processor.impl.RegisterAssyncResetImpl#getReset <em>Reset</em>}</li>
 *   <li>{@link processor.impl.RegisterAssyncResetImpl#getClock <em>Clock</em>}</li>
 *   <li>{@link processor.impl.RegisterAssyncResetImpl#getLoad <em>Load</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RegisterAssyncResetImpl extends EObjectImpl implements RegisterAssyncReset {
	/**
	 * The default value of the '{@link #getInternalData() <em>Internal Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalData()
	 * @generated
	 * @ordered
	 */
	protected static final int INTERNAL_DATA_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getInternalData() <em>Internal Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalData()
	 * @generated
	 * @ordered
	 */
	protected int internalData = INTERNAL_DATA_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOutRa() <em>Out Ra</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutRa()
	 * @generated
	 * @ordered
	 */
	protected OutputRegisterAssync outRa;

	/**
	 * The cached value of the '{@link #getInRa() <em>In Ra</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInRa()
	 * @generated
	 * @ordered
	 */
	protected InputRegisterAssync inRa;

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
	 * The cached value of the '{@link #getLoad() <em>Load</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoad()
	 * @generated
	 * @ordered
	 */
	protected Load load;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegisterAssyncResetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProcessorPackage.Literals.REGISTER_ASSYNC_RESET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getInternalData() {
		return internalData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInternalData(int newInternalData) {
		int oldInternalData = internalData;
		internalData = newInternalData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessorPackage.REGISTER_ASSYNC_RESET__INTERNAL_DATA, oldInternalData, internalData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputRegisterAssync getOutRa() {
		if (outRa != null && outRa.eIsProxy()) {
			InternalEObject oldOutRa = (InternalEObject)outRa;
			outRa = (OutputRegisterAssync)eResolveProxy(oldOutRa);
			if (outRa != oldOutRa) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessorPackage.REGISTER_ASSYNC_RESET__OUT_RA, oldOutRa, outRa));
			}
		}
		return outRa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputRegisterAssync basicGetOutRa() {
		return outRa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutRa(OutputRegisterAssync newOutRa) {
		OutputRegisterAssync oldOutRa = outRa;
		outRa = newOutRa;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessorPackage.REGISTER_ASSYNC_RESET__OUT_RA, oldOutRa, outRa));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputRegisterAssync getInRa() {
		if (inRa != null && inRa.eIsProxy()) {
			InternalEObject oldInRa = (InternalEObject)inRa;
			inRa = (InputRegisterAssync)eResolveProxy(oldInRa);
			if (inRa != oldInRa) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessorPackage.REGISTER_ASSYNC_RESET__IN_RA, oldInRa, inRa));
			}
		}
		return inRa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputRegisterAssync basicGetInRa() {
		return inRa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInRa(InputRegisterAssync newInRa) {
		InputRegisterAssync oldInRa = inRa;
		inRa = newInRa;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessorPackage.REGISTER_ASSYNC_RESET__IN_RA, oldInRa, inRa));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessorPackage.REGISTER_ASSYNC_RESET__RESET, oldReset, reset));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessorPackage.REGISTER_ASSYNC_RESET__RESET, oldReset, reset));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessorPackage.REGISTER_ASSYNC_RESET__CLOCK, oldClock, clock));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessorPackage.REGISTER_ASSYNC_RESET__CLOCK, oldClock, clock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Load getLoad() {
		if (load != null && load.eIsProxy()) {
			InternalEObject oldLoad = (InternalEObject)load;
			load = (Load)eResolveProxy(oldLoad);
			if (load != oldLoad) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessorPackage.REGISTER_ASSYNC_RESET__LOAD, oldLoad, load));
			}
		}
		return load;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Load basicGetLoad() {
		return load;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoad(Load newLoad) {
		Load oldLoad = load;
		load = newLoad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessorPackage.REGISTER_ASSYNC_RESET__LOAD, oldLoad, load));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void RegisterBehaviour() {
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
			case ProcessorPackage.REGISTER_ASSYNC_RESET__INTERNAL_DATA:
				return getInternalData();
			case ProcessorPackage.REGISTER_ASSYNC_RESET__OUT_RA:
				if (resolve) return getOutRa();
				return basicGetOutRa();
			case ProcessorPackage.REGISTER_ASSYNC_RESET__IN_RA:
				if (resolve) return getInRa();
				return basicGetInRa();
			case ProcessorPackage.REGISTER_ASSYNC_RESET__RESET:
				if (resolve) return getReset();
				return basicGetReset();
			case ProcessorPackage.REGISTER_ASSYNC_RESET__CLOCK:
				if (resolve) return getClock();
				return basicGetClock();
			case ProcessorPackage.REGISTER_ASSYNC_RESET__LOAD:
				if (resolve) return getLoad();
				return basicGetLoad();
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
			case ProcessorPackage.REGISTER_ASSYNC_RESET__INTERNAL_DATA:
				setInternalData((Integer)newValue);
				return;
			case ProcessorPackage.REGISTER_ASSYNC_RESET__OUT_RA:
				setOutRa((OutputRegisterAssync)newValue);
				return;
			case ProcessorPackage.REGISTER_ASSYNC_RESET__IN_RA:
				setInRa((InputRegisterAssync)newValue);
				return;
			case ProcessorPackage.REGISTER_ASSYNC_RESET__RESET:
				setReset((Reset)newValue);
				return;
			case ProcessorPackage.REGISTER_ASSYNC_RESET__CLOCK:
				setClock((Clock)newValue);
				return;
			case ProcessorPackage.REGISTER_ASSYNC_RESET__LOAD:
				setLoad((Load)newValue);
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
			case ProcessorPackage.REGISTER_ASSYNC_RESET__INTERNAL_DATA:
				setInternalData(INTERNAL_DATA_EDEFAULT);
				return;
			case ProcessorPackage.REGISTER_ASSYNC_RESET__OUT_RA:
				setOutRa((OutputRegisterAssync)null);
				return;
			case ProcessorPackage.REGISTER_ASSYNC_RESET__IN_RA:
				setInRa((InputRegisterAssync)null);
				return;
			case ProcessorPackage.REGISTER_ASSYNC_RESET__RESET:
				setReset((Reset)null);
				return;
			case ProcessorPackage.REGISTER_ASSYNC_RESET__CLOCK:
				setClock((Clock)null);
				return;
			case ProcessorPackage.REGISTER_ASSYNC_RESET__LOAD:
				setLoad((Load)null);
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
			case ProcessorPackage.REGISTER_ASSYNC_RESET__INTERNAL_DATA:
				return internalData != INTERNAL_DATA_EDEFAULT;
			case ProcessorPackage.REGISTER_ASSYNC_RESET__OUT_RA:
				return outRa != null;
			case ProcessorPackage.REGISTER_ASSYNC_RESET__IN_RA:
				return inRa != null;
			case ProcessorPackage.REGISTER_ASSYNC_RESET__RESET:
				return reset != null;
			case ProcessorPackage.REGISTER_ASSYNC_RESET__CLOCK:
				return clock != null;
			case ProcessorPackage.REGISTER_ASSYNC_RESET__LOAD:
				return load != null;
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
		result.append(" (internalData: ");
		result.append(internalData);
		result.append(')');
		return result.toString();
	}

} //RegisterAssyncResetImpl
