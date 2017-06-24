package com.bobbyeshleman.workoutprogression

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.util.Log
import android.widget.Button
import android.widget.ListView
import android.widget.LinearLayout
import android.widget.LinearLayout.LayoutParams


class WorkoutActivity : AppCompatActivity() {
    val TAG = "WorkoutActivity"

    companion object {
        val WORKOUT_ID = "WORKOUT_ID"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_workout)
        val toolbar = findViewById(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)

        val fab = findViewById(R.id.fab) as FloatingActionButton
        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }

        val workoutId = this.intent.extras.getInt(WorkoutActivity.WORKOUT_ID)

        Log.d(TAG, " ID == " + workoutId)
        val workouts = DummyData.exercises(workoutId)
        for (workout in workouts){
            Log.d(TAG, " Creating workout button for " + workout)
            val myButton = Button(this)
            myButton.text = workout
            val ll = findViewById(R.id.workout_button_layout) as LinearLayout
            val lp = LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT)
            ll.addView(myButton, lp)
        }
    }
}
