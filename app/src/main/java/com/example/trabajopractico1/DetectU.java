package com.example.trabajopractico1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;

public class DetectU extends BroadcastReceiver {
            public void onReceive(Context context, Intent intent) {
                boolean connected = intent.getAction().equals(Intent.ACTION_POWER_CONNECTED);
                if (connected) {
                    Toast.makeText(context, "Call Iniciated", Toast.LENGTH_LONG).show();
                    Intent i =new Intent(Intent.ACTION_CALL);
                    i.setData(Uri.parse("cel 911"));
                    context.startActivity(i);
                }
            }
        }
