package com.nna.spaceapl.fragment

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.nna.spaceapl.R
import com.nna.spaceapl.adapter.AdapterSpace
import com.nna.spaceapl.databinding.FragmentPlanetBinding
import com.nna.spaceapl.model.SpaceItem
import com.nna.spaceapl.network.RetrofitInterface
import com.nna.spaceapl.network.RetrofitService
import com.nna.spaceapl.room.RoomDB
import kotlinx.coroutines.launch


class PlanetFragment : Fragment() {

//    private lateinit var binding : FragmentPlanetBinding
//    private lateinit var adapterPlanet: AdapterSpace
//
//    private lateinit var roomDB : RoomDB
//
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View {
//
////        return inflater.inflate(R.layout.fragment_planet, container, false)
////        binding = FragmentPlanetBinding.inflate(inflater,container,false)
//
//        roomDB = RoomDB.getDatabaseItem(context!!)
//
//        adapterPlanet = AdapterSpace()
//        binding.rvPlanet.adapter = adapterPlanet
//        binding.rvPlanet.setHasFixedSize(true)
//        binding.rvPlanet.layoutManager = LinearLayoutManager(context)
//
//        return binding.root
//    }
//
//
//    @SuppressLint("NotifyDataSetChanged")
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//
//        //memberi nama data yg berasal dari gallery fragment
//        val detailItemGallery = roomDB.roomDao().getDatabyType("Planet")
//
//        detailItemGallery.observe(viewLifecycleOwner, Observer {
//            if (it.isNotEmpty()){
//                adapterPlanet.addData(it)
//                adapterPlanet.notifyDataSetChanged()
//            }else{
//                Toast.makeText(context, "Database Kosong", Toast.LENGTH_SHORT).show()
//
//                val retrofitService = RetrofitService.buildservice(RetrofitInterface::class.java)
//
//                viewLifecycleOwner.lifecycleScope.launch {
//                    val mintadataGallery = retrofitService.getDataPlanet()
//
//                    if (mintadataGallery.isSuccessful){
//                        val dataGallery = mintadataGallery.body() as List<SpaceItem>
//                        dataGallery.forEach{
//                            it.type = "Planet"
//                        }
//                        roomDB.roomDao().insertData(dataGallery)
////                adapterPlanet.addData(dataGallery)
////                adapterPlanet.notifyDataSetChanged()
//                    }
//                }
//            }
//        })
//
//
//    }

}