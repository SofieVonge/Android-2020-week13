package com.example.recyclerviewdemo.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewdemo.R;
import com.example.recyclerviewdemo.storage.Storage;
import com.example.recyclerviewdemo.view.MyViewHolder;

import org.w3c.dom.Text;

//my adapter should use MyViewholder
public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

    private Storage storage;
    private static final int WITH_IMAGE = 1;
    private static final int TEXT_ONLY = 2;

    public MyAdapter(Storage storage) {
        this.storage = storage;
    }
    @NonNull
    @Override                                               //parent is the MainActivity object
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LinearLayout ll = null;
        if (viewType == TEXT_ONLY) {
            ll = (LinearLayout) LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.my_layout, parent, false);
        } else if (viewType == WITH_IMAGE) {
            //linearlayout with image
            ll = (LinearLayout) LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.image_layout, parent, false);
        }

        return new MyViewHolder(ll); //pass the ll to the constructor of the viewholder
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.setData(storage.list.get(position) + position); //dummy data

    }

    @Override
    public int getItemCount() {
        return storage.list.size();
    }

    //allow us to specify what type of content is at a given position
    @Override
    public int getItemViewType(int position) {
        if (position % 2 == 0) {
            return TEXT_ONLY;
        } else {
            return WITH_IMAGE;
        }
    }
}
