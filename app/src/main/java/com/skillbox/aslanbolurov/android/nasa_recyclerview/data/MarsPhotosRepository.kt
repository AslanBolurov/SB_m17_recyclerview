package com.skillbox.aslanbolurov.android.nasa_recyclerview.data


import com.skillbox.aslanbolurov.android.nasa_recyclerview.entity.MarsPhotosArray
import kotlinx.coroutines.delay
import javax.inject.Inject

class MarsPhotosRepository @Inject constructor() {
    suspend fun getMarsPhotos(): Array<MarsPhotosArrayDto> {
        delay(2000)
        return RetrofitInstance.searchMarsPhotosApi.getMarsPhotos().photos
    }

}