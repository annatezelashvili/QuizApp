package com.example.quizapp.scoremodels;

import java.util.ArrayList;
import java.util.List;

public class ScoreManager {
private List<Score> ScoresList= new ArrayList<>();
public void addScores (Score score){
    this.ScoresList.add(score);
}

    public List<Score> getScoresList() {
        return ScoresList;
    }

    public void setScoresList(List<Score> scoresList) {
        ScoresList = scoresList;
    }
}
