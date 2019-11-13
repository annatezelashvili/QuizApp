package com.example.quizapp.scoremodels;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.gson.Gson;

public class ScoreStorage  {

    private static final String SCORES_LIST_FILE = "scores_list_file";
    private static final String SCORES_LIST_KEY = "scores_list_key";

    private Context mContext;

    public ScoreStorage(Context mContext) {
        this.mContext = mContext;
    }

    public void addScoresToSharedPreferences(Score score) {

        ScoreManager  scoreManager = read();
        scoreManager.getScoresList().add(score);
        write(scoreManager);
    }



    public ScoreManager  getScoresStorage() {
        return read();
    }

    private SharedPreferences getSharedPreferences() {
        return mContext.getSharedPreferences(SCORES_LIST_FILE, Context.MODE_PRIVATE);
    }

    private void write(ScoreManager  scores) {
        SharedPreferences.Editor editor = getSharedPreferences().edit();
        editor.putString(SCORES_LIST_KEY, new Gson().toJson(scores));
        editor.commit();
    }

    private ScoreManager read() {
        String jsonString = getSharedPreferences().getString(SCORES_LIST_KEY, null);
        return new Gson().fromJson(jsonString, ScoreManager.class);
    }
}
