package com.example.user.myapplication;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import android.util.Log;

public class Users {

    private static final String TAG = "QuickNotesUSER";

    public static void list(Integer Paginas) {

        // create map to store
        Map<Integer, List<String>> map = new HashMap<Integer, List<String>>();

        // create list one and store values
        List<String> valSetOne = new ArrayList<String>();
        valSetOne.add("Apple");
        valSetOne.add("Aeroplane");
        valSetOne.add("Aeroplane");

        // create list two and store values
        List<String> valSetTwo = new ArrayList<String>();
        valSetTwo.add("Bat");
        valSetTwo.add("Banana");
        valSetTwo.add("Aeroplane");

        // create list three and store values
        List<String> valSetThree = new ArrayList<String>();
        valSetThree.add("Cat");
        valSetThree.add("Car");
        valSetThree.add("Aeroplane");

        // put values into map
       // map.put("A", valSetOne);
        map.put(1, valSetOne);
        map.put(2, valSetTwo);
        map.put(3, valSetThree);
        Log.d(TAG, "PASSOU POR AQUI");
        // iterate and display values
        System.out.println("Fetching Keys and corresponding [Multiple] Values \n");
        for (Map.Entry<Integer, List<String>> entry : map.entrySet()) {
            Integer key = entry.getKey();
            List<String> values = entry.getValue();
            System.out.println("Id = " + key + " \n First_name: " + values.get(0)
                                             + " \n Last_name: "  + values.get(1)
                                             + " \n Avatar: "     + values.get(2)
                                             + "\n");
        }
        Log.d(TAG, "FINALIZOU");
    }
}
