/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.ufrn.lasic.pml.impl;

import br.ufrn.lasic.pml.PMLPackage;
import br.ufrn.lasic.pml.Seletor;
import br.ufrn.lasic.pml.TypeData;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Seletor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.ufrn.lasic.pml.impl.SeletorImpl#getName <em>Name</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.impl.SeletorImpl#getType <em>Type</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.impl.SeletorImpl#getLengh <em>Lengh</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.impl.SeletorImpl#getBit <em>Bit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SeletorImpl extends EObjectImpl implements Seletor {
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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeData TYPE_EDEFAULT = TypeData.BINARY;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeData type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLengh() <em>Lengh</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLengh()
	 * @generated
	 * @ordered
	 */
	protected static final int LENGH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLengh() <em>Lengh</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLengh()
	 * @generated
	 * @ordered
	 */
	protected int lengh = LENGH_EDEFAULT;

	/**
	 * The default value of the '{@link #getBit() <em>Bit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBit()
	 * @generated
	 * @ordered
	 */
	protected static final int BIT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBit() <em>Bit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBit()
	 * @generated
	 * @ordered
	 */
	protected int bit = BIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SeletorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PMLPackage.Literals.SELETOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PMLPackage.SELETOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeData getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeData newType) {
		TypeData oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PMLPackage.SELETOR__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLengh() {
		return lengh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLengh(int newLengh) {
		int oldLengh = lengh;
		lengh = newLengh;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PMLPackage.SELETOR__LENGH, oldLengh, lengh));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBit() {
		return bit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBit(int newBit) {
		int oldBit = bit;
		bit = newBit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PMLPackage.SELETOR__BIT, oldBit, bit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PMLPackage.SELETOR__NAME:
				return getName();
			case PMLPackage.SELETOR__TYPE:
				return getType();
			case PMLPackage.SELETOR__LENGH:
				return getLengh();
			case PMLPackage.SELETOR__BIT:
				return getBit();
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
			case PMLPackage.SELETOR__NAME:
				setName((String)newValue);
				return;
			case PMLPackage.SELETOR__TYPE:
				setType((TypeData)newValue);
				return;
			case PMLPackage.SELETOR__LENGH:
				setLengh((Integer)newValue);
				return;
			case PMLPackage.SELETOR__BIT:
				setBit((Integer)newValue);
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
			case PMLPackage.SELETOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PMLPackage.SELETOR__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case PMLPackage.SELETOR__LENGH:
				setLengh(LENGH_EDEFAULT);
				return;
			case PMLPackage.SELETOR__BIT:
				setBit(BIT_EDEFAULT);
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
			case PMLPackage.SELETOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PMLPackage.SELETOR__TYPE:
				return type != TYPE_EDEFAULT;
			case PMLPackage.SELETOR__LENGH:
				return lengh != LENGH_EDEFAULT;
			case PMLPackage.SELETOR__BIT:
				return bit != BIT_EDEFAULT;
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
		result.append(", type: ");
		result.append(type);
		result.append(", lengh: ");
		result.append(lengh);
		result.append(", bit: ");
		result.append(bit);
		result.append(')');
		return result.toString();
	}

} //SeletorImpl
