package com.skillbox.aslanbolurov.android.nasa_recyclerview.domain

import android.util.Log
import com.skillbox.aslanbolurov.android.nasa_recyclerview.data.MarsPhotosArrayDto
import com.skillbox.aslanbolurov.android.nasa_recyclerview.data.MarsPhotosDto
import com.skillbox.aslanbolurov.android.nasa_recyclerview.data.MarsPhotosRepository
import com.skillbox.aslanbolurov.android.nasa_recyclerview.entity.MarsPhotosArray
import javax.inject.Inject

class GetMarsPhotoUseCase @Inject constructor(
    private val repository: MarsPhotosRepository
) {
    suspend fun execute(): Array<MarsPhotosArrayDto> {
        val response = repository.getMarsPhotos()
        Log.d("aslan555", "execute: ${response.size}")

        return response

    }


}