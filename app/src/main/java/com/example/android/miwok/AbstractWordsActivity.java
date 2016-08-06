package com.example.android.miwok;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public abstract class AbstractWordsActivity extends AppCompatActivity {

    public ArrayList<Word> words = new ArrayList<>();

    protected abstract void addWords();
    protected abstract int getActivityId();
    protected abstract int getBackgroundColor();
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getActivityId());

        addWords();

        WordAdapter itemsAdapter = new WordAdapter(this, words);

        itemsAdapter.setBackgroundColor(getBackgroundColor());

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                releaseMediaPlayer();
                mediaPlayer = MediaPlayer.create(AbstractWordsActivity.this, words.get(position).getAudioResourceId());
                mediaPlayer.start();
            }
        });

        listView.setAdapter(itemsAdapter);
    }

    @Override
    protected void onStop() {
        super.onStop();
        releaseMediaPlayer();
    }

    /**
     * Release media player when exist
     */
    protected void releaseMediaPlayer() {
        if (mediaPlayer != null) {
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }
}
