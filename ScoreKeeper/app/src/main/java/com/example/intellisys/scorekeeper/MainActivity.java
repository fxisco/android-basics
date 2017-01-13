package com.example.intellisys.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Integer teamAPunctuation = 0;
    Integer teamBPunctuation = 0;
    TextView scoreA;
    TextView scoreB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scoreA = (TextView) findViewById(R.id.scoreA);
        scoreB = (TextView) findViewById(R.id.scoreB);
        scoreA.setText(teamAPunctuation.toString());
        scoreB.setText(teamBPunctuation.toString());
    }

    public void addPointToScore(View view) {
        String tag = view.getTag().toString();
        String team = tag.split(",")[0];
        int points = Integer.parseInt(tag.split(",")[1]);

        if (team.equals("a")) {
            teamAPunctuation += points;
            scoreA.setText(teamAPunctuation.toString());
        } else {
            teamBPunctuation += points;
            scoreB.setText(teamBPunctuation.toString());
        }
    }

    public void resetPunctuation(View view) {
        teamAPunctuation = 0;
        teamBPunctuation = 0;
        scoreA.setText(teamAPunctuation.toString());
        scoreB.setText(teamBPunctuation.toString());
    }
}
