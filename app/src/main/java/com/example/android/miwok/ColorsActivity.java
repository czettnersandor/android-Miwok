package com.example.android.miwok;

public class ColorsActivity extends AbstractWordsActivity {

    protected void addWords() {
        words.add(new Word("red", "weṭeṭṭi"));
        words.add(new Word("green", "chokokki"));
        words.add(new Word("brown", "ṭakaakki"));
        words.add(new Word("gray", "ṭopoppi"));
        words.add(new Word("black", "kululli"));
        words.add(new Word("white", "kelelli"));
        words.add(new Word("dusty yelloy", "ṭopiisә"));
        words.add(new Word("mustard yellow", "chiwiiṭә"));
    }

    @Override
    protected int getActivityId() {
        return R.layout.word_list;
    }

}
