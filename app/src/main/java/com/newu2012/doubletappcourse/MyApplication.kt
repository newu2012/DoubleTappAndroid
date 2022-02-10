package com.newu2012.doubletappcourse

import android.app.Activity
import android.app.Application
import android.app.Application.ActivityLifecycleCallbacks
import android.os.Bundle
import android.util.Log


class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        registerActivityLifecycleCallbacks(MyActivityLifecycleCallbacks())
    }
}

private class MyActivityLifecycleCallbacks : ActivityLifecycleCallbacks {
    override fun onActivityCreated(activity: Activity, bundle: Bundle?) {
        Log.d(activity.localClassName, "onActivityCreated:")
    }

    override fun onActivityDestroyed(activity: Activity) {
        Log.d(activity.localClassName, "onActivityDestroyed:")
    }

    override fun onActivityPaused(activity: Activity) {
        Log.d(activity.localClassName, "onActivityPaused:")
    }

    override fun onActivityResumed(activity: Activity) {
        Log.d(activity.localClassName, "onActivityResumed:")
    }

    override fun onActivitySaveInstanceState(
        activity: Activity,
        outState: Bundle
    ) {
        Log.d(activity.localClassName, "onActivitySaveInstanceState:")
    }

    override fun onActivityStarted(activity: Activity) {
        Log.d(activity.localClassName, "onActivityStarted:")
    }

    override fun onActivityStopped(activity: Activity) {
        Log.d(activity.localClassName, "onActivityStopped:")
    }
}