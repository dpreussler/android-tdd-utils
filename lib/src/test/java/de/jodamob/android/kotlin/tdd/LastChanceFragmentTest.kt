package de.jodamob.android.kotlin.tdd

import android.app.*
import com.nhaarman.mockito_kotlin.*
import org.junit.Test

@Suppress("IllegalIdentifier")
class LastChanceFragmentTest {

    val tested = object: Fragment() {
        override fun onCreate(bundle: android.os.Bundle) {
            throw java.lang.NullPointerException("")
        }

        override fun onStart() {
            throw java.lang.NullPointerException("")
        }

        override fun onResume() {
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
    fun `can call safeCreate`() {
        tested.safeCreate(null)
    }

    @Test
    fun `can call safeDestroy`() {
        tested.safeDestroy()
    }

    @Test
    fun `can call safeResume`() {
        tested.safeResume()
    }

    @Test
    fun `can call safePause`() {
        tested.safePause()
    }

    @Test
    fun `can call safeStart`() {
        tested.safeStart()
    }

    @Test
    fun `can call safeStop`() {
        tested.safeStop()
    }

    @Test
    fun `can call safeActivityResult`() {
        tested.safeActivityResult(0, 1, mock())
    }

    @Test
    fun `can call safeSaveInstanceState`() {
        tested.safeSaveInstanceState(mock())
    }

    @Test
    fun `can call safeActivityCreated`() {
        tested.safeActivityCreated(mock())
    }

    @Test
    fun `can call safeCreateView`() {
        tested.safeCreateView(mock(), mock(), mock())
    }

    @Test
    fun `can call safeDestroyView`() {
        tested.safeDestroyView()
    }

    @Test
    fun `can call safeAttach`() {
        tested.safeAttach(mock())
    }

    @Test
    fun `can call safeAttachFragment`() {
        tested.safeAttachFragment(mock())
    }

    @Test
    fun `can call safeDetach`() {
        tested.safeDetach()
    }
}