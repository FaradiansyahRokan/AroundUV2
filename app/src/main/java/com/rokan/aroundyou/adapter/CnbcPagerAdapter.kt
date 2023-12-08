package com.rokan.aroundyou.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.rokan.aroundyou.ui.home.cnbc.CnbcHostFragment
import com.rokan.aroundyou.ui.home.cnbc.CnbcInvestmentFragment
import com.rokan.aroundyou.ui.home.cnbc.CnbcNewsFragment
import com.rokan.aroundyou.ui.home.cnbc.CnbcTerbaruFragment

class CnbcPagerAdapter(fa: CnbcHostFragment) : FragmentStateAdapter(fa) {
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> CnbcNewsFragment()
            1 -> CnbcTerbaruFragment()
            2 -> CnbcInvestmentFragment()
            else -> CnbcNewsFragment()
        }
    }
}