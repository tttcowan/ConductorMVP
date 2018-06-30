package com.appsauce.mvpappsauce.settings

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.appsauce.mvpappsauce.R
import com.appsauce.mvpappsauce.base.BaseControllerProd
import com.appsauce.mvpappsauce.extension.Log
import com.appsauce.mvpappsauce.module.PresenterModule

class SettingsController : BaseControllerProd<SettingsPresenterProd.View, SettingsPresenterProd>(), SettingsPresenterProd.View {

    override lateinit var presenter: SettingsPresenterProd

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup): View {
        presenter = PresenterModule.settings()
        return inflater.inflate(R.layout.controller_setting, container, false)
    }

    override fun show() {
        "Will show stuff".Log()
    }
}


