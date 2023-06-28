package com.example.caloriecounterandfooddiaryapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class FoodActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView carbofood,proteinfood,fatfood,vitaminfood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        this.setTitle("Food chart with calories");
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.light_pest)));

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        carbofood = findViewById(R.id.FirstCardViewId);
        proteinfood = findViewById(R.id.SecondCardViewId);
        fatfood = findViewById(R.id.ThirdCardViewId);
        vitaminfood= findViewById(R.id.FouthCardViewId);


        carbofood.setOnClickListener(this);
        proteinfood.setOnClickListener(this);
        fatfood.setOnClickListener(this);
        vitaminfood.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.FirstCardViewId){

            Intent intent = new Intent(FoodActivity.this,CarbohydrateActivity.class);
            startActivity(intent);

        }
        else if(v.getId()==R.id.SecondCardViewId){

            Intent intent = new Intent(FoodActivity.this,ProteinActivity.class);
            startActivity(intent);

        }
        else if(v.getId()==R.id.ThirdCardViewId){
             Intent intent = new Intent(FoodActivity.this,FatActivity.class);
             startActivity(intent);

        }
        else if (v.getId()==R.id.FouthCardViewId){

            Intent intent = new Intent(FoodActivity.this,VitaminActivity.class);
            startActivity(intent);
        }

    }

    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            this.finish();
        }
        return super.onOptionsItemSelected(item);

    }

}