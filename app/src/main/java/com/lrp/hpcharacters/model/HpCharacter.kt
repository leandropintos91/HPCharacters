package com.lrp.hpcharacters.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class HpCharacter {
    @SerializedName("name")
    @Expose
    private var name: String = ""

    @SerializedName("alternate_names")
    @Expose
    private var alternateNames: List<String> = emptyList()

    @SerializedName("species")
    @Expose
    private var species: String = ""

    @SerializedName("gender")
    @Expose
    private var gender: String = ""

    @SerializedName("house")
    @Expose
    private var house: String = ""

    @SerializedName("dateOfBirth")
    @Expose
    private var dateOfBirth: String = ""

//    @SerializedName("yearOfBirth")
//    @Expose
//    private var yearOfBirth: Int = 0

    @SerializedName("wizard")
    @Expose
    private var wizard: Boolean = false

    @SerializedName("ancestry")
    @Expose
    private var ancestry: String = ""

    @SerializedName("eyeColour")
    @Expose
    private var eyeColour: String = ""

    @SerializedName("hairColour")
    @Expose
    private var hairColour: String = ""

    @SerializedName("wand")
    @Expose
    private var wand: Wand = Wand()

    @SerializedName("patronus")
    @Expose
    private var patronus: String = ""

    @SerializedName("hogwartsStudent")
    @Expose
    private var hogwartsStudent: Boolean = false

    @SerializedName("hogwartsStaff")
    @Expose
    private var hogwartsStaff: Boolean = false

    @SerializedName("actor")
    @Expose
    private var actor: String = ""

    @SerializedName("alternate_actors")
    @Expose
    private var alternateActors: List<String> = emptyList()

    @SerializedName("alive")
    @Expose
    private var alive: Boolean = false

    @SerializedName("image")
    @Expose
    private var image: String = ""
}