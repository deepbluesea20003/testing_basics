package com.lbg;

abstract public class Item {
    private int x;
    private int y;

    public Item(int x, int y){
        this.x=x;
        this.y=y;
    }

    @Override
    abstract public String toString();

    public int getY() {

        return y;
    }

    public void setY(int y) {

        this.y = y;
    }

    public int getX() {

        return x;
    }

    public void setX(int x) {

        this.x = x;
    }
}
