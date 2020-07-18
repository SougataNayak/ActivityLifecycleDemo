package com.example.activitylifecycledemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class ThirdActivity : AppCompatActivity() {

    private val TAG = "LogStatements"
    private val activityName = "ThirdActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        Log.d(TAG, "onCreate: $activityName")
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