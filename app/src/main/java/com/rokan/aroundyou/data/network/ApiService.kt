package com.rokan.aroundyou.data.network

import com.rokan.aroundyou.data.model.NewsResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

//CNCB
    @GET("/cnbc/news/")
    fun getCNBCNewsNews(
        @Query("q") q: String = "news",
        @Query("language") language: String = "id",
        @Query("pageSize") pageSize: Int = 10,
        @Query("sortBy") sortBy: String = "news"
    ): Call<NewsResponse>

    @GET("/cnbc/terbaru")
    fun getCNBCTerbaruNews(
        @Query("q") q: String = "terbaru",
        @Query("language") language: String = "id",
        @Query("pageSize") pageSize: Int = 10,
        @Query("sortBy") sortBy: String = "relevancy"
    ): Call<NewsResponse>

    @GET("/cnbc/market")
    fun getCNBCInvestmentNews(
        @Query("q") q: String = "market",
        @Query("language") language: String = "id",
        @Query("pageSize") pageSize: Int = 10,
        @Query("sortBy") sortBy: String = "relevancy"
    ): Call<NewsResponse>

//    CNN
    @GET("/cnn/terbaru")
    fun getCNNTerbaruNews(
        @Query("q") q: String = "terbaru",
        @Query("language") language: String = "id",
        @Query("pageSize") pageSize: Int = 10,
        @Query("sortBy") sortBy: String = "relevancy"
    ): Call<NewsResponse>

    @GET("/cnn/ekonomi")
    fun getCNNEkonomiNews(
        @Query("q") q: String = "ekonomi",
        @Query("language") language: String = "id",
        @Query("pageSize") pageSize: Int = 10,
        @Query("sortBy") sortBy: String = "relevancy"
    ): Call<NewsResponse>

    @GET("/cnn/hiburan")
    fun getCNNHiburanNews(
        @Query("q") q: String = "hiburan",
        @Query("language") language: String = "id",
        @Query("pageSize") pageSize: Int = 10,
        @Query("sortBy") sortBy: String = "relevancy"
    ): Call<NewsResponse>

//    antara
    @GET("/antara/terbaru")
    fun getAntaraTerbaruNews(
        @Query("q") q: String = "terbaru",
        @Query("language") language: String = "id",
        @Query("pageSize") pageSize: Int = 10,
        @Query("sortBy") sortBy: String = "relevancy"
    ): Call<NewsResponse>

    @GET("/antara/ekonomi")
    fun getAntaraEkonomiNews(
        @Query("q") q: String = "ekonomi",
        @Query("language") language: String = "id",
        @Query("pageSize") pageSize: Int = 10,
        @Query("sortBy") sortBy: String = "relevancy"
    ): Call<NewsResponse>

    @GET("/antara/politik")
    fun getAntaraPolitikNews(
        @Query("q") q: String = "politik",
        @Query("language") language: String = "id",
        @Query("pageSize") pageSize: Int = 10,
        @Query("sortBy") sortBy: String = "relevancy"
    ): Call<NewsResponse>
}