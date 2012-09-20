/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package processor.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import processor.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see processor.ProcessorPackage
 * @generated
 */
public class ProcessorSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ProcessorPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessorSwitch() {
		if (modelPackage == null) {
			modelPackage = ProcessorPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ProcessorPackage.MULTIPLEXOR: {
				Multiplexor multiplexor = (Multiplexor)theEObject;
				T result = caseMultiplexor(multiplexor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessorPackage.SELETOR_REGISTER_FILE: {
				SeletorRegisterFile seletorRegisterFile = (SeletorRegisterFile)theEObject;
				T result = caseSeletorRegisterFile(seletorRegisterFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessorPackage.DEMULTIPLEXOR: {
				Demultiplexor demultiplexor = (Demultiplexor)theEObject;
				T result = caseDemultiplexor(demultiplexor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessorPackage.REGISTER_FILE: {
				RegisterFile registerFile = (RegisterFile)theEObject;
				T result = caseRegisterFile(registerFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessorPackage.REGISTER_ASSYNC_RESET: {
				RegisterAssyncReset registerAssyncReset = (RegisterAssyncReset)theEObject;
				T result = caseRegisterAssyncReset(registerAssyncReset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessorPackage.WRITE: {
				Write write = (Write)theEObject;
				T result = caseWrite(write);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessorPackage.READ: {
				Read read = (Read)theEObject;
				T result = caseRead(read);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessorPackage.READ_WRITE: {
				ReadWrite readWrite = (ReadWrite)theEObject;
				T result = caseReadWrite(readWrite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessorPackage.REGISTER: {
				Register register = (Register)theEObject;
				T result = caseRegister(register);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessorPackage.CONTROL_UNIT: {
				ControlUnit controlUnit = (ControlUnit)theEObject;
				T result = caseControlUnit(controlUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessorPackage.ULA: {
				ULA ula = (ULA)theEObject;
				T result = caseULA(ula);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessorPackage.INPUT_BOOLEAN: {
				InputBoolean inputBoolean = (InputBoolean)theEObject;
				T result = caseInputBoolean(inputBoolean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessorPackage.RESET: {
				Reset reset = (Reset)theEObject;
				T result = caseReset(reset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessorPackage.CLOCK: {
				Clock clock = (Clock)theEObject;
				T result = caseClock(clock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessorPackage.OUTPUT_BOOLEAN: {
				OutputBoolean outputBoolean = (OutputBoolean)theEObject;
				T result = caseOutputBoolean(outputBoolean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessorPackage.INPUT_MULTIPLEXOR: {
				InputMultiplexor inputMultiplexor = (InputMultiplexor)theEObject;
				T result = caseInputMultiplexor(inputMultiplexor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessorPackage.OUTPUT_MULTIPLEXOR: {
				OutputMultiplexor outputMultiplexor = (OutputMultiplexor)theEObject;
				T result = caseOutputMultiplexor(outputMultiplexor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessorPackage.OUTPUT_DEMUX: {
				OutputDemux outputDemux = (OutputDemux)theEObject;
				T result = caseOutputDemux(outputDemux);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessorPackage.INPUT_DEMUX: {
				InputDemux inputDemux = (InputDemux)theEObject;
				T result = caseInputDemux(inputDemux);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessorPackage.INPUT_REGISTER_FILE: {
				InputRegisterFile inputRegisterFile = (InputRegisterFile)theEObject;
				T result = caseInputRegisterFile(inputRegisterFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessorPackage.OUTPUT_REGISTER_FILE: {
				OutputRegisterFile outputRegisterFile = (OutputRegisterFile)theEObject;
				T result = caseOutputRegisterFile(outputRegisterFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessorPackage.INPUT_REGISTER_ASSYNC: {
				InputRegisterAssync inputRegisterAssync = (InputRegisterAssync)theEObject;
				T result = caseInputRegisterAssync(inputRegisterAssync);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessorPackage.OUTPUT_REGISTER_ASSYNC: {
				OutputRegisterAssync outputRegisterAssync = (OutputRegisterAssync)theEObject;
				T result = caseOutputRegisterAssync(outputRegisterAssync);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessorPackage.LOAD: {
				Load load = (Load)theEObject;
				T result = caseLoad(load);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessorPackage.INPUT_MEMORY: {
				InputMemory inputMemory = (InputMemory)theEObject;
				T result = caseInputMemory(inputMemory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessorPackage.OUTPUT_MEMORY: {
				OutputMemory outputMemory = (OutputMemory)theEObject;
				T result = caseOutputMemory(outputMemory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessorPackage.ADDRESS_MEMORY: {
				AddressMemory addressMemory = (AddressMemory)theEObject;
				T result = caseAddressMemory(addressMemory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessorPackage.MEMORY: {
				Memory memory = (Memory)theEObject;
				T result = caseMemory(memory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessorPackage.OPERATION: {
				Operation operation = (Operation)theEObject;
				T result = caseOperation(operation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessorPackage.OUTPUT_ULA: {
				OutputULA outputULA = (OutputULA)theEObject;
				T result = caseOutputULA(outputULA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessorPackage.SELETOR_ULA: {
				SeletorULA seletorULA = (SeletorULA)theEObject;
				T result = caseSeletorULA(seletorULA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessorPackage.STATUS: {
				Status status = (Status)theEObject;
				T result = caseStatus(status);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessorPackage.LOAD_CONTROL_UNIT: {
				LoadControlUnit loadControlUnit = (LoadControlUnit)theEObject;
				T result = caseLoadControlUnit(loadControlUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessorPackage.SELETOR_CONTROL_UNIT: {
				SeletorControlUnit seletorControlUnit = (SeletorControlUnit)theEObject;
				T result = caseSeletorControlUnit(seletorControlUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiplexor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiplexor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiplexor(Multiplexor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Seletor Register File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Seletor Register File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSeletorRegisterFile(SeletorRegisterFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Demultiplexor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Demultiplexor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDemultiplexor(Demultiplexor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Register File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Register File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegisterFile(RegisterFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Register Assync Reset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Register Assync Reset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegisterAssyncReset(RegisterAssyncReset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Write</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Write</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWrite(Write object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Read</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Read</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRead(Read object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Read Write</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Read Write</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadWrite(ReadWrite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Register</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Register</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegister(Register object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlUnit(ControlUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ULA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ULA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseULA(ULA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputBoolean(InputBoolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReset(Reset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clock</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clock</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClock(Clock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputBoolean(OutputBoolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Multiplexor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Multiplexor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputMultiplexor(InputMultiplexor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Multiplexor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Multiplexor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputMultiplexor(OutputMultiplexor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Demux</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Demux</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputDemux(OutputDemux object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Demux</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Demux</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputDemux(InputDemux object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Register File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Register File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputRegisterFile(InputRegisterFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Register File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Register File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputRegisterFile(OutputRegisterFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Register Assync</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Register Assync</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputRegisterAssync(InputRegisterAssync object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Register Assync</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Register Assync</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputRegisterAssync(OutputRegisterAssync object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Load</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Load</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoad(Load object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Memory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Memory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputMemory(InputMemory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Memory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Memory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputMemory(OutputMemory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Address Memory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Address Memory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddressMemory(AddressMemory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Memory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Memory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMemory(Memory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperation(Operation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output ULA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output ULA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputULA(OutputULA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Seletor ULA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Seletor ULA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSeletorULA(SeletorULA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatus(Status object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Load Control Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Load Control Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoadControlUnit(LoadControlUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Seletor Control Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Seletor Control Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSeletorControlUnit(SeletorControlUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ProcessorSwitch
