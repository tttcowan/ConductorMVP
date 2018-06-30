package com.appsauce.mvpappsauce.settings

import com.appsauce.mvpappsauce.base.BasePresenterProd
import com.appsauce.mvpappsauce.base.BaseView

class SettingsPresenterProd : BasePresenterProd<SettingsPresenterProd.View>() {

    override fun attachView(view: View) {
        super.attachView(view)
        view.show()
    }

    interface View : BaseView {
        fun show()
    }
}
