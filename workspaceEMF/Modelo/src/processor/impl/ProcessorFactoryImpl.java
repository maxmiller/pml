/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package processor.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import processor.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcessorFactoryImpl extends EFactoryImpl implements ProcessorFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProcessorFactory init() {
		try {
			ProcessorFactory theProcessorFactory = (ProcessorFactory)EPackage.Registry.INSTANCE.getEFactory("http://processor/1.0"); 
			if (theProcessorFactory != null) {
				return theProcessorFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ProcessorFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessorFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ProcessorPackage.MULTIPLEXOR: return createMultiplexor();
			case ProcessorPackage.SELETOR_REGISTER_FILE: return createSeletorRegisterFile();
			case ProcessorPackage.DEMULTIPLEXOR: return createDemultiplexor();
			case ProcessorPackage.REGISTER_FILE: return createRegisterFile();
			case ProcessorPackage.REGISTER_ASSYNC_RESET: return createRegisterAssyncReset();
			case ProcessorPackage.WRITE: return createWrite();
			case ProcessorPackage.READ: return createRead();
			case ProcessorPackage.READ_WRITE: return createReadWrite();
			case ProcessorPackage.REGISTER: return createRegister();
			case ProcessorPackage.CONTROL_UNIT: return createControlUnit();
			case ProcessorPackage.ULA: return createULA();
			case ProcessorPackage.INPUT_BOOLEAN: return createInputBoolean();
			case ProcessorPackage.RESET: return createReset();
			case ProcessorPackage.CLOCK: return createClock();
			case ProcessorPackage.OUTPUT_BOOLEAN: return createOutputBoolean();
			case ProcessorPackage.INPUT_MULTIPLEXOR: return createInputMultiplexor();
			case ProcessorPackage.OUTPUT_MULTIPLEXOR: return createOutputMultiplexor();
			case ProcessorPackage.OUTPUT_DEMUX: return createOutputDemux();
			case ProcessorPackage.INPUT_DEMUX: return createInputDemux();
			case ProcessorPackage.INPUT_REGISTER_FILE: return createInputRegisterFile();
			case ProcessorPackage.OUTPUT_REGISTER_FILE: return createOutputRegisterFile();
			case ProcessorPackage.INPUT_REGISTER_ASSYNC: return createInputRegisterAssync();
			case ProcessorPackage.OUTPUT_REGISTER_ASSYNC: return createOutputRegisterAssync();
			case ProcessorPackage.LOAD: return createLoad();
			case ProcessorPackage.INPUT_MEMORY: return createInputMemory();
			case ProcessorPackage.OUTPUT_MEMORY: return createOutputMemory();
			case ProcessorPackage.ADDRESS_MEMORY: return createAddressMemory();
			case ProcessorPackage.MEMORY: return createMemory();
			case ProcessorPackage.OPERATION: return createOperation();
			case ProcessorPackage.OUTPUT_ULA: return createOutputULA();
			case ProcessorPackage.SELETOR_ULA: return createSeletorULA();
			case ProcessorPackage.STATUS: return createStatus();
			case ProcessorPackage.LOAD_CONTROL_UNIT: return createLoadControlUnit();
			case ProcessorPackage.SELETOR_CONTROL_UNIT: return createSeletorControlUnit();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ProcessorPackage.ARRAY_INTEGER:
				return createArrayIntegerFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ProcessorPackage.ARRAY_INTEGER:
				return convertArrayIntegerToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Multiplexor createMultiplexor() {
		MultiplexorImpl multiplexor = new MultiplexorImpl();
		return multiplexor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeletorRegisterFile createSeletorRegisterFile() {
		SeletorRegisterFileImpl seletorRegisterFile = new SeletorRegisterFileImpl();
		return seletorRegisterFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Demultiplexor createDemultiplexor() {
		DemultiplexorImpl demultiplexor = new DemultiplexorImpl();
		return demultiplexor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegisterFile createRegisterFile() {
		RegisterFileImpl registerFile = new RegisterFileImpl();
		return registerFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegisterAssyncReset createRegisterAssyncReset() {
		RegisterAssyncResetImpl registerAssyncReset = new RegisterAssyncResetImpl();
		return registerAssyncReset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Write createWrite() {
		WriteImpl write = new WriteImpl();
		return write;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Read createRead() {
		ReadImpl read = new ReadImpl();
		return read;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadWrite createReadWrite() {
		ReadWriteImpl readWrite = new ReadWriteImpl();
		return readWrite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Register createRegister() {
		RegisterImpl register = new RegisterImpl();
		return register;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlUnit createControlUnit() {
		ControlUnitImpl controlUnit = new ControlUnitImpl();
		return controlUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ULA createULA() {
		ULAImpl ula = new ULAImpl();
		return ula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputBoolean createInputBoolean() {
		InputBooleanImpl inputBoolean = new InputBooleanImpl();
		return inputBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reset createReset() {
		ResetImpl reset = new ResetImpl();
		return reset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clock createClock() {
		ClockImpl clock = new ClockImpl();
		return clock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputBoolean createOutputBoolean() {
		OutputBooleanImpl outputBoolean = new OutputBooleanImpl();
		return outputBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputMultiplexor createInputMultiplexor() {
		InputMultiplexorImpl inputMultiplexor = new InputMultiplexorImpl();
		return inputMultiplexor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputMultiplexor createOutputMultiplexor() {
		OutputMultiplexorImpl outputMultiplexor = new OutputMultiplexorImpl();
		return outputMultiplexor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputDemux createOutputDemux() {
		OutputDemuxImpl outputDemux = new OutputDemuxImpl();
		return outputDemux;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputDemux createInputDemux() {
		InputDemuxImpl inputDemux = new InputDemuxImpl();
		return inputDemux;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputRegisterFile createInputRegisterFile() {
		InputRegisterFileImpl inputRegisterFile = new InputRegisterFileImpl();
		return inputRegisterFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputRegisterFile createOutputRegisterFile() {
		OutputRegisterFileImpl outputRegisterFile = new OutputRegisterFileImpl();
		return outputRegisterFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputRegisterAssync createInputRegisterAssync() {
		InputRegisterAssyncImpl inputRegisterAssync = new InputRegisterAssyncImpl();
		return inputRegisterAssync;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputRegisterAssync createOutputRegisterAssync() {
		OutputRegisterAssyncImpl outputRegisterAssync = new OutputRegisterAssyncImpl();
		return outputRegisterAssync;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Load createLoad() {
		LoadImpl load = new LoadImpl();
		return load;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputMemory createInputMemory() {
		InputMemoryImpl inputMemory = new InputMemoryImpl();
		return inputMemory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputMemory createOutputMemory() {
		OutputMemoryImpl outputMemory = new OutputMemoryImpl();
		return outputMemory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressMemory createAddressMemory() {
		AddressMemoryImpl addressMemory = new AddressMemoryImpl();
		return addressMemory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Memory createMemory() {
		MemoryImpl memory = new MemoryImpl();
		return memory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputULA createOutputULA() {
		OutputULAImpl outputULA = new OutputULAImpl();
		return outputULA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeletorULA createSeletorULA() {
		SeletorULAImpl seletorULA = new SeletorULAImpl();
		return seletorULA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Status createStatus() {
		StatusImpl status = new StatusImpl();
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadControlUnit createLoadControlUnit() {
		LoadControlUnitImpl loadControlUnit = new LoadControlUnitImpl();
		return loadControlUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeletorControlUnit createSeletorControlUnit() {
		SeletorControlUnitImpl seletorControlUnit = new SeletorControlUnitImpl();
		return seletorControlUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int[] createArrayIntegerFromString(EDataType eDataType, String initialValue) {
		return (int[])super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArrayIntegerToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessorPackage getProcessorPackage() {
		return (ProcessorPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ProcessorPackage getPackage() {
		return ProcessorPackage.eINSTANCE;
	}

} //ProcessorFactoryImpl
