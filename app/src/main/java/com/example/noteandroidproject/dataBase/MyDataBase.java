package com.example.noteandroidproject.dataBase;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.noteandroidproject.dataBase.Daos.NotesDao;
import com.example.noteandroidproject.dataBase.model.Note;

@Database(entities = {Note.class}, version = 1, exportSchema = false)
public abstract class MyDataBase extends RoomDatabase {
    public abstract NotesDao notesDao();

    public static final String DB_NAME = "NoteDataBase";
    private static MyDataBase dataBase;

    public static MyDataBase getInstance(Context context) {

        if (dataBase == null) {
            dataBase = Room.databaseBuilder(context, MyDataBase.class, DB_NAME)
                    .fallbackToDestructiveMigration()
                    .allowMainThreadQueries()
                    .build();
        }
        return dataBase;
    }

}
