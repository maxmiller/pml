/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package processor.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import processor.Memory;
import processor.ProcessorFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Memory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link processor.Memory#t_sync_mem() <em>Tsync mem</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class MemoryTest extends TestCase {

	/**
	 * The fixture for this Memory test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Memory fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MemoryTest.class);
	}

	/**
	 * Constructs a new Memory test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Memory test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Memory fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Memory test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Memory getFixture() {
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
		setFixture(ProcessorFactory.eINSTANCE.createMemory());
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

	/**
	 * Tests the '{@link processor.Memory#t_sync_mem() <em>Tsync mem</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see processor.Memory#t_sync_mem()
	 * @generated
	 */
	public void testT_sync_mem() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //MemoryTest
