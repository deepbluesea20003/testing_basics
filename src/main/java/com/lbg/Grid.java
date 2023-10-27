package com.lbg;

import java.util.ArrayList;

public class Grid {
    private int size = 4; // default size
    private final ArrayList<Item> items = new ArrayList<>();

    public Grid(int size){
        for(int i=0;i<size*size;i++) items.add(null);
    }

    Item peak(int x, int y){
        return items.get(x+y*size); // will be null if nothing there
    }

    private void add(Item i, int x, int y){ // adds item to a position
        items.add(x+y*size,i);
    }
}
