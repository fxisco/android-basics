package com.example.francisco.quizapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    boolean isQuestion1Checked, isQuestion2Checked, isQuestion4Checked;
    int scoreQuestion1;
    CheckBox question2Option1, question2Option2, question2Option3, question2Option4;
    CheckBox question4Option1, question4Option2, question4Option3, question4Option4;
    EditText question3_text;
    RadioGroup question1Group;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        question2Option1 = (CheckBox) findViewById(R.id.question2_option_1);
        question2Option2 = (CheckBox) findViewById(R.id.question2_option_2);
        question2Option3 = (CheckBox) findViewById(R.id.question2_option_3);
        question2Option4 = (CheckBox) findViewById(R.id.question2_option_4);
        question4Option1 = (CheckBox) findViewById(R.id.question4_option_1);
        question4Option2 = (CheckBox) findViewById(R.id.question4_option_2);
        question4Option3 = (CheckBox) findViewById(R.id.question4_option_3);
        question4Option4 = (CheckBox) findViewById(R.id.question4_option_4);
        question3_text = (EditText) findViewById(R.id.question3_text);
        question1Group = (RadioGroup) findViewById(R.id.question1_group);
    }

    public void checkQuestion1(View view) {
        isQuestion1Checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.question1_option_1:
                scoreQuestion1 = 10;
                break;
            case R.id.question1_option_2:
                scoreQuestion1 = 0;
                break;
            case R.id.question1_option_3:
                scoreQuestion1 = 0;
                break;
        }
    }

    public void checkQuestion2(View view) {
        isQuestion2Checked = question2Option1.isChecked() ||
                question2Option2.isChecked() ||
                question2Option3.isChecked() ||
                question2Option1.isChecked();
    }

    public void checkQuestion4(View view) {
        isQuestion4Checked = question4Option1.isChecked() ||
                question4Option2.isChecked() ||
                question4Option3.isChecked() ||
                question4Option1.isChecked();
    }

    public void submitQuiz(View view) {
        int totalScore = 0;
        boolean isQuestion3Empty = question3_text.getText().toString().equals("");

        if (isQuestion1Checked && isQuestion2Checked && !isQuestion3Empty && isQuestion4Checked) {
            totalScore += calculateQuizTotal();
            showTotal(view, totalScore);
        } else {
            Toast.makeText(view.getContext(), "You must fill all the questions", Toast.LENGTH_LONG).show();
        }
    }

    private int calculateQuizTotal() {
        int totalScore = 0;
        totalScore += scoreQuestion1;

        if (question2Option1.isChecked()) {
            totalScore += 5;
        }

        if (question2Option4.isChecked()) {
            totalScore += 5;
        }

        if (question4Option2.isChecked()) {
            totalScore += 5;
        }

        if (question4Option4.isChecked()) {
            totalScore += 5;
        }

        if (question3_text.getText().toString().toLowerCase().equals("internet")) {
            totalScore += 10;
        }

        return totalScore;
    }

    private void showTotal(View view, int totalScore) {
        Context context = view.getContext();
        String scoreString = "Quiz score: " + totalScore;
        Toast.makeText(context, scoreString, Toast.LENGTH_LONG).show();
    }

    public void resetQuiz(View view) {
        resetCheckBoxes();
        clearEditText();
        resetRadioButtons();
    }

    private void resetRadioButtons() {
        question1Group.clearCheck();
    }

    private void clearEditText() {
        question3_text.setText("");
    }

    private void resetCheckBoxes() {
        question2Option1.setChecked(false);
        question2Option2.setChecked(false);
        question2Option3.setChecked(false);
        question2Option4.setChecked(false);
        question4Option1.setChecked(false);
        question4Option2.setChecked(false);
        question4Option3.setChecked(false);
        question4Option4.setChecked(false);
    }

}
