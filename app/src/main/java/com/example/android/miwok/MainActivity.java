/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        TextView numberTextView = findViewById(R.id.numbers);
        TextView phrasesTextView = findViewById(R.id.phrases);
        TextView colorsTextView = findViewById(R.id.colors);
        TextView familyTextView = findViewById(R.id.family);

        // Numbers click handler which changes the view to the Numbers activity
        numberTextView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(numbersIntent);
            }
        });

        // Phrases click handler which changes the view to the Phrases activity
        phrasesTextView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(phrasesIntent);
            }
        });

        // Colors click handler which changes the view to the Colors activity
        colorsTextView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent colorIntent = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(colorIntent);
            }
        });

        // Family click handler which changes the view to the Family activity
        familyTextView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(familyIntent);
            }
        });
    }
}
