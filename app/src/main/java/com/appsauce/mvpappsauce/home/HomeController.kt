package com.appsauce.mvpappsauce.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.appsauce.mvpappsauce.R
import com.appsauce.mvpappsauce.base.BaseController
import com.appsauce.mvpappsauce.base.BaseControllerProd
import com.appsauce.mvpappsauce.extension.toast
import com.appsauce.mvpappsauce.module.PresenterModule
import kotlinx.android.synthetic.main.controller_home.view.*

class HomeController : HomeView, BaseController<HomeView, HomePresenter> by BaseControllerProd() {

    override lateinit var presenter: HomePresenter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup): View {
        presenter = PresenterModule.home()
        val view = inflater.inflate(R.layout.controller_home, container, false)
        view.controller_home_to_settings.setOnClickListener { presenter.toSettings() }
        return view
    }

    override fun callComplete() {
        presenter.callReturn()
    }

    override fun dialogReturn() {
        "Dialog callback".toast()
    }

}
