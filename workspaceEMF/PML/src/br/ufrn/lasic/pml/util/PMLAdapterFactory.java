/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.ufrn.lasic.pml.util;

import br.ufrn.lasic.pml.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see br.ufrn.lasic.pml.PMLPackage
 * @generated
 */
public class PMLAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PMLPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PMLAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PMLPackage.eINSTANCE;
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
	protected PMLSwitch<Adapter> modelSwitch =
		new PMLSwitch<Adapter>() {
			@Override
			public Adapter caseULA(ULA object) {
				return createULAAdapter();
			}
			@Override
			public Adapter caseBehavior(Behavior object) {
				return createBehaviorAdapter();
			}
			@Override
			public Adapter caseInput(Input object) {
				return createInputAdapter();
			}
			@Override
			public Adapter caseOutput(Output object) {
				return createOutputAdapter();
			}
			@Override
			public Adapter caseDemultiplexor(Demultiplexor object) {
				return createDemultiplexorAdapter();
			}
			@Override
			public Adapter caseMultiplexor(Multiplexor object) {
				return createMultiplexorAdapter();
			}
			@Override
			public Adapter caseControlUnit(ControlUnit object) {
				return createControlUnitAdapter();
			}
			@Override
			public Adapter caseProcessor(Processor object) {
				return createProcessorAdapter();
			}
			@Override
			public Adapter caseMemory(Memory object) {
				return createMemoryAdapter();
			}
			@Override
			public Adapter caseRegister(Register object) {
				return createRegisterAdapter();
			}
			@Override
			public Adapter caseInstructions(Instructions object) {
				return createInstructionsAdapter();
			}
			@Override
			public Adapter caseMicroInstruction(MicroInstruction object) {
				return createMicroInstructionAdapter();
			}
			@Override
			public Adapter caseInitialMicroInstruction(InitialMicroInstruction object) {
				return createInitialMicroInstructionAdapter();
			}
			@Override
			public Adapter caseFinalMicroInstruction(FinalMicroInstruction object) {
				return createFinalMicroInstructionAdapter();
			}
			@Override
			public Adapter caseSeletor(Seletor object) {
				return createSeletorAdapter();
			}
			@Override
			public Adapter caseOperation(Operation object) {
				return createOperationAdapter();
			}
			@Override
			public Adapter caseDecoder(Decoder object) {
				return createDecoderAdapter();
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
	 * Creates a new adapter for an object of class '{@link br.ufrn.lasic.pml.ULA <em>ULA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufrn.lasic.pml.ULA
	 * @generated
	 */
	public Adapter createULAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufrn.lasic.pml.Behavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufrn.lasic.pml.Behavior
	 * @generated
	 */
	public Adapter createBehaviorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufrn.lasic.pml.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufrn.lasic.pml.Input
	 * @generated
	 */
	public Adapter createInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufrn.lasic.pml.Output <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufrn.lasic.pml.Output
	 * @generated
	 */
	public Adapter createOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufrn.lasic.pml.Demultiplexor <em>Demultiplexor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufrn.lasic.pml.Demultiplexor
	 * @generated
	 */
	public Adapter createDemultiplexorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufrn.lasic.pml.Multiplexor <em>Multiplexor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufrn.lasic.pml.Multiplexor
	 * @generated
	 */
	public Adapter createMultiplexorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufrn.lasic.pml.ControlUnit <em>Control Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufrn.lasic.pml.ControlUnit
	 * @generated
	 */
	public Adapter createControlUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufrn.lasic.pml.Processor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufrn.lasic.pml.Processor
	 * @generated
	 */
	public Adapter createProcessorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufrn.lasic.pml.Memory <em>Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufrn.lasic.pml.Memory
	 * @generated
	 */
	public Adapter createMemoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufrn.lasic.pml.Register <em>Register</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufrn.lasic.pml.Register
	 * @generated
	 */
	public Adapter createRegisterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufrn.lasic.pml.Instructions <em>Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufrn.lasic.pml.Instructions
	 * @generated
	 */
	public Adapter createInstructionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufrn.lasic.pml.MicroInstruction <em>Micro Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufrn.lasic.pml.MicroInstruction
	 * @generated
	 */
	public Adapter createMicroInstructionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufrn.lasic.pml.InitialMicroInstruction <em>Initial Micro Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufrn.lasic.pml.InitialMicroInstruction
	 * @generated
	 */
	public Adapter createInitialMicroInstructionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufrn.lasic.pml.FinalMicroInstruction <em>Final Micro Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufrn.lasic.pml.FinalMicroInstruction
	 * @generated
	 */
	public Adapter createFinalMicroInstructionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufrn.lasic.pml.Seletor <em>Seletor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufrn.lasic.pml.Seletor
	 * @generated
	 */
	public Adapter createSeletorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufrn.lasic.pml.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufrn.lasic.pml.Operation
	 * @generated
	 */
	public Adapter createOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufrn.lasic.pml.Decoder <em>Decoder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufrn.lasic.pml.Decoder
	 * @generated
	 */
	public Adapter createDecoderAdapter() {
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

} //PMLAdapterFactory
