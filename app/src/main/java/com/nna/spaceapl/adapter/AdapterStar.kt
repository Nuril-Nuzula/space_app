package com.nna.spaceapl.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nna.spaceapl.databinding.ItemSpaceBinding
import com.nna.spaceapl.detail.DetailActivity
import com.nna.spaceapl.model.SpaceItem

class AdapterStar : RecyclerView.Adapter<StarViewHolder>() {
    private  var listitemgaleri = arrayListOf<SpaceItem>()

    fun addData(items : List<SpaceItem>){
        listitemgaleri.addAll(items)
    }

    //onCreatViewHolder untuk memfungsikan layout item yg d gunakan utk recycler view
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StarViewHolder {

        //with view binding
        val listitemgallerybinding = ItemSpaceBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return StarViewHolder(listitemgallerybinding)

//        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_star,parent,false)
//        return GalleryViewHolder(view)
    }

    override fun onBindViewHolder(holder: StarViewHolder, position: Int) {
        val data = listitemgaleri[position]
        holder.bindview(data)

        holder.itemView.setOnClickListener {
            val intent = Intent(it.context,DetailActivity::class.java)
            intent.putExtra(DetailActivity.DATA, data)
            it.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return listitemgaleri.size
    }


}
