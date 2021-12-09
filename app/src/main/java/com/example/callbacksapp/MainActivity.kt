package com.example.callbacksapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var startButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.title = "Activity1"
        Log.d("Activity1:", "onClick")


        startButton = findViewById(R.id.startBtn)

        startButton.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
            Toast.makeText(this, "Activity1 onCreate Called", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("Activity1:", "onStart")
        Toast.makeText(this, "Activity1 onStart Called", Toast.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Activity1:", "onRestart")
        Toast.makeText(this, "Activity1 onRestart Called", Toast.LENGTH_SHORT).show()

    }

    override fun onStop() {
        super.onStop()
        Log.d("Activity1:", "onStop")
        Toast.makeText(this, "Activity1 onStop Called", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Log.d("Activity1:", "onResume")
        Toast.makeText(this, "Activity1 onResume Called", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Log.d("Activity1:", "onPause")
        Toast.makeText(this, "Activity1 onPause Called", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Activity1:", "onDestroy")
        Toast.makeText(this, "Activity1 onDestroy Called", Toast.LENGTH_SHORT).show()
    }

}
