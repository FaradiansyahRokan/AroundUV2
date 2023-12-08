package com.rokan.aroundyou.ui.home.cnbc

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.rokan.aroundyou.adapter.NewsAdapter
import com.rokan.aroundyou.data.repository.NewsRepository
import com.rokan.aroundyou.databinding.FragmentCnbcNewsBinding
import com.rokan.aroundyou.ui.NewsViewModel
import com.rokan.aroundyou.utils.NewsViewModelFactory

class CnbcNewsFragment : Fragment() {
    private lateinit var binding: FragmentCnbcNewsBinding
    private val commonViewModel: NewsViewModel by viewModels {
        NewsViewModelFactory(NewsRepository())
    }



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCnbcNewsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val mAdapter = NewsAdapter()
        commonViewModel.getCNBCNewsNews()
        commonViewModel.CNBCNewsNews.observe(viewLifecycleOwner) { newsResponse ->
            val articles = newsResponse.data?.posts
            articles?.let {
                mAdapter.setData(it.filterNotNull())
                binding.rvCnbcNews.apply {
                    adapter = mAdapter
                    layoutManager = LinearLayoutManager(requireContext())
                }
            }
        }
    }
}