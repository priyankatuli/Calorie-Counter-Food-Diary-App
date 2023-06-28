package com.example.caloriecounterandfooddiaryapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView foodchartID, BMIcardViewID,BMRCardViewId,CalorieCardViewId;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        this.setTitle("Home Page");
        //actionbar color kora
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.teal_700)));


        foodchartID = findViewById(R.id.FoodCardView);
        BMIcardViewID = findViewById(R.id.BMICardView);
        BMRCardViewId = findViewById(R.id.BMRCardView);
        CalorieCardViewId = findViewById(R.id.CalorieCardView);



        //cardview r sathe listener set kora

        foodchartID.setOnClickListener(this);
        BMIcardViewID.setOnClickListener(this);
        BMRCardViewId.setOnClickListener(this);
        CalorieCardViewId.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.FoodCardView){
             Intent intent = new Intent(SecondActivity.this,FoodActivity.class);
             startActivity(intent);

        }
        else if(v.getId()==R.id.BMICardView){
            Intent intent = new Intent(SecondActivity.this,BMIActivity.class);
            startActivity(intent);
        }
        else if (v.getId()==R.id.BMRCardView){
            Intent intent = new Intent(SecondActivity.this,BMRActivity.class);
            startActivity(intent);
        }
        else if (v.getId()== R.id.CalorieCardView){
            Intent intent = new Intent (SecondActivity.this,CalorieActivity.class);
            startActivity(intent);
        }




    }
}