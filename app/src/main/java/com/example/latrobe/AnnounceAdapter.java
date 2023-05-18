package com.example.latrobe;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AnnounceAdapter extends RecyclerView.Adapter <AnnounceAdapter.MyViewHolder>{
    Context context;
    ArrayList<Model> list;

    public AnnounceAdapter(Context context, ArrayList<Model> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        //Inflating Recycler View to Display The List Of Announcements
        View v = LayoutInflater.from(context).inflate(R.layout.announcements2,parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        //Getting Items from differentt positions
        Model model = list.get(position);
        holder.title.setText(model.getTitle());
        holder.content.setText(model.getContent());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView title,content;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            title= itemView.findViewById(R.id.textView4);
            content= itemView.findViewById(R.id.textView5);
        }
    }
}
