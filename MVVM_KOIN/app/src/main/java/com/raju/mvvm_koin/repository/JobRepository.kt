package com.raju.mvvm_koin.repository

interface JobRepository {


    suspend fun fetchAssignedDefectList(mechanicPin: String)
}