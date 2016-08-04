package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public abstract class AbstractWordsActivity extends AppCompatActivity {

    public ArrayList<Word> words = new ArrayList<>();

    protected abstract void addWords();
    protected abstract int getActivityId();
    protected abstract int getBackgroundColor();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getActivityId());

        addWords();

        WordAdapter itemsAdapter = new WordAdapter(this, words);

        itemsAdapter.setBackgroundColor(getBackgroundColor());

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}
