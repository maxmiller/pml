/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package processor.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import processor.InputDemux;
import processor.ProcessorFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Input Demux</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InputDemuxTest extends TestCase {

	/**
	 * The fixture for this Input Demux test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputDemux fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InputDemuxTest.class);
	}

	/**
	 * Constructs a new Input Demux test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputDemuxTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Input Demux test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(InputDemux fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Input Demux test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputDemux getFixture() {
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
		setFixture(ProcessorFactory.eINSTANCE.createInputDemux());
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

} //InputDemuxTest
