package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
        int scoreTeamA =0;
        int scoreTeamB =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
/** Team A */
    public void addThreeforTeamA (View v){
        scoreTeamA=scoreTeamA+3;
        displayForTeamA(scoreTeamA);

    }
    public void addTwoforTeamA (View v) {
        scoreTeamA=scoreTeamA+2;
        displayForTeamA(scoreTeamA);
    }
    public void addOneforTeamA (View v) {
        scoreTeamA=scoreTeamA+1;
        displayForTeamA(scoreTeamA);
    }
    /** Team B */
    public void addThreeforTeamB (View v){
        scoreTeamB=scoreTeamB+3;
        displayForTeamB(scoreTeamB);

    }
    public void addTwoforTeamB (View v) {
        scoreTeamB=scoreTeamB+2;
        displayForTeamB(scoreTeamB);
    }
    public void addOneforTeamB (View v) {
        scoreTeamB=scoreTeamB+1;
        displayForTeamB(scoreTeamB);
    }
/** Resets the Score */
    public void resetScore (View v) {
         scoreTeamA =0;
         scoreTeamB =0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
    /**
     * Displays the given score for Team A.
     */

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
