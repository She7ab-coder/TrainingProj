package com.example.noteandroidproject.dataBase.Daos;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.noteandroidproject.dataBase.model.Note;

import java.util.List;

@Dao
public interface NotesDao {

    @Insert
    void addNote(Note note);

    @Update
    void updateNote(Note note);

    @Delete
    void deleteNote(Note note);

    @Query("delete from note where id=:id")
    void deleNoteById(int id);

    @Query("select * from note")
    List<Note> getAllNotes();

}
