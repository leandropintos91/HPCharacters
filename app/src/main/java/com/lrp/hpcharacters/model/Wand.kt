package com.lrp.hpcharacters.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Wand {

    @SerializedName("wood")
    @Expose
    private val wood : String = ""

    @SerializedName("core")
    @Expose
    private val core : String = ""

//    @SerializedName("length")
//    @Expose
//    private val length : Int = 0

}