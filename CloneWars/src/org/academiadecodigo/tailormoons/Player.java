package org.academiadecodigo.tailormoons;

import org.academiadecodigo.simplegraphics.graphics.Movable;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Player extends Picture {

    private int score;
    private boolean alive = true;
    private String name;
    //private Position pos;

    public Player(String name){
        this.name = name;
    }

    public void increaseScore (int score){
        this.score += score;
    }

    public void shoot (){
        new Bullet(this.getX(), this.getY());
    }

    public void die(){
        this.alive = false;
    }


    @Override
    public void translate(double v, double v1) {

    }
}
