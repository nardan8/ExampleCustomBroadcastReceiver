package com.nariman.examplecustombroadcastreceiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class ExampleBroadcastReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        // This method is called when the BroadcastReceiver is receiving an Intent broadcast.
        if ("com.nariman.EXAMPLE_ACTION".equals(intent.action)){
            val receivedText = intent.getStringExtra("com.nariman.EXTRA_TEXT")
            Toast.makeText(context, receivedText, Toast.LENGTH_LONG).show()
        }
    }
}
