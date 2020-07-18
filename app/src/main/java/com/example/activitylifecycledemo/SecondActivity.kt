package com.example.activitylifecycledemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    private val TAG = "LogStatements"
    private val activityName = "SecondActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        Log.d(TAG, "onCreate: $activityName")

        btnThirdActivity.setOnClickListener {
            Intent(this, ThirdActivity::class.java).also {
                startActivity(it)
            }
        }

        btnMainActivity.setOnClickListener {
            finish()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart: $activityName")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: $activityName")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause: $activityName")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart: $activityName")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop: $activityName")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy: $activityName")
    }
}