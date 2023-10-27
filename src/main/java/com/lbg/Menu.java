package com.lbg;

import java.util.ArrayList;

public class Menu {
    public void run(){

        System.out.println("How big would you like your grid?");
        int size = Integer.parseInt(IO.getUserInput("Size of grid: "));

        Grid grid = new Grid(size);


        System.out.println("Welcome to the maze game. Enter QUIT to finish the game at anytime");
        String move = IO.getUserInput("Which direction would you like to go?");



        while(move.compareToIgnoreCase("quit") != 0){

        }
    }
}
