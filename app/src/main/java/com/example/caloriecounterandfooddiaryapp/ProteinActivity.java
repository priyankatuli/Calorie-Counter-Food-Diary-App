package com.example.caloriecounterandfooddiaryapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ProteinActivity extends AppCompatActivity {

    private ListView listView1;
    String [] protein_name;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_protein);
        this.setTitle("List of protein foods with calorie");

        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.light_blue)));

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);



        listView1 = (ListView) findViewById(R.id.secondlistviewId);

        protein_name = getResources().getStringArray(R.array.protein_name);

        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(ProteinActivity.this,R.layout.sample2_view,R.id.ProteinId,protein_name);
        listView1.setAdapter(adapter1);


    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            this.finish();
        }

        return super.onOptionsItemSelected(item);

    }

}