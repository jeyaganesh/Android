package com.example.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class Broadcastreceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		// TODO Auto-generated method stub

		if (intent.getAction()
				.equals("android.provider.Telephony.SMS_RECEIVED")) {
			Toast toast = Toast.makeText(context, "message received",
					Toast.LENGTH_LONG);
			toast.show();
		}
	}

}
