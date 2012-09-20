/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package processor.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>processor</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcessorTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new ProcessorTests("processor Tests");
		suite.addTestSuite(MultiplexorTest.class);
		suite.addTestSuite(DemultiplexorTest.class);
		suite.addTestSuite(RegisterFileTest.class);
		suite.addTestSuite(RegisterAssyncResetTest.class);
		suite.addTestSuite(ControlUnitTest.class);
		suite.addTestSuite(ULATest.class);
		suite.addTestSuite(MemoryTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessorTests(String name) {
		super(name);
	}

} //ProcessorTests
