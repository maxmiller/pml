/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.ufrn.lasic.pml.impl;

import br.ufrn.lasic.pml.Behavior;
import br.ufrn.lasic.pml.PMLPackage;
import br.ufrn.lasic.pml.TypeData;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavior</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.ufrn.lasic.pml.impl.BehaviorImpl#getName <em>Name</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.impl.BehaviorImpl#getTypeBehavior <em>Type Behavior</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BehaviorImpl extends EObjectImpl implements Behavior {
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
	 * The default value of the '{@link #getTypeBehavior() <em>Type Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeBehavior()
	 * @generated
	 * @ordered
	 */
	protected static final TypeData TYPE_BEHAVIOR_EDEFAULT = TypeData.BINARY;

	/**
	 * The cached value of the '{@link #getTypeBehavior() <em>Type Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeBehavior()
	 * @generated
	 * @ordered
	 */
	protected TypeData typeBehavior = TYPE_BEHAVIOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehaviorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PMLPackage.Literals.BEHAVIOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PMLPackage.BEHAVIOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeData getTypeBehavior() {
		return typeBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeBehavior(TypeData newTypeBehavior) {
		TypeData oldTypeBehavior = typeBehavior;
		typeBehavior = newTypeBehavior == null ? TYPE_BEHAVIOR_EDEFAULT : newTypeBehavior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PMLPackage.BEHAVIOR__TYPE_BEHAVIOR, oldTypeBehavior, typeBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PMLPackage.BEHAVIOR__NAME:
				return getName();
			case PMLPackage.BEHAVIOR__TYPE_BEHAVIOR:
				return getTypeBehavior();
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
			case PMLPackage.BEHAVIOR__NAME:
				setName((String)newValue);
				return;
			case PMLPackage.BEHAVIOR__TYPE_BEHAVIOR:
				setTypeBehavior((TypeData)newValue);
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
			case PMLPackage.BEHAVIOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PMLPackage.BEHAVIOR__TYPE_BEHAVIOR:
				setTypeBehavior(TYPE_BEHAVIOR_EDEFAULT);
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
			case PMLPackage.BEHAVIOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PMLPackage.BEHAVIOR__TYPE_BEHAVIOR:
				return typeBehavior != TYPE_BEHAVIOR_EDEFAULT;
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
		result.append(", typeBehavior: ");
		result.append(typeBehavior);
		result.append(')');
		return result.toString();
	}

} //BehaviorImpl
