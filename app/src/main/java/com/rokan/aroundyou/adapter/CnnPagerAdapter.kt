package com.rokan.aroundyou.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.rokan.aroundyou.ui.home.cnn.CnnEkonomiFragment
import com.rokan.aroundyou.ui.home.cnn.CnnHiburanFragment
import com.rokan.aroundyou.ui.home.cnn.CnnHostFragment
import com.rokan.aroundyou.ui.home.cnn.CnnTerbaruFragment

class CnnPagerAdapter(fa: CnnHostFragment) : FragmentStateAdapter(fa) {
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> CnnTerbaruFragment()
            1 -> CnnEkonomiFragment()
            2 -> CnnHiburanFragment()
            else -> CnnTerbaruFragment()
        }
    }
}