package com.lbg;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchableTreeTest {

//    @Test
//    void populateContainer() {
//        DataStore data = new DataStore();
//        SearchableTree cut = new SearchableTree(data);
//        String expected_value = "selvyn";
//        String actual_value = cut.populateContainer();
//        assertEquals(expected_value,actual_value);
//    }

    @BeforeEach
    void setup(){
        DataStore data = new DataStore();
        SearchableTree cut = new SearchableTree(data);
    }

    @Test
    void findWhenItemThere() {
        DataStore data = new DataStore();
        SearchableTree cut = new SearchableTree(data);
        cut.populateContainer();
        int expected_value = 0;
        int actual_value = cut.find("selvyn");
        assertEquals(expected_value,actual_value);
    }

    @Test
    void findItemWhenNotThere(){
        DataStore data = new DataStore();
        SearchableTree cut = new SearchableTree(data);
        cut.populateContainer();
        int expected_value = -1;
        int actual_value = cut.find("Adam");
        assertEquals(expected_value,actual_value);
    }

    @Test
    void findIfLastItemWhenItemThereAndInList() {
        DataStore data = new DataStore();
        SearchableTree cut = new SearchableTree(data);
        cut.populateContainer();
        boolean expected_value = true;
        boolean actual_value = cut.findIfLastItem("taxes");
        assertEquals(expected_value,actual_value);
    }

    @Test
    void findIfLastItemWhenItemNotInList() {
        DataStore data = new DataStore();
        SearchableTree cut = new SearchableTree(data);
        cut.populateContainer();
        boolean expected_value = false;
        boolean actual_value = cut.findIfLastItem("Adam");
        assertEquals(expected_value,actual_value);
    }

    @Test
    void findIfLastItemWhenItemNotThereAndInList() {
        DataStore data = new DataStore();
        SearchableTree cut = new SearchableTree(data);
        cut.populateContainer();
        boolean expected_value = false;
        boolean actual_value = cut.findIfLastItem("lecture");
        assertEquals(expected_value,actual_value);
    }

    @Test
    void findIfFirstItemWhenItemThere() {
        DataStore data = new DataStore();
        SearchableTree cut = new SearchableTree(data);
        cut.populateContainer();
        boolean expected_value = true;
        boolean actual_value = cut.findIfFirstItem("selvyn");
        assertEquals(expected_value,actual_value);
    }

    @Test
    void findIfFirstItemWhenItemNotThereAndInList() {
        DataStore data = new DataStore();
        SearchableTree cut = new SearchableTree(data);
        cut.populateContainer();
        boolean expected_value = false;
        boolean actual_value = cut.findIfFirstItem("taxes");
        assertEquals(expected_value,actual_value);
    }

    @Test
    void findIfFirstItemWhenItemNotInList() {
        DataStore data = new DataStore();
        SearchableTree cut = new SearchableTree(data);
        cut.populateContainer();
        boolean expected_value = false;
        boolean actual_value = cut.findIfFirstItem("Adam");
        assertEquals(expected_value,actual_value);
    }
}