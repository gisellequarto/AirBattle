package org.academiadecodigo.tailormoons;

import org.academiadecodigo.simplegraphics.graphics.Movable;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Player extends Picture {

    private int score;
    private boolean alive = true;
    private String name;
    private Picture plane;
    private int x = 130;
    private int y = 500;
    private final int PICTURE_MIDDLE = 50;


    public Player(String name) {
        this.name = name;
        this.plane = new Picture(x, y, "assests/aviao4.jpg");
        plane.draw();
    }

    public void increaseScore(int score) {
        this.score += score;
    }

    public void shoot() {
        new Bullet(plane.getX(), plane.getY(), PICTURE_MIDDLE);

    }

    public void die() {
        this.alive = false;
    }


    @Override
    public void translate(double v, double v1) {
        plane.translate(v, v1);
        plane.draw();
    }
}
