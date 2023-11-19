package com.example.nutritionist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class category_child extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_child);
    }
    public void clk1(View v){
        Intent intent=new Intent(category_child.this, child_micro.class);
        startActivity(intent);
    }
    public void clk2(View v){
        Intent intent=new Intent(category_child.this, child_macro.class);
        startActivity(intent);
    }
    public void clk3(View v){
        Intent intent=new Intent(category_child.this, child_water.class);
        startActivity(intent);
    }
}