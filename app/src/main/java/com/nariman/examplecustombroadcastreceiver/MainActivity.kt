package com.nariman.examplecustombroadcastreceiver

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    val customReceiver = ExampleBroadcastReceiver()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val filter = IntentFilter("com.nariman.EXAMPLE_ACTION")
        registerReceiver(customReceiver, filter)
    }

    override fun onDestroy() {
        super.onDestroy()
        unregisterReceiver(customReceiver)
    }

    fun sendCustomBroadcast(view: View) {
        val intent = Intent("com.nariman.EXAMPLE_ACTION")
        intent.putExtra("com.nariman.EXTRA_TEXT", "Broadcast Received")
        sendBroadcast(intent)
    }
}
