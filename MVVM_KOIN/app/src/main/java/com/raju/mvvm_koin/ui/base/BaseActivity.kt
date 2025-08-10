package com.raju.mvvm_koin.ui.base


import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity: AppCompatActivity() {

    private lateinit var networkConnection: NetworkConnection

}