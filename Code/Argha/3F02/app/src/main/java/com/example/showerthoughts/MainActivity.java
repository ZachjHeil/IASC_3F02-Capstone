package com.example.showerthoughts;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private int note_count=0;

    private void add_note(){
        note_count+=1;
        add_notePreview();
        note.open_newNote();
    }
    private void delete_note(){
        note_count-=1;
        remove_notePreview();
    }
    private void add_notePreview(){

    }
    private void remove_notePreview(){

    }
    private void select_note(){

    }
    private void search_notes(char search){

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}