package com.example.android.miwok;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(Activity context, ArrayList<Word> words) {
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listViewItem = convertView;

        // Check if the view is being reused, otherwise create it.
        if (listViewItem == null) {
            listViewItem = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);

        TextView miwokWord = (TextView) listViewItem.findViewById(R.id.miwok_word);
        TextView defaultWord = (TextView) listViewItem.findViewById(R.id.english_word);

        miwokWord.setText(currentWord.getMiwokTranslation());
        defaultWord.setText(currentWord.getDefaultTranslation());

        return listViewItem;
    }
}
