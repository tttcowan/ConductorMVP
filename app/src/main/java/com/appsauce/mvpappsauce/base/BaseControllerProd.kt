package com.appsauce.mvpappsauce.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.appsauce.mvpappsauce.dialog.DialogId
import com.bluelinelabs.conductor.Controller

open class BaseControllerProd<V : BaseView, P : BasePresenter<V>> : Controller, BaseController<V, P>, BaseView {


    constructor() : super()
    constructor(bundle: Bundle) : super(bundle)

    override lateinit var presenter: P

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup): View {
        throw RuntimeException("Base controller onCreate called")
    }

    override fun controller(): Controller {
        return this
    }

    override fun tag(): String {
        return this::class.java.simpleName
    }

    override fun onAttach(view: View) {
        super.onAttach(view)
        @Suppress("UNCHECKED_CAST")
        presenter.attachView(this as V)
    }

    override fun onDetach(view: View) {
        super.onDetach(view)
        presenter.detachView()
    }

    override fun dialogDismiss(dialogId: DialogId) {
        presenter.dialogDismiss(dialogId)
    }

    override fun dialogPrimary(dialogId: DialogId) {
        presenter.dialogPrimary(dialogId)
    }

    override fun dialogSecondary(dialogId: DialogId) {
        presenter.dialogSecondary(dialogId)
    }
}