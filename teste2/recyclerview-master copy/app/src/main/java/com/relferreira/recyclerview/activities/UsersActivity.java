package com.relferreira.recyclerview.activities;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.relferreira.recyclerview.R;
import com.relferreira.recyclerview.adapters.PersonAdapter;
import com.relferreira.recyclerview.data.PersonData;
import com.relferreira.recyclerview.models.Person;

import java.util.List;
import android.util.Log;

public class UsersActivity extends AppCompatActivity {


    private static final String TAG = "MyActivity";
    private List<Person> mList;



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        Intent mIntent = getIntent();
        int intValue = mIntent.getIntExtra("position", 0);


        mList = PersonData.getPersons();

        Person person = mList.get(intValue);

        TextView name = (TextView) findViewById(R.id.user_name);
        TextView last_name = (TextView) findViewById(R.id.user_last_name);
        TextView age = (TextView) findViewById(R.id.user_age);

        name.setText("Name: " + person.getName());
        last_name.setText("Last_Name: " + person.getLastName());
        age.setText("Age: " + String.valueOf(person.getAge()));

    }

}