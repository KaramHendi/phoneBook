package com.example.fragments;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class BlankFragment2 extends Fragment {
TextView tvName;
TextView tvPhone;
ImageView ivContact;
    public BlankFragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = null;
        tvName=view.findViewById(R.id.tvName);
        tvPhone=view.findViewById(R.id.tvPhone);
        ivContact=view.findViewById(R.id.imageContact);
        ivContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phoneNum =tvPhone.getText().toString().trim();
                Intent intent=new Intent(Intent.ACTION_DIAL, Uri.parse("tel"+phoneNum));
                startActivity(intent);
            }
        });
      return view;
    }
    public void updateTexts(String st1,String st2){
        tvName.setText(st1);
        tvPhone.setText(st2);
    }
}