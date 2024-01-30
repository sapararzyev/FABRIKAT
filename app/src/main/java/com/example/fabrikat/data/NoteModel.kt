package com.example.fabrikat.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class NoteModel (
    @PrimaryKey(autoGenerate = true)
    val id:Int? = null,
    val img:Int,
    val title: String,
    val description:String,
    val data: String
)
