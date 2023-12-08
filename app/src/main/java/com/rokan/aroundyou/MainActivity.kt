package com.rokan.aroundyou

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.google.android.material.tabs.TabLayoutMediator
import com.rokan.aroundyou.adapter.SectionPagerAdapter
import com.rokan.aroundyou.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setUpViewPager()
    }
    private fun setUpViewPager() {
        binding.vpNews.adapter = SectionPagerAdapter(this)

        val adapter = SectionPagerAdapter(this)
        binding.vpNews.adapter = adapter

        TabLayoutMediator(binding.tabs, binding.vpNews) { tab, position ->
            when (position) {
                0 -> tab.icon = ContextCompat.getDrawable(this, R.drawable.ncb)
                1 -> tab.icon = ContextCompat.getDrawable(this, R.drawable.vector)
                2 -> tab.text = "Antara"
            }
        }.attach()

    }
}