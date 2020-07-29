package com.example.recyclerview;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    private Toolbar supportActionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        MyListData[] myListData = new MyListData[]{
                new MyListData("Succorfish SC2","Connect","f2bb529fca5"),
                new MyListData("Succorfish SC2","Connect","f2bb529fca6"),
                new MyListData("Succorfish SC2","Connect","f2bb529fca7"),
                new MyListData("Succorfish SC2","Connect","f2bb529fca5"),
                new MyListData("Succorfish SC2","Connect","f2bb529fca6"),
                new MyListData("Succorfish SC2","Connect","f2bb529fca7"),
                new MyListData("Succorfish SC2","Connect","f2bb529fca5"),
                new MyListData("Succorfish SC2","Connect","f2bb529fca6"),
                new MyListData("Succorfish SC2","Connect","f2bb529fca7"),
                new MyListData("Succorfish SC2","Connect","f2bb529fca5"),
                new MyListData("Succorfish SC2","Connect","f2bb529fca6"),
                new MyListData("Succorfish SC2","Connect","f2bb529fca7"),
        };
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        MyListAdapter adapter = new MyListAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }



}
