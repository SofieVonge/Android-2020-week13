package com.example.recyclerviewdemo.view;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewdemo.R;

public class ConstraintViewHolder extends RecyclerView.ViewHolder {

    private TextView textView;
    private ImageView imageView;
    private Button button;

    public ConstraintViewHolder(@NonNull View itemView) {
        super(itemView);
        ConstraintLayout cl = (ConstraintLayout) itemView;

        textView = cl.findViewById(R.id.textView2);
        imageView = cl.findViewById(R.id.imageView2);
        button = cl.findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "You clicked like!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void setData(String data) {
        textView.setText(data);
    }
}
