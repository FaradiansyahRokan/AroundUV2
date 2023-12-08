package com.rokan.aroundyou.data.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize


@Parcelize
data class NewsResponse(

    @field:SerializedName("data")
    val data: Data? = null,

    @field:SerializedName("success")
    val success: Boolean? = null,

    @field:SerializedName("message")
    val message: String? = null
) : Parcelable

@Parcelize
data class NewsItem(

    @field:SerializedName("thumbnail")
    val thumbnail: String,

    @field:SerializedName("link")
    val link: String,

    @field:SerializedName("description")
    val description: String,

    @field:SerializedName("title")
    val title: String,

    @field:SerializedName("pubDate")
    val pubDate: String,
) : Parcelable

@Parcelize
data class Data(

    @field:SerializedName("image")
    val image: String,

    @field:SerializedName("link")
    val link: String,

    @field:SerializedName("description")
    val description: String,

    @field:SerializedName("title")
    val title: String,

    @field:SerializedName("posts")
    val posts: List<NewsItem>,
) : Parcelable