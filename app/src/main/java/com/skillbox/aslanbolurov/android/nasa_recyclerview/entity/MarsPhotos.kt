package com.skillbox.aslanbolurov.android.nasa_recyclerview.entity
import com.skillbox.aslanbolurov.android.nasa_recyclerview.data.CameraFieldDto
import com.skillbox.aslanbolurov.android.nasa_recyclerview.data.MarsPhotosArrayDto
import com.skillbox.aslanbolurov.android.nasa_recyclerview.data.RoverFieldDto

//interface MarsPhotos {
//    var id:String
//    var sol:String
//    var camera:String
//    var image_src:String
//    var earth_date:String
//    var rover:Array<String>
//
//}

interface MarsPhotos{
    val photos: Array<MarsPhotosArrayDto>
}
interface MarsPhotosArray {
    var id:Int
    var sol:Int
    var camera: CameraFieldDto
    var img_src:String
    var earth_date:String
    var rover: RoverFieldDto
}

interface CameraField {
    var id:Int
    var name:String
    var rover_id:Int
    var full_name:String
}

interface RoverField{
    var id:Int
    var name:String
    var landing_date:String
    var launch_date:String
    var status:String
}
