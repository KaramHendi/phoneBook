package com.example.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class BlankFragment extends Fragment {
RecyclerView recyclerView;
RecyclerView.Adapter adapter;
RecyclerView.LayoutManager manager;

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



        return view;
    }
}