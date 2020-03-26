package com.example.recyclerviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerviewdemo.adapter.ConstraintAdapter;
import com.example.recyclerviewdemo.adapter.MyAdapter;
import com.example.recyclerviewdemo.storage.Storage;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ConstraintAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       /* recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new MyAdapter(new Storage());
        recyclerView.setAdapter(adapter);*/

       recyclerView = findViewById(R.id.recyclerView);
       recyclerView.setLayoutManager(new LinearLayoutManager(this));
       adapter = new ConstraintAdapter();
       recyclerView.setAdapter(adapter);
    }
}
