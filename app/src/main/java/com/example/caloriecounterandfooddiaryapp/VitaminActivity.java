package com.example.caloriecounterandfooddiaryapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class VitaminActivity extends AppCompatActivity {

    private ListView listView3;
    String[] vitamin_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vitamin);

        this.setTitle("List of other foods with calorie");

        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.fourth)));

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);



        listView3 = (ListView) findViewById(R.id.FourthlistviewId);

        vitamin_name = getResources().getStringArray(R.array.vitamin_name);

        ArrayAdapter<String> adapter4 = new ArrayAdapter<String>(VitaminActivity.this, R.layout.sample4_view, R.id.vitaminId, vitamin_name);
        listView3.setAdapter(adapter4);

    }

    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            this.finish();
        }
        return super.onOptionsItemSelected(item);

    }

}