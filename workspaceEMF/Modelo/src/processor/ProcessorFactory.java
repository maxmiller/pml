/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package processor;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see processor.ProcessorPackage
 * @generated
 */
public interface ProcessorFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProcessorFactory eINSTANCE = processor.impl.ProcessorFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Multiplexor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multiplexor</em>'.
	 * @generated
	 */
	Multiplexor createMultiplexor();

	/**
	 * Returns a new object of class '<em>Seletor Register File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Seletor Register File</em>'.
	 * @generated
	 */
	SeletorRegisterFile createSeletorRegisterFile();

	/**
	 * Returns a new object of class '<em>Demultiplexor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Demultiplexor</em>'.
	 * @generated
	 */
	Demultiplexor createDemultiplexor();

	/**
	 * Returns a new object of class '<em>Register File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Register File</em>'.
	 * @generated
	 */
	RegisterFile createRegisterFile();

	/**
	 * Returns a new object of class '<em>Register Assync Reset</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Register Assync Reset</em>'.
	 * @generated
	 */
	RegisterAssyncReset createRegisterAssyncReset();

	/**
	 * Returns a new object of class '<em>Write</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Write</em>'.
	 * @generated
	 */
	Write createWrite();

	/**
	 * Returns a new object of class '<em>Read</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Read</em>'.
	 * @generated
	 */
	Read createRead();

	/**
	 * Returns a new object of class '<em>Read Write</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Read Write</em>'.
	 * @generated
	 */
	ReadWrite createReadWrite();

	/**
	 * Returns a new object of class '<em>Register</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Register</em>'.
	 * @generated
	 */
	Register createRegister();

	/**
	 * Returns a new object of class '<em>Control Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Control Unit</em>'.
	 * @generated
	 */
	ControlUnit createControlUnit();

	/**
	 * Returns a new object of class '<em>ULA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ULA</em>'.
	 * @generated
	 */
	ULA createULA();

	/**
	 * Returns a new object of class '<em>Input Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Boolean</em>'.
	 * @generated
	 */
	InputBoolean createInputBoolean();

	/**
	 * Returns a new object of class '<em>Reset</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reset</em>'.
	 * @generated
	 */
	Reset createReset();

	/**
	 * Returns a new object of class '<em>Clock</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clock</em>'.
	 * @generated
	 */
	Clock createClock();

	/**
	 * Returns a new object of class '<em>Output Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output Boolean</em>'.
	 * @generated
	 */
	OutputBoolean createOutputBoolean();

	/**
	 * Returns a new object of class '<em>Input Multiplexor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Multiplexor</em>'.
	 * @generated
	 */
	InputMultiplexor createInputMultiplexor();

	/**
	 * Returns a new object of class '<em>Output Multiplexor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output Multiplexor</em>'.
	 * @generated
	 */
	OutputMultiplexor createOutputMultiplexor();

	/**
	 * Returns a new object of class '<em>Output Demux</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output Demux</em>'.
	 * @generated
	 */
	OutputDemux createOutputDemux();

	/**
	 * Returns a new object of class '<em>Input Demux</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Demux</em>'.
	 * @generated
	 */
	InputDemux createInputDemux();

	/**
	 * Returns a new object of class '<em>Input Register File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Register File</em>'.
	 * @generated
	 */
	InputRegisterFile createInputRegisterFile();

	/**
	 * Returns a new object of class '<em>Output Register File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output Register File</em>'.
	 * @generated
	 */
	OutputRegisterFile createOutputRegisterFile();

	/**
	 * Returns a new object of class '<em>Input Register Assync</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Register Assync</em>'.
	 * @generated
	 */
	InputRegisterAssync createInputRegisterAssync();

	/**
	 * Returns a new object of class '<em>Output Register Assync</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output Register Assync</em>'.
	 * @generated
	 */
	OutputRegisterAssync createOutputRegisterAssync();

	/**
	 * Returns a new object of class '<em>Load</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Load</em>'.
	 * @generated
	 */
	Load createLoad();

	/**
	 * Returns a new object of class '<em>Input Memory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Memory</em>'.
	 * @generated
	 */
	InputMemory createInputMemory();

	/**
	 * Returns a new object of class '<em>Output Memory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output Memory</em>'.
	 * @generated
	 */
	OutputMemory createOutputMemory();

	/**
	 * Returns a new object of class '<em>Address Memory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Address Memory</em>'.
	 * @generated
	 */
	AddressMemory createAddressMemory();

	/**
	 * Returns a new object of class '<em>Memory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Memory</em>'.
	 * @generated
	 */
	Memory createMemory();

	/**
	 * Returns a new object of class '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation</em>'.
	 * @generated
	 */
	Operation createOperation();

	/**
	 * Returns a new object of class '<em>Output ULA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output ULA</em>'.
	 * @generated
	 */
	OutputULA createOutputULA();

	/**
	 * Returns a new object of class '<em>Seletor ULA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Seletor ULA</em>'.
	 * @generated
	 */
	SeletorULA createSeletorULA();

	/**
	 * Returns a new object of class '<em>Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Status</em>'.
	 * @generated
	 */
	Status createStatus();

	/**
	 * Returns a new object of class '<em>Load Control Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Load Control Unit</em>'.
	 * @generated
	 */
	LoadControlUnit createLoadControlUnit();

	/**
	 * Returns a new object of class '<em>Seletor Control Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Seletor Control Unit</em>'.
	 * @generated
	 */
	SeletorControlUnit createSeletorControlUnit();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ProcessorPackage getProcessorPackage();

} //ProcessorFactory
