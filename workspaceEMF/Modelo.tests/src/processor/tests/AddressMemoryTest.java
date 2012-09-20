/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package processor.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import processor.AddressMemory;
import processor.ProcessorFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Address Memory</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AddressMemoryTest extends TestCase {

	/**
	 * The fixture for this Address Memory test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddressMemory fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AddressMemoryTest.class);
	}

	/**
	 * Constructs a new Address Memory test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressMemoryTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Address Memory test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(AddressMemory fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Address Memory test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddressMemory getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ProcessorFactory.eINSTANCE.createAddressMemory());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //AddressMemoryTest
