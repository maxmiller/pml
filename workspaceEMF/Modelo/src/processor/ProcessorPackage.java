/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package processor;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see processor.ProcessorFactory
 * @model kind="package"
 * @generated
 */
public interface ProcessorPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "processor";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://processor/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "processor";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProcessorPackage eINSTANCE = processor.impl.ProcessorPackageImpl.init();

	/**
	 * The meta object id for the '{@link processor.impl.MultiplexorImpl <em>Multiplexor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see processor.impl.MultiplexorImpl
	 * @see processor.impl.ProcessorPackageImpl#getMultiplexor()
	 * @generated
	 */
	int MULTIPLEXOR = 0;

	/**
	 * The feature id for the '<em><b>Num Inputs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLEXOR__NUM_INPUTS = 0;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLEXOR__INPUTS = 1;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLEXOR__OUTPUT = 2;

	/**
	 * The feature id for the '<em><b>Inout</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLEXOR__INOUT = 3;

	/**
	 * The feature id for the '<em><b>Inputs Mul</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLEXOR__INPUTS_MUL = 4;

	/**
	 * The feature id for the '<em><b>Output Mul</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLEXOR__OUTPUT_MUL = 5;

	/**
	 * The number of structural features of the '<em>Multiplexor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLEXOR_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link processor.impl.SeletorRegisterFileImpl <em>Seletor Register File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see processor.impl.SeletorRegisterFileImpl
	 * @see processor.impl.ProcessorPackageImpl#getSeletorRegisterFile()
	 * @generated
	 */
	int SELETOR_REGISTER_FILE = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELETOR_REGISTER_FILE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Seletor Register File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELETOR_REGISTER_FILE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link processor.impl.DemultiplexorImpl <em>Demultiplexor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see processor.impl.DemultiplexorImpl
	 * @see processor.impl.ProcessorPackageImpl#getDemultiplexor()
	 * @generated
	 */
	int DEMULTIPLEXOR = 2;

	/**
	 * The feature id for the '<em><b>Num Outputs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEMULTIPLEXOR__NUM_OUTPUTS = 0;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEMULTIPLEXOR__OUTPUTS = 1;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEMULTIPLEXOR__INPUT = 2;

	/**
	 * The feature id for the '<em><b>Outin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEMULTIPLEXOR__OUTIN = 3;

	/**
	 * The feature id for the '<em><b>Outputs Demux</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEMULTIPLEXOR__OUTPUTS_DEMUX = 4;

	/**
	 * The feature id for the '<em><b>Input Demux</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEMULTIPLEXOR__INPUT_DEMUX = 5;

	/**
	 * The number of structural features of the '<em>Demultiplexor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEMULTIPLEXOR_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link processor.impl.RegisterFileImpl <em>Register File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see processor.impl.RegisterFileImpl
	 * @see processor.impl.ProcessorPackageImpl#getRegisterFile()
	 * @generated
	 */
	int REGISTER_FILE = 3;

	/**
	 * The feature id for the '<em><b>Sel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_FILE__SEL = 0;

	/**
	 * The feature id for the '<em><b>Rw Bit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_FILE__RW_BIT = 1;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_FILE__CLOCK = 2;

	/**
	 * The feature id for the '<em><b>Registers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_FILE__REGISTERS = 3;

	/**
	 * The feature id for the '<em><b>In Rf</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_FILE__IN_RF = 4;

	/**
	 * The feature id for the '<em><b>Out Rf</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_FILE__OUT_RF = 5;

	/**
	 * The number of structural features of the '<em>Register File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_FILE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link processor.impl.RegisterAssyncResetImpl <em>Register Assync Reset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see processor.impl.RegisterAssyncResetImpl
	 * @see processor.impl.ProcessorPackageImpl#getRegisterAssyncReset()
	 * @generated
	 */
	int REGISTER_ASSYNC_RESET = 4;

	/**
	 * The feature id for the '<em><b>Internal Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_ASSYNC_RESET__INTERNAL_DATA = 0;

	/**
	 * The feature id for the '<em><b>Out Ra</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_ASSYNC_RESET__OUT_RA = 1;

	/**
	 * The feature id for the '<em><b>In Ra</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_ASSYNC_RESET__IN_RA = 2;

	/**
	 * The feature id for the '<em><b>Reset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_ASSYNC_RESET__RESET = 3;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_ASSYNC_RESET__CLOCK = 4;

	/**
	 * The feature id for the '<em><b>Load</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_ASSYNC_RESET__LOAD = 5;

	/**
	 * The number of structural features of the '<em>Register Assync Reset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_ASSYNC_RESET_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link processor.impl.WriteImpl <em>Write</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see processor.impl.WriteImpl
	 * @see processor.impl.ProcessorPackageImpl#getWrite()
	 * @generated
	 */
	int WRITE = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Write</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link processor.impl.ReadImpl <em>Read</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see processor.impl.ReadImpl
	 * @see processor.impl.ProcessorPackageImpl#getRead()
	 * @generated
	 */
	int READ = 6;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Read</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link processor.impl.ReadWriteImpl <em>Read Write</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see processor.impl.ReadWriteImpl
	 * @see processor.impl.ProcessorPackageImpl#getReadWrite()
	 * @generated
	 */
	int READ_WRITE = 7;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_WRITE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Read Write</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_WRITE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link processor.impl.RegisterImpl <em>Register</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see processor.impl.RegisterImpl
	 * @see processor.impl.ProcessorPackageImpl#getRegister()
	 * @generated
	 */
	int REGISTER = 8;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Register</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link processor.impl.ControlUnitImpl <em>Control Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see processor.impl.ControlUnitImpl
	 * @see processor.impl.ProcessorPackageImpl#getControlUnit()
	 * @generated
	 */
	int CONTROL_UNIT = 9;

	/**
	 * The feature id for the '<em><b>Loads</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__LOADS = 0;

	/**
	 * The feature id for the '<em><b>Write Memory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__WRITE_MEMORY = 1;

	/**
	 * The feature id for the '<em><b>Readwritebit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__READWRITEBIT = 2;

	/**
	 * The feature id for the '<em><b>Sel Control Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__SEL_CONTROL_UNIT = 3;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__STATE = 4;

	/**
	 * The feature id for the '<em><b>Instruction Substate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__INSTRUCTION_SUBSTATE = 5;

	/**
	 * The number of structural features of the '<em>Control Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link processor.impl.ULAImpl <em>ULA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see processor.impl.ULAImpl
	 * @see processor.impl.ProcessorPackageImpl#getULA()
	 * @generated
	 */
	int ULA = 10;

	/**
	 * The feature id for the '<em><b>Op Sel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULA__OP_SEL = 0;

	/**
	 * The feature id for the '<em><b>Ulastatus</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULA__ULASTATUS = 1;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULA__OPERATIONS = 2;

	/**
	 * The feature id for the '<em><b>Op Sel Ula</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULA__OP_SEL_ULA = 3;

	/**
	 * The feature id for the '<em><b>Ula Out</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULA__ULA_OUT = 4;

	/**
	 * The number of structural features of the '<em>ULA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULA_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link processor.impl.InputBooleanImpl <em>Input Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see processor.impl.InputBooleanImpl
	 * @see processor.impl.ProcessorPackageImpl#getInputBoolean()
	 * @generated
	 */
	int INPUT_BOOLEAN = 11;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_BOOLEAN__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Input Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_BOOLEAN_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link processor.impl.ResetImpl <em>Reset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see processor.impl.ResetImpl
	 * @see processor.impl.ProcessorPackageImpl#getReset()
	 * @generated
	 */
	int RESET = 12;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Reset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link processor.impl.ClockImpl <em>Clock</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see processor.impl.ClockImpl
	 * @see processor.impl.ProcessorPackageImpl#getClock()
	 * @generated
	 */
	int CLOCK = 13;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Clock</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link processor.impl.OutputBooleanImpl <em>Output Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see processor.impl.OutputBooleanImpl
	 * @see processor.impl.ProcessorPackageImpl#getOutputBoolean()
	 * @generated
	 */
	int OUTPUT_BOOLEAN = 14;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_BOOLEAN__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Output Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_BOOLEAN_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link processor.impl.InputMultiplexorImpl <em>Input Multiplexor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see processor.impl.InputMultiplexorImpl
	 * @see processor.impl.ProcessorPackageImpl#getInputMultiplexor()
	 * @generated
	 */
	int INPUT_MULTIPLEXOR = 15;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_MULTIPLEXOR__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Input Multiplexor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_MULTIPLEXOR_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link processor.impl.OutputMultiplexorImpl <em>Output Multiplexor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see processor.impl.OutputMultiplexorImpl
	 * @see processor.impl.ProcessorPackageImpl#getOutputMultiplexor()
	 * @generated
	 */
	int OUTPUT_MULTIPLEXOR = 16;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_MULTIPLEXOR__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Output Multiplexor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_MULTIPLEXOR_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link processor.impl.OutputDemuxImpl <em>Output Demux</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see processor.impl.OutputDemuxImpl
	 * @see processor.impl.ProcessorPackageImpl#getOutputDemux()
	 * @generated
	 */
	int OUTPUT_DEMUX = 17;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DEMUX__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Output Demux</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DEMUX_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link processor.impl.InputDemuxImpl <em>Input Demux</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see processor.impl.InputDemuxImpl
	 * @see processor.impl.ProcessorPackageImpl#getInputDemux()
	 * @generated
	 */
	int INPUT_DEMUX = 18;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DEMUX__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Input Demux</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DEMUX_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link processor.impl.InputRegisterFileImpl <em>Input Register File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see processor.impl.InputRegisterFileImpl
	 * @see processor.impl.ProcessorPackageImpl#getInputRegisterFile()
	 * @generated
	 */
	int INPUT_REGISTER_FILE = 19;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_REGISTER_FILE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Input Register File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_REGISTER_FILE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link processor.impl.OutputRegisterFileImpl <em>Output Register File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see processor.impl.OutputRegisterFileImpl
	 * @see processor.impl.ProcessorPackageImpl#getOutputRegisterFile()
	 * @generated
	 */
	int OUTPUT_REGISTER_FILE = 20;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_REGISTER_FILE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Output Register File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_REGISTER_FILE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link processor.impl.InputRegisterAssyncImpl <em>Input Register Assync</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see processor.impl.InputRegisterAssyncImpl
	 * @see processor.impl.ProcessorPackageImpl#getInputRegisterAssync()
	 * @generated
	 */
	int INPUT_REGISTER_ASSYNC = 21;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_REGISTER_ASSYNC__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Input Register Assync</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_REGISTER_ASSYNC_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link processor.impl.OutputRegisterAssyncImpl <em>Output Register Assync</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see processor.impl.OutputRegisterAssyncImpl
	 * @see processor.impl.ProcessorPackageImpl#getOutputRegisterAssync()
	 * @generated
	 */
	int OUTPUT_REGISTER_ASSYNC = 22;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_REGISTER_ASSYNC__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Output Register Assync</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_REGISTER_ASSYNC_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link processor.impl.LoadImpl <em>Load</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see processor.impl.LoadImpl
	 * @see processor.impl.ProcessorPackageImpl#getLoad()
	 * @generated
	 */
	int LOAD = 23;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Load</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link processor.impl.InputMemoryImpl <em>Input Memory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see processor.impl.InputMemoryImpl
	 * @see processor.impl.ProcessorPackageImpl#getInputMemory()
	 * @generated
	 */
	int INPUT_MEMORY = 24;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_MEMORY__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Input Memory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_MEMORY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link processor.impl.OutputMemoryImpl <em>Output Memory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see processor.impl.OutputMemoryImpl
	 * @see processor.impl.ProcessorPackageImpl#getOutputMemory()
	 * @generated
	 */
	int OUTPUT_MEMORY = 25;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_MEMORY__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Output Memory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_MEMORY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link processor.impl.AddressMemoryImpl <em>Address Memory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see processor.impl.AddressMemoryImpl
	 * @see processor.impl.ProcessorPackageImpl#getAddressMemory()
	 * @generated
	 */
	int ADDRESS_MEMORY = 26;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_MEMORY__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Address Memory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_MEMORY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link processor.impl.MemoryImpl <em>Memory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see processor.impl.MemoryImpl
	 * @see processor.impl.ProcessorPackageImpl#getMemory()
	 * @generated
	 */
	int MEMORY = 27;

	/**
	 * The feature id for the '<em><b>Mem</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__MEM = 0;

	/**
	 * The feature id for the '<em><b>Write</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__WRITE = 1;

	/**
	 * The feature id for the '<em><b>Reset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__RESET = 2;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__CLOCK = 3;

	/**
	 * The feature id for the '<em><b>Datai</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__DATAI = 4;

	/**
	 * The feature id for the '<em><b>Datao</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__DATAO = 5;

	/**
	 * The feature id for the '<em><b>Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__ADDRESS = 6;

	/**
	 * The number of structural features of the '<em>Memory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link processor.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see processor.impl.OperationImpl
	 * @see processor.impl.ProcessorPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 28;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link processor.impl.OutputULAImpl <em>Output ULA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see processor.impl.OutputULAImpl
	 * @see processor.impl.ProcessorPackageImpl#getOutputULA()
	 * @generated
	 */
	int OUTPUT_ULA = 29;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ULA__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Output ULA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ULA_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link processor.impl.SeletorULAImpl <em>Seletor ULA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see processor.impl.SeletorULAImpl
	 * @see processor.impl.ProcessorPackageImpl#getSeletorULA()
	 * @generated
	 */
	int SELETOR_ULA = 30;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELETOR_ULA__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Seletor ULA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELETOR_ULA_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link processor.impl.StatusImpl <em>Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see processor.impl.StatusImpl
	 * @see processor.impl.ProcessorPackageImpl#getStatus()
	 * @generated
	 */
	int STATUS = 31;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link processor.impl.LoadControlUnitImpl <em>Load Control Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see processor.impl.LoadControlUnitImpl
	 * @see processor.impl.ProcessorPackageImpl#getLoadControlUnit()
	 * @generated
	 */
	int LOAD_CONTROL_UNIT = 32;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_CONTROL_UNIT__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Load Control Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_CONTROL_UNIT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link processor.impl.SeletorControlUnitImpl <em>Seletor Control Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see processor.impl.SeletorControlUnitImpl
	 * @see processor.impl.ProcessorPackageImpl#getSeletorControlUnit()
	 * @generated
	 */
	int SELETOR_CONTROL_UNIT = 33;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELETOR_CONTROL_UNIT__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Seletor Control Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELETOR_CONTROL_UNIT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '<em>Array Integer</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see processor.impl.ProcessorPackageImpl#getArrayInteger()
	 * @generated
	 */
	int ARRAY_INTEGER = 34;


	/**
	 * Returns the meta object for class '{@link processor.Multiplexor <em>Multiplexor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiplexor</em>'.
	 * @see processor.Multiplexor
	 * @generated
	 */
	EClass getMultiplexor();

	/**
	 * Returns the meta object for the attribute '{@link processor.Multiplexor#getNumInputs <em>Num Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Inputs</em>'.
	 * @see processor.Multiplexor#getNumInputs()
	 * @see #getMultiplexor()
	 * @generated
	 */
	EAttribute getMultiplexor_NumInputs();

	/**
	 * Returns the meta object for the reference list '{@link processor.Multiplexor#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inputs</em>'.
	 * @see processor.Multiplexor#getInputs()
	 * @see #getMultiplexor()
	 * @generated
	 */
	EReference getMultiplexor_Inputs();

	/**
	 * Returns the meta object for the reference '{@link processor.Multiplexor#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output</em>'.
	 * @see processor.Multiplexor#getOutput()
	 * @see #getMultiplexor()
	 * @generated
	 */
	EReference getMultiplexor_Output();

	/**
	 * Returns the meta object for the reference '{@link processor.Multiplexor#getInout <em>Inout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inout</em>'.
	 * @see processor.Multiplexor#getInout()
	 * @see #getMultiplexor()
	 * @generated
	 */
	EReference getMultiplexor_Inout();

	/**
	 * Returns the meta object for the reference list '{@link processor.Multiplexor#getInputsMul <em>Inputs Mul</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inputs Mul</em>'.
	 * @see processor.Multiplexor#getInputsMul()
	 * @see #getMultiplexor()
	 * @generated
	 */
	EReference getMultiplexor_InputsMul();

	/**
	 * Returns the meta object for the reference '{@link processor.Multiplexor#getOutputMul <em>Output Mul</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output Mul</em>'.
	 * @see processor.Multiplexor#getOutputMul()
	 * @see #getMultiplexor()
	 * @generated
	 */
	EReference getMultiplexor_OutputMul();

	/**
	 * Returns the meta object for class '{@link processor.SeletorRegisterFile <em>Seletor Register File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Seletor Register File</em>'.
	 * @see processor.SeletorRegisterFile
	 * @generated
	 */
	EClass getSeletorRegisterFile();

	/**
	 * Returns the meta object for the attribute '{@link processor.SeletorRegisterFile#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see processor.SeletorRegisterFile#getValue()
	 * @see #getSeletorRegisterFile()
	 * @generated
	 */
	EAttribute getSeletorRegisterFile_Value();

	/**
	 * Returns the meta object for class '{@link processor.Demultiplexor <em>Demultiplexor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Demultiplexor</em>'.
	 * @see processor.Demultiplexor
	 * @generated
	 */
	EClass getDemultiplexor();

	/**
	 * Returns the meta object for the attribute '{@link processor.Demultiplexor#getNumOutputs <em>Num Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Outputs</em>'.
	 * @see processor.Demultiplexor#getNumOutputs()
	 * @see #getDemultiplexor()
	 * @generated
	 */
	EAttribute getDemultiplexor_NumOutputs();

	/**
	 * Returns the meta object for the reference list '{@link processor.Demultiplexor#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outputs</em>'.
	 * @see processor.Demultiplexor#getOutputs()
	 * @see #getDemultiplexor()
	 * @generated
	 */
	EReference getDemultiplexor_Outputs();

	/**
	 * Returns the meta object for the reference '{@link processor.Demultiplexor#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input</em>'.
	 * @see processor.Demultiplexor#getInput()
	 * @see #getDemultiplexor()
	 * @generated
	 */
	EReference getDemultiplexor_Input();

	/**
	 * Returns the meta object for the reference '{@link processor.Demultiplexor#getOutin <em>Outin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Outin</em>'.
	 * @see processor.Demultiplexor#getOutin()
	 * @see #getDemultiplexor()
	 * @generated
	 */
	EReference getDemultiplexor_Outin();

	/**
	 * Returns the meta object for the reference list '{@link processor.Demultiplexor#getOutputsDemux <em>Outputs Demux</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outputs Demux</em>'.
	 * @see processor.Demultiplexor#getOutputsDemux()
	 * @see #getDemultiplexor()
	 * @generated
	 */
	EReference getDemultiplexor_OutputsDemux();

	/**
	 * Returns the meta object for the reference '{@link processor.Demultiplexor#getInputDemux <em>Input Demux</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input Demux</em>'.
	 * @see processor.Demultiplexor#getInputDemux()
	 * @see #getDemultiplexor()
	 * @generated
	 */
	EReference getDemultiplexor_InputDemux();

	/**
	 * Returns the meta object for class '{@link processor.RegisterFile <em>Register File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Register File</em>'.
	 * @see processor.RegisterFile
	 * @generated
	 */
	EClass getRegisterFile();

	/**
	 * Returns the meta object for the reference '{@link processor.RegisterFile#getSel <em>Sel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sel</em>'.
	 * @see processor.RegisterFile#getSel()
	 * @see #getRegisterFile()
	 * @generated
	 */
	EReference getRegisterFile_Sel();

	/**
	 * Returns the meta object for the reference '{@link processor.RegisterFile#getRwBit <em>Rw Bit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rw Bit</em>'.
	 * @see processor.RegisterFile#getRwBit()
	 * @see #getRegisterFile()
	 * @generated
	 */
	EReference getRegisterFile_RwBit();

	/**
	 * Returns the meta object for the reference '{@link processor.RegisterFile#getClock <em>Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Clock</em>'.
	 * @see processor.RegisterFile#getClock()
	 * @see #getRegisterFile()
	 * @generated
	 */
	EReference getRegisterFile_Clock();

	/**
	 * Returns the meta object for the attribute '{@link processor.RegisterFile#getRegisters <em>Registers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Registers</em>'.
	 * @see processor.RegisterFile#getRegisters()
	 * @see #getRegisterFile()
	 * @generated
	 */
	EAttribute getRegisterFile_Registers();

	/**
	 * Returns the meta object for the reference '{@link processor.RegisterFile#getInRf <em>In Rf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>In Rf</em>'.
	 * @see processor.RegisterFile#getInRf()
	 * @see #getRegisterFile()
	 * @generated
	 */
	EReference getRegisterFile_InRf();

	/**
	 * Returns the meta object for the reference '{@link processor.RegisterFile#getOutRf <em>Out Rf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Out Rf</em>'.
	 * @see processor.RegisterFile#getOutRf()
	 * @see #getRegisterFile()
	 * @generated
	 */
	EReference getRegisterFile_OutRf();

	/**
	 * Returns the meta object for class '{@link processor.RegisterAssyncReset <em>Register Assync Reset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Register Assync Reset</em>'.
	 * @see processor.RegisterAssyncReset
	 * @generated
	 */
	EClass getRegisterAssyncReset();

	/**
	 * Returns the meta object for the attribute '{@link processor.RegisterAssyncReset#getInternalData <em>Internal Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Internal Data</em>'.
	 * @see processor.RegisterAssyncReset#getInternalData()
	 * @see #getRegisterAssyncReset()
	 * @generated
	 */
	EAttribute getRegisterAssyncReset_InternalData();

	/**
	 * Returns the meta object for the reference '{@link processor.RegisterAssyncReset#getOutRa <em>Out Ra</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Out Ra</em>'.
	 * @see processor.RegisterAssyncReset#getOutRa()
	 * @see #getRegisterAssyncReset()
	 * @generated
	 */
	EReference getRegisterAssyncReset_OutRa();

	/**
	 * Returns the meta object for the reference '{@link processor.RegisterAssyncReset#getInRa <em>In Ra</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>In Ra</em>'.
	 * @see processor.RegisterAssyncReset#getInRa()
	 * @see #getRegisterAssyncReset()
	 * @generated
	 */
	EReference getRegisterAssyncReset_InRa();

	/**
	 * Returns the meta object for the reference '{@link processor.RegisterAssyncReset#getReset <em>Reset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reset</em>'.
	 * @see processor.RegisterAssyncReset#getReset()
	 * @see #getRegisterAssyncReset()
	 * @generated
	 */
	EReference getRegisterAssyncReset_Reset();

	/**
	 * Returns the meta object for the reference '{@link processor.RegisterAssyncReset#getClock <em>Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Clock</em>'.
	 * @see processor.RegisterAssyncReset#getClock()
	 * @see #getRegisterAssyncReset()
	 * @generated
	 */
	EReference getRegisterAssyncReset_Clock();

	/**
	 * Returns the meta object for the reference '{@link processor.RegisterAssyncReset#getLoad <em>Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Load</em>'.
	 * @see processor.RegisterAssyncReset#getLoad()
	 * @see #getRegisterAssyncReset()
	 * @generated
	 */
	EReference getRegisterAssyncReset_Load();

	/**
	 * Returns the meta object for class '{@link processor.Write <em>Write</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Write</em>'.
	 * @see processor.Write
	 * @generated
	 */
	EClass getWrite();

	/**
	 * Returns the meta object for the attribute '{@link processor.Write#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see processor.Write#isValue()
	 * @see #getWrite()
	 * @generated
	 */
	EAttribute getWrite_Value();

	/**
	 * Returns the meta object for class '{@link processor.Read <em>Read</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Read</em>'.
	 * @see processor.Read
	 * @generated
	 */
	EClass getRead();

	/**
	 * Returns the meta object for the attribute '{@link processor.Read#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see processor.Read#isValue()
	 * @see #getRead()
	 * @generated
	 */
	EAttribute getRead_Value();

	/**
	 * Returns the meta object for class '{@link processor.ReadWrite <em>Read Write</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Read Write</em>'.
	 * @see processor.ReadWrite
	 * @generated
	 */
	EClass getReadWrite();

	/**
	 * Returns the meta object for the attribute '{@link processor.ReadWrite#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see processor.ReadWrite#isValue()
	 * @see #getReadWrite()
	 * @generated
	 */
	EAttribute getReadWrite_Value();

	/**
	 * Returns the meta object for class '{@link processor.Register <em>Register</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Register</em>'.
	 * @see processor.Register
	 * @generated
	 */
	EClass getRegister();

	/**
	 * Returns the meta object for the attribute '{@link processor.Register#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see processor.Register#getValue()
	 * @see #getRegister()
	 * @generated
	 */
	EAttribute getRegister_Value();

	/**
	 * Returns the meta object for class '{@link processor.ControlUnit <em>Control Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Unit</em>'.
	 * @see processor.ControlUnit
	 * @generated
	 */
	EClass getControlUnit();

	/**
	 * Returns the meta object for the reference list '{@link processor.ControlUnit#getLoads <em>Loads</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Loads</em>'.
	 * @see processor.ControlUnit#getLoads()
	 * @see #getControlUnit()
	 * @generated
	 */
	EReference getControlUnit_Loads();

	/**
	 * Returns the meta object for the reference '{@link processor.ControlUnit#getWriteMemory <em>Write Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Write Memory</em>'.
	 * @see processor.ControlUnit#getWriteMemory()
	 * @see #getControlUnit()
	 * @generated
	 */
	EReference getControlUnit_WriteMemory();

	/**
	 * Returns the meta object for the reference '{@link processor.ControlUnit#getReadwritebit <em>Readwritebit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Readwritebit</em>'.
	 * @see processor.ControlUnit#getReadwritebit()
	 * @see #getControlUnit()
	 * @generated
	 */
	EReference getControlUnit_Readwritebit();

	/**
	 * Returns the meta object for the reference '{@link processor.ControlUnit#getSelControlUnit <em>Sel Control Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sel Control Unit</em>'.
	 * @see processor.ControlUnit#getSelControlUnit()
	 * @see #getControlUnit()
	 * @generated
	 */
	EReference getControlUnit_SelControlUnit();

	/**
	 * Returns the meta object for the attribute '{@link processor.ControlUnit#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see processor.ControlUnit#getState()
	 * @see #getControlUnit()
	 * @generated
	 */
	EAttribute getControlUnit_State();

	/**
	 * Returns the meta object for the attribute '{@link processor.ControlUnit#getInstructionSubstate <em>Instruction Substate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instruction Substate</em>'.
	 * @see processor.ControlUnit#getInstructionSubstate()
	 * @see #getControlUnit()
	 * @generated
	 */
	EAttribute getControlUnit_InstructionSubstate();

	/**
	 * Returns the meta object for class '{@link processor.ULA <em>ULA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ULA</em>'.
	 * @see processor.ULA
	 * @generated
	 */
	EClass getULA();

	/**
	 * Returns the meta object for the containment reference '{@link processor.ULA#getOpSel <em>Op Sel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Op Sel</em>'.
	 * @see processor.ULA#getOpSel()
	 * @see #getULA()
	 * @generated
	 */
	EReference getULA_OpSel();

	/**
	 * Returns the meta object for the reference '{@link processor.ULA#getUlastatus <em>Ulastatus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ulastatus</em>'.
	 * @see processor.ULA#getUlastatus()
	 * @see #getULA()
	 * @generated
	 */
	EReference getULA_Ulastatus();

	/**
	 * Returns the meta object for the reference list '{@link processor.ULA#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Operations</em>'.
	 * @see processor.ULA#getOperations()
	 * @see #getULA()
	 * @generated
	 */
	EReference getULA_Operations();

	/**
	 * Returns the meta object for the reference '{@link processor.ULA#getOpSelUla <em>Op Sel Ula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op Sel Ula</em>'.
	 * @see processor.ULA#getOpSelUla()
	 * @see #getULA()
	 * @generated
	 */
	EReference getULA_OpSelUla();

	/**
	 * Returns the meta object for the reference '{@link processor.ULA#getUlaOut <em>Ula Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ula Out</em>'.
	 * @see processor.ULA#getUlaOut()
	 * @see #getULA()
	 * @generated
	 */
	EReference getULA_UlaOut();

	/**
	 * Returns the meta object for class '{@link processor.InputBoolean <em>Input Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Boolean</em>'.
	 * @see processor.InputBoolean
	 * @generated
	 */
	EClass getInputBoolean();

	/**
	 * Returns the meta object for the attribute '{@link processor.InputBoolean#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see processor.InputBoolean#isValue()
	 * @see #getInputBoolean()
	 * @generated
	 */
	EAttribute getInputBoolean_Value();

	/**
	 * Returns the meta object for class '{@link processor.Reset <em>Reset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reset</em>'.
	 * @see processor.Reset
	 * @generated
	 */
	EClass getReset();

	/**
	 * Returns the meta object for the attribute '{@link processor.Reset#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see processor.Reset#isValue()
	 * @see #getReset()
	 * @generated
	 */
	EAttribute getReset_Value();

	/**
	 * Returns the meta object for class '{@link processor.Clock <em>Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clock</em>'.
	 * @see processor.Clock
	 * @generated
	 */
	EClass getClock();

	/**
	 * Returns the meta object for the attribute '{@link processor.Clock#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see processor.Clock#isValue()
	 * @see #getClock()
	 * @generated
	 */
	EAttribute getClock_Value();

	/**
	 * Returns the meta object for class '{@link processor.OutputBoolean <em>Output Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Boolean</em>'.
	 * @see processor.OutputBoolean
	 * @generated
	 */
	EClass getOutputBoolean();

	/**
	 * Returns the meta object for the attribute '{@link processor.OutputBoolean#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see processor.OutputBoolean#isValue()
	 * @see #getOutputBoolean()
	 * @generated
	 */
	EAttribute getOutputBoolean_Value();

	/**
	 * Returns the meta object for class '{@link processor.InputMultiplexor <em>Input Multiplexor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Multiplexor</em>'.
	 * @see processor.InputMultiplexor
	 * @generated
	 */
	EClass getInputMultiplexor();

	/**
	 * Returns the meta object for the attribute '{@link processor.InputMultiplexor#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see processor.InputMultiplexor#getValue()
	 * @see #getInputMultiplexor()
	 * @generated
	 */
	EAttribute getInputMultiplexor_Value();

	/**
	 * Returns the meta object for class '{@link processor.OutputMultiplexor <em>Output Multiplexor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Multiplexor</em>'.
	 * @see processor.OutputMultiplexor
	 * @generated
	 */
	EClass getOutputMultiplexor();

	/**
	 * Returns the meta object for the attribute '{@link processor.OutputMultiplexor#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see processor.OutputMultiplexor#getValue()
	 * @see #getOutputMultiplexor()
	 * @generated
	 */
	EAttribute getOutputMultiplexor_Value();

	/**
	 * Returns the meta object for class '{@link processor.OutputDemux <em>Output Demux</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Demux</em>'.
	 * @see processor.OutputDemux
	 * @generated
	 */
	EClass getOutputDemux();

	/**
	 * Returns the meta object for the attribute '{@link processor.OutputDemux#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see processor.OutputDemux#getValue()
	 * @see #getOutputDemux()
	 * @generated
	 */
	EAttribute getOutputDemux_Value();

	/**
	 * Returns the meta object for class '{@link processor.InputDemux <em>Input Demux</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Demux</em>'.
	 * @see processor.InputDemux
	 * @generated
	 */
	EClass getInputDemux();

	/**
	 * Returns the meta object for the attribute '{@link processor.InputDemux#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see processor.InputDemux#getValue()
	 * @see #getInputDemux()
	 * @generated
	 */
	EAttribute getInputDemux_Value();

	/**
	 * Returns the meta object for class '{@link processor.InputRegisterFile <em>Input Register File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Register File</em>'.
	 * @see processor.InputRegisterFile
	 * @generated
	 */
	EClass getInputRegisterFile();

	/**
	 * Returns the meta object for the attribute '{@link processor.InputRegisterFile#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see processor.InputRegisterFile#getValue()
	 * @see #getInputRegisterFile()
	 * @generated
	 */
	EAttribute getInputRegisterFile_Value();

	/**
	 * Returns the meta object for class '{@link processor.OutputRegisterFile <em>Output Register File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Register File</em>'.
	 * @see processor.OutputRegisterFile
	 * @generated
	 */
	EClass getOutputRegisterFile();

	/**
	 * Returns the meta object for the attribute '{@link processor.OutputRegisterFile#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see processor.OutputRegisterFile#getValue()
	 * @see #getOutputRegisterFile()
	 * @generated
	 */
	EAttribute getOutputRegisterFile_Value();

	/**
	 * Returns the meta object for class '{@link processor.InputRegisterAssync <em>Input Register Assync</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Register Assync</em>'.
	 * @see processor.InputRegisterAssync
	 * @generated
	 */
	EClass getInputRegisterAssync();

	/**
	 * Returns the meta object for the attribute '{@link processor.InputRegisterAssync#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see processor.InputRegisterAssync#getValue()
	 * @see #getInputRegisterAssync()
	 * @generated
	 */
	EAttribute getInputRegisterAssync_Value();

	/**
	 * Returns the meta object for class '{@link processor.OutputRegisterAssync <em>Output Register Assync</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Register Assync</em>'.
	 * @see processor.OutputRegisterAssync
	 * @generated
	 */
	EClass getOutputRegisterAssync();

	/**
	 * Returns the meta object for the attribute '{@link processor.OutputRegisterAssync#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see processor.OutputRegisterAssync#getValue()
	 * @see #getOutputRegisterAssync()
	 * @generated
	 */
	EAttribute getOutputRegisterAssync_Value();

	/**
	 * Returns the meta object for class '{@link processor.Load <em>Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Load</em>'.
	 * @see processor.Load
	 * @generated
	 */
	EClass getLoad();

	/**
	 * Returns the meta object for the attribute '{@link processor.Load#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see processor.Load#isValue()
	 * @see #getLoad()
	 * @generated
	 */
	EAttribute getLoad_Value();

	/**
	 * Returns the meta object for class '{@link processor.InputMemory <em>Input Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Memory</em>'.
	 * @see processor.InputMemory
	 * @generated
	 */
	EClass getInputMemory();

	/**
	 * Returns the meta object for the attribute '{@link processor.InputMemory#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see processor.InputMemory#getValue()
	 * @see #getInputMemory()
	 * @generated
	 */
	EAttribute getInputMemory_Value();

	/**
	 * Returns the meta object for class '{@link processor.OutputMemory <em>Output Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Memory</em>'.
	 * @see processor.OutputMemory
	 * @generated
	 */
	EClass getOutputMemory();

	/**
	 * Returns the meta object for the attribute '{@link processor.OutputMemory#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see processor.OutputMemory#getValue()
	 * @see #getOutputMemory()
	 * @generated
	 */
	EAttribute getOutputMemory_Value();

	/**
	 * Returns the meta object for class '{@link processor.AddressMemory <em>Address Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address Memory</em>'.
	 * @see processor.AddressMemory
	 * @generated
	 */
	EClass getAddressMemory();

	/**
	 * Returns the meta object for the attribute '{@link processor.AddressMemory#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see processor.AddressMemory#getValue()
	 * @see #getAddressMemory()
	 * @generated
	 */
	EAttribute getAddressMemory_Value();

	/**
	 * Returns the meta object for class '{@link processor.Memory <em>Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Memory</em>'.
	 * @see processor.Memory
	 * @generated
	 */
	EClass getMemory();

	/**
	 * Returns the meta object for the attribute '{@link processor.Memory#getMem <em>Mem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mem</em>'.
	 * @see processor.Memory#getMem()
	 * @see #getMemory()
	 * @generated
	 */
	EAttribute getMemory_Mem();

	/**
	 * Returns the meta object for the reference '{@link processor.Memory#getWrite <em>Write</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Write</em>'.
	 * @see processor.Memory#getWrite()
	 * @see #getMemory()
	 * @generated
	 */
	EReference getMemory_Write();

	/**
	 * Returns the meta object for the reference '{@link processor.Memory#getReset <em>Reset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reset</em>'.
	 * @see processor.Memory#getReset()
	 * @see #getMemory()
	 * @generated
	 */
	EReference getMemory_Reset();

	/**
	 * Returns the meta object for the reference '{@link processor.Memory#getClock <em>Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Clock</em>'.
	 * @see processor.Memory#getClock()
	 * @see #getMemory()
	 * @generated
	 */
	EReference getMemory_Clock();

	/**
	 * Returns the meta object for the reference '{@link processor.Memory#getDatai <em>Datai</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datai</em>'.
	 * @see processor.Memory#getDatai()
	 * @see #getMemory()
	 * @generated
	 */
	EReference getMemory_Datai();

	/**
	 * Returns the meta object for the reference '{@link processor.Memory#getDatao <em>Datao</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datao</em>'.
	 * @see processor.Memory#getDatao()
	 * @see #getMemory()
	 * @generated
	 */
	EReference getMemory_Datao();

	/**
	 * Returns the meta object for the reference '{@link processor.Memory#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Address</em>'.
	 * @see processor.Memory#getAddress()
	 * @see #getMemory()
	 * @generated
	 */
	EReference getMemory_Address();

	/**
	 * Returns the meta object for class '{@link processor.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see processor.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the attribute '{@link processor.Operation#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see processor.Operation#getValue()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Value();

	/**
	 * Returns the meta object for class '{@link processor.OutputULA <em>Output ULA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output ULA</em>'.
	 * @see processor.OutputULA
	 * @generated
	 */
	EClass getOutputULA();

	/**
	 * Returns the meta object for the attribute '{@link processor.OutputULA#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see processor.OutputULA#getValue()
	 * @see #getOutputULA()
	 * @generated
	 */
	EAttribute getOutputULA_Value();

	/**
	 * Returns the meta object for class '{@link processor.SeletorULA <em>Seletor ULA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Seletor ULA</em>'.
	 * @see processor.SeletorULA
	 * @generated
	 */
	EClass getSeletorULA();

	/**
	 * Returns the meta object for the attribute '{@link processor.SeletorULA#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see processor.SeletorULA#getValue()
	 * @see #getSeletorULA()
	 * @generated
	 */
	EAttribute getSeletorULA_Value();

	/**
	 * Returns the meta object for class '{@link processor.Status <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Status</em>'.
	 * @see processor.Status
	 * @generated
	 */
	EClass getStatus();

	/**
	 * Returns the meta object for the attribute '{@link processor.Status#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see processor.Status#isValue()
	 * @see #getStatus()
	 * @generated
	 */
	EAttribute getStatus_Value();

	/**
	 * Returns the meta object for class '{@link processor.LoadControlUnit <em>Load Control Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Load Control Unit</em>'.
	 * @see processor.LoadControlUnit
	 * @generated
	 */
	EClass getLoadControlUnit();

	/**
	 * Returns the meta object for the attribute '{@link processor.LoadControlUnit#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see processor.LoadControlUnit#isValue()
	 * @see #getLoadControlUnit()
	 * @generated
	 */
	EAttribute getLoadControlUnit_Value();

	/**
	 * Returns the meta object for class '{@link processor.SeletorControlUnit <em>Seletor Control Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Seletor Control Unit</em>'.
	 * @see processor.SeletorControlUnit
	 * @generated
	 */
	EClass getSeletorControlUnit();

	/**
	 * Returns the meta object for the attribute '{@link processor.SeletorControlUnit#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see processor.SeletorControlUnit#getValue()
	 * @see #getSeletorControlUnit()
	 * @generated
	 */
	EAttribute getSeletorControlUnit_Value();

	/**
	 * Returns the meta object for data type '<em>Array Integer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Array Integer</em>'.
	 * @model instanceClass="int[]"
	 * @generated
	 */
	EDataType getArrayInteger();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProcessorFactory getProcessorFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link processor.impl.MultiplexorImpl <em>Multiplexor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see processor.impl.MultiplexorImpl
		 * @see processor.impl.ProcessorPackageImpl#getMultiplexor()
		 * @generated
		 */
		EClass MULTIPLEXOR = eINSTANCE.getMultiplexor();

		/**
		 * The meta object literal for the '<em><b>Num Inputs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLEXOR__NUM_INPUTS = eINSTANCE.getMultiplexor_NumInputs();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIPLEXOR__INPUTS = eINSTANCE.getMultiplexor_Inputs();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIPLEXOR__OUTPUT = eINSTANCE.getMultiplexor_Output();

		/**
		 * The meta object literal for the '<em><b>Inout</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIPLEXOR__INOUT = eINSTANCE.getMultiplexor_Inout();

		/**
		 * The meta object literal for the '<em><b>Inputs Mul</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIPLEXOR__INPUTS_MUL = eINSTANCE.getMultiplexor_InputsMul();

		/**
		 * The meta object literal for the '<em><b>Output Mul</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIPLEXOR__OUTPUT_MUL = eINSTANCE.getMultiplexor_OutputMul();

		/**
		 * The meta object literal for the '{@link processor.impl.SeletorRegisterFileImpl <em>Seletor Register File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see processor.impl.SeletorRegisterFileImpl
		 * @see processor.impl.ProcessorPackageImpl#getSeletorRegisterFile()
		 * @generated
		 */
		EClass SELETOR_REGISTER_FILE = eINSTANCE.getSeletorRegisterFile();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELETOR_REGISTER_FILE__VALUE = eINSTANCE.getSeletorRegisterFile_Value();

		/**
		 * The meta object literal for the '{@link processor.impl.DemultiplexorImpl <em>Demultiplexor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see processor.impl.DemultiplexorImpl
		 * @see processor.impl.ProcessorPackageImpl#getDemultiplexor()
		 * @generated
		 */
		EClass DEMULTIPLEXOR = eINSTANCE.getDemultiplexor();

		/**
		 * The meta object literal for the '<em><b>Num Outputs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEMULTIPLEXOR__NUM_OUTPUTS = eINSTANCE.getDemultiplexor_NumOutputs();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEMULTIPLEXOR__OUTPUTS = eINSTANCE.getDemultiplexor_Outputs();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEMULTIPLEXOR__INPUT = eINSTANCE.getDemultiplexor_Input();

		/**
		 * The meta object literal for the '<em><b>Outin</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEMULTIPLEXOR__OUTIN = eINSTANCE.getDemultiplexor_Outin();

		/**
		 * The meta object literal for the '<em><b>Outputs Demux</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEMULTIPLEXOR__OUTPUTS_DEMUX = eINSTANCE.getDemultiplexor_OutputsDemux();

		/**
		 * The meta object literal for the '<em><b>Input Demux</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEMULTIPLEXOR__INPUT_DEMUX = eINSTANCE.getDemultiplexor_InputDemux();

		/**
		 * The meta object literal for the '{@link processor.impl.RegisterFileImpl <em>Register File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see processor.impl.RegisterFileImpl
		 * @see processor.impl.ProcessorPackageImpl#getRegisterFile()
		 * @generated
		 */
		EClass REGISTER_FILE = eINSTANCE.getRegisterFile();

		/**
		 * The meta object literal for the '<em><b>Sel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTER_FILE__SEL = eINSTANCE.getRegisterFile_Sel();

		/**
		 * The meta object literal for the '<em><b>Rw Bit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTER_FILE__RW_BIT = eINSTANCE.getRegisterFile_RwBit();

		/**
		 * The meta object literal for the '<em><b>Clock</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTER_FILE__CLOCK = eINSTANCE.getRegisterFile_Clock();

		/**
		 * The meta object literal for the '<em><b>Registers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTER_FILE__REGISTERS = eINSTANCE.getRegisterFile_Registers();

		/**
		 * The meta object literal for the '<em><b>In Rf</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTER_FILE__IN_RF = eINSTANCE.getRegisterFile_InRf();

		/**
		 * The meta object literal for the '<em><b>Out Rf</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTER_FILE__OUT_RF = eINSTANCE.getRegisterFile_OutRf();

		/**
		 * The meta object literal for the '{@link processor.impl.RegisterAssyncResetImpl <em>Register Assync Reset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see processor.impl.RegisterAssyncResetImpl
		 * @see processor.impl.ProcessorPackageImpl#getRegisterAssyncReset()
		 * @generated
		 */
		EClass REGISTER_ASSYNC_RESET = eINSTANCE.getRegisterAssyncReset();

		/**
		 * The meta object literal for the '<em><b>Internal Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTER_ASSYNC_RESET__INTERNAL_DATA = eINSTANCE.getRegisterAssyncReset_InternalData();

		/**
		 * The meta object literal for the '<em><b>Out Ra</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTER_ASSYNC_RESET__OUT_RA = eINSTANCE.getRegisterAssyncReset_OutRa();

		/**
		 * The meta object literal for the '<em><b>In Ra</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTER_ASSYNC_RESET__IN_RA = eINSTANCE.getRegisterAssyncReset_InRa();

		/**
		 * The meta object literal for the '<em><b>Reset</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTER_ASSYNC_RESET__RESET = eINSTANCE.getRegisterAssyncReset_Reset();

		/**
		 * The meta object literal for the '<em><b>Clock</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTER_ASSYNC_RESET__CLOCK = eINSTANCE.getRegisterAssyncReset_Clock();

		/**
		 * The meta object literal for the '<em><b>Load</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTER_ASSYNC_RESET__LOAD = eINSTANCE.getRegisterAssyncReset_Load();

		/**
		 * The meta object literal for the '{@link processor.impl.WriteImpl <em>Write</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see processor.impl.WriteImpl
		 * @see processor.impl.ProcessorPackageImpl#getWrite()
		 * @generated
		 */
		EClass WRITE = eINSTANCE.getWrite();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WRITE__VALUE = eINSTANCE.getWrite_Value();

		/**
		 * The meta object literal for the '{@link processor.impl.ReadImpl <em>Read</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see processor.impl.ReadImpl
		 * @see processor.impl.ProcessorPackageImpl#getRead()
		 * @generated
		 */
		EClass READ = eINSTANCE.getRead();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute READ__VALUE = eINSTANCE.getRead_Value();

		/**
		 * The meta object literal for the '{@link processor.impl.ReadWriteImpl <em>Read Write</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see processor.impl.ReadWriteImpl
		 * @see processor.impl.ProcessorPackageImpl#getReadWrite()
		 * @generated
		 */
		EClass READ_WRITE = eINSTANCE.getReadWrite();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute READ_WRITE__VALUE = eINSTANCE.getReadWrite_Value();

		/**
		 * The meta object literal for the '{@link processor.impl.RegisterImpl <em>Register</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see processor.impl.RegisterImpl
		 * @see processor.impl.ProcessorPackageImpl#getRegister()
		 * @generated
		 */
		EClass REGISTER = eINSTANCE.getRegister();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTER__VALUE = eINSTANCE.getRegister_Value();

		/**
		 * The meta object literal for the '{@link processor.impl.ControlUnitImpl <em>Control Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see processor.impl.ControlUnitImpl
		 * @see processor.impl.ProcessorPackageImpl#getControlUnit()
		 * @generated
		 */
		EClass CONTROL_UNIT = eINSTANCE.getControlUnit();

		/**
		 * The meta object literal for the '<em><b>Loads</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_UNIT__LOADS = eINSTANCE.getControlUnit_Loads();

		/**
		 * The meta object literal for the '<em><b>Write Memory</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_UNIT__WRITE_MEMORY = eINSTANCE.getControlUnit_WriteMemory();

		/**
		 * The meta object literal for the '<em><b>Readwritebit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_UNIT__READWRITEBIT = eINSTANCE.getControlUnit_Readwritebit();

		/**
		 * The meta object literal for the '<em><b>Sel Control Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_UNIT__SEL_CONTROL_UNIT = eINSTANCE.getControlUnit_SelControlUnit();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_UNIT__STATE = eINSTANCE.getControlUnit_State();

		/**
		 * The meta object literal for the '<em><b>Instruction Substate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_UNIT__INSTRUCTION_SUBSTATE = eINSTANCE.getControlUnit_InstructionSubstate();

		/**
		 * The meta object literal for the '{@link processor.impl.ULAImpl <em>ULA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see processor.impl.ULAImpl
		 * @see processor.impl.ProcessorPackageImpl#getULA()
		 * @generated
		 */
		EClass ULA = eINSTANCE.getULA();

		/**
		 * The meta object literal for the '<em><b>Op Sel</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ULA__OP_SEL = eINSTANCE.getULA_OpSel();

		/**
		 * The meta object literal for the '<em><b>Ulastatus</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ULA__ULASTATUS = eINSTANCE.getULA_Ulastatus();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ULA__OPERATIONS = eINSTANCE.getULA_Operations();

		/**
		 * The meta object literal for the '<em><b>Op Sel Ula</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ULA__OP_SEL_ULA = eINSTANCE.getULA_OpSelUla();

		/**
		 * The meta object literal for the '<em><b>Ula Out</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ULA__ULA_OUT = eINSTANCE.getULA_UlaOut();

		/**
		 * The meta object literal for the '{@link processor.impl.InputBooleanImpl <em>Input Boolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see processor.impl.InputBooleanImpl
		 * @see processor.impl.ProcessorPackageImpl#getInputBoolean()
		 * @generated
		 */
		EClass INPUT_BOOLEAN = eINSTANCE.getInputBoolean();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_BOOLEAN__VALUE = eINSTANCE.getInputBoolean_Value();

		/**
		 * The meta object literal for the '{@link processor.impl.ResetImpl <em>Reset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see processor.impl.ResetImpl
		 * @see processor.impl.ProcessorPackageImpl#getReset()
		 * @generated
		 */
		EClass RESET = eINSTANCE.getReset();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESET__VALUE = eINSTANCE.getReset_Value();

		/**
		 * The meta object literal for the '{@link processor.impl.ClockImpl <em>Clock</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see processor.impl.ClockImpl
		 * @see processor.impl.ProcessorPackageImpl#getClock()
		 * @generated
		 */
		EClass CLOCK = eINSTANCE.getClock();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOCK__VALUE = eINSTANCE.getClock_Value();

		/**
		 * The meta object literal for the '{@link processor.impl.OutputBooleanImpl <em>Output Boolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see processor.impl.OutputBooleanImpl
		 * @see processor.impl.ProcessorPackageImpl#getOutputBoolean()
		 * @generated
		 */
		EClass OUTPUT_BOOLEAN = eINSTANCE.getOutputBoolean();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_BOOLEAN__VALUE = eINSTANCE.getOutputBoolean_Value();

		/**
		 * The meta object literal for the '{@link processor.impl.InputMultiplexorImpl <em>Input Multiplexor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see processor.impl.InputMultiplexorImpl
		 * @see processor.impl.ProcessorPackageImpl#getInputMultiplexor()
		 * @generated
		 */
		EClass INPUT_MULTIPLEXOR = eINSTANCE.getInputMultiplexor();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_MULTIPLEXOR__VALUE = eINSTANCE.getInputMultiplexor_Value();

		/**
		 * The meta object literal for the '{@link processor.impl.OutputMultiplexorImpl <em>Output Multiplexor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see processor.impl.OutputMultiplexorImpl
		 * @see processor.impl.ProcessorPackageImpl#getOutputMultiplexor()
		 * @generated
		 */
		EClass OUTPUT_MULTIPLEXOR = eINSTANCE.getOutputMultiplexor();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_MULTIPLEXOR__VALUE = eINSTANCE.getOutputMultiplexor_Value();

		/**
		 * The meta object literal for the '{@link processor.impl.OutputDemuxImpl <em>Output Demux</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see processor.impl.OutputDemuxImpl
		 * @see processor.impl.ProcessorPackageImpl#getOutputDemux()
		 * @generated
		 */
		EClass OUTPUT_DEMUX = eINSTANCE.getOutputDemux();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_DEMUX__VALUE = eINSTANCE.getOutputDemux_Value();

		/**
		 * The meta object literal for the '{@link processor.impl.InputDemuxImpl <em>Input Demux</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see processor.impl.InputDemuxImpl
		 * @see processor.impl.ProcessorPackageImpl#getInputDemux()
		 * @generated
		 */
		EClass INPUT_DEMUX = eINSTANCE.getInputDemux();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_DEMUX__VALUE = eINSTANCE.getInputDemux_Value();

		/**
		 * The meta object literal for the '{@link processor.impl.InputRegisterFileImpl <em>Input Register File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see processor.impl.InputRegisterFileImpl
		 * @see processor.impl.ProcessorPackageImpl#getInputRegisterFile()
		 * @generated
		 */
		EClass INPUT_REGISTER_FILE = eINSTANCE.getInputRegisterFile();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_REGISTER_FILE__VALUE = eINSTANCE.getInputRegisterFile_Value();

		/**
		 * The meta object literal for the '{@link processor.impl.OutputRegisterFileImpl <em>Output Register File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see processor.impl.OutputRegisterFileImpl
		 * @see processor.impl.ProcessorPackageImpl#getOutputRegisterFile()
		 * @generated
		 */
		EClass OUTPUT_REGISTER_FILE = eINSTANCE.getOutputRegisterFile();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_REGISTER_FILE__VALUE = eINSTANCE.getOutputRegisterFile_Value();

		/**
		 * The meta object literal for the '{@link processor.impl.InputRegisterAssyncImpl <em>Input Register Assync</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see processor.impl.InputRegisterAssyncImpl
		 * @see processor.impl.ProcessorPackageImpl#getInputRegisterAssync()
		 * @generated
		 */
		EClass INPUT_REGISTER_ASSYNC = eINSTANCE.getInputRegisterAssync();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_REGISTER_ASSYNC__VALUE = eINSTANCE.getInputRegisterAssync_Value();

		/**
		 * The meta object literal for the '{@link processor.impl.OutputRegisterAssyncImpl <em>Output Register Assync</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see processor.impl.OutputRegisterAssyncImpl
		 * @see processor.impl.ProcessorPackageImpl#getOutputRegisterAssync()
		 * @generated
		 */
		EClass OUTPUT_REGISTER_ASSYNC = eINSTANCE.getOutputRegisterAssync();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_REGISTER_ASSYNC__VALUE = eINSTANCE.getOutputRegisterAssync_Value();

		/**
		 * The meta object literal for the '{@link processor.impl.LoadImpl <em>Load</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see processor.impl.LoadImpl
		 * @see processor.impl.ProcessorPackageImpl#getLoad()
		 * @generated
		 */
		EClass LOAD = eINSTANCE.getLoad();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD__VALUE = eINSTANCE.getLoad_Value();

		/**
		 * The meta object literal for the '{@link processor.impl.InputMemoryImpl <em>Input Memory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see processor.impl.InputMemoryImpl
		 * @see processor.impl.ProcessorPackageImpl#getInputMemory()
		 * @generated
		 */
		EClass INPUT_MEMORY = eINSTANCE.getInputMemory();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_MEMORY__VALUE = eINSTANCE.getInputMemory_Value();

		/**
		 * The meta object literal for the '{@link processor.impl.OutputMemoryImpl <em>Output Memory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see processor.impl.OutputMemoryImpl
		 * @see processor.impl.ProcessorPackageImpl#getOutputMemory()
		 * @generated
		 */
		EClass OUTPUT_MEMORY = eINSTANCE.getOutputMemory();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_MEMORY__VALUE = eINSTANCE.getOutputMemory_Value();

		/**
		 * The meta object literal for the '{@link processor.impl.AddressMemoryImpl <em>Address Memory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see processor.impl.AddressMemoryImpl
		 * @see processor.impl.ProcessorPackageImpl#getAddressMemory()
		 * @generated
		 */
		EClass ADDRESS_MEMORY = eINSTANCE.getAddressMemory();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS_MEMORY__VALUE = eINSTANCE.getAddressMemory_Value();

		/**
		 * The meta object literal for the '{@link processor.impl.MemoryImpl <em>Memory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see processor.impl.MemoryImpl
		 * @see processor.impl.ProcessorPackageImpl#getMemory()
		 * @generated
		 */
		EClass MEMORY = eINSTANCE.getMemory();

		/**
		 * The meta object literal for the '<em><b>Mem</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMORY__MEM = eINSTANCE.getMemory_Mem();

		/**
		 * The meta object literal for the '<em><b>Write</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMORY__WRITE = eINSTANCE.getMemory_Write();

		/**
		 * The meta object literal for the '<em><b>Reset</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMORY__RESET = eINSTANCE.getMemory_Reset();

		/**
		 * The meta object literal for the '<em><b>Clock</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMORY__CLOCK = eINSTANCE.getMemory_Clock();

		/**
		 * The meta object literal for the '<em><b>Datai</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMORY__DATAI = eINSTANCE.getMemory_Datai();

		/**
		 * The meta object literal for the '<em><b>Datao</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMORY__DATAO = eINSTANCE.getMemory_Datao();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMORY__ADDRESS = eINSTANCE.getMemory_Address();

		/**
		 * The meta object literal for the '{@link processor.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see processor.impl.OperationImpl
		 * @see processor.impl.ProcessorPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__VALUE = eINSTANCE.getOperation_Value();

		/**
		 * The meta object literal for the '{@link processor.impl.OutputULAImpl <em>Output ULA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see processor.impl.OutputULAImpl
		 * @see processor.impl.ProcessorPackageImpl#getOutputULA()
		 * @generated
		 */
		EClass OUTPUT_ULA = eINSTANCE.getOutputULA();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_ULA__VALUE = eINSTANCE.getOutputULA_Value();

		/**
		 * The meta object literal for the '{@link processor.impl.SeletorULAImpl <em>Seletor ULA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see processor.impl.SeletorULAImpl
		 * @see processor.impl.ProcessorPackageImpl#getSeletorULA()
		 * @generated
		 */
		EClass SELETOR_ULA = eINSTANCE.getSeletorULA();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELETOR_ULA__VALUE = eINSTANCE.getSeletorULA_Value();

		/**
		 * The meta object literal for the '{@link processor.impl.StatusImpl <em>Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see processor.impl.StatusImpl
		 * @see processor.impl.ProcessorPackageImpl#getStatus()
		 * @generated
		 */
		EClass STATUS = eINSTANCE.getStatus();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATUS__VALUE = eINSTANCE.getStatus_Value();

		/**
		 * The meta object literal for the '{@link processor.impl.LoadControlUnitImpl <em>Load Control Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see processor.impl.LoadControlUnitImpl
		 * @see processor.impl.ProcessorPackageImpl#getLoadControlUnit()
		 * @generated
		 */
		EClass LOAD_CONTROL_UNIT = eINSTANCE.getLoadControlUnit();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD_CONTROL_UNIT__VALUE = eINSTANCE.getLoadControlUnit_Value();

		/**
		 * The meta object literal for the '{@link processor.impl.SeletorControlUnitImpl <em>Seletor Control Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see processor.impl.SeletorControlUnitImpl
		 * @see processor.impl.ProcessorPackageImpl#getSeletorControlUnit()
		 * @generated
		 */
		EClass SELETOR_CONTROL_UNIT = eINSTANCE.getSeletorControlUnit();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELETOR_CONTROL_UNIT__VALUE = eINSTANCE.getSeletorControlUnit_Value();

		/**
		 * The meta object literal for the '<em>Array Integer</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see processor.impl.ProcessorPackageImpl#getArrayInteger()
		 * @generated
		 */
		EDataType ARRAY_INTEGER = eINSTANCE.getArrayInteger();

	}

} //ProcessorPackage
