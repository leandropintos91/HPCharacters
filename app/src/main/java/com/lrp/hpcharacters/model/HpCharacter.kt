package com.lrp.hpcharacters.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

@Entity(tableName = "characters")
data class HpCharacter(

    @PrimaryKey(autoGenerate = true)
    var id: Int,

    @ColumnInfo(name = "name")
    @SerializedName("name")
    @Expose
    var name: String = "",

//    @ColumnInfo(name = "alternate_names")
//    @SerializedName("alternate_names")
//    @Expose
//    var alternateNames: List<String> = emptyList(),

    @ColumnInfo(name = "species")
    @SerializedName("species")
    @Expose
    var species: String = "",

    @ColumnInfo(name = "gender")
    @SerializedName("gender")
    @Expose
    var gender: String = "",

    @ColumnInfo(name = "house")
    @SerializedName("house")
    @Expose
    var house: String = "",

    @ColumnInfo(name = "date_of_birth")
    @SerializedName("dateOfBirth")
    @Expose
    var dateOfBirth: String = "",

//    @SerializedName("yearOfBirth")
//    @Expose
//    var yearOfBirth: Int = 0

    @ColumnInfo(name = "wizard")
    @SerializedName("wizard")
    @Expose
    var wizard: Boolean = false,

    @ColumnInfo(name = "ancestry")
    @SerializedName("ancestry")
    @Expose
    var ancestry: String = "",

    @ColumnInfo(name = "eye_colour")
    @SerializedName("eyeColour")
    @Expose
    var eyeColour: String = "",

    @ColumnInfo(name = "hair_colour")
    @SerializedName("hairColour")
    @Expose
    var hairColour: String = "",

//    @ColumnInfo(name = "wand")
//    @SerializedName("wand")
//    @Expose
//    var wand: Wand = Wand(),

    @ColumnInfo(name = "patronus")
    @SerializedName("patronus")
    @Expose
    var patronus: String = "",

    @ColumnInfo(name = "hogwarts_student")
    @SerializedName("hogwartsStudent")
    @Expose
    var hogwartsStudent: Boolean = false,

    @ColumnInfo(name = "hogwarts_staff")
    @SerializedName("hogwartsStaff")
    @Expose
    var hogwartsStaff: Boolean = false,

    @ColumnInfo(name = "actor")
    @SerializedName("actor")
    @Expose
    var actor: String = "",

//    @ColumnInfo(name = "alternate_actors")
//    @SerializedName("alternate_actors")
//    @Expose
//    var alternateActors: List<String> = emptyList(),

    @ColumnInfo(name = "alive")
    @SerializedName("alive")
    @Expose
    var alive: Boolean = false,

    @ColumnInfo(name = "image")
    @SerializedName("image")
    @Expose
    var image: String = ""

) : Serializable