package com.example.fragments;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class BlankFragment extends Fragment {
public static RecyclerView recyclerView;
public static RecyclerView.Adapter adapter;
public static RecyclerView.LayoutManager manager;

    public BlankFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_1, container, false);
        recyclerView=view.findViewById(R.id.recycleView);
        recyclerView.setHasFixedSize(true);
        manager=new LinearLayoutManager(this.getActivity());
        recyclerView.setLayoutManager(manager);
        adapter=new com.example.fragments.PersonAdapter(this.getActivity(), com.example.fragments.MainActivity.persons);
        recyclerView.setAdapter(adapter);
        return view;
    }
    @SuppressLint("NotifyDataSetChanged")
    public static void notifyDataSetChanged(){
        adapter.notifyDataSetChanged();
    }
}