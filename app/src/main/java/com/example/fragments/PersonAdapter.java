package com.example.fragments;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.ViewHolder> {
   private ArrayList <Person> list;
   ItemSelected activity;
   public PersonAdapter (Context context,ArrayList<Person>list){
       this.list=list;
       activity=(ItemSelected) context;
   }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from((parent.getContext())).inflate((R.layout.row),parent,false);
        return new ViewHolder((view));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
       holder.itemView.setTag(list.get(position));
     holder.textView.setText(list.get(position).getName());
     holder.imageView.setImageResource(list.get(position).getImageView());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public interface ItemSelected{
       void onItemClicked(int index);


   }
   public class ViewHolder extends RecyclerView.ViewHolder{
       TextView textView;
       ImageView imageView;
       public ViewHolder(@NonNull View itemView) {
           super(itemView);
           textView=itemView.findViewById(R.id.tvName);
           itemView=itemView.findViewById(R.id.imgContact);
           itemView.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   activity.onItemClicked(list.indexOf(v.getTag()));
               }
           });
       }
   }
}

