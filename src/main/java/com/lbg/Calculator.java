package com.lbg;

public class Calculator {
    public double add(double x, double y) {
        return x+y;
    }

    public double subtract (double x, double y){
        return x-y;
    }

    public double remainingPercentage (double value, double percent){
        return value - (value*percent/100);
    }
}
