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
        View listView = convertView;

        if (listView == null) {
            listView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);

        TextView miwokTranslationTextView = listView.findViewById(R.id.miwokTranslation);
        miwokTranslationTextView.setText(currentWord.getMiwokTranslation());

        TextView defaultTranslationTextView = listView.findViewById(R.id.defaultTranslation);
        defaultTranslationTextView.setText(currentWord.getmDefaultTranslation());

        return listView;
    }
}
