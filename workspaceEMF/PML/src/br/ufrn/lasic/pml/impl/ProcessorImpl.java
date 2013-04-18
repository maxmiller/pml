/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.ufrn.lasic.pml.impl;

import br.ufrn.lasic.pml.ControlUnit;
import br.ufrn.lasic.pml.Decoder;
import br.ufrn.lasic.pml.Demultiplexor;
import br.ufrn.lasic.pml.Memory;
import br.ufrn.lasic.pml.Multiplexor;
import br.ufrn.lasic.pml.PMLPackage;
import br.ufrn.lasic.pml.PipelineInitialStage;
import br.ufrn.lasic.pml.Processor;
import br.ufrn.lasic.pml.Register;
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
 * An implementation of the model object '<em><b>Processor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.ufrn.lasic.pml.impl.ProcessorImpl#getDemux <em>Demux</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.impl.ProcessorImpl#getUlas <em>Ulas</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.impl.ProcessorImpl#getRegisters <em>Registers</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.impl.ProcessorImpl#getMemories <em>Memories</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.impl.ProcessorImpl#getMux <em>Mux</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.impl.ProcessorImpl#getControlUnits <em>Control Units</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.impl.ProcessorImpl#getName <em>Name</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.impl.ProcessorImpl#getDecoders <em>Decoders</em>}</li>
 *   <li>{@link br.ufrn.lasic.pml.impl.ProcessorImpl#getInitialStagePipeline <em>Initial Stage Pipeline</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcessorImpl extends EObjectImpl implements Processor {
	/**
	 * The cached value of the '{@link #getDemux() <em>Demux</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDemux()
	 * @generated
	 * @ordered
	 */
	protected EList<Demultiplexor> demux;

	/**
	 * The cached value of the '{@link #getUlas() <em>Ulas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUlas()
	 * @generated
	 * @ordered
	 */
	protected EList<ULA> ulas;

	/**
	 * The cached value of the '{@link #getRegisters() <em>Registers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegisters()
	 * @generated
	 * @ordered
	 */
	protected EList<Register> registers;

	/**
	 * The cached value of the '{@link #getMemories() <em>Memories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemories()
	 * @generated
	 * @ordered
	 */
	protected EList<Memory> memories;

	/**
	 * The cached value of the '{@link #getMux() <em>Mux</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMux()
	 * @generated
	 * @ordered
	 */
	protected EList<Multiplexor> mux;

	/**
	 * The cached value of the '{@link #getControlUnits() <em>Control Units</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<ControlUnit> controlUnits;

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
	 * The cached value of the '{@link #getDecoders() <em>Decoders</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecoders()
	 * @generated
	 * @ordered
	 */
	protected EList<Decoder> decoders;

	/**
	 * The cached value of the '{@link #getInitialStagePipeline() <em>Initial Stage Pipeline</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialStagePipeline()
	 * @generated
	 * @ordered
	 */
	protected PipelineInitialStage initialStagePipeline;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PMLPackage.Literals.PROCESSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Demultiplexor> getDemux() {
		if (demux == null) {
			demux = new EObjectContainmentEList<Demultiplexor>(Demultiplexor.class, this, PMLPackage.PROCESSOR__DEMUX);
		}
		return demux;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ULA> getUlas() {
		if (ulas == null) {
			ulas = new EObjectContainmentEList<ULA>(ULA.class, this, PMLPackage.PROCESSOR__ULAS);
		}
		return ulas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Register> getRegisters() {
		if (registers == null) {
			registers = new EObjectContainmentEList<Register>(Register.class, this, PMLPackage.PROCESSOR__REGISTERS);
		}
		return registers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Memory> getMemories() {
		if (memories == null) {
			memories = new EObjectContainmentEList<Memory>(Memory.class, this, PMLPackage.PROCESSOR__MEMORIES);
		}
		return memories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Multiplexor> getMux() {
		if (mux == null) {
			mux = new EObjectContainmentEList<Multiplexor>(Multiplexor.class, this, PMLPackage.PROCESSOR__MUX);
		}
		return mux;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ControlUnit> getControlUnits() {
		if (controlUnits == null) {
			controlUnits = new EObjectContainmentEList<ControlUnit>(ControlUnit.class, this, PMLPackage.PROCESSOR__CONTROL_UNITS);
		}
		return controlUnits;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PMLPackage.PROCESSOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Decoder> getDecoders() {
		if (decoders == null) {
			decoders = new EObjectContainmentEList<Decoder>(Decoder.class, this, PMLPackage.PROCESSOR__DECODERS);
		}
		return decoders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PipelineInitialStage getInitialStagePipeline() {
		return initialStagePipeline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitialStagePipeline(PipelineInitialStage newInitialStagePipeline, NotificationChain msgs) {
		PipelineInitialStage oldInitialStagePipeline = initialStagePipeline;
		initialStagePipeline = newInitialStagePipeline;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PMLPackage.PROCESSOR__INITIAL_STAGE_PIPELINE, oldInitialStagePipeline, newInitialStagePipeline);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialStagePipeline(PipelineInitialStage newInitialStagePipeline) {
		if (newInitialStagePipeline != initialStagePipeline) {
			NotificationChain msgs = null;
			if (initialStagePipeline != null)
				msgs = ((InternalEObject)initialStagePipeline).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PMLPackage.PROCESSOR__INITIAL_STAGE_PIPELINE, null, msgs);
			if (newInitialStagePipeline != null)
				msgs = ((InternalEObject)newInitialStagePipeline).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PMLPackage.PROCESSOR__INITIAL_STAGE_PIPELINE, null, msgs);
			msgs = basicSetInitialStagePipeline(newInitialStagePipeline, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PMLPackage.PROCESSOR__INITIAL_STAGE_PIPELINE, newInitialStagePipeline, newInitialStagePipeline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PMLPackage.PROCESSOR__DEMUX:
				return ((InternalEList<?>)getDemux()).basicRemove(otherEnd, msgs);
			case PMLPackage.PROCESSOR__ULAS:
				return ((InternalEList<?>)getUlas()).basicRemove(otherEnd, msgs);
			case PMLPackage.PROCESSOR__REGISTERS:
				return ((InternalEList<?>)getRegisters()).basicRemove(otherEnd, msgs);
			case PMLPackage.PROCESSOR__MEMORIES:
				return ((InternalEList<?>)getMemories()).basicRemove(otherEnd, msgs);
			case PMLPackage.PROCESSOR__MUX:
				return ((InternalEList<?>)getMux()).basicRemove(otherEnd, msgs);
			case PMLPackage.PROCESSOR__CONTROL_UNITS:
				return ((InternalEList<?>)getControlUnits()).basicRemove(otherEnd, msgs);
			case PMLPackage.PROCESSOR__DECODERS:
				return ((InternalEList<?>)getDecoders()).basicRemove(otherEnd, msgs);
			case PMLPackage.PROCESSOR__INITIAL_STAGE_PIPELINE:
				return basicSetInitialStagePipeline(null, msgs);
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
			case PMLPackage.PROCESSOR__DEMUX:
				return getDemux();
			case PMLPackage.PROCESSOR__ULAS:
				return getUlas();
			case PMLPackage.PROCESSOR__REGISTERS:
				return getRegisters();
			case PMLPackage.PROCESSOR__MEMORIES:
				return getMemories();
			case PMLPackage.PROCESSOR__MUX:
				return getMux();
			case PMLPackage.PROCESSOR__CONTROL_UNITS:
				return getControlUnits();
			case PMLPackage.PROCESSOR__NAME:
				return getName();
			case PMLPackage.PROCESSOR__DECODERS:
				return getDecoders();
			case PMLPackage.PROCESSOR__INITIAL_STAGE_PIPELINE:
				return getInitialStagePipeline();
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
			case PMLPackage.PROCESSOR__DEMUX:
				getDemux().clear();
				getDemux().addAll((Collection<? extends Demultiplexor>)newValue);
				return;
			case PMLPackage.PROCESSOR__ULAS:
				getUlas().clear();
				getUlas().addAll((Collection<? extends ULA>)newValue);
				return;
			case PMLPackage.PROCESSOR__REGISTERS:
				getRegisters().clear();
				getRegisters().addAll((Collection<? extends Register>)newValue);
				return;
			case PMLPackage.PROCESSOR__MEMORIES:
				getMemories().clear();
				getMemories().addAll((Collection<? extends Memory>)newValue);
				return;
			case PMLPackage.PROCESSOR__MUX:
				getMux().clear();
				getMux().addAll((Collection<? extends Multiplexor>)newValue);
				return;
			case PMLPackage.PROCESSOR__CONTROL_UNITS:
				getControlUnits().clear();
				getControlUnits().addAll((Collection<? extends ControlUnit>)newValue);
				return;
			case PMLPackage.PROCESSOR__NAME:
				setName((String)newValue);
				return;
			case PMLPackage.PROCESSOR__DECODERS:
				getDecoders().clear();
				getDecoders().addAll((Collection<? extends Decoder>)newValue);
				return;
			case PMLPackage.PROCESSOR__INITIAL_STAGE_PIPELINE:
				setInitialStagePipeline((PipelineInitialStage)newValue);
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
			case PMLPackage.PROCESSOR__DEMUX:
				getDemux().clear();
				return;
			case PMLPackage.PROCESSOR__ULAS:
				getUlas().clear();
				return;
			case PMLPackage.PROCESSOR__REGISTERS:
				getRegisters().clear();
				return;
			case PMLPackage.PROCESSOR__MEMORIES:
				getMemories().clear();
				return;
			case PMLPackage.PROCESSOR__MUX:
				getMux().clear();
				return;
			case PMLPackage.PROCESSOR__CONTROL_UNITS:
				getControlUnits().clear();
				return;
			case PMLPackage.PROCESSOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PMLPackage.PROCESSOR__DECODERS:
				getDecoders().clear();
				return;
			case PMLPackage.PROCESSOR__INITIAL_STAGE_PIPELINE:
				setInitialStagePipeline((PipelineInitialStage)null);
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
			case PMLPackage.PROCESSOR__DEMUX:
				return demux != null && !demux.isEmpty();
			case PMLPackage.PROCESSOR__ULAS:
				return ulas != null && !ulas.isEmpty();
			case PMLPackage.PROCESSOR__REGISTERS:
				return registers != null && !registers.isEmpty();
			case PMLPackage.PROCESSOR__MEMORIES:
				return memories != null && !memories.isEmpty();
			case PMLPackage.PROCESSOR__MUX:
				return mux != null && !mux.isEmpty();
			case PMLPackage.PROCESSOR__CONTROL_UNITS:
				return controlUnits != null && !controlUnits.isEmpty();
			case PMLPackage.PROCESSOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PMLPackage.PROCESSOR__DECODERS:
				return decoders != null && !decoders.isEmpty();
			case PMLPackage.PROCESSOR__INITIAL_STAGE_PIPELINE:
				return initialStagePipeline != null;
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

} //ProcessorImpl
