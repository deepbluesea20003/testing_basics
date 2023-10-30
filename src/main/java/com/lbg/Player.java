package com.lbg;

public class Player extends Item{
    public Player(int x, int y) {

        super(x, y);
    }

    @Override
    public String toString() {

        return "The Player";
    }

    // returns -1 if unable to move
    // returns 0 if moved to an empty space
    // returns 1 if found a monster
    // returns 2 if found the treasure

    public int move(int x_move, int y_move, Grid grid){
        int size = grid.getSize();
        int new_x = super.getX() + x_move;
        int new_y = super.getY() + y_move;

        if(new_x < 0 ||new_x >= size || new_y < 0 || new_y >= size) {
            return -1;
        }

        Item new_square = grid.peak(new_x,new_y);
        if(new_square == null){
            this.setX(new_x);
            this.setY(new_y);
            grid.add(new_square,new_x,new_y);
        }
        return 0;
    }
}
