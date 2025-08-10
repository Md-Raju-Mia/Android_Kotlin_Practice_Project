package com.raju.mvvm_koin.ui.module

import android.view.View
import com.raju.mvvm_koin.databinding.ActivityAssignDefectsBinding

class AssignedDefect {

  private val binding by lazy { ActivityAssignDefectsBinding.inflate(layoutInflater) }





    override fun isNetworkAvailable(isConnected: Boolean) {
        binding.tvConnectionStatus.visibility = if (isConnected) View.GONE else View.VISIBLE
        if (isConnected && staffPin.isNotEmpty()) {
            jobsViewModel.fetchAssignedDefectList(staffPin)
        }
    }

}