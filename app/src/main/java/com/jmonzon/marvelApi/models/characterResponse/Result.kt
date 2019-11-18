package com.jmonzon.marvelApi.models.characterResponse

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Result(
    @SerializedName("id")
    @Expose
    val id: String,
    @SerializedName("name")
    @Expose
    val name: String,
    @SerializedName("description")
    @Expose
    val description: String,
    @SerializedName("modified")
    @Expose
    val modified: String,
    @SerializedName("resourceURI")
    @Expose
    val resourceURI: String,
    @SerializedName("urls")
    @Expose
    val urls: List<Url>?,
    @SerializedName("thumbnail")
    @Expose
    val thumbnail: Thumbnail,
    @SerializedName("comics")
    @Expose
    val comics: Comics,
    @SerializedName("stories")
    @Expose
    val stories: Stories,
    @SerializedName("events")
    @Expose
    val events: Events,
    @SerializedName("series")
    @Expose
    val series: Series
)