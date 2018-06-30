package com.appsauce.mvpappsauce.base

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.appsauce.mvpappsauce.dialog.DialogId
import com.bluelinelabs.conductor.Controller

interface BaseController<V : BaseView, P : BasePresenter<V>> {
    var presenter: P
    fun dialogDismiss(dialogId: DialogId)
    fun dialogPrimary(dialogId: DialogId)
    fun dialogSecondary(dialogId: DialogId)
    fun onCreateView(inflater: LayoutInflater, container: ViewGroup): View
    fun controller() : Controller
    fun tag() : String

}