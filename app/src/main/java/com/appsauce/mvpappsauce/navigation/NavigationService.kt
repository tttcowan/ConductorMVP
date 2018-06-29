package com.appsauce.mvpappsauce.navigation

interface NavigationService {
    fun handleBack(): Boolean
    fun toHome()
    fun toSettings()
    fun destroy()
}
