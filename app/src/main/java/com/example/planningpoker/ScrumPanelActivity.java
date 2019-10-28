package com.example.planningpoker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ScrumPanelActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrum_panel);

        Components();
//        FillListView();
    }

    private void Components()
    {
        listView = findViewById(R.id.simpleListView);
    }


    //UNDER CONSTRUCTION
//    private void FillListView()
//    {
//        //DBHandler db = new DBHandler(this);
//        //ArrayList<String> array = db.getHobbies();
//
//
//        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,R.layout.activity_listview, R.id.textView,array);
//        listView.setAdapter(arrayAdapter);
//    }

}
