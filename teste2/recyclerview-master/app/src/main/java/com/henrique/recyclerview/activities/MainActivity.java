package com.henrique.recyclerview.activities;

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

import com.henrique.recyclerview.R;
import com.henrique.recyclerview.adapters.PersonAdapter;
import com.henrique.recyclerview.data.PersonData;
import com.henrique.recyclerview.models.Person;

import java.util.List;

import com.henrique.recyclerview.API.gitapi;
import com.henrique.recyclerview.models.ListGit;
import com.henrique.recyclerview.models.gitmodel;
import com.squareup.okhttp.ResponseBody;

import java.io.IOException;

import retrofit.Call;
import retrofit.Callback;
import retrofit.GsonConverterFactory;
import retrofit.Response;
import retrofit.Retrofit;


public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private PersonAdapter mAdapter;
    private boolean mLayoutGrid;
    private List<Person> mList;

    String API = "http://reqres.in";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        mRecyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(layoutManager);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(API)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        mLayoutGrid = false;
        mList = PersonData.getPersons();
        mAdapter = new PersonAdapter(mList);
        mRecyclerView.setAdapter(mAdapter);

        gitapi git = retrofit.create(gitapi.class);
        Call call = git.getUser(1); //page a ser colocada
        call.enqueue(new Callback<ListGit>() {
            @Override
            public void onResponse(Response<ListGit> response, Retrofit retrofit) {
                ListGit model = response.body();
                int i = model.getPerPage();
                for (int j = 0; j < i; j++) {
                    mList.add(j, PersonData.newPerson(model.getListUsers().get(j).getId(), model.getListUsers().get(j).getFirstName(),
                            model.getListUsers().get(j).getLastName(), model.getListUsers().get(j).getAvatar()));
                    mAdapter.notifyItemInserted(j);
                }

            }

            @Override
            public void onFailure(Throwable t) {
            }
        });






        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
       // fab.setOnClickListener(fabClick);
        fab.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {


                Intent myIntent = new Intent(MainActivity.this, UsersActivity.class);
                startActivity(myIntent);

            }
        });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.action_grid:
                mLayoutGrid = !mLayoutGrid;
                mRecyclerView.setLayoutManager((mLayoutGrid) ? new GridLayoutManager(this, 2) : new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


//nao uilizado!! Para adicionar um novo usuario.
//
//    private View.OnClickListener fabClick = new View.OnClickListener(){
//
//        @Override
//        public void onClick(View v) {
//            mList.add(5, PersonData.newPerson());
//            mAdapter.notifyItemInserted(4);
//        }
//    };

}
