package com.example.recyclerviewdemo.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewdemo.R;
import com.example.recyclerviewdemo.view.ConstraintViewHolder;

public class ConstraintAdapter extends RecyclerView.Adapter<ConstraintViewHolder> {


    @NonNull
    @Override
    public ConstraintViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ConstraintLayout cl = (ConstraintLayout) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.constraint_layout, parent, false);
        return new ConstraintViewHolder(cl);
    }

    @Override
    public void onBindViewHolder(@NonNull ConstraintViewHolder holder, int position) {
        holder.setData("Dummy data on " + position);

    }

    @Override
    public int getItemCount() {
        return 10;
    }
}
