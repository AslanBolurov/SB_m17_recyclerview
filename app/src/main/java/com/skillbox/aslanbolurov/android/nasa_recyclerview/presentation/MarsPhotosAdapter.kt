package com.skillbox.aslanbolurov.android.nasa_recyclerview.presentation

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.skillbox.aslanbolurov.android.nasa_recyclerview.R
import com.skillbox.aslanbolurov.android.nasa_recyclerview.data.MarsPhotosArrayDto
import com.skillbox.aslanbolurov.android.nasa_recyclerview.databinding.MarsPhotoElementBinding



class MarsPhotosAdapter : RecyclerView.Adapter<MarsPhotosHolder>() {

    private var data: MutableList<MarsPhotosArrayDto> = mutableListOf()
    fun setData(data: Array<MarsPhotosArrayDto>) {
        this.data = data.toMutableList()
        Log.d("aslan555", "setData: ${this.data.size}")
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MarsPhotosHolder {
        return MarsPhotosHolder(
            MarsPhotoElementBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: MarsPhotosHolder, position: Int) {
        val item = data.getOrNull(position)
        with(holder.binding) {
            dateTextView.text =item?.earth_date ?: ""
            solTextView.text = item?.sol.toString()
            roverTextView.text = item?.rover?.name ?: ""
            cameraTextView.text = item?.camera?.name ?: ""
            item?.let {
                Glide
                    .with(imageView.context)
                    .load(it.img_src)
                    .into(imageView)
            }
        }
    }

    override fun getItemCount(): Int = data.size
}


class MarsPhotosHolder(
    val binding: MarsPhotoElementBinding
) : RecyclerView.ViewHolder(binding.root) {


}