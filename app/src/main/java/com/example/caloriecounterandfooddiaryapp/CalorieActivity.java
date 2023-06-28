package com.example.caloriecounterandfooddiaryapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class CalorieActivity extends AppCompatActivity implements View.OnClickListener  {

    private EditText ageedittext, heightedittext, weightedittext;

    private RadioGroup genderradiogroup, activityradiogroup;
    private RadioButton genderbutton, activitybutton;

    String agetext, heighttext, weighttext;

    private Button resultbutton;

    private TextView tdee;

    Double a, h, w, res, td, wl, wg;
    int flag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calorie);

        this.setTitle("Calorie counter");
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.name)));

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        ageedittext = findViewById(R.id.ageedittextid);
        heightedittext = findViewById(R.id.heightedittextid);
        weightedittext = findViewById(R.id.weightedittextid);

        genderradiogroup = findViewById(R.id.genderradiogroupid);
        activityradiogroup = findViewById(R.id.acitvityradiogroupid);
        resultbutton = findViewById(R.id.resultbuttonid);
        tdee = findViewById(R.id.resultextviewid);

        resultbutton.setOnClickListener(this);


    }
    @Override
    public void onClick(View v) {
        agetext = ageedittext.getText().toString();
        a = Double.parseDouble(agetext);

        heighttext = heightedittext.getText().toString();
        h = Double.parseDouble(heighttext);

        weighttext = weightedittext.getText().toString();
        w = Double.parseDouble(weighttext);

        int selecctgenderid, selectactivityid;

        selecctgenderid = genderradiogroup.getCheckedRadioButtonId();
        genderbutton = findViewById(selecctgenderid);
        String sex;
        sex = genderbutton.getText().toString();
        if (sex.equals("male")) {
            flag = 1;
        } else {
            flag = 2;
        }

        if (flag == 1) {
            res = 88.362 + (13.397 * w) + (4.799 * h) - (5.677 * a);
            //tdee.setText("dm"+res);
        }
        else {
            res = 447.593 + (9.247 * w) + (3.098 * h) - (4.330 * a);
            //tdee.setText("df"+res);
        }

        selectactivityid = activityradiogroup.getCheckedRadioButtonId();
        activitybutton = findViewById(selectactivityid);

        String activity;
        activity = activitybutton.getText().toString();


        if (activity.equals("little or no exercise")) {
            td = res * 1.2;
        } else if (activity.equals("Exercise 1-3times/week")) {
            td = res * 1.37;
        } else if (activity.equals("Daily or intense exercise 3-4times/week")) {
            td = res * 1.54;
        } else if (activity.equals("intense exercise 6-7")) {
            td = res * 1.72;
        } else if (activity.equals("Very intense exercise daily or Physical job")) {
            td = res * 1.89;
        } else {
            td = res;
        }

        wl = td * .8;
        wg = td * 1.2;

        tdee.setText( "TDEE is : "+td+"caloies per day \n For Weightloss you should take : "+wl+"calories per day.\n For weight gain you should take :"+wg+"calories per day.");

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId()==android.R.id.home){
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }

}