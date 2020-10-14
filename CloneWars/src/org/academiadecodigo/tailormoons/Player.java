package org.academiadecodigo.tailormoons;

public class Player {

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

    /*public void shoot (){
        new Bullet(this.pos);
    }*/

    public void die(){
        this.alive = false;
    }
}
