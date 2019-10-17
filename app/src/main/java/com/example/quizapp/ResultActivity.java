package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.quizapp.QuestionActivity.LAST_SCORE;


public  class ResultActivity extends AppCompatActivity {
    private TextView mScore;
    private SharePreferenceManager mSharePreferenceManager;
    private Button mHistory;
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
            mHistory=findViewById(R.id.history);
        mHistory.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent newIntent = new Intent(ResultActivity.this, HistoryActivity.class);
                startActivity(newIntent);
            }
        });
    }
}