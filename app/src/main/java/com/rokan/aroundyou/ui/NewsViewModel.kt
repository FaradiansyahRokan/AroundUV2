package com.rokan.aroundyou.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.rokan.aroundyou.data.model.NewsResponse
import com.rokan.aroundyou.data.repository.NewsRepository

class NewsViewModel (private val repository: NewsRepository): ViewModel() {

    val CNBCNewsNews: LiveData<NewsResponse> = repository.CNBCNewsNews
    val CNBCTerbaruNews: LiveData<NewsResponse> = repository.CNBCTerbaruNews
    val CNBCInvestment: LiveData<NewsResponse> = repository.CNBCInvestmentNews

    val CNNTerbaruNews: LiveData<NewsResponse> = repository.CNNTerbaruNews
    val CNNEkonomiNews: LiveData<NewsResponse> = repository.CNNEkonomiNews
    val CNNHiburanNews: LiveData<NewsResponse> = repository.CNNHiburanNews

    val AntaraTerbaruNews: LiveData<NewsResponse> = repository.AntaraTerbaruNews
    val AntaraEkonomiNews: LiveData<NewsResponse> = repository.AntaraEkonomiNews
    val AntaraPolitikNews: LiveData<NewsResponse> = repository.AntaraPolitikNews


    fun getCNBCNewsNews() {
        repository.getCNBCNewsNews()
    }
    fun getCNBCTerbaruNews() {
        repository.getCNBCTerbaruNews()
    }

    fun getCNBCInvestmentNews() {
        repository.getCNBCInvestmentNews()
    }

    fun getCNNTerbaruNews() {
        repository.getCNNTerbaruNews()
    }

    fun getCNNEkonomiNews() {
        repository.getCNNEkonomiNews()
    }

    fun getCNNHiburanNews() {
        repository.getCNNHiburanNews()
    }

    fun getAntaraTerbaruNews() {
        repository.getAntaraTerbaruNews()
    }

    fun getAntaraEkonomiNews() {
        repository.getAntaraEkonomiNews()
    }

    fun getAntaraPolitikNews() {
        repository.getAntaraPolitikNews()
    }
}