[![Release](https://jitpack.io/v/dpreussler/android-tdd-utils.svg)](https://jitpack.io/#dpreussler/android-tdd-utils) [![Build Status](https://travis-ci.org/dpreussler/android-tdd-utils.svg?branch=master)](https://travis-ci.org/dpreussler/android-tdd-utils) [![Coverage Status](https://coveralls.io/repos/github/dpreussler/android-tdd-utils/badge.svg)](https://coveralls.io/github/dpreussler/android-tdd-utils)


# android-tdd-utils


Enables you to call protected life cycle methods on your activities


```kotlin

import android.app.onCreate

@Test
fun test() {
    val tested = MainActivity()
    tested.onCreate(null)
}

```

Gradle
------

```groovy
...
repositories {
    maven {url "https://jitpack.io"}
}

testCompile 'com.github.dpreussler:android-tdd-utils:v0.2.1'
 
```



License
=======

The MIT License (MIT)

Copyright (c) 2017 Danny Preussler

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
