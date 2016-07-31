package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    public ArrayList<Word> words = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        words.add(new Word("one", "lutti"));
        words.add(new Word("two", "lutti"));
        words.add(new Word("three", "lutti"));
        words.add(new Word("four", "lutti"));
        words.add(new Word("five", "lutti"));
        words.add(new Word("six", "lutti"));
        words.add(new Word("seven", "lutti"));
        words.add(new Word("eight", "lutti"));
        words.add(new Word("nine", "lutti"));
        words.add(new Word("ten", "lutti"));

        WordAdapter itemsAdapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}
