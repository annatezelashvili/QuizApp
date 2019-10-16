package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.quizapp.QuestionActivity.LAST_SCORE;


public class ResultActivity extends AppCompatActivity {
    private TextView mScore;
    private SharePreferenceManager mSharePreferenceManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        mScore = findViewById(R.id.score);
        Intent intent = getIntent();
        String Score = intent.getExtras().getString("score");
        mScore.setText(Score);
        mScore.setText("Your score is : " + Score);
        mSharePreferenceManager = new SharePreferenceManager(this);
            mSharePreferenceManager.write(LAST_SCORE, Score);
        }
}