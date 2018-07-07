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
package com.example.android.datafrominternet;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //  (26) Created an EditText variable called mSearchBoxEditText

    EditText mSearchBoxEditText;
    //  (27) Created a TextView variable called mUrlDisplayTextView
    //  (28) Created a TextView variable called mSearchResultsTextView
    TextView mUrlDisplayTextView;
    TextView mSearchResultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //  (29) Used findViewById to get a reference to mSearchBoxEditText
        mSearchBoxEditText = (EditText)findViewById(R.id.et_search_box);

        //  (30) Used findViewById to get a reference to mUrlDisplayTextView
        //  (31) Used findViewById to get a reference to mSearchResultsTextView
        mUrlDisplayTextView = (TextView)findViewById(R.id.tv_url_display);
        mSearchResultTextView = (TextView)findViewById(R.id.tv_github_search_result_json);
    }
}
