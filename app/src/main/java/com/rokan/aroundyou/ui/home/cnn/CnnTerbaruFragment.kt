package com.rokan.aroundyou.ui.home.cnn

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.rokan.aroundyou.adapter.NewsAdapter
import com.rokan.aroundyou.data.repository.NewsRepository
import com.rokan.aroundyou.databinding.FragmentCnnTerbaruBinding
import com.rokan.aroundyou.ui.NewsViewModel
import com.rokan.aroundyou.utils.NewsViewModelFactory

class CnnTerbaruFragment : Fragment() {
    private lateinit var binding: FragmentCnnTerbaruBinding
    private val commonViewModel: NewsViewModel by viewModels {
        NewsViewModelFactory(NewsRepository())
    }



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCnnTerbaruBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val mAdapter = NewsAdapter()
        commonViewModel.getCNNTerbaruNews()
        commonViewModel.CNNTerbaruNews.observe(viewLifecycleOwner) { newsResponse ->
            val articles = newsResponse.data?.posts
            articles?.let {
                mAdapter.setData(it.filterNotNull())
                binding.rvCnnTerbaru.apply {
                    adapter = mAdapter
                    layoutManager = LinearLayoutManager(requireContext())
                }
            }
        }
    }
}