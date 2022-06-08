package com.nna.spaceapl

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import com.google.android.material.tabs.TabLayoutMediator
import com.nna.spaceapl.adapter.TabAdapter
import com.nna.spaceapl.databinding.ActivityMainBinding
import com.nna.spaceapl.detilstar.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

            binding.imageView2.setOnClickListener {
                startActivity(Intent(this, AlphaActivity::class.java))
            }

            binding.imageView3.setOnClickListener {
                startActivity(Intent(this, BarnardActivity::class.java))
            }
            binding.imageView4.setOnClickListener {
                startActivity(Intent(this, AldebaranActivity::class.java))
            }
            binding.imageView5.setOnClickListener {
                startActivity(Intent(this, CapellaActivity::class.java))
            }
            binding.imageView6.setOnClickListener {
                startActivity(Intent(this, RigelActivity::class.java))
            }
            binding.imageView7.setOnClickListener {
                startActivity(Intent(this, SiriusActivity::class.java))
            }

//        val manageFrament = supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment? ?: return
//
//        val navControler = manageFrament.navController

//        binding.viewPager.adapter = TabAdapter(supportFragmentManager, lifecycle)
//        TabLayoutMediator(binding.tabLayout, binding.viewPager) {tab, position ->
//            when (position){
//                0 -> {
//                    tab.text = "Planet"
//                }
//                1 -> {
//                    tab.text = "Star"
//                }
//            }
//        }.attach()


//        binding.bottomNavigationView.setupWithNavController(navControler)
    }
}