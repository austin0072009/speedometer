package com.mercandalli.android.apps.speedometer.speed_view_tesla

import androidx.annotation.ColorRes

interface SpeedTeslaViewContract {

    interface UserAction {

        fun onAttached()

        fun onDetached()

        fun onFabClicked()
    }

    interface Screen {

        fun setSpeedText(
            text: String
        )

        fun setSpeedUnitText(
            text: String
        )

        fun setStartStopButtonText(
            drawableRes: Int
        )

        fun setTextSecondaryColorRes(
            @ColorRes colorRes: Int
        )
    }
}
