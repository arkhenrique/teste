package com.relferreira.recyclerview.data;

import com.relferreira.recyclerview.models.Person;
import java.util.ArrayList;
import java.util.List;

public class PersonData {

    public static List<Person> getPersons(){
        List<Person> list = new ArrayList<>();
        list.add(new Person("A", "B", 1));
        list.add(new Person("C", "D", 2));
        list.add(new Person("E", "F", 3));
        list.add(new Person("G", "H", 4));
        list.add(new Person("I", "J", 5));
        list.add(new Person("K", "L", 6));
        list.add(new Person("M", "N", 7));
        list.add(new Person("O", "P", 8));
        list.add(new Person("Q", "R", 9));
        list.add(new Person("S", "T", 10));
        return list;
    }

    public static Person newPerson(){
        return new Person("teste", "este", 20);
    }
}
