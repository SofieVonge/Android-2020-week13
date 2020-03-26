package com.example.recyclerviewdemo.view;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewdemo.MainActivity;
import com.example.recyclerviewdemo.R;

public class MyViewHolder extends RecyclerView.ViewHolder {

    //need to get a reference to the textview from my_layout
    private TextView textView;
    private ImageView imageView;
    private Button button;

    //this view will be a linearlayout
    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        LinearLayout ll = (LinearLayout) itemView;
        textView = ll.findViewById(R.id.textView);
        imageView = ll.findViewById(R.id.imageView);
        button = ll.findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "You clicked like!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void setData(String data) {
        textView.setText(data); //setting the textview to whatever data we have
    }
}
