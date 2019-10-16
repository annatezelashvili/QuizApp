package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    public static String editedScore = " ";
    private TextView mScore;
    private SharePreferenceManager mSharePreferenceManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        mScore=findViewById(R.id.score);
        Intent intent = getIntent();
        String Score=intent.getExtras().getString("score");
        mScore.setText(Score);
        mScore.setText("Your score is : " + Score);
        mSharePreferenceManager = new SharePreferenceManager(this);
;
        saveResult();
    }
    private void saveResult(){
        String defResult = "Your Last Result : 2/5";
        mSharePreferenceManager.write(editedScore,defResult );
    }
}
