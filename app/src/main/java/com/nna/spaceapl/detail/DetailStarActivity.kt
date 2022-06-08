package com.nna.spaceapl.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import coil.load
import com.bumptech.glide.Glide
import com.nna.spaceapl.databinding.ActivityDetailStarBinding
import com.nna.spaceapl.model.SpaceItem

class DetailStarActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailStarBinding

    companion object {
        const val DATA = "h"

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailStarBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val data = intent.getParcelableExtra<SpaceItem>(DATA)

        binding.txtDesc.text = data?.deskripsi
        binding.tvDetailPlanet.text = data?.judul

        binding.imgDetailPlanet.load(data?.gambar){
// scale(Scale.FILL)
        }
        Glide.with(this)
            .load(data?.gambar).into(binding.imgDetailPlanet)


    }
}
