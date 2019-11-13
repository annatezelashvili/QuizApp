package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


import com.example.quizapp.scoremodels.Score;
import com.example.quizapp.scoremodels.ScoreStorage;

import java.util.ArrayList;
import java.util.List;



public class HistoryActivity extends AppCompatActivity {
    private ListView mHistoryList;
    private HistoryArrayAdapter mHistoryArrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
        mHistoryList = findViewById(R.id.score_list);
        mHistoryArrayAdapter = new HistoryArrayAdapter(this,0,new ArrayList<Score>());
        mHistoryList.setAdapter(mHistoryArrayAdapter);
    }
//    @Override
//    protected void onResume() {
//        super.onResume();
//        ScoreStorage scoresManager = new ScoreStorage(this);
//        mHistoryArrayAdapter.clear();
//        mHistoryArrayAdapter.addAll(scoresManager.getScoresStorage().getScoresList());
//    }
    private class HistoryArrayAdapter extends ArrayAdapter {
        public HistoryArrayAdapter(@NonNull Context context, int resource, @NonNull List<Score> objects) {
            super(context, resource, objects);
        }
    }
}