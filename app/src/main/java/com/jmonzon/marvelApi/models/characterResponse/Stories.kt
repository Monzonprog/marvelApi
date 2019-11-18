package com.jmonzon.marvelApi.models.characterResponse

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Stories(
    @SerializedName("available")
    @Expose
    val available: String,
    @SerializedName("returned")
    @Expose
    val returned: String,
    @SerializedName("collectionURI")
    @Expose
    val collectionURI: String,
    @SerializedName("items")
    @Expose
    val items: List<Item>?
)