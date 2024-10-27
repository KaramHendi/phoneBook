package com.example.fragments;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
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
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public interface ItemSelected{
       void onItemSelected(int index);


   }
   public class ViewHolder extends RecyclerView.ViewHolder{
       TextView textView;

       public ViewHolder(@NonNull View itemView) {
           super(itemView);
           textView=itemView.findViewById(R.id.tvName);
           itemView.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {

               }
           });
       }
   }
}

