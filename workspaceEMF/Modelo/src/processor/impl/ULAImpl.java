/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package processor.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import processor.Operation;
import processor.OutputULA;
import processor.ProcessorPackage;
import processor.SeletorRegisterFile;
import processor.SeletorULA;
import processor.Status;
import processor.ULA;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ULA</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link processor.impl.ULAImpl#getOpSel <em>Op Sel</em>}</li>
 *   <li>{@link processor.impl.ULAImpl#getUlastatus <em>Ulastatus</em>}</li>
 *   <li>{@link processor.impl.ULAImpl#getOperations <em>Operations</em>}</li>
 *   <li>{@link processor.impl.ULAImpl#getOpSelUla <em>Op Sel Ula</em>}</li>
 *   <li>{@link processor.impl.ULAImpl#getUlaOut <em>Ula Out</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ULAImpl extends EObjectImpl implements ULA {
	/**
	 * The cached value of the '{@link #getOpSel() <em>Op Sel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpSel()
	 * @generated
	 * @ordered
	 */
	protected SeletorRegisterFile opSel;

	/**
	 * The cached value of the '{@link #getUlastatus() <em>Ulastatus</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUlastatus()
	 * @generated
	 * @ordered
	 */
	protected Status ulastatus;

	/**
	 * The cached value of the '{@link #getOperations() <em>Operations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> operations;

	/**
	 * The cached value of the '{@link #getOpSelUla() <em>Op Sel Ula</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpSelUla()
	 * @generated
	 * @ordered
	 */
	protected SeletorULA opSelUla;

	/**
	 * The cached value of the '{@link #getUlaOut() <em>Ula Out</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUlaOut()
	 * @generated
	 * @ordered
	 */
	protected OutputULA ulaOut;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ULAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProcessorPackage.Literals.ULA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeletorRegisterFile getOpSel() {
		return opSel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOpSel(SeletorRegisterFile newOpSel, NotificationChain msgs) {
		SeletorRegisterFile oldOpSel = opSel;
		opSel = newOpSel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessorPackage.ULA__OP_SEL, oldOpSel, newOpSel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpSel(SeletorRegisterFile newOpSel) {
		if (newOpSel != opSel) {
			NotificationChain msgs = null;
			if (opSel != null)
				msgs = ((InternalEObject)opSel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessorPackage.ULA__OP_SEL, null, msgs);
			if (newOpSel != null)
				msgs = ((InternalEObject)newOpSel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessorPackage.ULA__OP_SEL, null, msgs);
			msgs = basicSetOpSel(newOpSel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessorPackage.ULA__OP_SEL, newOpSel, newOpSel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Status getUlastatus() {
		if (ulastatus != null && ulastatus.eIsProxy()) {
			InternalEObject oldUlastatus = (InternalEObject)ulastatus;
			ulastatus = (Status)eResolveProxy(oldUlastatus);
			if (ulastatus != oldUlastatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessorPackage.ULA__ULASTATUS, oldUlastatus, ulastatus));
			}
		}
		return ulastatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Status basicGetUlastatus() {
		return ulastatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUlastatus(Status newUlastatus) {
		Status oldUlastatus = ulastatus;
		ulastatus = newUlastatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessorPackage.ULA__ULASTATUS, oldUlastatus, ulastatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getOperations() {
		if (operations == null) {
			operations = new EObjectResolvingEList<Operation>(Operation.class, this, ProcessorPackage.ULA__OPERATIONS);
		}
		return operations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeletorULA getOpSelUla() {
		if (opSelUla != null && opSelUla.eIsProxy()) {
			InternalEObject oldOpSelUla = (InternalEObject)opSelUla;
			opSelUla = (SeletorULA)eResolveProxy(oldOpSelUla);
			if (opSelUla != oldOpSelUla) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessorPackage.ULA__OP_SEL_ULA, oldOpSelUla, opSelUla));
			}
		}
		return opSelUla;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeletorULA basicGetOpSelUla() {
		return opSelUla;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpSelUla(SeletorULA newOpSelUla) {
		SeletorULA oldOpSelUla = opSelUla;
		opSelUla = newOpSelUla;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessorPackage.ULA__OP_SEL_ULA, oldOpSelUla, opSelUla));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputULA getUlaOut() {
		if (ulaOut != null && ulaOut.eIsProxy()) {
			InternalEObject oldUlaOut = (InternalEObject)ulaOut;
			ulaOut = (OutputULA)eResolveProxy(oldUlaOut);
			if (ulaOut != oldUlaOut) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessorPackage.ULA__ULA_OUT, oldUlaOut, ulaOut));
			}
		}
		return ulaOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputULA basicGetUlaOut() {
		return ulaOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUlaOut(OutputULA newUlaOut) {
		OutputULA oldUlaOut = ulaOut;
		ulaOut = newUlaOut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessorPackage.ULA__ULA_OUT, oldUlaOut, ulaOut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void ULABehavior() {
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProcessorPackage.ULA__OP_SEL:
				return basicSetOpSel(null, msgs);
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
			case ProcessorPackage.ULA__OP_SEL:
				return getOpSel();
			case ProcessorPackage.ULA__ULASTATUS:
				if (resolve) return getUlastatus();
				return basicGetUlastatus();
			case ProcessorPackage.ULA__OPERATIONS:
				return getOperations();
			case ProcessorPackage.ULA__OP_SEL_ULA:
				if (resolve) return getOpSelUla();
				return basicGetOpSelUla();
			case ProcessorPackage.ULA__ULA_OUT:
				if (resolve) return getUlaOut();
				return basicGetUlaOut();
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
			case ProcessorPackage.ULA__OP_SEL:
				setOpSel((SeletorRegisterFile)newValue);
				return;
			case ProcessorPackage.ULA__ULASTATUS:
				setUlastatus((Status)newValue);
				return;
			case ProcessorPackage.ULA__OPERATIONS:
				getOperations().clear();
				getOperations().addAll((Collection<? extends Operation>)newValue);
				return;
			case ProcessorPackage.ULA__OP_SEL_ULA:
				setOpSelUla((SeletorULA)newValue);
				return;
			case ProcessorPackage.ULA__ULA_OUT:
				setUlaOut((OutputULA)newValue);
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
			case ProcessorPackage.ULA__OP_SEL:
				setOpSel((SeletorRegisterFile)null);
				return;
			case ProcessorPackage.ULA__ULASTATUS:
				setUlastatus((Status)null);
				return;
			case ProcessorPackage.ULA__OPERATIONS:
				getOperations().clear();
				return;
			case ProcessorPackage.ULA__OP_SEL_ULA:
				setOpSelUla((SeletorULA)null);
				return;
			case ProcessorPackage.ULA__ULA_OUT:
				setUlaOut((OutputULA)null);
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
			case ProcessorPackage.ULA__OP_SEL:
				return opSel != null;
			case ProcessorPackage.ULA__ULASTATUS:
				return ulastatus != null;
			case ProcessorPackage.ULA__OPERATIONS:
				return operations != null && !operations.isEmpty();
			case ProcessorPackage.ULA__OP_SEL_ULA:
				return opSelUla != null;
			case ProcessorPackage.ULA__ULA_OUT:
				return ulaOut != null;
		}
		return super.eIsSet(featureID);
	}

} //ULAImpl
