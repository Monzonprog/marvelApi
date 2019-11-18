package com.jmonzon.marvelApi.models.characterResponse

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("offset")
    @Expose
    val offset: String,
    @SerializedName("limit")
    @Expose
    val limit: String,
    @SerializedName("total")
    @Expose
    val total: String,
    @SerializedName("count")
    @Expose
    val count: String,
    @SerializedName("results")
    @Expose
    val results: List<Result>?
)