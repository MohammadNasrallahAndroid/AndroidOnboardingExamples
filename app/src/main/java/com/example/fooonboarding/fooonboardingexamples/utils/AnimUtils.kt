package com.example.fooonboarding.fooonboardingexamples.utils

import android.view.View
import android.view.ViewAnimationUtils
import android.view.animation.DecelerateInterpolator
import kotlin.math.hypot

fun View.test(view: View) {
    val radius = hypot(right.toDouble(), bottom.toDouble()).toInt()
    ViewAnimationUtils.createCircularReveal(view, left, bottom, 0f, radius.toFloat()).apply {
        interpolator = DecelerateInterpolator(2f)
        duration = 2000
        start()
    }
}



