package com.example.ikhsan.beginner3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamA, teamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void Pls3A_btn(View view) {
        teamA = teamA + 3;
        updateA(teamA);
    }

    public void Pls2A_btn(View view) {
        teamA = teamA + 2;
        updateA(teamA);
    }

    public void Pls1A_btn(View view) {
        teamA = teamA + 1;
        updateA(teamA);
    }

    private void updateA(int i) {
        TextView tv = findViewById(R.id.scoreA_id);
        tv.setText(""+i);
    }

    public void Pls3B_btn(View view) {
        teamB = teamB + 3;
        updateB(teamB);
    }

    public void Pls2B_btn(View view) {
        teamB = teamB + 2;
        updateB(teamB);
    }

    public void Pls1B_btn(View view) {
        teamB = teamB + 1;
        updateB(teamB);
    }

    private void updateB(int i) {
        TextView tv = findViewById(R.id.scoreB_id);
        tv.setText(""+i);
    }

    public void reset_btn(View view) {
        teamA = teamB = 0;
        updateA(teamA);
        updateB(teamB);
    }
}
