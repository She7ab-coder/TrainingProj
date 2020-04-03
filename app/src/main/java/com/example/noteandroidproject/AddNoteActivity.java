package com.example.noteandroidproject;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.noteandroidproject.dataBase.Daos.NotesDao;
import com.example.noteandroidproject.dataBase.MyDataBase;
import com.example.noteandroidproject.dataBase.model.Note;

public class AddNoteActivity extends AppCompatActivity implements View.OnClickListener {

    protected EditText title;
    protected EditText contentNote;
    protected EditText time;
    protected Button AddBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_add_note);


    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.Add_btn) {
            String titleS = title.getText().toString();
            String contentS = contentNote.getText().toString();
            String timeS = time.getText().toString();
            Note note = new Note(titleS, contentS, timeS);
            MyDataBase.getInstance(this)
                    .notesDao()
                    .addNote(note);


        }
    }

    private void initView() {
        title = (EditText) findViewById(R.id.title);
        contentNote = (EditText) findViewById(R.id.content_note);
        time = (EditText) findViewById(R.id.time);
        AddBtn = (Button) findViewById(R.id.Add_btn);
        AddBtn.setOnClickListener(AddNoteActivity.this);
    }
}
