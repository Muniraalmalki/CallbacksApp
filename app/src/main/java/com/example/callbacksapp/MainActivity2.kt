package com.example.callbacksapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {

        lateinit var strt2Btn : Button

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main2)
            strt2Btn= findViewById<Button>(R.id.ac2Btn)

            Toast.makeText(this, "Activity2 onCreate Called", Toast.LENGTH_SHORT).show()

            strt2Btn.setOnClickListener {
                val intent = Intent(this@MainActivity2 , MainActivity::class.java)
                startActivity(intent)
            }
        }

        override fun onStart() {
            super.onStart()
            Log.d("Activity2:","onStart")
            Toast.makeText(this, "Activity2 onStart Called", Toast.LENGTH_SHORT).show()
        }

        override fun onRestart() {
            super.onRestart()
            Log.d("Activity2:","onRestart")
            Toast.makeText(this, "Activity2 onRestart Called", Toast.LENGTH_SHORT).show()
        }

        override fun onStop() {
            super.onStop()
            Log.d("Activity2:","onStop")
            Toast.makeText(this, "Activity2 onStop Called", Toast.LENGTH_SHORT).show()
        }

        override fun onResume() {
            super.onResume()
            Log.d("Activity2:","onResume")
            Toast.makeText(this, "Activity2 onResume Called", Toast.LENGTH_SHORT).show()
        }

        override fun onPause() {
            super.onPause()
            Log.d("Activity2:","onPause")
            Toast.makeText(this, "Activity2 onPause Called", Toast.LENGTH_SHORT).show()
        }

        override fun onDestroy() {
            super.onDestroy()
            Log.d("Activity2:","onDestroy")
            Toast.makeText(this, "Activity2 onDestroy Called", Toast.LENGTH_SHORT).show()
        }
    }