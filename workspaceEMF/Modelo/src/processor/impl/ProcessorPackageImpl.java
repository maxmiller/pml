/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package processor.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import processor.AddressMemory;
import processor.Clock;
import processor.ControlUnit;
import processor.Demultiplexor;
import processor.InputBoolean;
import processor.InputDemux;
import processor.InputMemory;
import processor.InputMultiplexor;
import processor.InputRegisterAssync;
import processor.InputRegisterFile;
import processor.Load;
import processor.LoadControlUnit;
import processor.Memory;
import processor.Multiplexor;
import processor.Operation;
import processor.OutputBoolean;
import processor.OutputDemux;
import processor.OutputMemory;
import processor.OutputMultiplexor;
import processor.OutputRegisterAssync;
import processor.OutputRegisterFile;
import processor.OutputULA;
import processor.ProcessorFactory;
import processor.ProcessorPackage;
import processor.Read;
import processor.ReadWrite;
import processor.Register;
import processor.RegisterAssyncReset;
import processor.RegisterFile;
import processor.Reset;
import processor.SeletorControlUnit;
import processor.SeletorRegisterFile;
import processor.SeletorULA;
import processor.Status;
import processor.Write;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcessorPackageImpl extends EPackageImpl implements ProcessorPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiplexorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass seletorRegisterFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass demultiplexorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass registerFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass registerAssyncResetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass writeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readWriteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass registerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ulaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputMultiplexorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputMultiplexorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputDemuxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputDemuxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputRegisterFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputRegisterFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputRegisterAssyncEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputRegisterAssyncEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputMemoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputMemoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addressMemoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputULAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass seletorULAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loadControlUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass seletorControlUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType arrayIntegerEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see processor.ProcessorPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ProcessorPackageImpl() {
		super(eNS_URI, ProcessorFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ProcessorPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ProcessorPackage init() {
		if (isInited) return (ProcessorPackage)EPackage.Registry.INSTANCE.getEPackage(ProcessorPackage.eNS_URI);

		// Obtain or create and register package
		ProcessorPackageImpl theProcessorPackage = (ProcessorPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ProcessorPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ProcessorPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theProcessorPackage.createPackageContents();

		// Initialize created meta-data
		theProcessorPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theProcessorPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ProcessorPackage.eNS_URI, theProcessorPackage);
		return theProcessorPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiplexor() {
		return multiplexorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiplexor_NumInputs() {
		return (EAttribute)multiplexorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiplexor_Inputs() {
		return (EReference)multiplexorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiplexor_Output() {
		return (EReference)multiplexorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiplexor_Inout() {
		return (EReference)multiplexorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiplexor_InputsMul() {
		return (EReference)multiplexorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiplexor_OutputMul() {
		return (EReference)multiplexorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSeletorRegisterFile() {
		return seletorRegisterFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeletorRegisterFile_Value() {
		return (EAttribute)seletorRegisterFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDemultiplexor() {
		return demultiplexorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDemultiplexor_NumOutputs() {
		return (EAttribute)demultiplexorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDemultiplexor_Outputs() {
		return (EReference)demultiplexorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDemultiplexor_Input() {
		return (EReference)demultiplexorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDemultiplexor_Outin() {
		return (EReference)demultiplexorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDemultiplexor_OutputsDemux() {
		return (EReference)demultiplexorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDemultiplexor_InputDemux() {
		return (EReference)demultiplexorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegisterFile() {
		return registerFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegisterFile_Sel() {
		return (EReference)registerFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegisterFile_RwBit() {
		return (EReference)registerFileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegisterFile_Clock() {
		return (EReference)registerFileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegisterFile_Registers() {
		return (EAttribute)registerFileEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegisterFile_InRf() {
		return (EReference)registerFileEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegisterFile_OutRf() {
		return (EReference)registerFileEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegisterAssyncReset() {
		return registerAssyncResetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegisterAssyncReset_InternalData() {
		return (EAttribute)registerAssyncResetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegisterAssyncReset_OutRa() {
		return (EReference)registerAssyncResetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegisterAssyncReset_InRa() {
		return (EReference)registerAssyncResetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegisterAssyncReset_Reset() {
		return (EReference)registerAssyncResetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegisterAssyncReset_Clock() {
		return (EReference)registerAssyncResetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegisterAssyncReset_Load() {
		return (EReference)registerAssyncResetEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWrite() {
		return writeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWrite_Value() {
		return (EAttribute)writeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRead() {
		return readEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRead_Value() {
		return (EAttribute)readEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadWrite() {
		return readWriteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReadWrite_Value() {
		return (EAttribute)readWriteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegister() {
		return registerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegister_Value() {
		return (EAttribute)registerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlUnit() {
		return controlUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlUnit_Loads() {
		return (EReference)controlUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlUnit_WriteMemory() {
		return (EReference)controlUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlUnit_Readwritebit() {
		return (EReference)controlUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlUnit_SelControlUnit() {
		return (EReference)controlUnitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlUnit_State() {
		return (EAttribute)controlUnitEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlUnit_InstructionSubstate() {
		return (EAttribute)controlUnitEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getULA() {
		return ulaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getULA_OpSel() {
		return (EReference)ulaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getULA_Ulastatus() {
		return (EReference)ulaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getULA_Operations() {
		return (EReference)ulaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getULA_OpSelUla() {
		return (EReference)ulaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getULA_UlaOut() {
		return (EReference)ulaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputBoolean() {
		return inputBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputBoolean_Value() {
		return (EAttribute)inputBooleanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReset() {
		return resetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReset_Value() {
		return (EAttribute)resetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClock() {
		return clockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClock_Value() {
		return (EAttribute)clockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputBoolean() {
		return outputBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputBoolean_Value() {
		return (EAttribute)outputBooleanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputMultiplexor() {
		return inputMultiplexorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputMultiplexor_Value() {
		return (EAttribute)inputMultiplexorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputMultiplexor() {
		return outputMultiplexorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputMultiplexor_Value() {
		return (EAttribute)outputMultiplexorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputDemux() {
		return outputDemuxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputDemux_Value() {
		return (EAttribute)outputDemuxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputDemux() {
		return inputDemuxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputDemux_Value() {
		return (EAttribute)inputDemuxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputRegisterFile() {
		return inputRegisterFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputRegisterFile_Value() {
		return (EAttribute)inputRegisterFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputRegisterFile() {
		return outputRegisterFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputRegisterFile_Value() {
		return (EAttribute)outputRegisterFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputRegisterAssync() {
		return inputRegisterAssyncEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputRegisterAssync_Value() {
		return (EAttribute)inputRegisterAssyncEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputRegisterAssync() {
		return outputRegisterAssyncEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputRegisterAssync_Value() {
		return (EAttribute)outputRegisterAssyncEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoad() {
		return loadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoad_Value() {
		return (EAttribute)loadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputMemory() {
		return inputMemoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputMemory_Value() {
		return (EAttribute)inputMemoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputMemory() {
		return outputMemoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputMemory_Value() {
		return (EAttribute)outputMemoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddressMemory() {
		return addressMemoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressMemory_Value() {
		return (EAttribute)addressMemoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMemory() {
		return memoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemory_Mem() {
		return (EAttribute)memoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemory_Write() {
		return (EReference)memoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemory_Reset() {
		return (EReference)memoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemory_Clock() {
		return (EReference)memoryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemory_Datai() {
		return (EReference)memoryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemory_Datao() {
		return (EReference)memoryEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemory_Address() {
		return (EReference)memoryEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperation() {
		return operationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_Value() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputULA() {
		return outputULAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputULA_Value() {
		return (EAttribute)outputULAEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSeletorULA() {
		return seletorULAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeletorULA_Value() {
		return (EAttribute)seletorULAEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatus() {
		return statusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatus_Value() {
		return (EAttribute)statusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoadControlUnit() {
		return loadControlUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoadControlUnit_Value() {
		return (EAttribute)loadControlUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSeletorControlUnit() {
		return seletorControlUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeletorControlUnit_Value() {
		return (EAttribute)seletorControlUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getArrayInteger() {
		return arrayIntegerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessorFactory getProcessorFactory() {
		return (ProcessorFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		multiplexorEClass = createEClass(MULTIPLEXOR);
		createEAttribute(multiplexorEClass, MULTIPLEXOR__NUM_INPUTS);
		createEReference(multiplexorEClass, MULTIPLEXOR__INPUTS);
		createEReference(multiplexorEClass, MULTIPLEXOR__OUTPUT);
		createEReference(multiplexorEClass, MULTIPLEXOR__INOUT);
		createEReference(multiplexorEClass, MULTIPLEXOR__INPUTS_MUL);
		createEReference(multiplexorEClass, MULTIPLEXOR__OUTPUT_MUL);

		seletorRegisterFileEClass = createEClass(SELETOR_REGISTER_FILE);
		createEAttribute(seletorRegisterFileEClass, SELETOR_REGISTER_FILE__VALUE);

		demultiplexorEClass = createEClass(DEMULTIPLEXOR);
		createEAttribute(demultiplexorEClass, DEMULTIPLEXOR__NUM_OUTPUTS);
		createEReference(demultiplexorEClass, DEMULTIPLEXOR__OUTPUTS);
		createEReference(demultiplexorEClass, DEMULTIPLEXOR__INPUT);
		createEReference(demultiplexorEClass, DEMULTIPLEXOR__OUTIN);
		createEReference(demultiplexorEClass, DEMULTIPLEXOR__OUTPUTS_DEMUX);
		createEReference(demultiplexorEClass, DEMULTIPLEXOR__INPUT_DEMUX);

		registerFileEClass = createEClass(REGISTER_FILE);
		createEReference(registerFileEClass, REGISTER_FILE__SEL);
		createEReference(registerFileEClass, REGISTER_FILE__RW_BIT);
		createEReference(registerFileEClass, REGISTER_FILE__CLOCK);
		createEAttribute(registerFileEClass, REGISTER_FILE__REGISTERS);
		createEReference(registerFileEClass, REGISTER_FILE__IN_RF);
		createEReference(registerFileEClass, REGISTER_FILE__OUT_RF);

		registerAssyncResetEClass = createEClass(REGISTER_ASSYNC_RESET);
		createEAttribute(registerAssyncResetEClass, REGISTER_ASSYNC_RESET__INTERNAL_DATA);
		createEReference(registerAssyncResetEClass, REGISTER_ASSYNC_RESET__OUT_RA);
		createEReference(registerAssyncResetEClass, REGISTER_ASSYNC_RESET__IN_RA);
		createEReference(registerAssyncResetEClass, REGISTER_ASSYNC_RESET__RESET);
		createEReference(registerAssyncResetEClass, REGISTER_ASSYNC_RESET__CLOCK);
		createEReference(registerAssyncResetEClass, REGISTER_ASSYNC_RESET__LOAD);

		writeEClass = createEClass(WRITE);
		createEAttribute(writeEClass, WRITE__VALUE);

		readEClass = createEClass(READ);
		createEAttribute(readEClass, READ__VALUE);

		readWriteEClass = createEClass(READ_WRITE);
		createEAttribute(readWriteEClass, READ_WRITE__VALUE);

		registerEClass = createEClass(REGISTER);
		createEAttribute(registerEClass, REGISTER__VALUE);

		controlUnitEClass = createEClass(CONTROL_UNIT);
		createEReference(controlUnitEClass, CONTROL_UNIT__LOADS);
		createEReference(controlUnitEClass, CONTROL_UNIT__WRITE_MEMORY);
		createEReference(controlUnitEClass, CONTROL_UNIT__READWRITEBIT);
		createEReference(controlUnitEClass, CONTROL_UNIT__SEL_CONTROL_UNIT);
		createEAttribute(controlUnitEClass, CONTROL_UNIT__STATE);
		createEAttribute(controlUnitEClass, CONTROL_UNIT__INSTRUCTION_SUBSTATE);

		ulaEClass = createEClass(ULA);
		createEReference(ulaEClass, ULA__OP_SEL);
		createEReference(ulaEClass, ULA__ULASTATUS);
		createEReference(ulaEClass, ULA__OPERATIONS);
		createEReference(ulaEClass, ULA__OP_SEL_ULA);
		createEReference(ulaEClass, ULA__ULA_OUT);

		inputBooleanEClass = createEClass(INPUT_BOOLEAN);
		createEAttribute(inputBooleanEClass, INPUT_BOOLEAN__VALUE);

		resetEClass = createEClass(RESET);
		createEAttribute(resetEClass, RESET__VALUE);

		clockEClass = createEClass(CLOCK);
		createEAttribute(clockEClass, CLOCK__VALUE);

		outputBooleanEClass = createEClass(OUTPUT_BOOLEAN);
		createEAttribute(outputBooleanEClass, OUTPUT_BOOLEAN__VALUE);

		inputMultiplexorEClass = createEClass(INPUT_MULTIPLEXOR);
		createEAttribute(inputMultiplexorEClass, INPUT_MULTIPLEXOR__VALUE);

		outputMultiplexorEClass = createEClass(OUTPUT_MULTIPLEXOR);
		createEAttribute(outputMultiplexorEClass, OUTPUT_MULTIPLEXOR__VALUE);

		outputDemuxEClass = createEClass(OUTPUT_DEMUX);
		createEAttribute(outputDemuxEClass, OUTPUT_DEMUX__VALUE);

		inputDemuxEClass = createEClass(INPUT_DEMUX);
		createEAttribute(inputDemuxEClass, INPUT_DEMUX__VALUE);

		inputRegisterFileEClass = createEClass(INPUT_REGISTER_FILE);
		createEAttribute(inputRegisterFileEClass, INPUT_REGISTER_FILE__VALUE);

		outputRegisterFileEClass = createEClass(OUTPUT_REGISTER_FILE);
		createEAttribute(outputRegisterFileEClass, OUTPUT_REGISTER_FILE__VALUE);

		inputRegisterAssyncEClass = createEClass(INPUT_REGISTER_ASSYNC);
		createEAttribute(inputRegisterAssyncEClass, INPUT_REGISTER_ASSYNC__VALUE);

		outputRegisterAssyncEClass = createEClass(OUTPUT_REGISTER_ASSYNC);
		createEAttribute(outputRegisterAssyncEClass, OUTPUT_REGISTER_ASSYNC__VALUE);

		loadEClass = createEClass(LOAD);
		createEAttribute(loadEClass, LOAD__VALUE);

		inputMemoryEClass = createEClass(INPUT_MEMORY);
		createEAttribute(inputMemoryEClass, INPUT_MEMORY__VALUE);

		outputMemoryEClass = createEClass(OUTPUT_MEMORY);
		createEAttribute(outputMemoryEClass, OUTPUT_MEMORY__VALUE);

		addressMemoryEClass = createEClass(ADDRESS_MEMORY);
		createEAttribute(addressMemoryEClass, ADDRESS_MEMORY__VALUE);

		memoryEClass = createEClass(MEMORY);
		createEAttribute(memoryEClass, MEMORY__MEM);
		createEReference(memoryEClass, MEMORY__WRITE);
		createEReference(memoryEClass, MEMORY__RESET);
		createEReference(memoryEClass, MEMORY__CLOCK);
		createEReference(memoryEClass, MEMORY__DATAI);
		createEReference(memoryEClass, MEMORY__DATAO);
		createEReference(memoryEClass, MEMORY__ADDRESS);

		operationEClass = createEClass(OPERATION);
		createEAttribute(operationEClass, OPERATION__VALUE);

		outputULAEClass = createEClass(OUTPUT_ULA);
		createEAttribute(outputULAEClass, OUTPUT_ULA__VALUE);

		seletorULAEClass = createEClass(SELETOR_ULA);
		createEAttribute(seletorULAEClass, SELETOR_ULA__VALUE);

		statusEClass = createEClass(STATUS);
		createEAttribute(statusEClass, STATUS__VALUE);

		loadControlUnitEClass = createEClass(LOAD_CONTROL_UNIT);
		createEAttribute(loadControlUnitEClass, LOAD_CONTROL_UNIT__VALUE);

		seletorControlUnitEClass = createEClass(SELETOR_CONTROL_UNIT);
		createEAttribute(seletorControlUnitEClass, SELETOR_CONTROL_UNIT__VALUE);

		// Create data types
		arrayIntegerEDataType = createEDataType(ARRAY_INTEGER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(multiplexorEClass, Multiplexor.class, "Multiplexor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMultiplexor_NumInputs(), ecorePackage.getEInt(), "numInputs", null, 0, 1, Multiplexor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMultiplexor_Inputs(), this.getInputMultiplexor(), null, "inputs", null, 1, -1, Multiplexor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMultiplexor_Output(), this.getOutputMultiplexor(), null, "output", null, 1, 1, Multiplexor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMultiplexor_Inout(), this.getMultiplexor(), null, "inout", null, 0, 1, Multiplexor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMultiplexor_InputsMul(), this.getInputMultiplexor(), null, "inputsMul", null, 1, -1, Multiplexor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMultiplexor_OutputMul(), this.getOutputMultiplexor(), null, "outputMul", null, 1, 1, Multiplexor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(multiplexorEClass, null, "multiplexorBehavior", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(seletorRegisterFileEClass, SeletorRegisterFile.class, "SeletorRegisterFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSeletorRegisterFile_Value(), ecorePackage.getEInt(), "value", null, 0, 1, SeletorRegisterFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(demultiplexorEClass, Demultiplexor.class, "Demultiplexor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDemultiplexor_NumOutputs(), ecorePackage.getEInt(), "numOutputs", null, 0, 1, Demultiplexor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDemultiplexor_Outputs(), this.getOutputDemux(), null, "outputs", null, 1, -1, Demultiplexor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDemultiplexor_Input(), this.getInputDemux(), null, "input", null, 1, 1, Demultiplexor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDemultiplexor_Outin(), this.getDemultiplexor(), null, "outin", null, 0, 1, Demultiplexor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDemultiplexor_OutputsDemux(), this.getOutputDemux(), null, "outputsDemux", null, 1, -1, Demultiplexor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDemultiplexor_InputDemux(), this.getInputDemux(), null, "inputDemux", null, 1, 1, Demultiplexor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(demultiplexorEClass, null, "demultiplexorBehavior", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(registerFileEClass, RegisterFile.class, "RegisterFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRegisterFile_Sel(), this.getSeletorRegisterFile(), null, "sel", null, 1, 1, RegisterFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegisterFile_RwBit(), this.getReadWrite(), null, "rwBit", null, 1, 1, RegisterFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegisterFile_Clock(), this.getClock(), null, "clock", null, 1, 1, RegisterFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegisterFile_Registers(), this.getArrayInteger(), "registers", null, 0, 1, RegisterFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegisterFile_InRf(), this.getInputRegisterFile(), null, "inRf", null, 1, 1, RegisterFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegisterFile_OutRf(), this.getOutputRegisterFile(), null, "outRf", null, 1, 1, RegisterFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(registerFileEClass, null, "registerFileBehavior", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(registerAssyncResetEClass, RegisterAssyncReset.class, "RegisterAssyncReset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRegisterAssyncReset_InternalData(), ecorePackage.getEInt(), "internalData", null, 0, 1, RegisterAssyncReset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegisterAssyncReset_OutRa(), this.getOutputRegisterAssync(), null, "outRa", null, 1, 1, RegisterAssyncReset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegisterAssyncReset_InRa(), this.getInputRegisterAssync(), null, "inRa", null, 1, 1, RegisterAssyncReset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegisterAssyncReset_Reset(), this.getReset(), null, "reset", null, 1, 1, RegisterAssyncReset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegisterAssyncReset_Clock(), this.getClock(), null, "clock", null, 1, 1, RegisterAssyncReset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegisterAssyncReset_Load(), this.getLoad(), null, "load", null, 1, 1, RegisterAssyncReset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(registerAssyncResetEClass, null, "RegisterBehaviour", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(writeEClass, Write.class, "Write", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWrite_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, Write.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(readEClass, Read.class, "Read", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRead_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, Read.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(readWriteEClass, ReadWrite.class, "ReadWrite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReadWrite_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, ReadWrite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(registerEClass, Register.class, "Register", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRegister_Value(), ecorePackage.getEInt(), "value", null, 0, 1, Register.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlUnitEClass, ControlUnit.class, "ControlUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getControlUnit_Loads(), this.getLoadControlUnit(), null, "loads", null, 1, -1, ControlUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControlUnit_WriteMemory(), this.getWrite(), null, "writeMemory", null, 1, 1, ControlUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControlUnit_Readwritebit(), this.getReadWrite(), null, "readwritebit", null, 1, 1, ControlUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControlUnit_SelControlUnit(), this.getSeletorControlUnit(), null, "selControlUnit", null, 1, 1, ControlUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControlUnit_State(), ecorePackage.getEInt(), "state", null, 0, 1, ControlUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControlUnit_InstructionSubstate(), ecorePackage.getEInt(), "instructionSubstate", null, 0, 1, ControlUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(controlUnitEClass, null, "controlUnitBehavior", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlUnitEClass, null, "processInstruction", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlUnitEClass, null, "processMiscellaneousInstruction", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlUnitEClass, null, "processControlInstruction", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlUnitEClass, null, "processRegisterInstruction", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlUnitEClass, null, "processMemoryInstruction", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlUnitEClass, null, "resetAllLoads", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlUnitEClass, null, "incrementPC", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlUnitEClass, null, "loadsARWithPc", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ulaEClass, processor.ULA.class, "ULA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getULA_OpSel(), this.getSeletorRegisterFile(), null, "opSel", null, 1, 1, processor.ULA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getULA_Ulastatus(), this.getStatus(), null, "ulastatus", null, 1, 1, processor.ULA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getULA_Operations(), this.getOperation(), null, "operations", null, 1, -1, processor.ULA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getULA_OpSelUla(), this.getSeletorULA(), null, "opSelUla", null, 1, 1, processor.ULA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getULA_UlaOut(), this.getOutputULA(), null, "ulaOut", null, 1, 1, processor.ULA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(ulaEClass, null, "ULABehavior", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(inputBooleanEClass, InputBoolean.class, "InputBoolean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInputBoolean_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, InputBoolean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resetEClass, Reset.class, "Reset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReset_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, Reset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clockEClass, Clock.class, "Clock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClock_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, Clock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputBooleanEClass, OutputBoolean.class, "OutputBoolean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOutputBoolean_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, OutputBoolean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputMultiplexorEClass, InputMultiplexor.class, "InputMultiplexor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInputMultiplexor_Value(), ecorePackage.getEInt(), "value", null, 0, 1, InputMultiplexor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputMultiplexorEClass, OutputMultiplexor.class, "OutputMultiplexor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOutputMultiplexor_Value(), ecorePackage.getEInt(), "value", null, 0, 1, OutputMultiplexor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputDemuxEClass, OutputDemux.class, "OutputDemux", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOutputDemux_Value(), ecorePackage.getEInt(), "value", null, 0, 1, OutputDemux.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputDemuxEClass, InputDemux.class, "InputDemux", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInputDemux_Value(), ecorePackage.getEInt(), "value", null, 0, 1, InputDemux.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputRegisterFileEClass, InputRegisterFile.class, "InputRegisterFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInputRegisterFile_Value(), ecorePackage.getEInt(), "value", null, 0, 1, InputRegisterFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputRegisterFileEClass, OutputRegisterFile.class, "OutputRegisterFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOutputRegisterFile_Value(), ecorePackage.getEInt(), "value", null, 0, 1, OutputRegisterFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputRegisterAssyncEClass, InputRegisterAssync.class, "InputRegisterAssync", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInputRegisterAssync_Value(), ecorePackage.getEInt(), "value", null, 0, 1, InputRegisterAssync.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputRegisterAssyncEClass, OutputRegisterAssync.class, "OutputRegisterAssync", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOutputRegisterAssync_Value(), ecorePackage.getEInt(), "value", null, 0, 1, OutputRegisterAssync.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(loadEClass, Load.class, "Load", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLoad_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, Load.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputMemoryEClass, InputMemory.class, "InputMemory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInputMemory_Value(), ecorePackage.getEInt(), "value", null, 0, 1, InputMemory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputMemoryEClass, OutputMemory.class, "OutputMemory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOutputMemory_Value(), ecorePackage.getEInt(), "value", null, 0, 1, OutputMemory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addressMemoryEClass, AddressMemory.class, "AddressMemory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddressMemory_Value(), ecorePackage.getEInt(), "value", null, 0, 1, AddressMemory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(memoryEClass, Memory.class, "Memory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMemory_Mem(), this.getArrayInteger(), "mem", null, 0, 1, Memory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMemory_Write(), this.getWrite(), null, "write", null, 1, 1, Memory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMemory_Reset(), this.getReset(), null, "reset", null, 1, 1, Memory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMemory_Clock(), this.getClock(), null, "clock", null, 1, 1, Memory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMemory_Datai(), this.getInputMemory(), null, "datai", null, 1, 1, Memory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMemory_Datao(), this.getOutputMemory(), null, "datao", null, 1, 1, Memory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMemory_Address(), this.getAddressMemory(), null, "address", null, 1, 1, Memory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(memoryEClass, null, "t_sync_mem", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperation_Value(), ecorePackage.getEInt(), "value", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputULAEClass, OutputULA.class, "OutputULA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOutputULA_Value(), ecorePackage.getEInt(), "value", null, 0, 1, OutputULA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(seletorULAEClass, SeletorULA.class, "SeletorULA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSeletorULA_Value(), ecorePackage.getEInt(), "value", null, 0, 1, SeletorULA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statusEClass, Status.class, "Status", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStatus_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, Status.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(loadControlUnitEClass, LoadControlUnit.class, "LoadControlUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLoadControlUnit_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, LoadControlUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(seletorControlUnitEClass, SeletorControlUnit.class, "SeletorControlUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSeletorControlUnit_Value(), ecorePackage.getEInt(), "value", null, 0, 1, SeletorControlUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(arrayIntegerEDataType, int[].class, "ArrayInteger", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ProcessorPackageImpl
