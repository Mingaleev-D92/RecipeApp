package com.example.recipeapp.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "favorite_table")
data class Favorite(
    @PrimaryKey
    val id:Int?,
    val name:String?,
    val imageLink:String?
)
