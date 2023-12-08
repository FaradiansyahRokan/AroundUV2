package com.rokan.aroundyou.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.rokan.aroundyou.ui.home.antara.AntaraEkonomiFragment
import com.rokan.aroundyou.ui.home.antara.AntaraHostFragment
import com.rokan.aroundyou.ui.home.antara.AntaraPolitikFragment
import com.rokan.aroundyou.ui.home.antara.AntaraTerbaruFragment

class AntaraPagerAdapter(fa: AntaraHostFragment) : FragmentStateAdapter(fa) {
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> AntaraTerbaruFragment()
            1 -> AntaraEkonomiFragment()
            2 -> AntaraPolitikFragment()
            else -> AntaraTerbaruFragment()
        }
    }
}