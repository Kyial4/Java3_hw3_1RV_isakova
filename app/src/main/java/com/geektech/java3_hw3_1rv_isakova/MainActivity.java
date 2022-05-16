package com.geektech.java3_hw3_1rv_isakova;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recycle_number);
        ArrayList<String> number = new ArrayList<>();
        number.add("996703333644");
        number.add("996703333644");
        number.add("996703333644");
        number.add("996703333644");
        number.add("996703333644");
        number.add("996703333644");
        number.add("996703333644");
        number.add("996703333644");
        number.add("996703333644");
        number.add("996703333644");
        number.add("996703333644");
        number.add("996703333644");

    }
}