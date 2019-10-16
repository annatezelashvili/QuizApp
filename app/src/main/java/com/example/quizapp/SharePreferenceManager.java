package com.example.quizapp;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.TextView;

public class SharePreferenceManager {

    private static final String FILE_NAME = "test";

    private Context mContext;

    public SharePreferenceManager(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("Never Played");
        }
        this.mContext = context;
    }

    public void write(String key, String value) {
        SharedPreferences.Editor editor = getSharedPreferences().edit();
        editor.putString(key, value);
        editor.commit();
    }

    public String read(String key) {
        return getSharedPreferences().getString(key, null);
    }

    private SharedPreferences getSharedPreferences() {
        return mContext.getSharedPreferences(FILE_NAME, Context.MODE_PRIVATE);
    }
}
