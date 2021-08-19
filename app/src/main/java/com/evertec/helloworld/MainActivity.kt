package com.evertec.helloworld

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("LifeCycle", "Activity:onCreate")

        setListeners()
    }

    override fun onStart() {
        super.onStart()
        Log.i("LifeCycle", "Activity:onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("LifeCycle", "Activity:onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("LifeCycle", "Activity:onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("LifeCycle", "Activity:onStop")
    }

    override fun onDestroy() {
        Log.i("LifeCycle", "Activity:onDestroy")
        super.onDestroy()
    }

    private fun setListeners() {
        val button = findViewById<Button>(R.id.button_open_action)
        button.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}