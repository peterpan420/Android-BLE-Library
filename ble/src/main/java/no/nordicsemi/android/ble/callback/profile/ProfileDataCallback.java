package no.nordicsemi.android.ble.callback.profile;

import android.bluetooth.BluetoothDevice;
import android.support.annotation.NonNull;

import no.nordicsemi.android.ble.data.Data;
import no.nordicsemi.android.ble.callback.DataReceivedCallback;
import no.nordicsemi.android.ble.data.DataMerger;

@SuppressWarnings("unused")
public interface ProfileDataCallback extends DataReceivedCallback {

	/**
	 * Callback called when the data received do not conform to required scheme.
	 * @param device target device.
	 * @param data the data received. If the {@link DataMerger} was used, this contains the merged result.
	 */
	default void onInvalidDataReceived(final @NonNull BluetoothDevice device, final @NonNull Data data) {
		// ignore
	}
}
