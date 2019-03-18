package de.jodamob.android.kotlin.tdd

import android.app.onCreate
import android.app.onPostCreate
import android.app.onResume
import android.app.onPostResume
import android.app.onStart
import android.app.onStop
import android.app.onPause
import android.app.onDestroy
import android.app.onActivityResult
import android.app.onNewIntent
import android.app.onSaveInstanceState
import android.content.Intent
import com.nhaarman.mockito_kotlin.*
import org.amshove.kluent.`should be equal to`
import org.junit.Test

@Suppress("IllegalIdentifier")
class MyActivityTest {

    val tested = MyActivity()

    @Test
    fun `can call onCreate`() {
        tested.onCreate(null)
        tested.state `should be equal to` "created"
    }

    @Test
    fun `can call onPostCreate`() {
        tested.onPostCreate(null)
        tested.state `should be equal to` "postcreated"
    }

    @Test
    fun `can call onNewIntent`() {
        val intent = mock<Intent>{
            on { toString() } doReturn "myIntent"
        }
        tested.onNewIntent(intent)
        tested.state `should be equal to` "newIntent: myIntent"
    }

    @Test
    fun `can call onStart`() {
        tested.onStart()
        tested.state `should be equal to` "started"
    }

    @Test
    fun `can call onResume`() {
        tested.onResume()
        tested.state `should be equal to` "resumed"
    }

    @Test
    fun `can call onPostResume`() {
        tested.onPostResume()
        tested.state `should be equal to` "postresumed"
    }

    @Test
    fun `can call onPause`() {
        tested.onPause()
        tested.state `should be equal to` "paused"
    }

    @Test
    fun `can call onStop`() {
        tested.onStop()
        tested.state `should be equal to` "stopped"
    }

    @Test
    fun `can call onDestroy`() {
        tested.onDestroy()
        tested.state `should be equal to` "destroyed"
    }

    @Test
    fun `can call onActivityResult`() {
        tested.onActivityResult(0, 1, mock())
        tested.state `should be equal to` "resulted"
    }

    @Test
    fun `can call onSaveInstanceState`() {
        tested.onSaveInstanceState(mock())
        tested.state `should be equal to` "saved"
    }
}