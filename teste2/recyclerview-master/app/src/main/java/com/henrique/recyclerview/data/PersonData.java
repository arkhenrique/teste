package com.henrique.recyclerview.data;

import com.henrique.recyclerview.models.Person;
import java.util.ArrayList;
import java.util.List;
import com.loopj.android.http.*;
import cz.msebera.android.httpclient.Header;

public class PersonData {
    AsyncHttpClient client = new AsyncHttpClient();
    RequestParams params = new RequestParams();
    private int id;
    private String name;
    private String last_name;
    private String avatar;



    static List<Person> list = new ArrayList<>();
    public static List<Person> getPersons(){

        return list;
    }

    public static Person newPerson(int id, String name, String last_name, String avatar){
        return new Person(id, name, last_name, avatar);
    }
}
