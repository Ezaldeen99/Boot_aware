package com.example.myapplication;

import static android.content.Intent.FLAG_ACTIVITY_NEW_TASK;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class StartMyBootReceiver extends BroadcastReceiver {

    private static final String TAG = "StartMyBootReceiver";

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.v(TAG, "Receive broadcast");

        if (Intent.ACTION_BOOT_COMPLETED.equals(intent.getAction())) {
            Toast.makeText(context, "Receive boot completed", Toast.LENGTH_SHORT).show();
            Log.d(TAG, "Receive boot completed broadcast");
            Intent browserIntent = new Intent(context, MainActivity.class);
            browserIntent.addFlags(FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(browserIntent);
        }
    }
}
