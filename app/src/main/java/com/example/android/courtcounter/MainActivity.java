package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    int scoreForA = 0;
    int scoreForB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void update3ptScoreForA(android.view.View view) {
        scoreForA = scoreForA + 3;
        displayScoreForA(scoreForA);
    }

    public void update2ptScoreForA(android.view.View view) {
        scoreForA = scoreForA + 2;
        displayScoreForA(scoreForA);
    }

    public void updateFreeThrowForA(android.view.View view) {
        scoreForA = scoreForA + 1;
        displayScoreForA(scoreForA);
    }

    public void reset(android.view.View view) {
        scoreForA = 0;
        displayScoreForA(scoreForA);
        scoreForB = 0;
        displayScoreForB(scoreForB);
    }

    private void displayScoreForA(int number) {
        android.widget.TextView quantityTextView = (android.widget.TextView) findViewById(R.id.scoreA);
        quantityTextView.setText(String.valueOf(number));

    }

    public void update3ptScoreForB(android.view.View view) {
        scoreForB = scoreForB + 3;
        displayScoreForB(scoreForB);
    }

    public void update2ptScoreForB(android.view.View view) {
        scoreForB = scoreForB + 2;
        displayScoreForB(scoreForB);
    }

    public void updateFreeThrowForB(android.view.View view) {
        scoreForB = scoreForB + 1;
        displayScoreForB(scoreForB);
    }

    private void displayScoreForB(int number) {
        android.widget.TextView quantityTextView = (android.widget.TextView) findViewById(R.id.scoreB);
        quantityTextView.setText(String.valueOf(number));

    }
}
