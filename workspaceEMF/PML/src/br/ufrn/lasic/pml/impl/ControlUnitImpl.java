/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.ufrn.lasic.pml.impl;

import br.ufrn.lasic.pml.Behavior;
import br.ufrn.lasic.pml.ControlUnit;
import br.ufrn.lasic.pml.Input;
import br.ufrn.lasic.pml.Instructions;
import br.ufrn.lasic.pml.Output;
import br.ufrn.lasic.pml.PMLPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.ufrn.lasic.pml.impl.ControlUnitImpl#getBehaviorsControlUnit <em>Behaviors Control Unit</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.impl.ControlUnitImpl#getInputsControlUnit <em>Inputs Control Unit</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.impl.ControlUnitImpl#getOutputsControlUnit <em>Outputs Control Unit</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.impl.ControlUnitImpl#getName <em>Name</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.impl.ControlUnitImpl#getIntructions <em>Intructions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ControlUnitImpl extends EObjectImpl implements ControlUnit {
	/**
	 * The cached value of the '{@link #getBehaviorsControlUnit() <em>Behaviors Control Unit</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviorsControlUnit()
	 * @generated
	 * @ordered
	 */
	protected EList<Behavior> behaviorsControlUnit;

	/**
	 * The cached value of the '{@link #getInputsControlUnit() <em>Inputs Control Unit</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputsControlUnit()
	 * @generated
	 * @ordered
	 */
	protected EList<Input> inputsControlUnit;

	/**
	 * The cached value of the '{@link #getOutputsControlUnit() <em>Outputs Control Unit</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputsControlUnit()
	 * @generated
	 * @ordered
	 */
	protected EList<Output> outputsControlUnit;

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
	 * The cached value of the '{@link #getIntructions() <em>Intructions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntructions()
	 * @generated
	 * @ordered
	 */
	protected EList<Instructions> intructions;

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
		return PMLPackage.Literals.CONTROL_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Behavior> getBehaviorsControlUnit() {
		if (behaviorsControlUnit == null) {
			behaviorsControlUnit = new EObjectContainmentEList<Behavior>(Behavior.class, this, PMLPackage.CONTROL_UNIT__BEHAVIORS_CONTROL_UNIT);
		}
		return behaviorsControlUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Input> getInputsControlUnit() {
		if (inputsControlUnit == null) {
			inputsControlUnit = new EObjectContainmentEList<Input>(Input.class, this, PMLPackage.CONTROL_UNIT__INPUTS_CONTROL_UNIT);
		}
		return inputsControlUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Output> getOutputsControlUnit() {
		if (outputsControlUnit == null) {
			outputsControlUnit = new EObjectContainmentEList<Output>(Output.class, this, PMLPackage.CONTROL_UNIT__OUTPUTS_CONTROL_UNIT);
		}
		return outputsControlUnit;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PMLPackage.CONTROL_UNIT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Instructions> getIntructions() {
		if (intructions == null) {
			intructions = new EObjectContainmentEList<Instructions>(Instructions.class, this, PMLPackage.CONTROL_UNIT__INTRUCTIONS);
		}
		return intructions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PMLPackage.CONTROL_UNIT__BEHAVIORS_CONTROL_UNIT:
				return ((InternalEList<?>)getBehaviorsControlUnit()).basicRemove(otherEnd, msgs);
			case PMLPackage.CONTROL_UNIT__INPUTS_CONTROL_UNIT:
				return ((InternalEList<?>)getInputsControlUnit()).basicRemove(otherEnd, msgs);
			case PMLPackage.CONTROL_UNIT__OUTPUTS_CONTROL_UNIT:
				return ((InternalEList<?>)getOutputsControlUnit()).basicRemove(otherEnd, msgs);
			case PMLPackage.CONTROL_UNIT__INTRUCTIONS:
				return ((InternalEList<?>)getIntructions()).basicRemove(otherEnd, msgs);
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
			case PMLPackage.CONTROL_UNIT__BEHAVIORS_CONTROL_UNIT:
				return getBehaviorsControlUnit();
			case PMLPackage.CONTROL_UNIT__INPUTS_CONTROL_UNIT:
				return getInputsControlUnit();
			case PMLPackage.CONTROL_UNIT__OUTPUTS_CONTROL_UNIT:
				return getOutputsControlUnit();
			case PMLPackage.CONTROL_UNIT__NAME:
				return getName();
			case PMLPackage.CONTROL_UNIT__INTRUCTIONS:
				return getIntructions();
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
			case PMLPackage.CONTROL_UNIT__BEHAVIORS_CONTROL_UNIT:
				getBehaviorsControlUnit().clear();
				getBehaviorsControlUnit().addAll((Collection<? extends Behavior>)newValue);
				return;
			case PMLPackage.CONTROL_UNIT__INPUTS_CONTROL_UNIT:
				getInputsControlUnit().clear();
				getInputsControlUnit().addAll((Collection<? extends Input>)newValue);
				return;
			case PMLPackage.CONTROL_UNIT__OUTPUTS_CONTROL_UNIT:
				getOutputsControlUnit().clear();
				getOutputsControlUnit().addAll((Collection<? extends Output>)newValue);
				return;
			case PMLPackage.CONTROL_UNIT__NAME:
				setName((String)newValue);
				return;
			case PMLPackage.CONTROL_UNIT__INTRUCTIONS:
				getIntructions().clear();
				getIntructions().addAll((Collection<? extends Instructions>)newValue);
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
			case PMLPackage.CONTROL_UNIT__BEHAVIORS_CONTROL_UNIT:
				getBehaviorsControlUnit().clear();
				return;
			case PMLPackage.CONTROL_UNIT__INPUTS_CONTROL_UNIT:
				getInputsControlUnit().clear();
				return;
			case PMLPackage.CONTROL_UNIT__OUTPUTS_CONTROL_UNIT:
				getOutputsControlUnit().clear();
				return;
			case PMLPackage.CONTROL_UNIT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PMLPackage.CONTROL_UNIT__INTRUCTIONS:
				getIntructions().clear();
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
			case PMLPackage.CONTROL_UNIT__BEHAVIORS_CONTROL_UNIT:
				return behaviorsControlUnit != null && !behaviorsControlUnit.isEmpty();
			case PMLPackage.CONTROL_UNIT__INPUTS_CONTROL_UNIT:
				return inputsControlUnit != null && !inputsControlUnit.isEmpty();
			case PMLPackage.CONTROL_UNIT__OUTPUTS_CONTROL_UNIT:
				return outputsControlUnit != null && !outputsControlUnit.isEmpty();
			case PMLPackage.CONTROL_UNIT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PMLPackage.CONTROL_UNIT__INTRUCTIONS:
				return intructions != null && !intructions.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //ControlUnitImpl
