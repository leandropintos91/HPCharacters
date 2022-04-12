package com.lrp.hpcharacters.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class HpCharacter : Serializable {
    @SerializedName("name")
    @Expose
    var name: String = ""

    @SerializedName("alternate_names")
    @Expose
    var alternateNames: List<String> = emptyList()

    @SerializedName("species")
    @Expose
    var species: String = ""

    @SerializedName("gender")
    @Expose
    var gender: String = ""

    @SerializedName("house")
    @Expose
    var house: String = ""

    @SerializedName("dateOfBirth")
    @Expose
    var dateOfBirth: String = ""

//    @SerializedName("yearOfBirth")
//    @Expose
//    var yearOfBirth: Int = 0

    @SerializedName("wizard")
    @Expose
    var wizard: Boolean = false

    @SerializedName("ancestry")
    @Expose
    var ancestry: String = ""

    @SerializedName("eyeColour")
    @Expose
    var eyeColour: String = ""

    @SerializedName("hairColour")
    @Expose
    var hairColour: String = ""

    @SerializedName("wand")
    @Expose
    var wand: Wand = Wand()

    @SerializedName("patronus")
    @Expose
    var patronus: String = ""

    @SerializedName("hogwartsStudent")
    @Expose
    var hogwartsStudent: Boolean = false

    @SerializedName("hogwartsStaff")
    @Expose
    var hogwartsStaff: Boolean = false

    @SerializedName("actor")
    @Expose
    var actor: String = ""

    @SerializedName("alternate_actors")
    @Expose
    var alternateActors: List<String> = emptyList()

    @SerializedName("alive")
    @Expose
    var alive: Boolean = false

    @SerializedName("image")
    @Expose
    var image: String = ""

}