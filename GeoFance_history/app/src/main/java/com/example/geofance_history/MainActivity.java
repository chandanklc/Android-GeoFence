package com.example.geofance_history;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        MyListData[] myListData= new MyListData[]{
                new MyListData("MINIMUM DWELL TIME BREACH","25-07-2020 12:06:55","the device entered or exited geofence.the state changed from the previous position",R.drawable.right),
                new MyListData("MINIMUM DWELL TIME BREACH","25-07-2020 12:05:29","the device entered or exited geofence.the state changed from the previous position",R.drawable.right),
                new MyListData("BOUNDARY CROSS BREACH","25-07-2020 12:06:55","the device entered or exited geofence.the state changed from the previous position",R.drawable.right),
                new MyListData("NA","25-07-2020 12:06:55","the device entered or exited geofence.the state changed from the previous position",R.drawable.right),
                new MyListData("NA","25-07-2020 12:06:55","the device entered or exited geofence.the state changed from the previous position",R.drawable.right),
                new MyListData("MINIMUM DWELL TIME BREACH","25-07-2020 12:06:55","the device entered or exited geofence.the state changed from the previous position",R.drawable.right),
                new MyListData("MINIMUM DWELL TIME BREACH","25-07-2020 12:05:29","the device entered or exited geofence.the state changed from the previous position",R.drawable.right),
                new MyListData("BOUNDARY CROSS BREACH","25-07-2020 12:06:55","the device entered or exited geofence.the state changed from the previous position",R.drawable.right),
                new MyListData("NA","25-07-2020 12:06:55","the device entered or exited geofence.the state changed from the previous position",R.drawable.right),
                new MyListData("NA","25-07-2020 12:06:55","the device entered or exited geofence.the state changed from the previous position",R.drawable.right)
        };

        RecyclerView recyclerView=(RecyclerView)findViewById(R.id.recyclerView);
        MyListAdapter adapter = new MyListAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

    }
}

