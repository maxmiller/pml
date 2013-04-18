/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.ufrn.lasic.pml.impl;

import br.ufrn.lasic.pml.PMLPackage;
import br.ufrn.lasic.pml.PipelineInitialStage;
import br.ufrn.lasic.pml.PipelineNextStage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pipeline Initial Stage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.ufrn.lasic.pml.impl.PipelineInitialStageImpl#getName <em>Name</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.impl.PipelineInitialStageImpl#getNextStatePipeline <em>Next State Pipeline</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PipelineInitialStageImpl extends EObjectImpl implements PipelineInitialStage {
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
	 * The cached value of the '{@link #getNextStatePipeline() <em>Next State Pipeline</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextStatePipeline()
	 * @generated
	 * @ordered
	 */
	protected PipelineNextStage nextStatePipeline;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PipelineInitialStageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PMLPackage.Literals.PIPELINE_INITIAL_STAGE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PMLPackage.PIPELINE_INITIAL_STAGE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PipelineNextStage getNextStatePipeline() {
		return nextStatePipeline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNextStatePipeline(PipelineNextStage newNextStatePipeline, NotificationChain msgs) {
		PipelineNextStage oldNextStatePipeline = nextStatePipeline;
		nextStatePipeline = newNextStatePipeline;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PMLPackage.PIPELINE_INITIAL_STAGE__NEXT_STATE_PIPELINE, oldNextStatePipeline, newNextStatePipeline);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextStatePipeline(PipelineNextStage newNextStatePipeline) {
		if (newNextStatePipeline != nextStatePipeline) {
			NotificationChain msgs = null;
			if (nextStatePipeline != null)
				msgs = ((InternalEObject)nextStatePipeline).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PMLPackage.PIPELINE_INITIAL_STAGE__NEXT_STATE_PIPELINE, null, msgs);
			if (newNextStatePipeline != null)
				msgs = ((InternalEObject)newNextStatePipeline).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PMLPackage.PIPELINE_INITIAL_STAGE__NEXT_STATE_PIPELINE, null, msgs);
			msgs = basicSetNextStatePipeline(newNextStatePipeline, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PMLPackage.PIPELINE_INITIAL_STAGE__NEXT_STATE_PIPELINE, newNextStatePipeline, newNextStatePipeline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PMLPackage.PIPELINE_INITIAL_STAGE__NEXT_STATE_PIPELINE:
				return basicSetNextStatePipeline(null, msgs);
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
			case PMLPackage.PIPELINE_INITIAL_STAGE__NAME:
				return getName();
			case PMLPackage.PIPELINE_INITIAL_STAGE__NEXT_STATE_PIPELINE:
				return getNextStatePipeline();
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
			case PMLPackage.PIPELINE_INITIAL_STAGE__NAME:
				setName((String)newValue);
				return;
			case PMLPackage.PIPELINE_INITIAL_STAGE__NEXT_STATE_PIPELINE:
				setNextStatePipeline((PipelineNextStage)newValue);
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
			case PMLPackage.PIPELINE_INITIAL_STAGE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PMLPackage.PIPELINE_INITIAL_STAGE__NEXT_STATE_PIPELINE:
				setNextStatePipeline((PipelineNextStage)null);
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
			case PMLPackage.PIPELINE_INITIAL_STAGE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PMLPackage.PIPELINE_INITIAL_STAGE__NEXT_STATE_PIPELINE:
				return nextStatePipeline != null;
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

} //PipelineInitialStageImpl
