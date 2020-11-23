package com.example.hostelapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listview);


        ArrayList<String> list= new ArrayList<>();
        //information to be displayed as a list-view.
        list.add("Qwetu Hostel");
        list.add("Alsopps Hostel");
        list.add("Comfy hostels");
        list.add("Bambi Hostels");
        list.add("Nyumba Kumi Hostels");
        list.add("Manchester Hostels");
        list.add("KCA Hostels");
        list.add("Ngara Men's Hostel");
        list.add("Scott Christian Hostels");
        list.add("West Prime Hostels");
        list.add("Park Inn Hostels");
        list.add("Deja Hostels");
        list.add("Kawangware Hostels");
        list.add("Kabete Hostels");
        list.add("CBD Hostels");


        final ArrayAdapter<String> adapter= new ArrayAdapter<>(this,R.layout.custom_list,
                R.id.text,list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String day =  adapter.getItem(position);
                Toast.makeText(MainActivity.this, "unavailable", Toast.LENGTH_SHORT).show();

            }
        });
    }
}