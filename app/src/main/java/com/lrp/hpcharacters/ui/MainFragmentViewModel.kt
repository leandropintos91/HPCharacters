package com.lrp.hpcharacters.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.lrp.hpcharacters.model.HpCharacter
import com.lrp.hpcharacters.service.HpCharactersService
import kotlinx.coroutines.*

class MainFragmentViewModel(
    private val hpCharactersService : HpCharactersService
    ) : ViewModel() {

    private var viewModelJob = Job()
    private val coroutineScope = CoroutineScope(viewModelJob + Dispatchers.Main)

    private val _results = MutableLiveData<List<HpCharacter>>(emptyList())
    val results : LiveData<List<HpCharacter>> = _results

    fun getMarsRealEstateProperties() {
        coroutineScope.launch {
            _results.value = hpCharactersService.getAllCharacters().await()
        }
    }

}

class MainFragmentViewModelFactory : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainFragmentViewModel::class.java)) {
            return MainFragmentViewModel(HpCharactersService()) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}