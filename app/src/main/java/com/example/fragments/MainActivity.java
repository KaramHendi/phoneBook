package com.example.fragments;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    public static ArrayList<Person> persons;
    TextView tvDate;
    String currentDate;
    Calendar calendar=Calendar.getInstance();
    FragmentManager fragmentManager;
    BlankFragment listFrag;
    BlankFragment2 detailFrag;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvDate=findViewById(R.id.tvDate);
        fragmentManager=this.getSupportFragmentManager();
        currentDate= DateFormat.getDateInstance(DateFormat.FULL).format(calendar.getTime());
        tvDate.setText(currentDate);
        listFrag=(BlankFragment) fragmentManager.findFragmentById(R.id.listFrag);
        initArray();
        detailFrag=(BlankFragment2) fragmentManager.findFragmentById(R.id.detailFrag);

    }
    public void initArray(){
        persons.add(new Person("Adel Emam","0523527176",R.drawable.adel));
        persons.add(new Person("Messi","0546738929",R.drawable.messi));
        persons.add(new Person("Ahmad Helmy","0546789023",R.drawable.ahmad));
        persons.add(new Person("Samir Khanim","0509871234",R.drawable.samir));
        persons.add(new Person("Ehab Towfek","0524567891",R.drawable.ehab));

    }
    public void onItemClicked(int Index) {
        if(!persons.isEmpty()) {
            detailFrag.updateTexts(persons.get(Index).getName(), persons.get(Index).getPhone());
        }
        else
            return ;
    }
}