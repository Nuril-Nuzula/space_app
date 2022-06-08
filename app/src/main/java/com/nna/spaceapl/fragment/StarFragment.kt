package com.nna.spaceapl.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil.setContentView
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.nna.spaceapl.adapter.AdapterStar
import com.nna.spaceapl.databinding.ActivityMainBinding
import com.nna.spaceapl.databinding.FragmentStarBinding
import com.nna.spaceapl.detilstar.AlphaActivity
import com.nna.spaceapl.model.SpaceItem
import com.nna.spaceapl.network.RetrofitInterface
import com.nna.spaceapl.network.RetrofitService
import kotlinx.coroutines.launch

class StarFragment : Fragment() {

    private lateinit var binding : FragmentStarBinding
    private lateinit var adapterStar: AdapterStar

//    private lateinit var roomDB : RoomDB



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentStarBinding.inflate(inflater,container,false)

//        roomDB = RoomDB.getDatabaseItem(context!!)

        adapterStar = AdapterStar()
        binding.rvStar.adapter = adapterStar
        binding.rvStar.setHasFixedSize(true)
        binding.rvStar.layoutManager = LinearLayoutManager(context)

        return binding.root

    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        val detailItemStar = roomDB.roomDao().getDatabyType("Star")

//        detailItemStar.observe(viewLifecycleOwner, Observer {
//            if (it.isNotEmpty()){
//                adapterStar.addData(it)
//                adapterStar.notifyDataSetChanged()
//            }else{
//                Toast.makeText(context,"DataBase Kosong", Toast.LENGTH_SHORT).show()
//
//
//            }
//
//        })
        val retrofitService = RetrofitService.buildservice(RetrofitInterface::class.java)

        viewLifecycleOwner.lifecycleScope.launch {
            val mintadataGallery = retrofitService.getDataStar()

            if (mintadataGallery.isSuccessful){
                val dataStar = mintadataGallery.body() as List<SpaceItem>
                dataStar.forEach{
                    it.type = "Planet"
                }
//                roomDB.roomDao().insertData(dataStar)

                adapterStar.addData(dataStar)
                adapterStar.notifyDataSetChanged()
            }
        }


    }


}

