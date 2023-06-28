package com.example.caloriecounterandfooddiaryapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FatActivity extends AppCompatActivity {

    private ListView listView2;
    String[] fat_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fat);

        this.setTitle("List of Fat foods with calorie");

        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.new_red)));

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        listView2 = (ListView) findViewById(R.id.ThirdlistviewId);

        fat_name = getResources().getStringArray(R.array.Fat_name);

        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(FatActivity.this, R.layout.sample3_view, R.id.fatId, fat_name);
        listView2.setAdapter(adapter3);

    }

    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            this.finish();
        }

        return super.onOptionsItemSelected(item);

    }


}