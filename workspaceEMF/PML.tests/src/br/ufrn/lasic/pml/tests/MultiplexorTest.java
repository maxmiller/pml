/**
 */
package br.ufrn.lasic.pml.tests;

import br.ufrn.lasic.pml.Multiplexor;
import br.ufrn.lasic.pml.PMLFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Multiplexor</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MultiplexorTest extends TestCase {

	/**
	 * The fixture for this Multiplexor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Multiplexor fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MultiplexorTest.class);
	}

	/**
	 * Constructs a new Multiplexor test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiplexorTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Multiplexor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Multiplexor fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Multiplexor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Multiplexor getFixture() {
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
		setFixture(PMLFactory.eINSTANCE.createMultiplexor());
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

} //MultiplexorTest
