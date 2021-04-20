package com.company;

import java.util.ArrayList;
import java.util.List;

public class Storage {
    private List<String> items;
    private  static volatile Storage instance;

    public  List<String> getItems() {

        return items;
    }

    public static Storage getInstance() {
        synchronized (Storage.class) {
            if (instance == null) {
                instance = new Storage();
                System.out.println("creating instance");
            }

            return instance;
        }
    }

    private Storage() {
        items=new ArrayList<>();
    }
    public synchronized void addItem(String item){
        items.add(item);
    }
}
