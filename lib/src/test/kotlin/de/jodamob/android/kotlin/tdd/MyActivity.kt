package de.jodamob.android.kotlin.tdd

import android.app.Activity
import android.os.Bundle
import android.content.Intent

class MyActivity(var state : String = "") : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        state = state.plus("created")
    }

    override fun onPostCreate(savedInstanceState: Bundle?) {
        state = state.plus("postcreated")
    }

    override fun onStart() {
        state = state.plus("started")
    }

    override fun onResume() {
        state = state.plus("resumed")
    }

    override fun onPostResume() {
        state = state.plus("postresumed")
    }

    override fun onPause() {
        state = state.plus("paused")
    }

    override fun onStop() {
        state = state.plus("stopped")
    }

    override fun onDestroy() {
        state = state.plus("destroyed")
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        state = state.plus("resulted")
    }

    override fun onSaveInstanceState(savedInstanceState: Bundle) {
        state = state.plus("saved")
    }

}