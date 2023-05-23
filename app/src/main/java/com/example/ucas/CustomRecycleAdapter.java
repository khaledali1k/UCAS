package com.example.ucas;


import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ucas.inpot1;

import java.util.ArrayList;

public class CustomRecycleAdapter extends RecyclerView.Adapter<CustomRecycleAdapter.MyHolder> {
    Context context;
    ArrayList<inpot1> data;
    OnClickListener listener;

    public CustomRecycleAdapter(Context context, ArrayList<inpot1> data ,OnClickListener listener ) {
        this.context = context;
        this.data = data;
        this.listener=listener;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item4,parent,false);

        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.tvName.setText(data.get(position).getName());
        holder.tvName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onClick();

            }
        });
        holder.pop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onDelete(position);
            }
        });


    }

    @Override
    public int getItemCount() {
        return data.size();
    }





    public class MyHolder extends RecyclerView.ViewHolder {
        TextView tvName;

        Button pop;
        public MyHolder(@NonNull View itemView) {
            super(itemView);

            tvName = itemView.findViewById(R.id);
            pop =itemView.findViewById(R.id.tttt);
        }
    }
    interface OnClickListener{
        void onClick();
        void onDelete(int positen);
    }
}