package com.appsauce.mvpappsauce.main

interface MainPresenter {
    fun viewReady()
    fun destroy()
    fun backPressed(): Boolean
}