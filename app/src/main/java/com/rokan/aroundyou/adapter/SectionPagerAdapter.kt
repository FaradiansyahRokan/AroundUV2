package com.rokan.aroundyou.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.rokan.aroundyou.ui.home.antara.AntaraHostFragment
import com.rokan.aroundyou.ui.home.cnbc.CnbcHostFragment
import com.rokan.aroundyou.ui.home.cnn.CnnHostFragment

class SectionPagerAdapter(fa: FragmentActivity) : FragmentStateAdapter(fa) {
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> CnbcHostFragment()
            1 -> CnnHostFragment()
            2 -> AntaraHostFragment()
            else -> CnbcHostFragment()
        }
    }
}