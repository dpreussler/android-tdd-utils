package android.app

import android.content.Intent
import android.os.Bundle

fun Activity.onCreate(bundle: Bundle?) = this.onCreate(bundle)
fun Activity.onPostCreate(bundle: Bundle?) = this.onPostCreate(bundle)
fun Activity.onStart() = this.onStart()
fun Activity.onNewIntent(intent: Intent?) = this.onNewIntent(intent)
fun Activity.onResume() = this.onResume()
fun Activity.onPostResume() = this.onPostResume()
fun Activity.onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) = this.onActivityResult(requestCode, resultCode, data)
fun Activity.onSaveInstanceState(bundle: Bundle) = this.onSaveInstanceState(bundle)
fun Activity.onPause() = this.onPause()
fun Activity.onStop() = this.onStop()
fun Activity.onDestroy() = this.onDestroy()




