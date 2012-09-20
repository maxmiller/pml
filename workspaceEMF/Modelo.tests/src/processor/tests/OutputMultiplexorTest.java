/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package processor.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import processor.OutputMultiplexor;
import processor.ProcessorFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Output Multiplexor</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OutputMultiplexorTest extends TestCase {

	/**
	 * The fixture for this Output Multiplexor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputMultiplexor fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OutputMultiplexorTest.class);
	}

	/**
	 * Constructs a new Output Multiplexor test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputMultiplexorTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Output Multiplexor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(OutputMultiplexor fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Output Multiplexor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputMultiplexor getFixture() {
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
		setFixture(ProcessorFactory.eINSTANCE.createOutputMultiplexor());
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

} //OutputMultiplexorTest
