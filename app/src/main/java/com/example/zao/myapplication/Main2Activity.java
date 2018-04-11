package com.example.zao.myapplication;

import java.util.ArrayList;
import java.util.Arrays;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {
    private ListView mainListView ;
   private ArrayAdapter<String> listAdapter ;
   String[] users = {"sp-115-1", "sp-115-2", "sp-115-3"};
 //  ArrayList<String> userList = new ArrayList<String>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mainListView = (ListView) findViewById(R.id.mainListView);


      // userList.addAll( Arrays.asList(users) );
        listAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, users);
        mainListView.setAdapter( listAdapter );
    }

}
