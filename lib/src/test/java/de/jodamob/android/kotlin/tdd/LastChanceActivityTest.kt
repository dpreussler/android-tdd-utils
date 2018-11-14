package de.jodamob.android.kotlin.tdd

import android.app.*
import com.nhaarman.mockito_kotlin.*
import org.junit.Test

@Suppress("IllegalIdentifier")
class LastChanceActivityTest {

    val tested = object: Activity() {
        override fun onCreate(bundle: android.os.Bundle) {
            throw java.lang.NullPointerException("")
        }

        override fun onPostCreate(bundle: android.os.Bundle) {
            throw java.lang.NullPointerException("")
        }

        override fun onStart() {
            throw java.lang.NullPointerException("")
        }

        override fun onResume() {
            throw java.lang.NullPointerException("")
        }

        override fun onPostResume() {
            throw java.lang.NullPointerException("")
        }

        override fun onPause() {
            throw java.lang.NullPointerException("")
        }

        override fun onStop() {
            throw java.lang.NullPointerException("")
        }

        override fun onDestroy() {
            throw java.lang.NullPointerException("")
        }

        override fun onActivityResult(i1: Int, i2: Int, intent: android.content.Intent?) {
            throw java.lang.NullPointerException("")
        }


        override fun onSaveInstanceState(bundle: android.os.Bundle) {
            throw java.lang.NullPointerException("")
        }
    }

    @Test
    fun `can call onCreate`() {
        tested.safeCreate(null)
    }

    @Test
    fun `can call onPostCreate`() {
        tested.safePostCreate(null)
    }

    @Test
    fun `can call onStart`() {
        tested.safeStart()
    }

    @Test
    fun `can call onResume`() {
        tested.safeResume()
    }

    @Test
    fun `can call onPostResume`() {
        tested.safePostResume()
    }

    @Test
    fun `can call onPause`() {
        tested.safePause()
    }

    @Test
    fun `can call onStop`() {
        tested.safeStop()
    }

    @Test
    fun `can call onDestroy`() {
        tested.safeDestroy()
    }

    @Test
    fun `can call onActivityResult`() {
        tested.safeActivityResult(0, 1, mock())
    }

    @Test
    fun `can call onSaveInstanceState`() {
        tested.safeSaveInstanceState(mock())
    }
}