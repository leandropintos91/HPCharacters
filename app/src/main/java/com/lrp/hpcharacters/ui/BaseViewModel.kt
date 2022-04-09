package com.lrp.hpcharacters.ui

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job

abstract class BaseViewModel: ViewModel() {

    var viewModelJob = Job()
    val coroutineScope = CoroutineScope(viewModelJob + Dispatchers.Main)

}