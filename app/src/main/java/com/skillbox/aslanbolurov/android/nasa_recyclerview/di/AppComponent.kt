package com.skillbox.aslanbolurov.android.nasa_recyclerview.di

import com.skillbox.aslanbolurov.android.nasa_recyclerview.presentation.MarsPhotosViewModel
import com.skillbox.aslanbolurov.android.nasa_recyclerview.presentation.MarsPhotosViewModelFactory
import dagger.Component


@Component
interface AppComponent {
    fun marsPhotosViewModelFactory():MarsPhotosViewModelFactory
}