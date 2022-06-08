package com.nna.spaceapl.adapter

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.nna.spaceapl.databinding.ItemSpaceBinding
import com.nna.spaceapl.model.SpaceItem

class StarViewHolder (val galleryBinding: ItemSpaceBinding):
    RecyclerView.ViewHolder(galleryBinding.root){
    fun bindview(item: SpaceItem){
        itemView.run {
            galleryBinding.tvJudul.text = item.judul
            galleryBinding.tvDesk.text = item.deskripsi
            Glide.with(this).load(item.gambar).into(galleryBinding.imgGallery)
        }
    }
}