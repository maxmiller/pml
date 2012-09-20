/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.ufrn.lasic.pml.impl;

import br.ufrn.lasic.pml.Input;
import br.ufrn.lasic.pml.Output;
import br.ufrn.lasic.pml.PMLPackage;
import br.ufrn.lasic.pml.TypeData;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.ufrn.lasic.pml.impl.InputImpl#getName <em>Name</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.impl.InputImpl#getType <em>Type</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.impl.InputImpl#getLength <em>Length</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.impl.InputImpl#getInout <em>Inout</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.impl.InputImpl#isSensitive <em>Sensitive</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InputImpl extends EObjectImpl implements Input {
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
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected static final int LENGTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected int length = LENGTH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInout() <em>Inout</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInout()
	 * @generated
	 * @ordered
	 */
	protected Output inout;

	/**
	 * The default value of the '{@link #isSensitive() <em>Sensitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSensitive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SENSITIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSensitive() <em>Sensitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSensitive()
	 * @generated
	 * @ordered
	 */
	protected boolean sensitive = SENSITIVE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PMLPackage.Literals.INPUT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PMLPackage.INPUT__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PMLPackage.INPUT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLength(int newLength) {
		int oldLength = length;
		length = newLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PMLPackage.INPUT__LENGTH, oldLength, length));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Output getInout() {
		if (inout != null && inout.eIsProxy()) {
			InternalEObject oldInout = (InternalEObject)inout;
			inout = (Output)eResolveProxy(oldInout);
			if (inout != oldInout) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PMLPackage.INPUT__INOUT, oldInout, inout));
			}
		}
		return inout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Output basicGetInout() {
		return inout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInout(Output newInout) {
		Output oldInout = inout;
		inout = newInout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PMLPackage.INPUT__INOUT, oldInout, inout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSensitive() {
		return sensitive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSensitive(boolean newSensitive) {
		boolean oldSensitive = sensitive;
		sensitive = newSensitive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PMLPackage.INPUT__SENSITIVE, oldSensitive, sensitive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PMLPackage.INPUT__NAME:
				return getName();
			case PMLPackage.INPUT__TYPE:
				return getType();
			case PMLPackage.INPUT__LENGTH:
				return getLength();
			case PMLPackage.INPUT__INOUT:
				if (resolve) return getInout();
				return basicGetInout();
			case PMLPackage.INPUT__SENSITIVE:
				return isSensitive();
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
			case PMLPackage.INPUT__NAME:
				setName((String)newValue);
				return;
			case PMLPackage.INPUT__TYPE:
				setType((TypeData)newValue);
				return;
			case PMLPackage.INPUT__LENGTH:
				setLength((Integer)newValue);
				return;
			case PMLPackage.INPUT__INOUT:
				setInout((Output)newValue);
				return;
			case PMLPackage.INPUT__SENSITIVE:
				setSensitive((Boolean)newValue);
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
			case PMLPackage.INPUT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PMLPackage.INPUT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case PMLPackage.INPUT__LENGTH:
				setLength(LENGTH_EDEFAULT);
				return;
			case PMLPackage.INPUT__INOUT:
				setInout((Output)null);
				return;
			case PMLPackage.INPUT__SENSITIVE:
				setSensitive(SENSITIVE_EDEFAULT);
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
			case PMLPackage.INPUT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PMLPackage.INPUT__TYPE:
				return type != TYPE_EDEFAULT;
			case PMLPackage.INPUT__LENGTH:
				return length != LENGTH_EDEFAULT;
			case PMLPackage.INPUT__INOUT:
				return inout != null;
			case PMLPackage.INPUT__SENSITIVE:
				return sensitive != SENSITIVE_EDEFAULT;
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
		result.append(", length: ");
		result.append(length);
		result.append(", sensitive: ");
		result.append(sensitive);
		result.append(')');
		return result.toString();
	}

} //InputImpl
