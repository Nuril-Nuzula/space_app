package com.nna.spaceapl.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.nna.spaceapl.fragment.PlanetFragment
import com.nna.spaceapl.fragment.StarFragment

class TabAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle): FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount()= 2

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> {
                PlanetFragment()
            }
            1 -> {
                StarFragment()
            }
            else -> {
                Fragment()
            }
        }
    }
}