package com.lbg;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchableTreeTest {

    @Test
    void populateContainer() {
        SearchableTree cut = new SearchableTree();
        String expected_value = "selvyn";
        String actual_value = cut.populateContainer();
        assertEquals(expected_value,actual_value);

    }

    @Test
    void findWhenItemThere() {
        SearchableTree cut = new SearchableTree();
        cut.populateContainer();
        int expected_value = 0;
        int actual_value = cut.find("selvyn");
        assertEquals(expected_value,actual_value);
    }

    @Test
    void findItemWhenNotThere(){
        SearchableTree cut = new SearchableTree();
        cut.populateContainer();
        int expected_value = -1;
        int actual_value = cut.find("Adam");
        assertEquals(expected_value,actual_value);
    }

    @Test
    void findIfLastItemWhenItemThereAndInList() {
        SearchableTree cut = new SearchableTree();
        cut.populateContainer();
        boolean expected_value = true;
        boolean actual_value = cut.findIfLastItem("taxes");
        assertEquals(expected_value,actual_value);
    }

    @Test
    void findIfLastItemWhenItemNotInList() {
        SearchableTree cut = new SearchableTree();
        cut.populateContainer();
        boolean expected_value = false;
        boolean actual_value = cut.findIfLastItem("Adam");
        assertEquals(expected_value,actual_value);
    }

    @Test
    void findIfLastItemWhenItemNotThereAndInList() {
        SearchableTree cut = new SearchableTree();
        cut.populateContainer();
        boolean expected_value = false;
        boolean actual_value = cut.findIfLastItem("lecture");
        assertEquals(expected_value,actual_value);
    }

    @Test
    void findIfFirstItemWhenItemThere() {
        SearchableTree cut = new SearchableTree();
        cut.populateContainer();
        boolean expected_value = true;
        boolean actual_value = cut.findIfFirstItem("selvyn");
        assertEquals(expected_value,actual_value);
    }

    @Test
    void findIfFirstItemWhenItemNotThereAndInList() {
        SearchableTree cut = new SearchableTree();
        cut.populateContainer();
        boolean expected_value = false;
        boolean actual_value = cut.findIfFirstItem("taxes");
        assertEquals(expected_value,actual_value);
    }

    @Test
    void findIfFirstItemWhenItemNotInList() {
        SearchableTree cut = new SearchableTree();
        cut.populateContainer();
        boolean expected_value = false;
        boolean actual_value = cut.findIfFirstItem("Adam");
        assertEquals(expected_value,actual_value);
    }
}