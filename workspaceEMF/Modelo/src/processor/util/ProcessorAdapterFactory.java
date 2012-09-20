/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package processor.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import processor.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see processor.ProcessorPackage
 * @generated
 */
public class ProcessorAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ProcessorPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessorAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ProcessorPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessorSwitch<Adapter> modelSwitch =
		new ProcessorSwitch<Adapter>() {
			@Override
			public Adapter caseMultiplexor(Multiplexor object) {
				return createMultiplexorAdapter();
			}
			@Override
			public Adapter caseSeletorRegisterFile(SeletorRegisterFile object) {
				return createSeletorRegisterFileAdapter();
			}
			@Override
			public Adapter caseDemultiplexor(Demultiplexor object) {
				return createDemultiplexorAdapter();
			}
			@Override
			public Adapter caseRegisterFile(RegisterFile object) {
				return createRegisterFileAdapter();
			}
			@Override
			public Adapter caseRegisterAssyncReset(RegisterAssyncReset object) {
				return createRegisterAssyncResetAdapter();
			}
			@Override
			public Adapter caseWrite(Write object) {
				return createWriteAdapter();
			}
			@Override
			public Adapter caseRead(Read object) {
				return createReadAdapter();
			}
			@Override
			public Adapter caseReadWrite(ReadWrite object) {
				return createReadWriteAdapter();
			}
			@Override
			public Adapter caseRegister(Register object) {
				return createRegisterAdapter();
			}
			@Override
			public Adapter caseControlUnit(ControlUnit object) {
				return createControlUnitAdapter();
			}
			@Override
			public Adapter caseULA(ULA object) {
				return createULAAdapter();
			}
			@Override
			public Adapter caseInputBoolean(InputBoolean object) {
				return createInputBooleanAdapter();
			}
			@Override
			public Adapter caseReset(Reset object) {
				return createResetAdapter();
			}
			@Override
			public Adapter caseClock(Clock object) {
				return createClockAdapter();
			}
			@Override
			public Adapter caseOutputBoolean(OutputBoolean object) {
				return createOutputBooleanAdapter();
			}
			@Override
			public Adapter caseInputMultiplexor(InputMultiplexor object) {
				return createInputMultiplexorAdapter();
			}
			@Override
			public Adapter caseOutputMultiplexor(OutputMultiplexor object) {
				return createOutputMultiplexorAdapter();
			}
			@Override
			public Adapter caseOutputDemux(OutputDemux object) {
				return createOutputDemuxAdapter();
			}
			@Override
			public Adapter caseInputDemux(InputDemux object) {
				return createInputDemuxAdapter();
			}
			@Override
			public Adapter caseInputRegisterFile(InputRegisterFile object) {
				return createInputRegisterFileAdapter();
			}
			@Override
			public Adapter caseOutputRegisterFile(OutputRegisterFile object) {
				return createOutputRegisterFileAdapter();
			}
			@Override
			public Adapter caseInputRegisterAssync(InputRegisterAssync object) {
				return createInputRegisterAssyncAdapter();
			}
			@Override
			public Adapter caseOutputRegisterAssync(OutputRegisterAssync object) {
				return createOutputRegisterAssyncAdapter();
			}
			@Override
			public Adapter caseLoad(Load object) {
				return createLoadAdapter();
			}
			@Override
			public Adapter caseInputMemory(InputMemory object) {
				return createInputMemoryAdapter();
			}
			@Override
			public Adapter caseOutputMemory(OutputMemory object) {
				return createOutputMemoryAdapter();
			}
			@Override
			public Adapter caseAddressMemory(AddressMemory object) {
				return createAddressMemoryAdapter();
			}
			@Override
			public Adapter caseMemory(Memory object) {
				return createMemoryAdapter();
			}
			@Override
			public Adapter caseOperation(Operation object) {
				return createOperationAdapter();
			}
			@Override
			public Adapter caseOutputULA(OutputULA object) {
				return createOutputULAAdapter();
			}
			@Override
			public Adapter caseSeletorULA(SeletorULA object) {
				return createSeletorULAAdapter();
			}
			@Override
			public Adapter caseStatus(Status object) {
				return createStatusAdapter();
			}
			@Override
			public Adapter caseLoadControlUnit(LoadControlUnit object) {
				return createLoadControlUnitAdapter();
			}
			@Override
			public Adapter caseSeletorControlUnit(SeletorControlUnit object) {
				return createSeletorControlUnitAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link processor.Multiplexor <em>Multiplexor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see processor.Multiplexor
	 * @generated
	 */
	public Adapter createMultiplexorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link processor.SeletorRegisterFile <em>Seletor Register File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see processor.SeletorRegisterFile
	 * @generated
	 */
	public Adapter createSeletorRegisterFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link processor.Demultiplexor <em>Demultiplexor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see processor.Demultiplexor
	 * @generated
	 */
	public Adapter createDemultiplexorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link processor.RegisterFile <em>Register File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see processor.RegisterFile
	 * @generated
	 */
	public Adapter createRegisterFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link processor.RegisterAssyncReset <em>Register Assync Reset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see processor.RegisterAssyncReset
	 * @generated
	 */
	public Adapter createRegisterAssyncResetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link processor.Write <em>Write</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see processor.Write
	 * @generated
	 */
	public Adapter createWriteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link processor.Read <em>Read</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see processor.Read
	 * @generated
	 */
	public Adapter createReadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link processor.ReadWrite <em>Read Write</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see processor.ReadWrite
	 * @generated
	 */
	public Adapter createReadWriteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link processor.Register <em>Register</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see processor.Register
	 * @generated
	 */
	public Adapter createRegisterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link processor.ControlUnit <em>Control Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see processor.ControlUnit
	 * @generated
	 */
	public Adapter createControlUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link processor.ULA <em>ULA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see processor.ULA
	 * @generated
	 */
	public Adapter createULAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link processor.InputBoolean <em>Input Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see processor.InputBoolean
	 * @generated
	 */
	public Adapter createInputBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link processor.Reset <em>Reset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see processor.Reset
	 * @generated
	 */
	public Adapter createResetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link processor.Clock <em>Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see processor.Clock
	 * @generated
	 */
	public Adapter createClockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link processor.OutputBoolean <em>Output Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see processor.OutputBoolean
	 * @generated
	 */
	public Adapter createOutputBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link processor.InputMultiplexor <em>Input Multiplexor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see processor.InputMultiplexor
	 * @generated
	 */
	public Adapter createInputMultiplexorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link processor.OutputMultiplexor <em>Output Multiplexor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see processor.OutputMultiplexor
	 * @generated
	 */
	public Adapter createOutputMultiplexorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link processor.OutputDemux <em>Output Demux</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see processor.OutputDemux
	 * @generated
	 */
	public Adapter createOutputDemuxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link processor.InputDemux <em>Input Demux</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see processor.InputDemux
	 * @generated
	 */
	public Adapter createInputDemuxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link processor.InputRegisterFile <em>Input Register File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see processor.InputRegisterFile
	 * @generated
	 */
	public Adapter createInputRegisterFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link processor.OutputRegisterFile <em>Output Register File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see processor.OutputRegisterFile
	 * @generated
	 */
	public Adapter createOutputRegisterFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link processor.InputRegisterAssync <em>Input Register Assync</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see processor.InputRegisterAssync
	 * @generated
	 */
	public Adapter createInputRegisterAssyncAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link processor.OutputRegisterAssync <em>Output Register Assync</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see processor.OutputRegisterAssync
	 * @generated
	 */
	public Adapter createOutputRegisterAssyncAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link processor.Load <em>Load</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see processor.Load
	 * @generated
	 */
	public Adapter createLoadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link processor.InputMemory <em>Input Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see processor.InputMemory
	 * @generated
	 */
	public Adapter createInputMemoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link processor.OutputMemory <em>Output Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see processor.OutputMemory
	 * @generated
	 */
	public Adapter createOutputMemoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link processor.AddressMemory <em>Address Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see processor.AddressMemory
	 * @generated
	 */
	public Adapter createAddressMemoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link processor.Memory <em>Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see processor.Memory
	 * @generated
	 */
	public Adapter createMemoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link processor.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see processor.Operation
	 * @generated
	 */
	public Adapter createOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link processor.OutputULA <em>Output ULA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see processor.OutputULA
	 * @generated
	 */
	public Adapter createOutputULAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link processor.SeletorULA <em>Seletor ULA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see processor.SeletorULA
	 * @generated
	 */
	public Adapter createSeletorULAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link processor.Status <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see processor.Status
	 * @generated
	 */
	public Adapter createStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link processor.LoadControlUnit <em>Load Control Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see processor.LoadControlUnit
	 * @generated
	 */
	public Adapter createLoadControlUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link processor.SeletorControlUnit <em>Seletor Control Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see processor.SeletorControlUnit
	 * @generated
	 */
	public Adapter createSeletorControlUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ProcessorAdapterFactory
