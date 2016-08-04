package com.example.android.miwok;

import android.app.Activity;
import android.media.Image;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private int backgroundColor = R.color.category_colors;

    public WordAdapter(Activity context, ArrayList<Word> words) {
        super(context, 0, words);
    }

    public void setBackgroundColor(int color) {
        backgroundColor = color;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listViewItem = convertView;

        // Check if the view is being reused, otherwise create it.
        if (listViewItem == null) {
            listViewItem = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        listViewItem.setBackgroundColor(ContextCompat.getColor(getContext(), backgroundColor));

        Word currentWord = getItem(position);

        TextView miwokWord = (TextView) listViewItem.findViewById(R.id.miwok_word);
        TextView defaultWord = (TextView) listViewItem.findViewById(R.id.english_word);
        ImageView img = (ImageView) listViewItem.findViewById(R.id.imageview);

        miwokWord.setText(currentWord.getMiwokTranslation());
        defaultWord.setText(currentWord.getDefaultTranslation());

        if (currentWord.getImageResourceId() == 0) {
            img.setVisibility(View.GONE);
        } else {
            img.setVisibility(View.VISIBLE);
            img.setImageResource(currentWord.getImageResourceId());
        }

        return listViewItem;
    }
}
