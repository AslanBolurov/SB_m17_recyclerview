package com.skillbox.aslanbolurov.android.nasa_recyclerview.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.skillbox.aslanbolurov.android.nasa_recyclerview.data.MarsPhotosRepository
import com.skillbox.aslanbolurov.android.nasa_recyclerview.domain.GetMarsPhotoUseCase
import javax.inject.Inject

class MarsPhotosViewModelFactory @Inject constructor(
    private val marsPhotosViewModel: MarsPhotosViewModel
): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MarsPhotosViewModel::class.java)){
            return marsPhotosViewModel as T
        }else
            throw IllegalArgumentException("Unknown class name")

    }
}
