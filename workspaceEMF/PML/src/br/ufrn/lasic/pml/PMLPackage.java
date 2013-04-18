/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.ufrn.lasic.pml;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see br.ufrn.lasic.pml.PMLFactory
 * @model kind="package"
 * @generated
 */
public interface PMLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pml";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://pml/0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pml";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PMLPackage eINSTANCE = br.ufrn.lasic.pml.impl.PMLPackageImpl.init();

	/**
	 * The meta object id for the '{@link br.ufrn.lasic.pml.impl.ULAImpl <em>ULA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufrn.lasic.pml.impl.ULAImpl
	 * @see br.ufrn.lasic.pml.impl.PMLPackageImpl#getULA()
	 * @generated
	 */
	int ULA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Behaviros ULA</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULA__BEHAVIROS_ULA = 1;

	/**
	 * The feature id for the '<em><b>Outputs ULA</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULA__OUTPUTS_ULA = 2;

	/**
	 * The feature id for the '<em><b>Inputs ULA</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULA__INPUTS_ULA = 3;

	/**
	 * The feature id for the '<em><b>Operations ULA</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULA__OPERATIONS_ULA = 4;

	/**
	 * The feature id for the '<em><b>Seletor ULA</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULA__SELETOR_ULA = 5;

	/**
	 * The number of structural features of the '<em>ULA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULA_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link br.ufrn.lasic.pml.impl.BehaviorImpl <em>Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufrn.lasic.pml.impl.BehaviorImpl
	 * @see br.ufrn.lasic.pml.impl.PMLPackageImpl#getBehavior()
	 * @generated
	 */
	int BEHAVIOR = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type Behavior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__TYPE_BEHAVIOR = 1;

	/**
	 * The number of structural features of the '<em>Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link br.ufrn.lasic.pml.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufrn.lasic.pml.impl.InputImpl
	 * @see br.ufrn.lasic.pml.impl.PMLPackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__LENGTH = 2;

	/**
	 * The feature id for the '<em><b>Inout</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__INOUT = 3;

	/**
	 * The feature id for the '<em><b>Sensitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__SENSITIVE = 4;

	/**
	 * The feature id for the '<em><b>Bit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__BIT = 5;

	/**
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link br.ufrn.lasic.pml.impl.OutputImpl <em>Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufrn.lasic.pml.impl.OutputImpl
	 * @see br.ufrn.lasic.pml.impl.PMLPackageImpl#getOutput()
	 * @generated
	 */
	int OUTPUT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Outin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__OUTIN = 2;

	/**
	 * The feature id for the '<em><b>Sensitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__SENSITIVE = 3;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__LENGTH = 4;

	/**
	 * The feature id for the '<em><b>Bit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__BIT = 5;

	/**
	 * The number of structural features of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link br.ufrn.lasic.pml.impl.DemultiplexorImpl <em>Demultiplexor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufrn.lasic.pml.impl.DemultiplexorImpl
	 * @see br.ufrn.lasic.pml.impl.PMLPackageImpl#getDemultiplexor()
	 * @generated
	 */
	int DEMULTIPLEXOR = 4;

	/**
	 * The feature id for the '<em><b>Behaviors Demux</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEMULTIPLEXOR__BEHAVIORS_DEMUX = 0;

	/**
	 * The feature id for the '<em><b>Indemux</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEMULTIPLEXOR__INDEMUX = 1;

	/**
	 * The feature id for the '<em><b>Outdemux</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEMULTIPLEXOR__OUTDEMUX = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEMULTIPLEXOR__NAME = 3;

	/**
	 * The feature id for the '<em><b>Seletordemux</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEMULTIPLEXOR__SELETORDEMUX = 4;

	/**
	 * The number of structural features of the '<em>Demultiplexor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEMULTIPLEXOR_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link br.ufrn.lasic.pml.impl.MultiplexorImpl <em>Multiplexor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufrn.lasic.pml.impl.MultiplexorImpl
	 * @see br.ufrn.lasic.pml.impl.PMLPackageImpl#getMultiplexor()
	 * @generated
	 */
	int MULTIPLEXOR = 5;

	/**
	 * The feature id for the '<em><b>Behaviormux</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLEXOR__BEHAVIORMUX = 0;

	/**
	 * The feature id for the '<em><b>Outmux</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLEXOR__OUTMUX = 1;

	/**
	 * The feature id for the '<em><b>Inmux</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLEXOR__INMUX = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLEXOR__NAME = 3;

	/**
	 * The feature id for the '<em><b>Seletormux</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLEXOR__SELETORMUX = 4;

	/**
	 * The number of structural features of the '<em>Multiplexor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLEXOR_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link br.ufrn.lasic.pml.impl.ControlUnitImpl <em>Control Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufrn.lasic.pml.impl.ControlUnitImpl
	 * @see br.ufrn.lasic.pml.impl.PMLPackageImpl#getControlUnit()
	 * @generated
	 */
	int CONTROL_UNIT = 6;

	/**
	 * The feature id for the '<em><b>Behaviors Control Unit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__BEHAVIORS_CONTROL_UNIT = 0;

	/**
	 * The feature id for the '<em><b>Inputs Control Unit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__INPUTS_CONTROL_UNIT = 1;

	/**
	 * The feature id for the '<em><b>Outputs Control Unit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__OUTPUTS_CONTROL_UNIT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__NAME = 3;

	/**
	 * The feature id for the '<em><b>Intructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__INTRUCTIONS = 4;

	/**
	 * The number of structural features of the '<em>Control Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link br.ufrn.lasic.pml.impl.ProcessorImpl <em>Processor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufrn.lasic.pml.impl.ProcessorImpl
	 * @see br.ufrn.lasic.pml.impl.PMLPackageImpl#getProcessor()
	 * @generated
	 */
	int PROCESSOR = 7;

	/**
	 * The feature id for the '<em><b>Demux</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__DEMUX = 0;

	/**
	 * The feature id for the '<em><b>Ulas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__ULAS = 1;

	/**
	 * The feature id for the '<em><b>Registers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__REGISTERS = 2;

	/**
	 * The feature id for the '<em><b>Memories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__MEMORIES = 3;

	/**
	 * The feature id for the '<em><b>Mux</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__MUX = 4;

	/**
	 * The feature id for the '<em><b>Control Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__CONTROL_UNITS = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__NAME = 6;

	/**
	 * The feature id for the '<em><b>Decoders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__DECODERS = 7;

	/**
	 * The feature id for the '<em><b>Initial Stage Pipeline</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__INITIAL_STAGE_PIPELINE = 8;

	/**
	 * The number of structural features of the '<em>Processor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link br.ufrn.lasic.pml.impl.MemoryImpl <em>Memory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufrn.lasic.pml.impl.MemoryImpl
	 * @see br.ufrn.lasic.pml.impl.PMLPackageImpl#getMemory()
	 * @generated
	 */
	int MEMORY = 8;

	/**
	 * The feature id for the '<em><b>Behaviors Memory</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__BEHAVIORS_MEMORY = 0;

	/**
	 * The feature id for the '<em><b>Input Memory</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__INPUT_MEMORY = 1;

	/**
	 * The feature id for the '<em><b>Output Memory</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__OUTPUT_MEMORY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__NAME = 3;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__LENGTH = 4;

	/**
	 * The number of structural features of the '<em>Memory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link br.ufrn.lasic.pml.impl.RegisterImpl <em>Register</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufrn.lasic.pml.impl.RegisterImpl
	 * @see br.ufrn.lasic.pml.impl.PMLPackageImpl#getRegister()
	 * @generated
	 */
	int REGISTER = 9;

	/**
	 * The feature id for the '<em><b>Behavior Register</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER__BEHAVIOR_REGISTER = 0;

	/**
	 * The feature id for the '<em><b>Output Register</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER__OUTPUT_REGISTER = 1;

	/**
	 * The feature id for the '<em><b>Input Register</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER__INPUT_REGISTER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER__NAME = 3;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER__LENGTH = 4;

	/**
	 * The number of structural features of the '<em>Register</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link br.ufrn.lasic.pml.impl.InstructionsImpl <em>Instructions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufrn.lasic.pml.impl.InstructionsImpl
	 * @see br.ufrn.lasic.pml.impl.PMLPackageImpl#getInstructions()
	 * @generated
	 */
	int INSTRUCTIONS = 10;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTIONS__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTIONS__NAME = 1;

	/**
	 * The feature id for the '<em><b>Initial</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTIONS__INITIAL = 2;

	/**
	 * The number of structural features of the '<em>Instructions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTIONS_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link br.ufrn.lasic.pml.impl.MicroInstructionImpl <em>Micro Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufrn.lasic.pml.impl.MicroInstructionImpl
	 * @see br.ufrn.lasic.pml.impl.PMLPackageImpl#getMicroInstruction()
	 * @generated
	 */
	int MICRO_INSTRUCTION = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICRO_INSTRUCTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICRO_INSTRUCTION__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Next Microinstruction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICRO_INSTRUCTION__NEXT_MICROINSTRUCTION = 2;

	/**
	 * The feature id for the '<em><b>Final</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICRO_INSTRUCTION__FINAL = 3;

	/**
	 * The number of structural features of the '<em>Micro Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICRO_INSTRUCTION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link br.ufrn.lasic.pml.impl.InitialMicroInstructionImpl <em>Initial Micro Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufrn.lasic.pml.impl.InitialMicroInstructionImpl
	 * @see br.ufrn.lasic.pml.impl.PMLPackageImpl#getInitialMicroInstruction()
	 * @generated
	 */
	int INITIAL_MICRO_INSTRUCTION = 12;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MICRO_INSTRUCTION__NEXT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MICRO_INSTRUCTION__NAME = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MICRO_INSTRUCTION__VALUE = 2;

	/**
	 * The feature id for the '<em><b>Direct Final Micro Instruction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MICRO_INSTRUCTION__DIRECT_FINAL_MICRO_INSTRUCTION = 3;

	/**
	 * The number of structural features of the '<em>Initial Micro Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MICRO_INSTRUCTION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link br.ufrn.lasic.pml.impl.FinalMicroInstructionImpl <em>Final Micro Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufrn.lasic.pml.impl.FinalMicroInstructionImpl
	 * @see br.ufrn.lasic.pml.impl.PMLPackageImpl#getFinalMicroInstruction()
	 * @generated
	 */
	int FINAL_MICRO_INSTRUCTION = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_MICRO_INSTRUCTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_MICRO_INSTRUCTION__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Final Micro Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_MICRO_INSTRUCTION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link br.ufrn.lasic.pml.impl.SeletorImpl <em>Seletor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufrn.lasic.pml.impl.SeletorImpl
	 * @see br.ufrn.lasic.pml.impl.PMLPackageImpl#getSeletor()
	 * @generated
	 */
	int SELETOR = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELETOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELETOR__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Lengh</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELETOR__LENGH = 2;

	/**
	 * The feature id for the '<em><b>Bit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELETOR__BIT = 3;

	/**
	 * The number of structural features of the '<em>Seletor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELETOR_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link br.ufrn.lasic.pml.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufrn.lasic.pml.impl.OperationImpl
	 * @see br.ufrn.lasic.pml.impl.PMLPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = 0;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link br.ufrn.lasic.pml.impl.DecoderImpl <em>Decoder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufrn.lasic.pml.impl.DecoderImpl
	 * @see br.ufrn.lasic.pml.impl.PMLPackageImpl#getDecoder()
	 * @generated
	 */
	int DECODER = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECODER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Out Decoder</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECODER__OUT_DECODER = 1;

	/**
	 * The feature id for the '<em><b>In Decoder</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECODER__IN_DECODER = 2;

	/**
	 * The feature id for the '<em><b>Behavior Decoder</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECODER__BEHAVIOR_DECODER = 3;

	/**
	 * The number of structural features of the '<em>Decoder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECODER_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link br.ufrn.lasic.pml.impl.PipelineInitialStageImpl <em>Pipeline Initial Stage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufrn.lasic.pml.impl.PipelineInitialStageImpl
	 * @see br.ufrn.lasic.pml.impl.PMLPackageImpl#getPipelineInitialStage()
	 * @generated
	 */
	int PIPELINE_INITIAL_STAGE = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE_INITIAL_STAGE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Next State Pipeline</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE_INITIAL_STAGE__NEXT_STATE_PIPELINE = 1;

	/**
	 * The number of structural features of the '<em>Pipeline Initial Stage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE_INITIAL_STAGE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link br.ufrn.lasic.pml.impl.PipelineNextStageImpl <em>Pipeline Next Stage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufrn.lasic.pml.impl.PipelineNextStageImpl
	 * @see br.ufrn.lasic.pml.impl.PMLPackageImpl#getPipelineNextStage()
	 * @generated
	 */
	int PIPELINE_NEXT_STAGE = 18;

	/**
	 * The feature id for the '<em><b>Pipeline Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE_NEXT_STAGE__PIPELINE_NEXT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE_NEXT_STAGE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Pipeline Next Stage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE_NEXT_STAGE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link br.ufrn.lasic.pml.TypeComponent <em>Type Component</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufrn.lasic.pml.TypeComponent
	 * @see br.ufrn.lasic.pml.impl.PMLPackageImpl#getTypeComponent()
	 * @generated
	 */
	int TYPE_COMPONENT = 19;

	/**
	 * The meta object id for the '{@link br.ufrn.lasic.pml.TypeData <em>Type Data</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufrn.lasic.pml.TypeData
	 * @see br.ufrn.lasic.pml.impl.PMLPackageImpl#getTypeData()
	 * @generated
	 */
	int TYPE_DATA = 20;


	/**
	 * Returns the meta object for class '{@link br.ufrn.lasic.pml.ULA <em>ULA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ULA</em>'.
	 * @see br.ufrn.lasic.pml.ULA
	 * @generated
	 */
	EClass getULA();

	/**
	 * Returns the meta object for the attribute '{@link br.ufrn.lasic.pml.ULA#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.ufrn.lasic.pml.ULA#getName()
	 * @see #getULA()
	 * @generated
	 */
	EAttribute getULA_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link br.ufrn.lasic.pml.ULA#getBehavirosULA <em>Behaviros ULA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Behaviros ULA</em>'.
	 * @see br.ufrn.lasic.pml.ULA#getBehavirosULA()
	 * @see #getULA()
	 * @generated
	 */
	EReference getULA_BehavirosULA();

	/**
	 * Returns the meta object for the containment reference list '{@link br.ufrn.lasic.pml.ULA#getOutputsULA <em>Outputs ULA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outputs ULA</em>'.
	 * @see br.ufrn.lasic.pml.ULA#getOutputsULA()
	 * @see #getULA()
	 * @generated
	 */
	EReference getULA_OutputsULA();

	/**
	 * Returns the meta object for the containment reference list '{@link br.ufrn.lasic.pml.ULA#getInputsULA <em>Inputs ULA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs ULA</em>'.
	 * @see br.ufrn.lasic.pml.ULA#getInputsULA()
	 * @see #getULA()
	 * @generated
	 */
	EReference getULA_InputsULA();

	/**
	 * Returns the meta object for the containment reference list '{@link br.ufrn.lasic.pml.ULA#getOperationsULA <em>Operations ULA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations ULA</em>'.
	 * @see br.ufrn.lasic.pml.ULA#getOperationsULA()
	 * @see #getULA()
	 * @generated
	 */
	EReference getULA_OperationsULA();

	/**
	 * Returns the meta object for the containment reference '{@link br.ufrn.lasic.pml.ULA#getSeletorULA <em>Seletor ULA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Seletor ULA</em>'.
	 * @see br.ufrn.lasic.pml.ULA#getSeletorULA()
	 * @see #getULA()
	 * @generated
	 */
	EReference getULA_SeletorULA();

	/**
	 * Returns the meta object for class '{@link br.ufrn.lasic.pml.Behavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior</em>'.
	 * @see br.ufrn.lasic.pml.Behavior
	 * @generated
	 */
	EClass getBehavior();

	/**
	 * Returns the meta object for the attribute '{@link br.ufrn.lasic.pml.Behavior#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.ufrn.lasic.pml.Behavior#getName()
	 * @see #getBehavior()
	 * @generated
	 */
	EAttribute getBehavior_Name();

	/**
	 * Returns the meta object for the attribute '{@link br.ufrn.lasic.pml.Behavior#getTypeBehavior <em>Type Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Behavior</em>'.
	 * @see br.ufrn.lasic.pml.Behavior#getTypeBehavior()
	 * @see #getBehavior()
	 * @generated
	 */
	EAttribute getBehavior_TypeBehavior();

	/**
	 * Returns the meta object for class '{@link br.ufrn.lasic.pml.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see br.ufrn.lasic.pml.Input
	 * @generated
	 */
	EClass getInput();

	/**
	 * Returns the meta object for the attribute '{@link br.ufrn.lasic.pml.Input#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.ufrn.lasic.pml.Input#getName()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Name();

	/**
	 * Returns the meta object for the attribute '{@link br.ufrn.lasic.pml.Input#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see br.ufrn.lasic.pml.Input#getType()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Type();

	/**
	 * Returns the meta object for the attribute '{@link br.ufrn.lasic.pml.Input#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see br.ufrn.lasic.pml.Input#getLength()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Length();

	/**
	 * Returns the meta object for the reference '{@link br.ufrn.lasic.pml.Input#getInout <em>Inout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inout</em>'.
	 * @see br.ufrn.lasic.pml.Input#getInout()
	 * @see #getInput()
	 * @generated
	 */
	EReference getInput_Inout();

	/**
	 * Returns the meta object for the attribute '{@link br.ufrn.lasic.pml.Input#isSensitive <em>Sensitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sensitive</em>'.
	 * @see br.ufrn.lasic.pml.Input#isSensitive()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Sensitive();

	/**
	 * Returns the meta object for the attribute '{@link br.ufrn.lasic.pml.Input#getBit <em>Bit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bit</em>'.
	 * @see br.ufrn.lasic.pml.Input#getBit()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Bit();

	/**
	 * Returns the meta object for class '{@link br.ufrn.lasic.pml.Output <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output</em>'.
	 * @see br.ufrn.lasic.pml.Output
	 * @generated
	 */
	EClass getOutput();

	/**
	 * Returns the meta object for the attribute '{@link br.ufrn.lasic.pml.Output#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.ufrn.lasic.pml.Output#getName()
	 * @see #getOutput()
	 * @generated
	 */
	EAttribute getOutput_Name();

	/**
	 * Returns the meta object for the attribute '{@link br.ufrn.lasic.pml.Output#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see br.ufrn.lasic.pml.Output#getType()
	 * @see #getOutput()
	 * @generated
	 */
	EAttribute getOutput_Type();

	/**
	 * Returns the meta object for the reference '{@link br.ufrn.lasic.pml.Output#getOutin <em>Outin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Outin</em>'.
	 * @see br.ufrn.lasic.pml.Output#getOutin()
	 * @see #getOutput()
	 * @generated
	 */
	EReference getOutput_Outin();

	/**
	 * Returns the meta object for the attribute '{@link br.ufrn.lasic.pml.Output#isSensitive <em>Sensitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sensitive</em>'.
	 * @see br.ufrn.lasic.pml.Output#isSensitive()
	 * @see #getOutput()
	 * @generated
	 */
	EAttribute getOutput_Sensitive();

	/**
	 * Returns the meta object for the attribute '{@link br.ufrn.lasic.pml.Output#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see br.ufrn.lasic.pml.Output#getLength()
	 * @see #getOutput()
	 * @generated
	 */
	EAttribute getOutput_Length();

	/**
	 * Returns the meta object for the attribute '{@link br.ufrn.lasic.pml.Output#getBit <em>Bit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bit</em>'.
	 * @see br.ufrn.lasic.pml.Output#getBit()
	 * @see #getOutput()
	 * @generated
	 */
	EAttribute getOutput_Bit();

	/**
	 * Returns the meta object for class '{@link br.ufrn.lasic.pml.Demultiplexor <em>Demultiplexor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Demultiplexor</em>'.
	 * @see br.ufrn.lasic.pml.Demultiplexor
	 * @generated
	 */
	EClass getDemultiplexor();

	/**
	 * Returns the meta object for the containment reference list '{@link br.ufrn.lasic.pml.Demultiplexor#getBehaviorsDemux <em>Behaviors Demux</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Behaviors Demux</em>'.
	 * @see br.ufrn.lasic.pml.Demultiplexor#getBehaviorsDemux()
	 * @see #getDemultiplexor()
	 * @generated
	 */
	EReference getDemultiplexor_BehaviorsDemux();

	/**
	 * Returns the meta object for the containment reference '{@link br.ufrn.lasic.pml.Demultiplexor#getIndemux <em>Indemux</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Indemux</em>'.
	 * @see br.ufrn.lasic.pml.Demultiplexor#getIndemux()
	 * @see #getDemultiplexor()
	 * @generated
	 */
	EReference getDemultiplexor_Indemux();

	/**
	 * Returns the meta object for the containment reference '{@link br.ufrn.lasic.pml.Demultiplexor#getOutdemux <em>Outdemux</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Outdemux</em>'.
	 * @see br.ufrn.lasic.pml.Demultiplexor#getOutdemux()
	 * @see #getDemultiplexor()
	 * @generated
	 */
	EReference getDemultiplexor_Outdemux();

	/**
	 * Returns the meta object for the attribute '{@link br.ufrn.lasic.pml.Demultiplexor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.ufrn.lasic.pml.Demultiplexor#getName()
	 * @see #getDemultiplexor()
	 * @generated
	 */
	EAttribute getDemultiplexor_Name();

	/**
	 * Returns the meta object for the containment reference '{@link br.ufrn.lasic.pml.Demultiplexor#getSeletordemux <em>Seletordemux</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Seletordemux</em>'.
	 * @see br.ufrn.lasic.pml.Demultiplexor#getSeletordemux()
	 * @see #getDemultiplexor()
	 * @generated
	 */
	EReference getDemultiplexor_Seletordemux();

	/**
	 * Returns the meta object for class '{@link br.ufrn.lasic.pml.Multiplexor <em>Multiplexor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiplexor</em>'.
	 * @see br.ufrn.lasic.pml.Multiplexor
	 * @generated
	 */
	EClass getMultiplexor();

	/**
	 * Returns the meta object for the containment reference list '{@link br.ufrn.lasic.pml.Multiplexor#getBehaviormux <em>Behaviormux</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Behaviormux</em>'.
	 * @see br.ufrn.lasic.pml.Multiplexor#getBehaviormux()
	 * @see #getMultiplexor()
	 * @generated
	 */
	EReference getMultiplexor_Behaviormux();

	/**
	 * Returns the meta object for the containment reference '{@link br.ufrn.lasic.pml.Multiplexor#getOutmux <em>Outmux</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Outmux</em>'.
	 * @see br.ufrn.lasic.pml.Multiplexor#getOutmux()
	 * @see #getMultiplexor()
	 * @generated
	 */
	EReference getMultiplexor_Outmux();

	/**
	 * Returns the meta object for the containment reference '{@link br.ufrn.lasic.pml.Multiplexor#getInmux <em>Inmux</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inmux</em>'.
	 * @see br.ufrn.lasic.pml.Multiplexor#getInmux()
	 * @see #getMultiplexor()
	 * @generated
	 */
	EReference getMultiplexor_Inmux();

	/**
	 * Returns the meta object for the attribute '{@link br.ufrn.lasic.pml.Multiplexor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.ufrn.lasic.pml.Multiplexor#getName()
	 * @see #getMultiplexor()
	 * @generated
	 */
	EAttribute getMultiplexor_Name();

	/**
	 * Returns the meta object for the containment reference '{@link br.ufrn.lasic.pml.Multiplexor#getSeletormux <em>Seletormux</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Seletormux</em>'.
	 * @see br.ufrn.lasic.pml.Multiplexor#getSeletormux()
	 * @see #getMultiplexor()
	 * @generated
	 */
	EReference getMultiplexor_Seletormux();

	/**
	 * Returns the meta object for class '{@link br.ufrn.lasic.pml.ControlUnit <em>Control Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Unit</em>'.
	 * @see br.ufrn.lasic.pml.ControlUnit
	 * @generated
	 */
	EClass getControlUnit();

	/**
	 * Returns the meta object for the containment reference list '{@link br.ufrn.lasic.pml.ControlUnit#getBehaviorsControlUnit <em>Behaviors Control Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Behaviors Control Unit</em>'.
	 * @see br.ufrn.lasic.pml.ControlUnit#getBehaviorsControlUnit()
	 * @see #getControlUnit()
	 * @generated
	 */
	EReference getControlUnit_BehaviorsControlUnit();

	/**
	 * Returns the meta object for the containment reference list '{@link br.ufrn.lasic.pml.ControlUnit#getInputsControlUnit <em>Inputs Control Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs Control Unit</em>'.
	 * @see br.ufrn.lasic.pml.ControlUnit#getInputsControlUnit()
	 * @see #getControlUnit()
	 * @generated
	 */
	EReference getControlUnit_InputsControlUnit();

	/**
	 * Returns the meta object for the containment reference list '{@link br.ufrn.lasic.pml.ControlUnit#getOutputsControlUnit <em>Outputs Control Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outputs Control Unit</em>'.
	 * @see br.ufrn.lasic.pml.ControlUnit#getOutputsControlUnit()
	 * @see #getControlUnit()
	 * @generated
	 */
	EReference getControlUnit_OutputsControlUnit();

	/**
	 * Returns the meta object for the attribute '{@link br.ufrn.lasic.pml.ControlUnit#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.ufrn.lasic.pml.ControlUnit#getName()
	 * @see #getControlUnit()
	 * @generated
	 */
	EAttribute getControlUnit_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link br.ufrn.lasic.pml.ControlUnit#getIntructions <em>Intructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Intructions</em>'.
	 * @see br.ufrn.lasic.pml.ControlUnit#getIntructions()
	 * @see #getControlUnit()
	 * @generated
	 */
	EReference getControlUnit_Intructions();

	/**
	 * Returns the meta object for class '{@link br.ufrn.lasic.pml.Processor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processor</em>'.
	 * @see br.ufrn.lasic.pml.Processor
	 * @generated
	 */
	EClass getProcessor();

	/**
	 * Returns the meta object for the containment reference list '{@link br.ufrn.lasic.pml.Processor#getDemux <em>Demux</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Demux</em>'.
	 * @see br.ufrn.lasic.pml.Processor#getDemux()
	 * @see #getProcessor()
	 * @generated
	 */
	EReference getProcessor_Demux();

	/**
	 * Returns the meta object for the containment reference list '{@link br.ufrn.lasic.pml.Processor#getUlas <em>Ulas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ulas</em>'.
	 * @see br.ufrn.lasic.pml.Processor#getUlas()
	 * @see #getProcessor()
	 * @generated
	 */
	EReference getProcessor_Ulas();

	/**
	 * Returns the meta object for the containment reference list '{@link br.ufrn.lasic.pml.Processor#getRegisters <em>Registers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Registers</em>'.
	 * @see br.ufrn.lasic.pml.Processor#getRegisters()
	 * @see #getProcessor()
	 * @generated
	 */
	EReference getProcessor_Registers();

	/**
	 * Returns the meta object for the containment reference list '{@link br.ufrn.lasic.pml.Processor#getMemories <em>Memories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Memories</em>'.
	 * @see br.ufrn.lasic.pml.Processor#getMemories()
	 * @see #getProcessor()
	 * @generated
	 */
	EReference getProcessor_Memories();

	/**
	 * Returns the meta object for the containment reference list '{@link br.ufrn.lasic.pml.Processor#getMux <em>Mux</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mux</em>'.
	 * @see br.ufrn.lasic.pml.Processor#getMux()
	 * @see #getProcessor()
	 * @generated
	 */
	EReference getProcessor_Mux();

	/**
	 * Returns the meta object for the containment reference list '{@link br.ufrn.lasic.pml.Processor#getControlUnits <em>Control Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Control Units</em>'.
	 * @see br.ufrn.lasic.pml.Processor#getControlUnits()
	 * @see #getProcessor()
	 * @generated
	 */
	EReference getProcessor_ControlUnits();

	/**
	 * Returns the meta object for the attribute '{@link br.ufrn.lasic.pml.Processor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.ufrn.lasic.pml.Processor#getName()
	 * @see #getProcessor()
	 * @generated
	 */
	EAttribute getProcessor_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link br.ufrn.lasic.pml.Processor#getDecoders <em>Decoders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Decoders</em>'.
	 * @see br.ufrn.lasic.pml.Processor#getDecoders()
	 * @see #getProcessor()
	 * @generated
	 */
	EReference getProcessor_Decoders();

	/**
	 * Returns the meta object for the containment reference '{@link br.ufrn.lasic.pml.Processor#getInitialStagePipeline <em>Initial Stage Pipeline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initial Stage Pipeline</em>'.
	 * @see br.ufrn.lasic.pml.Processor#getInitialStagePipeline()
	 * @see #getProcessor()
	 * @generated
	 */
	EReference getProcessor_InitialStagePipeline();

	/**
	 * Returns the meta object for class '{@link br.ufrn.lasic.pml.Memory <em>Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Memory</em>'.
	 * @see br.ufrn.lasic.pml.Memory
	 * @generated
	 */
	EClass getMemory();

	/**
	 * Returns the meta object for the containment reference list '{@link br.ufrn.lasic.pml.Memory#getBehaviorsMemory <em>Behaviors Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Behaviors Memory</em>'.
	 * @see br.ufrn.lasic.pml.Memory#getBehaviorsMemory()
	 * @see #getMemory()
	 * @generated
	 */
	EReference getMemory_BehaviorsMemory();

	/**
	 * Returns the meta object for the containment reference list '{@link br.ufrn.lasic.pml.Memory#getInputMemory <em>Input Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Memory</em>'.
	 * @see br.ufrn.lasic.pml.Memory#getInputMemory()
	 * @see #getMemory()
	 * @generated
	 */
	EReference getMemory_InputMemory();

	/**
	 * Returns the meta object for the containment reference list '{@link br.ufrn.lasic.pml.Memory#getOutputMemory <em>Output Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output Memory</em>'.
	 * @see br.ufrn.lasic.pml.Memory#getOutputMemory()
	 * @see #getMemory()
	 * @generated
	 */
	EReference getMemory_OutputMemory();

	/**
	 * Returns the meta object for the attribute '{@link br.ufrn.lasic.pml.Memory#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.ufrn.lasic.pml.Memory#getName()
	 * @see #getMemory()
	 * @generated
	 */
	EAttribute getMemory_Name();

	/**
	 * Returns the meta object for the attribute '{@link br.ufrn.lasic.pml.Memory#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see br.ufrn.lasic.pml.Memory#getLength()
	 * @see #getMemory()
	 * @generated
	 */
	EAttribute getMemory_Length();

	/**
	 * Returns the meta object for class '{@link br.ufrn.lasic.pml.Register <em>Register</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Register</em>'.
	 * @see br.ufrn.lasic.pml.Register
	 * @generated
	 */
	EClass getRegister();

	/**
	 * Returns the meta object for the containment reference list '{@link br.ufrn.lasic.pml.Register#getBehaviorRegister <em>Behavior Register</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Behavior Register</em>'.
	 * @see br.ufrn.lasic.pml.Register#getBehaviorRegister()
	 * @see #getRegister()
	 * @generated
	 */
	EReference getRegister_BehaviorRegister();

	/**
	 * Returns the meta object for the containment reference list '{@link br.ufrn.lasic.pml.Register#getOutputRegister <em>Output Register</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output Register</em>'.
	 * @see br.ufrn.lasic.pml.Register#getOutputRegister()
	 * @see #getRegister()
	 * @generated
	 */
	EReference getRegister_OutputRegister();

	/**
	 * Returns the meta object for the containment reference list '{@link br.ufrn.lasic.pml.Register#getInputRegister <em>Input Register</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Register</em>'.
	 * @see br.ufrn.lasic.pml.Register#getInputRegister()
	 * @see #getRegister()
	 * @generated
	 */
	EReference getRegister_InputRegister();

	/**
	 * Returns the meta object for the attribute '{@link br.ufrn.lasic.pml.Register#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.ufrn.lasic.pml.Register#getName()
	 * @see #getRegister()
	 * @generated
	 */
	EAttribute getRegister_Name();

	/**
	 * Returns the meta object for the attribute '{@link br.ufrn.lasic.pml.Register#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see br.ufrn.lasic.pml.Register#getLength()
	 * @see #getRegister()
	 * @generated
	 */
	EAttribute getRegister_Length();

	/**
	 * Returns the meta object for class '{@link br.ufrn.lasic.pml.Instructions <em>Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instructions</em>'.
	 * @see br.ufrn.lasic.pml.Instructions
	 * @generated
	 */
	EClass getInstructions();

	/**
	 * Returns the meta object for the attribute '{@link br.ufrn.lasic.pml.Instructions#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see br.ufrn.lasic.pml.Instructions#getType()
	 * @see #getInstructions()
	 * @generated
	 */
	EAttribute getInstructions_Type();

	/**
	 * Returns the meta object for the attribute '{@link br.ufrn.lasic.pml.Instructions#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.ufrn.lasic.pml.Instructions#getName()
	 * @see #getInstructions()
	 * @generated
	 */
	EAttribute getInstructions_Name();

	/**
	 * Returns the meta object for the containment reference '{@link br.ufrn.lasic.pml.Instructions#getInitial <em>Initial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initial</em>'.
	 * @see br.ufrn.lasic.pml.Instructions#getInitial()
	 * @see #getInstructions()
	 * @generated
	 */
	EReference getInstructions_Initial();

	/**
	 * Returns the meta object for class '{@link br.ufrn.lasic.pml.MicroInstruction <em>Micro Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Micro Instruction</em>'.
	 * @see br.ufrn.lasic.pml.MicroInstruction
	 * @generated
	 */
	EClass getMicroInstruction();

	/**
	 * Returns the meta object for the attribute '{@link br.ufrn.lasic.pml.MicroInstruction#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.ufrn.lasic.pml.MicroInstruction#getName()
	 * @see #getMicroInstruction()
	 * @generated
	 */
	EAttribute getMicroInstruction_Name();

	/**
	 * Returns the meta object for the attribute '{@link br.ufrn.lasic.pml.MicroInstruction#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see br.ufrn.lasic.pml.MicroInstruction#getValue()
	 * @see #getMicroInstruction()
	 * @generated
	 */
	EAttribute getMicroInstruction_Value();

	/**
	 * Returns the meta object for the containment reference list '{@link br.ufrn.lasic.pml.MicroInstruction#getNextMicroinstruction <em>Next Microinstruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Next Microinstruction</em>'.
	 * @see br.ufrn.lasic.pml.MicroInstruction#getNextMicroinstruction()
	 * @see #getMicroInstruction()
	 * @generated
	 */
	EReference getMicroInstruction_NextMicroinstruction();

	/**
	 * Returns the meta object for the containment reference '{@link br.ufrn.lasic.pml.MicroInstruction#getFinal <em>Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Final</em>'.
	 * @see br.ufrn.lasic.pml.MicroInstruction#getFinal()
	 * @see #getMicroInstruction()
	 * @generated
	 */
	EReference getMicroInstruction_Final();

	/**
	 * Returns the meta object for class '{@link br.ufrn.lasic.pml.InitialMicroInstruction <em>Initial Micro Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial Micro Instruction</em>'.
	 * @see br.ufrn.lasic.pml.InitialMicroInstruction
	 * @generated
	 */
	EClass getInitialMicroInstruction();

	/**
	 * Returns the meta object for the containment reference '{@link br.ufrn.lasic.pml.InitialMicroInstruction#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Next</em>'.
	 * @see br.ufrn.lasic.pml.InitialMicroInstruction#getNext()
	 * @see #getInitialMicroInstruction()
	 * @generated
	 */
	EReference getInitialMicroInstruction_Next();

	/**
	 * Returns the meta object for the attribute '{@link br.ufrn.lasic.pml.InitialMicroInstruction#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.ufrn.lasic.pml.InitialMicroInstruction#getName()
	 * @see #getInitialMicroInstruction()
	 * @generated
	 */
	EAttribute getInitialMicroInstruction_Name();

	/**
	 * Returns the meta object for the attribute '{@link br.ufrn.lasic.pml.InitialMicroInstruction#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see br.ufrn.lasic.pml.InitialMicroInstruction#getValue()
	 * @see #getInitialMicroInstruction()
	 * @generated
	 */
	EAttribute getInitialMicroInstruction_Value();

	/**
	 * Returns the meta object for the containment reference '{@link br.ufrn.lasic.pml.InitialMicroInstruction#getDirectFinalMicroInstruction <em>Direct Final Micro Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Direct Final Micro Instruction</em>'.
	 * @see br.ufrn.lasic.pml.InitialMicroInstruction#getDirectFinalMicroInstruction()
	 * @see #getInitialMicroInstruction()
	 * @generated
	 */
	EReference getInitialMicroInstruction_DirectFinalMicroInstruction();

	/**
	 * Returns the meta object for class '{@link br.ufrn.lasic.pml.FinalMicroInstruction <em>Final Micro Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final Micro Instruction</em>'.
	 * @see br.ufrn.lasic.pml.FinalMicroInstruction
	 * @generated
	 */
	EClass getFinalMicroInstruction();

	/**
	 * Returns the meta object for the attribute '{@link br.ufrn.lasic.pml.FinalMicroInstruction#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.ufrn.lasic.pml.FinalMicroInstruction#getName()
	 * @see #getFinalMicroInstruction()
	 * @generated
	 */
	EAttribute getFinalMicroInstruction_Name();

	/**
	 * Returns the meta object for the attribute '{@link br.ufrn.lasic.pml.FinalMicroInstruction#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see br.ufrn.lasic.pml.FinalMicroInstruction#getValue()
	 * @see #getFinalMicroInstruction()
	 * @generated
	 */
	EAttribute getFinalMicroInstruction_Value();

	/**
	 * Returns the meta object for class '{@link br.ufrn.lasic.pml.Seletor <em>Seletor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Seletor</em>'.
	 * @see br.ufrn.lasic.pml.Seletor
	 * @generated
	 */
	EClass getSeletor();

	/**
	 * Returns the meta object for the attribute '{@link br.ufrn.lasic.pml.Seletor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.ufrn.lasic.pml.Seletor#getName()
	 * @see #getSeletor()
	 * @generated
	 */
	EAttribute getSeletor_Name();

	/**
	 * Returns the meta object for the attribute '{@link br.ufrn.lasic.pml.Seletor#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see br.ufrn.lasic.pml.Seletor#getType()
	 * @see #getSeletor()
	 * @generated
	 */
	EAttribute getSeletor_Type();

	/**
	 * Returns the meta object for the attribute '{@link br.ufrn.lasic.pml.Seletor#getLengh <em>Lengh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lengh</em>'.
	 * @see br.ufrn.lasic.pml.Seletor#getLengh()
	 * @see #getSeletor()
	 * @generated
	 */
	EAttribute getSeletor_Lengh();

	/**
	 * Returns the meta object for the attribute '{@link br.ufrn.lasic.pml.Seletor#getBit <em>Bit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bit</em>'.
	 * @see br.ufrn.lasic.pml.Seletor#getBit()
	 * @see #getSeletor()
	 * @generated
	 */
	EAttribute getSeletor_Bit();

	/**
	 * Returns the meta object for class '{@link br.ufrn.lasic.pml.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see br.ufrn.lasic.pml.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the attribute '{@link br.ufrn.lasic.pml.Operation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.ufrn.lasic.pml.Operation#getName()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Name();

	/**
	 * Returns the meta object for class '{@link br.ufrn.lasic.pml.Decoder <em>Decoder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decoder</em>'.
	 * @see br.ufrn.lasic.pml.Decoder
	 * @generated
	 */
	EClass getDecoder();

	/**
	 * Returns the meta object for the attribute '{@link br.ufrn.lasic.pml.Decoder#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.ufrn.lasic.pml.Decoder#getName()
	 * @see #getDecoder()
	 * @generated
	 */
	EAttribute getDecoder_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link br.ufrn.lasic.pml.Decoder#getOutDecoder <em>Out Decoder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Out Decoder</em>'.
	 * @see br.ufrn.lasic.pml.Decoder#getOutDecoder()
	 * @see #getDecoder()
	 * @generated
	 */
	EReference getDecoder_OutDecoder();

	/**
	 * Returns the meta object for the containment reference list '{@link br.ufrn.lasic.pml.Decoder#getInDecoder <em>In Decoder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>In Decoder</em>'.
	 * @see br.ufrn.lasic.pml.Decoder#getInDecoder()
	 * @see #getDecoder()
	 * @generated
	 */
	EReference getDecoder_InDecoder();

	/**
	 * Returns the meta object for the containment reference list '{@link br.ufrn.lasic.pml.Decoder#getBehaviorDecoder <em>Behavior Decoder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Behavior Decoder</em>'.
	 * @see br.ufrn.lasic.pml.Decoder#getBehaviorDecoder()
	 * @see #getDecoder()
	 * @generated
	 */
	EReference getDecoder_BehaviorDecoder();

	/**
	 * Returns the meta object for class '{@link br.ufrn.lasic.pml.PipelineInitialStage <em>Pipeline Initial Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pipeline Initial Stage</em>'.
	 * @see br.ufrn.lasic.pml.PipelineInitialStage
	 * @generated
	 */
	EClass getPipelineInitialStage();

	/**
	 * Returns the meta object for the attribute '{@link br.ufrn.lasic.pml.PipelineInitialStage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.ufrn.lasic.pml.PipelineInitialStage#getName()
	 * @see #getPipelineInitialStage()
	 * @generated
	 */
	EAttribute getPipelineInitialStage_Name();

	/**
	 * Returns the meta object for the containment reference '{@link br.ufrn.lasic.pml.PipelineInitialStage#getNextStatePipeline <em>Next State Pipeline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Next State Pipeline</em>'.
	 * @see br.ufrn.lasic.pml.PipelineInitialStage#getNextStatePipeline()
	 * @see #getPipelineInitialStage()
	 * @generated
	 */
	EReference getPipelineInitialStage_NextStatePipeline();

	/**
	 * Returns the meta object for class '{@link br.ufrn.lasic.pml.PipelineNextStage <em>Pipeline Next Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pipeline Next Stage</em>'.
	 * @see br.ufrn.lasic.pml.PipelineNextStage
	 * @generated
	 */
	EClass getPipelineNextStage();

	/**
	 * Returns the meta object for the containment reference '{@link br.ufrn.lasic.pml.PipelineNextStage#getPipelineNext <em>Pipeline Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pipeline Next</em>'.
	 * @see br.ufrn.lasic.pml.PipelineNextStage#getPipelineNext()
	 * @see #getPipelineNextStage()
	 * @generated
	 */
	EReference getPipelineNextStage_PipelineNext();

	/**
	 * Returns the meta object for the attribute '{@link br.ufrn.lasic.pml.PipelineNextStage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.ufrn.lasic.pml.PipelineNextStage#getName()
	 * @see #getPipelineNextStage()
	 * @generated
	 */
	EAttribute getPipelineNextStage_Name();

	/**
	 * Returns the meta object for enum '{@link br.ufrn.lasic.pml.TypeComponent <em>Type Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Component</em>'.
	 * @see br.ufrn.lasic.pml.TypeComponent
	 * @generated
	 */
	EEnum getTypeComponent();

	/**
	 * Returns the meta object for enum '{@link br.ufrn.lasic.pml.TypeData <em>Type Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Data</em>'.
	 * @see br.ufrn.lasic.pml.TypeData
	 * @generated
	 */
	EEnum getTypeData();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PMLFactory getPMLFactory();

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
		 * The meta object literal for the '{@link br.ufrn.lasic.pml.impl.ULAImpl <em>ULA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufrn.lasic.pml.impl.ULAImpl
		 * @see br.ufrn.lasic.pml.impl.PMLPackageImpl#getULA()
		 * @generated
		 */
		EClass ULA = eINSTANCE.getULA();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ULA__NAME = eINSTANCE.getULA_Name();

		/**
		 * The meta object literal for the '<em><b>Behaviros ULA</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ULA__BEHAVIROS_ULA = eINSTANCE.getULA_BehavirosULA();

		/**
		 * The meta object literal for the '<em><b>Outputs ULA</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ULA__OUTPUTS_ULA = eINSTANCE.getULA_OutputsULA();

		/**
		 * The meta object literal for the '<em><b>Inputs ULA</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ULA__INPUTS_ULA = eINSTANCE.getULA_InputsULA();

		/**
		 * The meta object literal for the '<em><b>Operations ULA</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ULA__OPERATIONS_ULA = eINSTANCE.getULA_OperationsULA();

		/**
		 * The meta object literal for the '<em><b>Seletor ULA</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ULA__SELETOR_ULA = eINSTANCE.getULA_SeletorULA();

		/**
		 * The meta object literal for the '{@link br.ufrn.lasic.pml.impl.BehaviorImpl <em>Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufrn.lasic.pml.impl.BehaviorImpl
		 * @see br.ufrn.lasic.pml.impl.PMLPackageImpl#getBehavior()
		 * @generated
		 */
		EClass BEHAVIOR = eINSTANCE.getBehavior();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIOR__NAME = eINSTANCE.getBehavior_Name();

		/**
		 * The meta object literal for the '<em><b>Type Behavior</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIOR__TYPE_BEHAVIOR = eINSTANCE.getBehavior_TypeBehavior();

		/**
		 * The meta object literal for the '{@link br.ufrn.lasic.pml.impl.InputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufrn.lasic.pml.impl.InputImpl
		 * @see br.ufrn.lasic.pml.impl.PMLPackageImpl#getInput()
		 * @generated
		 */
		EClass INPUT = eINSTANCE.getInput();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__NAME = eINSTANCE.getInput_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__TYPE = eINSTANCE.getInput_Type();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__LENGTH = eINSTANCE.getInput_Length();

		/**
		 * The meta object literal for the '<em><b>Inout</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT__INOUT = eINSTANCE.getInput_Inout();

		/**
		 * The meta object literal for the '<em><b>Sensitive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__SENSITIVE = eINSTANCE.getInput_Sensitive();

		/**
		 * The meta object literal for the '<em><b>Bit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__BIT = eINSTANCE.getInput_Bit();

		/**
		 * The meta object literal for the '{@link br.ufrn.lasic.pml.impl.OutputImpl <em>Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufrn.lasic.pml.impl.OutputImpl
		 * @see br.ufrn.lasic.pml.impl.PMLPackageImpl#getOutput()
		 * @generated
		 */
		EClass OUTPUT = eINSTANCE.getOutput();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT__NAME = eINSTANCE.getOutput_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT__TYPE = eINSTANCE.getOutput_Type();

		/**
		 * The meta object literal for the '<em><b>Outin</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT__OUTIN = eINSTANCE.getOutput_Outin();

		/**
		 * The meta object literal for the '<em><b>Sensitive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT__SENSITIVE = eINSTANCE.getOutput_Sensitive();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT__LENGTH = eINSTANCE.getOutput_Length();

		/**
		 * The meta object literal for the '<em><b>Bit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT__BIT = eINSTANCE.getOutput_Bit();

		/**
		 * The meta object literal for the '{@link br.ufrn.lasic.pml.impl.DemultiplexorImpl <em>Demultiplexor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufrn.lasic.pml.impl.DemultiplexorImpl
		 * @see br.ufrn.lasic.pml.impl.PMLPackageImpl#getDemultiplexor()
		 * @generated
		 */
		EClass DEMULTIPLEXOR = eINSTANCE.getDemultiplexor();

		/**
		 * The meta object literal for the '<em><b>Behaviors Demux</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEMULTIPLEXOR__BEHAVIORS_DEMUX = eINSTANCE.getDemultiplexor_BehaviorsDemux();

		/**
		 * The meta object literal for the '<em><b>Indemux</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEMULTIPLEXOR__INDEMUX = eINSTANCE.getDemultiplexor_Indemux();

		/**
		 * The meta object literal for the '<em><b>Outdemux</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEMULTIPLEXOR__OUTDEMUX = eINSTANCE.getDemultiplexor_Outdemux();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEMULTIPLEXOR__NAME = eINSTANCE.getDemultiplexor_Name();

		/**
		 * The meta object literal for the '<em><b>Seletordemux</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEMULTIPLEXOR__SELETORDEMUX = eINSTANCE.getDemultiplexor_Seletordemux();

		/**
		 * The meta object literal for the '{@link br.ufrn.lasic.pml.impl.MultiplexorImpl <em>Multiplexor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufrn.lasic.pml.impl.MultiplexorImpl
		 * @see br.ufrn.lasic.pml.impl.PMLPackageImpl#getMultiplexor()
		 * @generated
		 */
		EClass MULTIPLEXOR = eINSTANCE.getMultiplexor();

		/**
		 * The meta object literal for the '<em><b>Behaviormux</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIPLEXOR__BEHAVIORMUX = eINSTANCE.getMultiplexor_Behaviormux();

		/**
		 * The meta object literal for the '<em><b>Outmux</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIPLEXOR__OUTMUX = eINSTANCE.getMultiplexor_Outmux();

		/**
		 * The meta object literal for the '<em><b>Inmux</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIPLEXOR__INMUX = eINSTANCE.getMultiplexor_Inmux();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLEXOR__NAME = eINSTANCE.getMultiplexor_Name();

		/**
		 * The meta object literal for the '<em><b>Seletormux</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIPLEXOR__SELETORMUX = eINSTANCE.getMultiplexor_Seletormux();

		/**
		 * The meta object literal for the '{@link br.ufrn.lasic.pml.impl.ControlUnitImpl <em>Control Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufrn.lasic.pml.impl.ControlUnitImpl
		 * @see br.ufrn.lasic.pml.impl.PMLPackageImpl#getControlUnit()
		 * @generated
		 */
		EClass CONTROL_UNIT = eINSTANCE.getControlUnit();

		/**
		 * The meta object literal for the '<em><b>Behaviors Control Unit</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_UNIT__BEHAVIORS_CONTROL_UNIT = eINSTANCE.getControlUnit_BehaviorsControlUnit();

		/**
		 * The meta object literal for the '<em><b>Inputs Control Unit</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_UNIT__INPUTS_CONTROL_UNIT = eINSTANCE.getControlUnit_InputsControlUnit();

		/**
		 * The meta object literal for the '<em><b>Outputs Control Unit</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_UNIT__OUTPUTS_CONTROL_UNIT = eINSTANCE.getControlUnit_OutputsControlUnit();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_UNIT__NAME = eINSTANCE.getControlUnit_Name();

		/**
		 * The meta object literal for the '<em><b>Intructions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_UNIT__INTRUCTIONS = eINSTANCE.getControlUnit_Intructions();

		/**
		 * The meta object literal for the '{@link br.ufrn.lasic.pml.impl.ProcessorImpl <em>Processor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufrn.lasic.pml.impl.ProcessorImpl
		 * @see br.ufrn.lasic.pml.impl.PMLPackageImpl#getProcessor()
		 * @generated
		 */
		EClass PROCESSOR = eINSTANCE.getProcessor();

		/**
		 * The meta object literal for the '<em><b>Demux</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSOR__DEMUX = eINSTANCE.getProcessor_Demux();

		/**
		 * The meta object literal for the '<em><b>Ulas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSOR__ULAS = eINSTANCE.getProcessor_Ulas();

		/**
		 * The meta object literal for the '<em><b>Registers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSOR__REGISTERS = eINSTANCE.getProcessor_Registers();

		/**
		 * The meta object literal for the '<em><b>Memories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSOR__MEMORIES = eINSTANCE.getProcessor_Memories();

		/**
		 * The meta object literal for the '<em><b>Mux</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSOR__MUX = eINSTANCE.getProcessor_Mux();

		/**
		 * The meta object literal for the '<em><b>Control Units</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSOR__CONTROL_UNITS = eINSTANCE.getProcessor_ControlUnits();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSOR__NAME = eINSTANCE.getProcessor_Name();

		/**
		 * The meta object literal for the '<em><b>Decoders</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSOR__DECODERS = eINSTANCE.getProcessor_Decoders();

		/**
		 * The meta object literal for the '<em><b>Initial Stage Pipeline</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSOR__INITIAL_STAGE_PIPELINE = eINSTANCE.getProcessor_InitialStagePipeline();

		/**
		 * The meta object literal for the '{@link br.ufrn.lasic.pml.impl.MemoryImpl <em>Memory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufrn.lasic.pml.impl.MemoryImpl
		 * @see br.ufrn.lasic.pml.impl.PMLPackageImpl#getMemory()
		 * @generated
		 */
		EClass MEMORY = eINSTANCE.getMemory();

		/**
		 * The meta object literal for the '<em><b>Behaviors Memory</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMORY__BEHAVIORS_MEMORY = eINSTANCE.getMemory_BehaviorsMemory();

		/**
		 * The meta object literal for the '<em><b>Input Memory</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMORY__INPUT_MEMORY = eINSTANCE.getMemory_InputMemory();

		/**
		 * The meta object literal for the '<em><b>Output Memory</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMORY__OUTPUT_MEMORY = eINSTANCE.getMemory_OutputMemory();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMORY__NAME = eINSTANCE.getMemory_Name();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMORY__LENGTH = eINSTANCE.getMemory_Length();

		/**
		 * The meta object literal for the '{@link br.ufrn.lasic.pml.impl.RegisterImpl <em>Register</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufrn.lasic.pml.impl.RegisterImpl
		 * @see br.ufrn.lasic.pml.impl.PMLPackageImpl#getRegister()
		 * @generated
		 */
		EClass REGISTER = eINSTANCE.getRegister();

		/**
		 * The meta object literal for the '<em><b>Behavior Register</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTER__BEHAVIOR_REGISTER = eINSTANCE.getRegister_BehaviorRegister();

		/**
		 * The meta object literal for the '<em><b>Output Register</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTER__OUTPUT_REGISTER = eINSTANCE.getRegister_OutputRegister();

		/**
		 * The meta object literal for the '<em><b>Input Register</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTER__INPUT_REGISTER = eINSTANCE.getRegister_InputRegister();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTER__NAME = eINSTANCE.getRegister_Name();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTER__LENGTH = eINSTANCE.getRegister_Length();

		/**
		 * The meta object literal for the '{@link br.ufrn.lasic.pml.impl.InstructionsImpl <em>Instructions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufrn.lasic.pml.impl.InstructionsImpl
		 * @see br.ufrn.lasic.pml.impl.PMLPackageImpl#getInstructions()
		 * @generated
		 */
		EClass INSTRUCTIONS = eINSTANCE.getInstructions();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTRUCTIONS__TYPE = eINSTANCE.getInstructions_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTRUCTIONS__NAME = eINSTANCE.getInstructions_Name();

		/**
		 * The meta object literal for the '<em><b>Initial</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTRUCTIONS__INITIAL = eINSTANCE.getInstructions_Initial();

		/**
		 * The meta object literal for the '{@link br.ufrn.lasic.pml.impl.MicroInstructionImpl <em>Micro Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufrn.lasic.pml.impl.MicroInstructionImpl
		 * @see br.ufrn.lasic.pml.impl.PMLPackageImpl#getMicroInstruction()
		 * @generated
		 */
		EClass MICRO_INSTRUCTION = eINSTANCE.getMicroInstruction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MICRO_INSTRUCTION__NAME = eINSTANCE.getMicroInstruction_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MICRO_INSTRUCTION__VALUE = eINSTANCE.getMicroInstruction_Value();

		/**
		 * The meta object literal for the '<em><b>Next Microinstruction</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICRO_INSTRUCTION__NEXT_MICROINSTRUCTION = eINSTANCE.getMicroInstruction_NextMicroinstruction();

		/**
		 * The meta object literal for the '<em><b>Final</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICRO_INSTRUCTION__FINAL = eINSTANCE.getMicroInstruction_Final();

		/**
		 * The meta object literal for the '{@link br.ufrn.lasic.pml.impl.InitialMicroInstructionImpl <em>Initial Micro Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufrn.lasic.pml.impl.InitialMicroInstructionImpl
		 * @see br.ufrn.lasic.pml.impl.PMLPackageImpl#getInitialMicroInstruction()
		 * @generated
		 */
		EClass INITIAL_MICRO_INSTRUCTION = eINSTANCE.getInitialMicroInstruction();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_MICRO_INSTRUCTION__NEXT = eINSTANCE.getInitialMicroInstruction_Next();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INITIAL_MICRO_INSTRUCTION__NAME = eINSTANCE.getInitialMicroInstruction_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INITIAL_MICRO_INSTRUCTION__VALUE = eINSTANCE.getInitialMicroInstruction_Value();

		/**
		 * The meta object literal for the '<em><b>Direct Final Micro Instruction</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_MICRO_INSTRUCTION__DIRECT_FINAL_MICRO_INSTRUCTION = eINSTANCE.getInitialMicroInstruction_DirectFinalMicroInstruction();

		/**
		 * The meta object literal for the '{@link br.ufrn.lasic.pml.impl.FinalMicroInstructionImpl <em>Final Micro Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufrn.lasic.pml.impl.FinalMicroInstructionImpl
		 * @see br.ufrn.lasic.pml.impl.PMLPackageImpl#getFinalMicroInstruction()
		 * @generated
		 */
		EClass FINAL_MICRO_INSTRUCTION = eINSTANCE.getFinalMicroInstruction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FINAL_MICRO_INSTRUCTION__NAME = eINSTANCE.getFinalMicroInstruction_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FINAL_MICRO_INSTRUCTION__VALUE = eINSTANCE.getFinalMicroInstruction_Value();

		/**
		 * The meta object literal for the '{@link br.ufrn.lasic.pml.impl.SeletorImpl <em>Seletor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufrn.lasic.pml.impl.SeletorImpl
		 * @see br.ufrn.lasic.pml.impl.PMLPackageImpl#getSeletor()
		 * @generated
		 */
		EClass SELETOR = eINSTANCE.getSeletor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELETOR__NAME = eINSTANCE.getSeletor_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELETOR__TYPE = eINSTANCE.getSeletor_Type();

		/**
		 * The meta object literal for the '<em><b>Lengh</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELETOR__LENGH = eINSTANCE.getSeletor_Lengh();

		/**
		 * The meta object literal for the '<em><b>Bit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELETOR__BIT = eINSTANCE.getSeletor_Bit();

		/**
		 * The meta object literal for the '{@link br.ufrn.lasic.pml.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufrn.lasic.pml.impl.OperationImpl
		 * @see br.ufrn.lasic.pml.impl.PMLPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__NAME = eINSTANCE.getOperation_Name();

		/**
		 * The meta object literal for the '{@link br.ufrn.lasic.pml.impl.DecoderImpl <em>Decoder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufrn.lasic.pml.impl.DecoderImpl
		 * @see br.ufrn.lasic.pml.impl.PMLPackageImpl#getDecoder()
		 * @generated
		 */
		EClass DECODER = eINSTANCE.getDecoder();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECODER__NAME = eINSTANCE.getDecoder_Name();

		/**
		 * The meta object literal for the '<em><b>Out Decoder</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECODER__OUT_DECODER = eINSTANCE.getDecoder_OutDecoder();

		/**
		 * The meta object literal for the '<em><b>In Decoder</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECODER__IN_DECODER = eINSTANCE.getDecoder_InDecoder();

		/**
		 * The meta object literal for the '<em><b>Behavior Decoder</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECODER__BEHAVIOR_DECODER = eINSTANCE.getDecoder_BehaviorDecoder();

		/**
		 * The meta object literal for the '{@link br.ufrn.lasic.pml.impl.PipelineInitialStageImpl <em>Pipeline Initial Stage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufrn.lasic.pml.impl.PipelineInitialStageImpl
		 * @see br.ufrn.lasic.pml.impl.PMLPackageImpl#getPipelineInitialStage()
		 * @generated
		 */
		EClass PIPELINE_INITIAL_STAGE = eINSTANCE.getPipelineInitialStage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIPELINE_INITIAL_STAGE__NAME = eINSTANCE.getPipelineInitialStage_Name();

		/**
		 * The meta object literal for the '<em><b>Next State Pipeline</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE_INITIAL_STAGE__NEXT_STATE_PIPELINE = eINSTANCE.getPipelineInitialStage_NextStatePipeline();

		/**
		 * The meta object literal for the '{@link br.ufrn.lasic.pml.impl.PipelineNextStageImpl <em>Pipeline Next Stage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufrn.lasic.pml.impl.PipelineNextStageImpl
		 * @see br.ufrn.lasic.pml.impl.PMLPackageImpl#getPipelineNextStage()
		 * @generated
		 */
		EClass PIPELINE_NEXT_STAGE = eINSTANCE.getPipelineNextStage();

		/**
		 * The meta object literal for the '<em><b>Pipeline Next</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE_NEXT_STAGE__PIPELINE_NEXT = eINSTANCE.getPipelineNextStage_PipelineNext();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIPELINE_NEXT_STAGE__NAME = eINSTANCE.getPipelineNextStage_Name();

		/**
		 * The meta object literal for the '{@link br.ufrn.lasic.pml.TypeComponent <em>Type Component</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufrn.lasic.pml.TypeComponent
		 * @see br.ufrn.lasic.pml.impl.PMLPackageImpl#getTypeComponent()
		 * @generated
		 */
		EEnum TYPE_COMPONENT = eINSTANCE.getTypeComponent();

		/**
		 * The meta object literal for the '{@link br.ufrn.lasic.pml.TypeData <em>Type Data</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufrn.lasic.pml.TypeData
		 * @see br.ufrn.lasic.pml.impl.PMLPackageImpl#getTypeData()
		 * @generated
		 */
		EEnum TYPE_DATA = eINSTANCE.getTypeData();

	}

} //PMLPackage
