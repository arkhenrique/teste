package com.henrique.recyclerview.activities;

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

import com.henrique.recyclerview.R;
import com.henrique.recyclerview.adapters.PersonAdapter;
import com.henrique.recyclerview.data.PersonData;
import com.henrique.recyclerview.models.Person;

import java.util.List;
import android.util.Log;
import org.apache.commons.lang3.StringUtils;
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

        TextView id = (TextView) findViewById(R.id.user_Id);
        TextView name = (TextView) findViewById(R.id.user_name);
        TextView last_name = (TextView) findViewById(R.id.user_last_name);
        TextView avatar = (TextView) findViewById(R.id.user_avatar);

        id.setText("ID: " + person.getId());
        name.setText("Name: " + person.getName());
        last_name.setText("Last_Name: " + person.getLastName());
        avatar.setText("Avatar: " + StringUtils.left(person.getAvatar(), 25) + "...");

    }

}