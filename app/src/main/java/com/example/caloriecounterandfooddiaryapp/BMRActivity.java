package com.example.caloriecounterandfooddiaryapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BMRActivity extends AppCompatActivity {

    private EditText weight,height,age;
    private TextView result;
    private Button male,female;
    String Calculation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmractivity);


        this.setTitle("BMR Calculation");


        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.light_blue)));

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        weight = (EditText)findViewById(R.id.weight);
        height = (EditText)findViewById(R.id.height);
        age = (EditText)findViewById(R.id.age);
        result = (TextView)findViewById(R.id.result);
        male  = (Button) findViewById(R.id.Male);
        female = (Button) findViewById(R.id.Female);


        male.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s1 = weight.getText().toString();
                String s2 = height.getText().toString();
                String s3 = age.getText().toString();

                double weightvalue = Double.parseDouble(s1);
                double heightvalue = Double.parseDouble(s2);
                //double agevalue = Double.parseDouble(s3);
                int agevalue = Integer.parseInt(s3);

                ///BMR law from harris Benedict
                double BMR = 66 + 13.75 * (weightvalue) + 5 * (heightvalue) - 6.8 * (agevalue);
                Calculation = "You clicked the male button so your basal metabolism rate is: " +BMR +  "\n"  +"Calories/day";
                result.setText(Calculation);

            }
        });

        female.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String S1 = weight.getText().toString();
                String S2 = height.getText().toString();
                String S3 = age.getText().toString();


                double weightvalue = Double.parseDouble(S1);
                double heightvalue = Double.parseDouble(S2);
                double agevalue = Double.parseDouble(S3);

                double BMR = 665 + 9.6 * (weightvalue) + 1.8 * (heightvalue) - 4.7 * (agevalue);
                Calculation = "You clicked the female button so your basal metabolism rate is: " +BMR +  "\n"  +"Calories/day";
                result.setText(Calculation);


            }
        });

    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId()==android.R.id.home){
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }


}
