/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package processor.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import processor.util.ProcessorAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcessorItemProviderAdapterFactory extends ProcessorAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessorItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link processor.Multiplexor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiplexorItemProvider multiplexorItemProvider;

	/**
	 * This creates an adapter for a {@link processor.Multiplexor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMultiplexorAdapter() {
		if (multiplexorItemProvider == null) {
			multiplexorItemProvider = new MultiplexorItemProvider(this);
		}

		return multiplexorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link processor.SeletorRegisterFile} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SeletorRegisterFileItemProvider seletorRegisterFileItemProvider;

	/**
	 * This creates an adapter for a {@link processor.SeletorRegisterFile}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSeletorRegisterFileAdapter() {
		if (seletorRegisterFileItemProvider == null) {
			seletorRegisterFileItemProvider = new SeletorRegisterFileItemProvider(this);
		}

		return seletorRegisterFileItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link processor.Demultiplexor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DemultiplexorItemProvider demultiplexorItemProvider;

	/**
	 * This creates an adapter for a {@link processor.Demultiplexor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDemultiplexorAdapter() {
		if (demultiplexorItemProvider == null) {
			demultiplexorItemProvider = new DemultiplexorItemProvider(this);
		}

		return demultiplexorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link processor.RegisterFile} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegisterFileItemProvider registerFileItemProvider;

	/**
	 * This creates an adapter for a {@link processor.RegisterFile}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRegisterFileAdapter() {
		if (registerFileItemProvider == null) {
			registerFileItemProvider = new RegisterFileItemProvider(this);
		}

		return registerFileItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link processor.RegisterAssyncReset} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegisterAssyncResetItemProvider registerAssyncResetItemProvider;

	/**
	 * This creates an adapter for a {@link processor.RegisterAssyncReset}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRegisterAssyncResetAdapter() {
		if (registerAssyncResetItemProvider == null) {
			registerAssyncResetItemProvider = new RegisterAssyncResetItemProvider(this);
		}

		return registerAssyncResetItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link processor.Write} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WriteItemProvider writeItemProvider;

	/**
	 * This creates an adapter for a {@link processor.Write}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWriteAdapter() {
		if (writeItemProvider == null) {
			writeItemProvider = new WriteItemProvider(this);
		}

		return writeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link processor.Read} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReadItemProvider readItemProvider;

	/**
	 * This creates an adapter for a {@link processor.Read}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createReadAdapter() {
		if (readItemProvider == null) {
			readItemProvider = new ReadItemProvider(this);
		}

		return readItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link processor.ReadWrite} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReadWriteItemProvider readWriteItemProvider;

	/**
	 * This creates an adapter for a {@link processor.ReadWrite}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createReadWriteAdapter() {
		if (readWriteItemProvider == null) {
			readWriteItemProvider = new ReadWriteItemProvider(this);
		}

		return readWriteItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link processor.Register} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegisterItemProvider registerItemProvider;

	/**
	 * This creates an adapter for a {@link processor.Register}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRegisterAdapter() {
		if (registerItemProvider == null) {
			registerItemProvider = new RegisterItemProvider(this);
		}

		return registerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link processor.ControlUnit} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlUnitItemProvider controlUnitItemProvider;

	/**
	 * This creates an adapter for a {@link processor.ControlUnit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createControlUnitAdapter() {
		if (controlUnitItemProvider == null) {
			controlUnitItemProvider = new ControlUnitItemProvider(this);
		}

		return controlUnitItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link processor.ULA} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ULAItemProvider ulaItemProvider;

	/**
	 * This creates an adapter for a {@link processor.ULA}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createULAAdapter() {
		if (ulaItemProvider == null) {
			ulaItemProvider = new ULAItemProvider(this);
		}

		return ulaItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link processor.InputBoolean} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputBooleanItemProvider inputBooleanItemProvider;

	/**
	 * This creates an adapter for a {@link processor.InputBoolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInputBooleanAdapter() {
		if (inputBooleanItemProvider == null) {
			inputBooleanItemProvider = new InputBooleanItemProvider(this);
		}

		return inputBooleanItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link processor.Reset} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResetItemProvider resetItemProvider;

	/**
	 * This creates an adapter for a {@link processor.Reset}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createResetAdapter() {
		if (resetItemProvider == null) {
			resetItemProvider = new ResetItemProvider(this);
		}

		return resetItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link processor.Clock} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClockItemProvider clockItemProvider;

	/**
	 * This creates an adapter for a {@link processor.Clock}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createClockAdapter() {
		if (clockItemProvider == null) {
			clockItemProvider = new ClockItemProvider(this);
		}

		return clockItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link processor.OutputBoolean} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputBooleanItemProvider outputBooleanItemProvider;

	/**
	 * This creates an adapter for a {@link processor.OutputBoolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOutputBooleanAdapter() {
		if (outputBooleanItemProvider == null) {
			outputBooleanItemProvider = new OutputBooleanItemProvider(this);
		}

		return outputBooleanItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link processor.InputMultiplexor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputMultiplexorItemProvider inputMultiplexorItemProvider;

	/**
	 * This creates an adapter for a {@link processor.InputMultiplexor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInputMultiplexorAdapter() {
		if (inputMultiplexorItemProvider == null) {
			inputMultiplexorItemProvider = new InputMultiplexorItemProvider(this);
		}

		return inputMultiplexorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link processor.OutputMultiplexor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputMultiplexorItemProvider outputMultiplexorItemProvider;

	/**
	 * This creates an adapter for a {@link processor.OutputMultiplexor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOutputMultiplexorAdapter() {
		if (outputMultiplexorItemProvider == null) {
			outputMultiplexorItemProvider = new OutputMultiplexorItemProvider(this);
		}

		return outputMultiplexorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link processor.OutputDemux} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputDemuxItemProvider outputDemuxItemProvider;

	/**
	 * This creates an adapter for a {@link processor.OutputDemux}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOutputDemuxAdapter() {
		if (outputDemuxItemProvider == null) {
			outputDemuxItemProvider = new OutputDemuxItemProvider(this);
		}

		return outputDemuxItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link processor.InputDemux} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputDemuxItemProvider inputDemuxItemProvider;

	/**
	 * This creates an adapter for a {@link processor.InputDemux}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInputDemuxAdapter() {
		if (inputDemuxItemProvider == null) {
			inputDemuxItemProvider = new InputDemuxItemProvider(this);
		}

		return inputDemuxItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link processor.InputRegisterFile} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputRegisterFileItemProvider inputRegisterFileItemProvider;

	/**
	 * This creates an adapter for a {@link processor.InputRegisterFile}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInputRegisterFileAdapter() {
		if (inputRegisterFileItemProvider == null) {
			inputRegisterFileItemProvider = new InputRegisterFileItemProvider(this);
		}

		return inputRegisterFileItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link processor.OutputRegisterFile} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputRegisterFileItemProvider outputRegisterFileItemProvider;

	/**
	 * This creates an adapter for a {@link processor.OutputRegisterFile}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOutputRegisterFileAdapter() {
		if (outputRegisterFileItemProvider == null) {
			outputRegisterFileItemProvider = new OutputRegisterFileItemProvider(this);
		}

		return outputRegisterFileItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link processor.InputRegisterAssync} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputRegisterAssyncItemProvider inputRegisterAssyncItemProvider;

	/**
	 * This creates an adapter for a {@link processor.InputRegisterAssync}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInputRegisterAssyncAdapter() {
		if (inputRegisterAssyncItemProvider == null) {
			inputRegisterAssyncItemProvider = new InputRegisterAssyncItemProvider(this);
		}

		return inputRegisterAssyncItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link processor.OutputRegisterAssync} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputRegisterAssyncItemProvider outputRegisterAssyncItemProvider;

	/**
	 * This creates an adapter for a {@link processor.OutputRegisterAssync}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOutputRegisterAssyncAdapter() {
		if (outputRegisterAssyncItemProvider == null) {
			outputRegisterAssyncItemProvider = new OutputRegisterAssyncItemProvider(this);
		}

		return outputRegisterAssyncItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link processor.Load} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadItemProvider loadItemProvider;

	/**
	 * This creates an adapter for a {@link processor.Load}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLoadAdapter() {
		if (loadItemProvider == null) {
			loadItemProvider = new LoadItemProvider(this);
		}

		return loadItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link processor.InputMemory} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputMemoryItemProvider inputMemoryItemProvider;

	/**
	 * This creates an adapter for a {@link processor.InputMemory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInputMemoryAdapter() {
		if (inputMemoryItemProvider == null) {
			inputMemoryItemProvider = new InputMemoryItemProvider(this);
		}

		return inputMemoryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link processor.OutputMemory} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputMemoryItemProvider outputMemoryItemProvider;

	/**
	 * This creates an adapter for a {@link processor.OutputMemory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOutputMemoryAdapter() {
		if (outputMemoryItemProvider == null) {
			outputMemoryItemProvider = new OutputMemoryItemProvider(this);
		}

		return outputMemoryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link processor.AddressMemory} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddressMemoryItemProvider addressMemoryItemProvider;

	/**
	 * This creates an adapter for a {@link processor.AddressMemory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAddressMemoryAdapter() {
		if (addressMemoryItemProvider == null) {
			addressMemoryItemProvider = new AddressMemoryItemProvider(this);
		}

		return addressMemoryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link processor.Memory} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemoryItemProvider memoryItemProvider;

	/**
	 * This creates an adapter for a {@link processor.Memory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMemoryAdapter() {
		if (memoryItemProvider == null) {
			memoryItemProvider = new MemoryItemProvider(this);
		}

		return memoryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link processor.Operation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationItemProvider operationItemProvider;

	/**
	 * This creates an adapter for a {@link processor.Operation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOperationAdapter() {
		if (operationItemProvider == null) {
			operationItemProvider = new OperationItemProvider(this);
		}

		return operationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link processor.OutputULA} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputULAItemProvider outputULAItemProvider;

	/**
	 * This creates an adapter for a {@link processor.OutputULA}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOutputULAAdapter() {
		if (outputULAItemProvider == null) {
			outputULAItemProvider = new OutputULAItemProvider(this);
		}

		return outputULAItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link processor.SeletorULA} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SeletorULAItemProvider seletorULAItemProvider;

	/**
	 * This creates an adapter for a {@link processor.SeletorULA}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSeletorULAAdapter() {
		if (seletorULAItemProvider == null) {
			seletorULAItemProvider = new SeletorULAItemProvider(this);
		}

		return seletorULAItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link processor.Status} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StatusItemProvider statusItemProvider;

	/**
	 * This creates an adapter for a {@link processor.Status}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStatusAdapter() {
		if (statusItemProvider == null) {
			statusItemProvider = new StatusItemProvider(this);
		}

		return statusItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link processor.LoadControlUnit} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadControlUnitItemProvider loadControlUnitItemProvider;

	/**
	 * This creates an adapter for a {@link processor.LoadControlUnit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLoadControlUnitAdapter() {
		if (loadControlUnitItemProvider == null) {
			loadControlUnitItemProvider = new LoadControlUnitItemProvider(this);
		}

		return loadControlUnitItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link processor.SeletorControlUnit} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SeletorControlUnitItemProvider seletorControlUnitItemProvider;

	/**
	 * This creates an adapter for a {@link processor.SeletorControlUnit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSeletorControlUnitAdapter() {
		if (seletorControlUnitItemProvider == null) {
			seletorControlUnitItemProvider = new SeletorControlUnitItemProvider(this);
		}

		return seletorControlUnitItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (multiplexorItemProvider != null) multiplexorItemProvider.dispose();
		if (seletorRegisterFileItemProvider != null) seletorRegisterFileItemProvider.dispose();
		if (demultiplexorItemProvider != null) demultiplexorItemProvider.dispose();
		if (registerFileItemProvider != null) registerFileItemProvider.dispose();
		if (registerAssyncResetItemProvider != null) registerAssyncResetItemProvider.dispose();
		if (writeItemProvider != null) writeItemProvider.dispose();
		if (readItemProvider != null) readItemProvider.dispose();
		if (readWriteItemProvider != null) readWriteItemProvider.dispose();
		if (registerItemProvider != null) registerItemProvider.dispose();
		if (controlUnitItemProvider != null) controlUnitItemProvider.dispose();
		if (ulaItemProvider != null) ulaItemProvider.dispose();
		if (inputBooleanItemProvider != null) inputBooleanItemProvider.dispose();
		if (resetItemProvider != null) resetItemProvider.dispose();
		if (clockItemProvider != null) clockItemProvider.dispose();
		if (outputBooleanItemProvider != null) outputBooleanItemProvider.dispose();
		if (inputMultiplexorItemProvider != null) inputMultiplexorItemProvider.dispose();
		if (outputMultiplexorItemProvider != null) outputMultiplexorItemProvider.dispose();
		if (outputDemuxItemProvider != null) outputDemuxItemProvider.dispose();
		if (inputDemuxItemProvider != null) inputDemuxItemProvider.dispose();
		if (inputRegisterFileItemProvider != null) inputRegisterFileItemProvider.dispose();
		if (outputRegisterFileItemProvider != null) outputRegisterFileItemProvider.dispose();
		if (inputRegisterAssyncItemProvider != null) inputRegisterAssyncItemProvider.dispose();
		if (outputRegisterAssyncItemProvider != null) outputRegisterAssyncItemProvider.dispose();
		if (loadItemProvider != null) loadItemProvider.dispose();
		if (inputMemoryItemProvider != null) inputMemoryItemProvider.dispose();
		if (outputMemoryItemProvider != null) outputMemoryItemProvider.dispose();
		if (addressMemoryItemProvider != null) addressMemoryItemProvider.dispose();
		if (memoryItemProvider != null) memoryItemProvider.dispose();
		if (operationItemProvider != null) operationItemProvider.dispose();
		if (outputULAItemProvider != null) outputULAItemProvider.dispose();
		if (seletorULAItemProvider != null) seletorULAItemProvider.dispose();
		if (statusItemProvider != null) statusItemProvider.dispose();
		if (loadControlUnitItemProvider != null) loadControlUnitItemProvider.dispose();
		if (seletorControlUnitItemProvider != null) seletorControlUnitItemProvider.dispose();
	}

}
