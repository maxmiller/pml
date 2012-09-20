/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package processor.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import processor.InputBoolean;
import processor.ProcessorFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Input Boolean</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InputBooleanTest extends TestCase {

	/**
	 * The fixture for this Input Boolean test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputBoolean fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InputBooleanTest.class);
	}

	/**
	 * Constructs a new Input Boolean test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputBooleanTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Input Boolean test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(InputBoolean fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Input Boolean test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputBoolean getFixture() {
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
		setFixture(ProcessorFactory.eINSTANCE.createInputBoolean());
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

} //InputBooleanTest
