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

public class BMIActivity extends AppCompatActivity {

    private EditText weight,feet,inch;
    private Button calculation;
    private TextView result;
    String BMIresult,total;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmiactivity);


        this.setTitle("BMI Calculation");
        //Actionbar e color add kora
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.pink)));

        //Use of back arrow in action bar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);



        //view gulo ke find korte hoy
        weight = (EditText) findViewById(R.id.weight);
        feet = (EditText) findViewById(R.id.Feet);
        inch = (EditText) findViewById(R.id.Inch);
        calculation= (Button) findViewById(R.id.calculation);
        result = (TextView) findViewById(R.id.result);

        calculation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s1 = weight.getText().toString();
                String s2= feet.getText().toString();
                String s3= inch.getText().toString();

                Float weightvalue = Float.parseFloat(s1);
                int Feetvalue = Integer.parseInt(s2);
                int Inchvalue = Integer.parseInt(s3);
                double totalheight = ( (Feetvalue*0.305+Inchvalue*0.0254) * (Feetvalue*0.305+Inchvalue*0.0254));
                double BMI = (weightvalue)/ totalheight;
                if(BMI < 18.5){
                    BMIresult = "Underweight";
                }
                else if (BMI >=18.5 && BMI<=24.99){
                    BMIresult = "Normal";
                }
                else if(BMI>= 25 && BMI<=29.99){
                    BMIresult = "Overweight";
                }
                else if (BMI >=30 && BMI <=34.99 ){
                    BMIresult = "First class obesity";
                }
                else if (BMI >=35 && BMI<=39.99){
                    BMIresult = "Second class obesity";
                }
                else if (BMI>40){
                    BMIresult = "Third class obesity";
                }

                total = "Your body mass index is: " +BMI +"\n" +BMIresult + "\n" ;
                result.setText(total);

            }
        });

    }
    //jokhon backarrow te click korbe tokhon er kaj
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()==android.R.id.home){
            this.finish();
        }

        return super.onOptionsItemSelected(item);
    }
}
