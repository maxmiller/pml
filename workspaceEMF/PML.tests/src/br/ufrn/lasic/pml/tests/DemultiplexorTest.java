/**
 */
package br.ufrn.lasic.pml.tests;

import br.ufrn.lasic.pml.Demultiplexor;
import br.ufrn.lasic.pml.PMLFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Demultiplexor</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DemultiplexorTest extends TestCase {

	/**
	 * The fixture for this Demultiplexor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Demultiplexor fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DemultiplexorTest.class);
	}

	/**
	 * Constructs a new Demultiplexor test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DemultiplexorTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Demultiplexor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Demultiplexor fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Demultiplexor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Demultiplexor getFixture() {
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
		setFixture(PMLFactory.eINSTANCE.createDemultiplexor());
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

} //DemultiplexorTest
