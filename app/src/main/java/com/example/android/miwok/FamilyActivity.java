package com.example.android.miwok;

public class FamilyActivity extends AbstractWordsActivity {

    protected void addWords() {
        words.add(new Word("father", "әpә"));
        words.add(new Word("mother", "әṭa"));
        words.add(new Word("son", "angsi"));
        words.add(new Word("daughter", "tune"));
        words.add(new Word("old brother", "taachi"));
        words.add(new Word("young brother", "chalitti"));
        words.add(new Word("older sister", "teṭe"));
        words.add(new Word("younger sister", "kolliti"));
        words.add(new Word("grandmother", "ama"));
        words.add(new Word("grandfather", "paapa"));

    }

    @Override
    protected int getActivityId() {
        return R.layout.word_list;
    }

}
