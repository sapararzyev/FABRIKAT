package com.example.fabrikat.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface NoteDao {
    @Query( "SELECT * FROM notemodel")
    fun getAllNote():List<NoteModel>

    @Insert
    fun addNote(model: NoteModel)

    @Delete
    fun DeleteNote(model: NoteModel)

    @Update
    fun upNote(model: NoteModel)
}