package com.rokan.aroundyou.ui.home.antara

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayoutMediator
import com.rokan.aroundyou.adapter.AntaraPagerAdapter
import com.rokan.aroundyou.databinding.FragmentAntaraHostBinding

class AntaraHostFragment : Fragment() {

    private lateinit var binding: FragmentAntaraHostBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAntaraHostBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setUpViewPager()
    }

    private fun setUpViewPager() {

        val adapter = AntaraPagerAdapter(this)
        binding.vpAntara.adapter = adapter

        TabLayoutMediator(binding.tabs, binding.vpAntara) { tab, position ->
            when (position) {
                0 -> tab.text = "Terbaru"
                1 -> tab.text = "Ekonomi"
                2 -> tab.text = "Politik"
            }
        }.attach()
    }
}