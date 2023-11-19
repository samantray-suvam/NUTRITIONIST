package com.example.nutritionist;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void fun1(View v){
        Intent intent=new Intent(MainActivity.this, category_child.class);
        startActivity(intent);
    }
    public void fun2(View v){
        Intent intent=new Intent(MainActivity.this, category_teen.class);
        startActivity(intent);
    }
    public void fun3(View v){
        Intent intent=new Intent(MainActivity.this, category_adult.class);
        startActivity(intent);
    }
}