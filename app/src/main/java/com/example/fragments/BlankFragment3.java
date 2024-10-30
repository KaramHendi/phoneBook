package com.example.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class BlankFragment3 extends Fragment {
EditText etName,etPhone;
Button btnAdd;


    public BlankFragment3() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view= inflater.inflate(R.layout.fragment_3, container, false);
        etName=view.findViewById(R.id.edName);
        etPhone=view.findViewById(R.id.edPhone);
        btnAdd=view.findViewById(R.id.addPerson);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(etName.getText().toString().trim().isEmpty()||etPhone.getText().toString().trim().isEmpty()){
                    Toast.makeText(getContext(),"Please fill all fields ",Toast.LENGTH_SHORT).show();
                }
                else {
                    String name,phone;
                    name=etName.getText().toString().trim();
                    phone=etName.getText().toString().trim();
                    com.example.fragments.MainActivity.persons.add(new Person(name,phone));
                    Toast.makeText(getActivity(), "Person added successfully", Toast.LENGTH_SHORT).show();
                    etName.setText(null);
                    etPhone.setText(null);
                    BlankFragment.notifyDataSetChanged();



                }
            }
        });
        return view;
    }
}
