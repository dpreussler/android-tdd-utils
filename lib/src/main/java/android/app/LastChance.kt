@file:Suppress("unused")

package android.app

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup

fun Activity.safeCreate(bundle: Bundle?) = safe{ this.onCreate(bundle) }
fun Activity.safePostCreate(bundle: Bundle?) = safe{ this.onPostCreate(bundle) }
fun Activity.safeStart() = safe{ this.onStart() }
fun Activity.safeResume() = safe{ this.onResume() }
fun Activity.safePostResume() = safe{ this.onPostResume() }
fun Activity.safeActivityResult(requestCode: Int, resultCode: Int, data: Intent?) = safe{ this.onActivityResult(requestCode, resultCode, data) }
fun Activity.safeSaveInstanceState(bundle: Bundle) = safe{ this.onSaveInstanceState(bundle) }
fun Activity.safePause() = safe{ this.onPause() }
fun Activity.safeStop() = safe{ this.onStop() }
fun Activity.safeDestroy() = safe{ this.onDestroy() }
fun Activity.safeBAckPressed() = safe{ this.onBackPressed() }

fun Fragment.safeCreate(bundle: Bundle?) = safe { this.onCreate(bundle)}
fun Fragment.safeDestroy() = safe { this.onDestroy()}
fun Fragment.safeActivityCreated(bundle: Bundle?) = safe { this.onActivityCreated(bundle)}
fun Fragment.safeActivityResult(requestCode: Int, resultCode: Int, data: Intent?) = safe{ this.onActivityResult(requestCode, resultCode, data) }
fun Fragment.safeAttach(context: Context) = safe { this.onAttach(context)}
fun Fragment.safeAttachFragment(fragment: Fragment?) = safe { this.onAttachFragment(fragment)}
fun Fragment.safeDetach() = safe { this.onDetach()}
fun Fragment.safePause() = safe { this.onPause()}
fun Fragment.safeResume() = safe { this.onResume()}
fun Fragment.safeCreateView(inflater: LayoutInflater, viewGroup: ViewGroup, bundle: Bundle?) = safe { this.onCreateView(inflater, viewGroup, bundle)}
fun Fragment.safeDestroyView() = safe { this.onDestroyView()}
fun Fragment.safeSaveInstanceState(bundle: Bundle?) = safe { this.onSaveInstanceState(bundle)}
fun Fragment.safeStart() = safe { this.onStart()}
fun Fragment.safeStop() = safe { this.onStop()}

private inline fun <reified T> T.safe(method: () -> Any) {
    try {
        method()
    } catch (e: Exception) {}
}