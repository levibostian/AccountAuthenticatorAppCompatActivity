**Deprecated** Android's [AccountAuthenticatorActivity](https://developer.android.com/reference/android/accounts/AccountAuthenticatorActivity) javadoc now shows a message saying...

```
This class was deprecated in API level R.
Applications should extend Activity themselves. This class is not compatible with AppCompat, and the functionality it provides is not complex. 
```

With that being said, this project will be read-only and not updated. 

---

[![Release](https://jitpack.io/v/levibostian/AccountAuthenticatorAppCompatActivity.svg)](https://jitpack.io/#levibostian/AccountAuthenticatorAppCompatActivity)

# AccountAuthenticatorAppCompatActivity

AppCompat version of Android's [AccountAuthenticatorActivity](https://developer.android.com/reference/android/accounts/AccountAuthenticatorActivity). The goal is to keep it up-to-date for all future Android versions to drop into your app easily.

**Most up-to-date version: AppCompat- AndroidX 1.0.0-beta01. Compiling SDK: 28 (P)**

## What is AccountAuthenticatorAppCompatActivity?

Need to use Android's [AccountAuthenticatorActivity](https://developer.android.com/reference/android/accounts/AccountAuthenticatorActivity) with the [Toolbar](https://developer.android.com/reference/android/support/v7/widget/Toolbar) or Support [Fragment](https://developer.android.com/reference/android/support/v4/app/Fragment)? This library is for you.

Android's built-in `AccountAuthenticatorActivity` extends `Activity` instead of `AppCompat` and there is currently no version of this Activity in the support library. Therefore, this library is born.

## Why use AccountAuthenticatorAppCompatActivity?

This library is very small. It's [1 file](https://github.com/levibostian/AccountAuthenticatorAppCompatActivity/blob/master/accountauthenticatorappcompatactivity/src/main/java/com/levibostian/accountauthenticatorappcompatactivity/activity/AccountAuthenticatorAppCompatActivity.kt) with only a few methods in it.

You could easily copy and paste this 1 file into your Android app no problem. However, I prefer to have a version controlled, reuseable file that I can use across all of my projects.

Features:

* Very small. [1 file with only a few lines of code](https://github.com/levibostian/AccountAuthenticatorAppCompatActivity/blob/master/accountauthenticatorappcompatactivity/src/main/java/com/levibostian/accountauthenticatorappcompatactivity/activity/AccountAuthenticatorAppCompatActivity.kt).
* Depending on what version of Android you are compiling for and what version of the support library, chances are this project has a version for you.
* Tries to stay up-to-date on new Android SDK releases and AppCompat releases to easily install by just a git tag.
* MIT license.

# Install

Add this to your root build.gradle at the end of repositories:

```
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```

Then, install the Wendy module:

```
implementation 'com.github.levibostian:AccountAuthenticatorAppCompatActivity:P-1.0.0-beta'
```

Check this chart to decide what tag to use for your project:

| AppCompat Version      | Android SDK version | Library version |
|------------------------|---------------------|-----------------|
| Android X 1.0.0-beta01 | P                   | P-1.0.0-beta    |

# Getting started

Super simple. Extend `AccountAuthenticatorAppCompatActivity` and use it just like you would [AccountAuthenticatorActivity](https://developer.android.com/reference/android/accounts/AccountAuthenticatorActivity).

There is an example app in this project if you want an example project to refer to.

## Example app

This library comes with an example app. You may open it in Android Studio to test it out and see how the code works with the library.

## Author

* Levi Bostian - [GitHub](https://github.com/levibostian), [Twitter](https://twitter.com/levibostian), [Website/blog](http://levibostian.com)

![Levi Bostian image](https://gravatar.com/avatar/22355580305146b21508c74ff6b44bc5?s=250)

## Contribute

AccountAuthenticatorAppCompatActivity is open for pull requests. Check out the [list of issues](https://github.com/levibostian/AccountAuthenticatorAppCompatActivity/issues) for tasks I am planning on working on. Check them out if you wish to contribute in that way.

