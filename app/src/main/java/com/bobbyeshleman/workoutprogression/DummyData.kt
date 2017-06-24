package com.bobbyeshleman.workoutprogression

/**
 * Created by bobby on 6/24/17.
 */
class DummyData {
    companion object {
        fun exercises(workout: Int?) : List<String> {
            return when(workout) {
                R.id.lower1 -> listOf("Squat", "Deadlift")
                R.id.lower2 -> listOf("Leg Press")
                R.id.upper1 -> listOf("Bench Press", "Curls")
                R.id.upper2 -> listOf("OHP", "Chins")
                else -> listOf()
            }
        }
    }
}