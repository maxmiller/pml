/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.ufrn.lasic.pml.impl;

import br.ufrn.lasic.pml.InitialMicroInstruction;
import br.ufrn.lasic.pml.Instructions;
import br.ufrn.lasic.pml.PMLPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instructions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.ufrn.lasic.pml.impl.InstructionsImpl#getType <em>Type</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.impl.InstructionsImpl#getName <em>Name</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.impl.InstructionsImpl#getInitial <em>Initial</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InstructionsImpl extends EObjectImpl implements Instructions {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

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
	 * The cached value of the '{@link #getInitial() <em>Initial</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitial()
	 * @generated
	 * @ordered
	 */
	protected InitialMicroInstruction initial;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstructionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PMLPackage.Literals.INSTRUCTIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PMLPackage.INSTRUCTIONS__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PMLPackage.INSTRUCTIONS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialMicroInstruction getInitial() {
		return initial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitial(InitialMicroInstruction newInitial, NotificationChain msgs) {
		InitialMicroInstruction oldInitial = initial;
		initial = newInitial;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PMLPackage.INSTRUCTIONS__INITIAL, oldInitial, newInitial);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitial(InitialMicroInstruction newInitial) {
		if (newInitial != initial) {
			NotificationChain msgs = null;
			if (initial != null)
				msgs = ((InternalEObject)initial).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PMLPackage.INSTRUCTIONS__INITIAL, null, msgs);
			if (newInitial != null)
				msgs = ((InternalEObject)newInitial).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PMLPackage.INSTRUCTIONS__INITIAL, null, msgs);
			msgs = basicSetInitial(newInitial, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PMLPackage.INSTRUCTIONS__INITIAL, newInitial, newInitial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PMLPackage.INSTRUCTIONS__INITIAL:
				return basicSetInitial(null, msgs);
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
			case PMLPackage.INSTRUCTIONS__TYPE:
				return getType();
			case PMLPackage.INSTRUCTIONS__NAME:
				return getName();
			case PMLPackage.INSTRUCTIONS__INITIAL:
				return getInitial();
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
			case PMLPackage.INSTRUCTIONS__TYPE:
				setType((String)newValue);
				return;
			case PMLPackage.INSTRUCTIONS__NAME:
				setName((String)newValue);
				return;
			case PMLPackage.INSTRUCTIONS__INITIAL:
				setInitial((InitialMicroInstruction)newValue);
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
			case PMLPackage.INSTRUCTIONS__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case PMLPackage.INSTRUCTIONS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PMLPackage.INSTRUCTIONS__INITIAL:
				setInitial((InitialMicroInstruction)null);
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
			case PMLPackage.INSTRUCTIONS__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case PMLPackage.INSTRUCTIONS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PMLPackage.INSTRUCTIONS__INITIAL:
				return initial != null;
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
		result.append(" (type: ");
		result.append(type);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //InstructionsImpl
