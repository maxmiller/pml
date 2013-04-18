/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.ufrn.lasic.pml.impl;

import br.ufrn.lasic.pml.PMLPackage;
import br.ufrn.lasic.pml.PipelineNextStage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pipeline Next Stage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.ufrn.lasic.pml.impl.PipelineNextStageImpl#getPipelineNext <em>Pipeline Next</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.impl.PipelineNextStageImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PipelineNextStageImpl extends EObjectImpl implements PipelineNextStage {
	/**
	 * The cached value of the '{@link #getPipelineNext() <em>Pipeline Next</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPipelineNext()
	 * @generated
	 * @ordered
	 */
	protected PipelineNextStage pipelineNext;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PipelineNextStageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PMLPackage.Literals.PIPELINE_NEXT_STAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PipelineNextStage getPipelineNext() {
		return pipelineNext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPipelineNext(PipelineNextStage newPipelineNext, NotificationChain msgs) {
		PipelineNextStage oldPipelineNext = pipelineNext;
		pipelineNext = newPipelineNext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PMLPackage.PIPELINE_NEXT_STAGE__PIPELINE_NEXT, oldPipelineNext, newPipelineNext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPipelineNext(PipelineNextStage newPipelineNext) {
		if (newPipelineNext != pipelineNext) {
			NotificationChain msgs = null;
			if (pipelineNext != null)
				msgs = ((InternalEObject)pipelineNext).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PMLPackage.PIPELINE_NEXT_STAGE__PIPELINE_NEXT, null, msgs);
			if (newPipelineNext != null)
				msgs = ((InternalEObject)newPipelineNext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PMLPackage.PIPELINE_NEXT_STAGE__PIPELINE_NEXT, null, msgs);
			msgs = basicSetPipelineNext(newPipelineNext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PMLPackage.PIPELINE_NEXT_STAGE__PIPELINE_NEXT, newPipelineNext, newPipelineNext));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PMLPackage.PIPELINE_NEXT_STAGE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PMLPackage.PIPELINE_NEXT_STAGE__PIPELINE_NEXT:
				return basicSetPipelineNext(null, msgs);
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
			case PMLPackage.PIPELINE_NEXT_STAGE__PIPELINE_NEXT:
				return getPipelineNext();
			case PMLPackage.PIPELINE_NEXT_STAGE__NAME:
				return getName();
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
			case PMLPackage.PIPELINE_NEXT_STAGE__PIPELINE_NEXT:
				setPipelineNext((PipelineNextStage)newValue);
				return;
			case PMLPackage.PIPELINE_NEXT_STAGE__NAME:
				setName((String)newValue);
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
			case PMLPackage.PIPELINE_NEXT_STAGE__PIPELINE_NEXT:
				setPipelineNext((PipelineNextStage)null);
				return;
			case PMLPackage.PIPELINE_NEXT_STAGE__NAME:
				setName(NAME_EDEFAULT);
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
			case PMLPackage.PIPELINE_NEXT_STAGE__PIPELINE_NEXT:
				return pipelineNext != null;
			case PMLPackage.PIPELINE_NEXT_STAGE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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

} //PipelineNextStageImpl
