package com.jmonzon.marvelApi.models.characterResponse

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class CharacterResponse (
    @SerializedName("code")
    @Expose
    val code: String,
    @SerializedName("status")
    @Expose
    val status: String,
    @SerializedName("copyright")
    @Expose
    val copyright: String,
    @SerializedName("attributionText")
    @Expose
    val attributionText: String,
    @SerializedName("attributionHTML")
    @Expose
    val attributionHTML: String,
    @SerializedName("data")
    @Expose
    val data: Data,
    @SerializedName("etag")
    @Expose
    val etag: String
)
