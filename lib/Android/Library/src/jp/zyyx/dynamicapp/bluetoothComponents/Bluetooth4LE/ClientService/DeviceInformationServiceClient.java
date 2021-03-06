package jp.zyyx.dynamicapp.bluetoothComponents.Bluetooth4LE.ClientService;

import jp.zyyx.dynamicapp.utilities.DebugLog;
import android.bluetooth.BluetoothDevice;

import com.broadcom.bt.le.api.BleCharacteristic;
import com.broadcom.bt.le.api.BleClientService;
import com.broadcom.bt.le.api.BleGattID;

/*
 * Copyright (C) 2014 ZYYX, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
public class DeviceInformationServiceClient extends BleClientService {
	private static final String TAG = "DeviceInformationServiceClient";

	static public BleGattID myUuid = new BleGattID(BtLE4ClientServices.makeUUIDs(BtLE4ClientServices.SERVICE_DEVICE_INFORMATION));
	
	public DeviceInformationServiceClient() {
		super(myUuid);
	}
	
	public void onWriteCharacteristicComplete(int status, BluetoothDevice d,
            BleCharacteristic characteristic) {
        DebugLog.w(TAG, "onWriteCharacteristicComplete");
    }

    public void characteristicsRetrieved(BluetoothDevice d) {
    	DebugLog.w(TAG, "characteristicsRetrieved");
    }

    public void onRefreshComplete(BluetoothDevice d) {
    	DebugLog.w(TAG, "onRefreshComplete");
    }

    public void onSetCharacteristicAuthRequirement(BluetoothDevice d,
            BleCharacteristic characteristic, int instanceID) {
    	DebugLog.w(TAG, "onSetCharacteristicAuthRequirement");
    }

    public void onReadCharacteristicComplete(BluetoothDevice d, BleCharacteristic characteristic) {
    	DebugLog.w(TAG, "refreshOneCharacteristicComplete");
    }

    public void onCharacteristicChanged(BluetoothDevice d, BleCharacteristic characteristic) {
    	DebugLog.w(TAG, "onCharacteristicChanged");
    }

}
