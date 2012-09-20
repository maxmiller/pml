/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.ufrn.lasic.pml.impl;

import br.ufrn.lasic.pml.Behavior;
import br.ufrn.lasic.pml.Input;
import br.ufrn.lasic.pml.Operation;
import br.ufrn.lasic.pml.Output;
import br.ufrn.lasic.pml.PMLPackage;
import br.ufrn.lasic.pml.Seletor;
import br.ufrn.lasic.pml.ULA;

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
 * An implementation of the model object '<em><b>ULA</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.ufrn.lasic.pml.impl.ULAImpl#getName <em>Name</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.impl.ULAImpl#getBehavirosULA <em>Behaviros ULA</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.impl.ULAImpl#getOutputsULA <em>Outputs ULA</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.impl.ULAImpl#getInputsULA <em>Inputs ULA</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.impl.ULAImpl#getOperationsULA <em>Operations ULA</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.impl.ULAImpl#getSeletorULA <em>Seletor ULA</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ULAImpl extends EObjectImpl implements ULA {
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
	 * The cached value of the '{@link #getBehavirosULA() <em>Behaviros ULA</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehavirosULA()
	 * @generated
	 * @ordered
	 */
	protected EList<Behavior> behavirosULA;

	/**
	 * The cached value of the '{@link #getOutputsULA() <em>Outputs ULA</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputsULA()
	 * @generated
	 * @ordered
	 */
	protected EList<Output> outputsULA;

	/**
	 * The cached value of the '{@link #getInputsULA() <em>Inputs ULA</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputsULA()
	 * @generated
	 * @ordered
	 */
	protected EList<Input> inputsULA;

	/**
	 * The cached value of the '{@link #getOperationsULA() <em>Operations ULA</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationsULA()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> operationsULA;

	/**
	 * The cached value of the '{@link #getSeletorULA() <em>Seletor ULA</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeletorULA()
	 * @generated
	 * @ordered
	 */
	protected Seletor seletorULA;

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
		return PMLPackage.Literals.ULA;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PMLPackage.ULA__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Behavior> getBehavirosULA() {
		if (behavirosULA == null) {
			behavirosULA = new EObjectContainmentEList<Behavior>(Behavior.class, this, PMLPackage.ULA__BEHAVIROS_ULA);
		}
		return behavirosULA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Output> getOutputsULA() {
		if (outputsULA == null) {
			outputsULA = new EObjectContainmentEList<Output>(Output.class, this, PMLPackage.ULA__OUTPUTS_ULA);
		}
		return outputsULA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Input> getInputsULA() {
		if (inputsULA == null) {
			inputsULA = new EObjectContainmentEList<Input>(Input.class, this, PMLPackage.ULA__INPUTS_ULA);
		}
		return inputsULA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getOperationsULA() {
		if (operationsULA == null) {
			operationsULA = new EObjectContainmentEList<Operation>(Operation.class, this, PMLPackage.ULA__OPERATIONS_ULA);
		}
		return operationsULA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Seletor getSeletorULA() {
		return seletorULA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeletorULA(Seletor newSeletorULA, NotificationChain msgs) {
		Seletor oldSeletorULA = seletorULA;
		seletorULA = newSeletorULA;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PMLPackage.ULA__SELETOR_ULA, oldSeletorULA, newSeletorULA);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeletorULA(Seletor newSeletorULA) {
		if (newSeletorULA != seletorULA) {
			NotificationChain msgs = null;
			if (seletorULA != null)
				msgs = ((InternalEObject)seletorULA).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PMLPackage.ULA__SELETOR_ULA, null, msgs);
			if (newSeletorULA != null)
				msgs = ((InternalEObject)newSeletorULA).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PMLPackage.ULA__SELETOR_ULA, null, msgs);
			msgs = basicSetSeletorULA(newSeletorULA, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PMLPackage.ULA__SELETOR_ULA, newSeletorULA, newSeletorULA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PMLPackage.ULA__BEHAVIROS_ULA:
				return ((InternalEList<?>)getBehavirosULA()).basicRemove(otherEnd, msgs);
			case PMLPackage.ULA__OUTPUTS_ULA:
				return ((InternalEList<?>)getOutputsULA()).basicRemove(otherEnd, msgs);
			case PMLPackage.ULA__INPUTS_ULA:
				return ((InternalEList<?>)getInputsULA()).basicRemove(otherEnd, msgs);
			case PMLPackage.ULA__OPERATIONS_ULA:
				return ((InternalEList<?>)getOperationsULA()).basicRemove(otherEnd, msgs);
			case PMLPackage.ULA__SELETOR_ULA:
				return basicSetSeletorULA(null, msgs);
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
			case PMLPackage.ULA__NAME:
				return getName();
			case PMLPackage.ULA__BEHAVIROS_ULA:
				return getBehavirosULA();
			case PMLPackage.ULA__OUTPUTS_ULA:
				return getOutputsULA();
			case PMLPackage.ULA__INPUTS_ULA:
				return getInputsULA();
			case PMLPackage.ULA__OPERATIONS_ULA:
				return getOperationsULA();
			case PMLPackage.ULA__SELETOR_ULA:
				return getSeletorULA();
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
			case PMLPackage.ULA__NAME:
				setName((String)newValue);
				return;
			case PMLPackage.ULA__BEHAVIROS_ULA:
				getBehavirosULA().clear();
				getBehavirosULA().addAll((Collection<? extends Behavior>)newValue);
				return;
			case PMLPackage.ULA__OUTPUTS_ULA:
				getOutputsULA().clear();
				getOutputsULA().addAll((Collection<? extends Output>)newValue);
				return;
			case PMLPackage.ULA__INPUTS_ULA:
				getInputsULA().clear();
				getInputsULA().addAll((Collection<? extends Input>)newValue);
				return;
			case PMLPackage.ULA__OPERATIONS_ULA:
				getOperationsULA().clear();
				getOperationsULA().addAll((Collection<? extends Operation>)newValue);
				return;
			case PMLPackage.ULA__SELETOR_ULA:
				setSeletorULA((Seletor)newValue);
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
			case PMLPackage.ULA__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PMLPackage.ULA__BEHAVIROS_ULA:
				getBehavirosULA().clear();
				return;
			case PMLPackage.ULA__OUTPUTS_ULA:
				getOutputsULA().clear();
				return;
			case PMLPackage.ULA__INPUTS_ULA:
				getInputsULA().clear();
				return;
			case PMLPackage.ULA__OPERATIONS_ULA:
				getOperationsULA().clear();
				return;
			case PMLPackage.ULA__SELETOR_ULA:
				setSeletorULA((Seletor)null);
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
			case PMLPackage.ULA__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PMLPackage.ULA__BEHAVIROS_ULA:
				return behavirosULA != null && !behavirosULA.isEmpty();
			case PMLPackage.ULA__OUTPUTS_ULA:
				return outputsULA != null && !outputsULA.isEmpty();
			case PMLPackage.ULA__INPUTS_ULA:
				return inputsULA != null && !inputsULA.isEmpty();
			case PMLPackage.ULA__OPERATIONS_ULA:
				return operationsULA != null && !operationsULA.isEmpty();
			case PMLPackage.ULA__SELETOR_ULA:
				return seletorULA != null;
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

} //ULAImpl
