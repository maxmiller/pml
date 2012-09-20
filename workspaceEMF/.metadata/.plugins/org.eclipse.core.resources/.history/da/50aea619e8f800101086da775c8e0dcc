/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package multiplexormodel.multiplexador.impl;

import multiplexormodel.multiplexador.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MultiplexadorFactoryImpl extends EFactoryImpl implements MultiplexadorFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MultiplexadorFactory init() {
		try {
			MultiplexadorFactory theMultiplexadorFactory = (MultiplexadorFactory)EPackage.Registry.INSTANCE.getEFactory("http://lasic.ufrn.br/multiplexor/1.0"); 
			if (theMultiplexadorFactory != null) {
				return theMultiplexadorFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MultiplexadorFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiplexadorFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MultiplexadorPackage.INPUT: return createInput();
			case MultiplexadorPackage.MULTIPLEXER: return createMultiplexer();
			case MultiplexadorPackage.OUTPUT: return createOutput();
			case MultiplexadorPackage.SELETOR: return createSeletor();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Input createInput() {
		InputImpl input = new InputImpl();
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Multiplexer createMultiplexer() {
		MultiplexerImpl multiplexer = new MultiplexerImpl();
		return multiplexer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Output createOutput() {
		OutputImpl output = new OutputImpl();
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Seletor createSeletor() {
		SeletorImpl seletor = new SeletorImpl();
		return seletor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiplexadorPackage getMultiplexadorPackage() {
		return (MultiplexadorPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MultiplexadorPackage getPackage() {
		return MultiplexadorPackage.eINSTANCE;
	}

} //MultiplexadorFactoryImpl
