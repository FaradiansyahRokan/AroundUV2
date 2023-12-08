package com.rokan.aroundyou.ui.home.cnbc

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayoutMediator
import com.rokan.aroundyou.adapter.CnbcPagerAdapter
import com.rokan.aroundyou.databinding.FragmentCnbcHostBinding

class CnbcHostFragment : Fragment() {

    private lateinit var binding: FragmentCnbcHostBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCnbcHostBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setUpViewPager()
    }

    private fun setUpViewPager() {

        val adapter = CnbcPagerAdapter(this)
        binding.vpCnbc.adapter = adapter

        TabLayoutMediator(binding.tabs, binding.vpCnbc) { tab, position ->
            when (position) {
                0 -> tab.text = "News"
                1 -> tab.text = "Terbaru"
                2 -> tab.text = "Investment"
            }
        }.attach()
    }
}