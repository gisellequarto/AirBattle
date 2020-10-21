package org.academiadecodigo.tailormoons;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Ellipse;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Player {

    private Grid grid;
    private static int score = 0;
    private boolean alive = true;
    private String name;
    private Picture plane;
    private int x = 130;
    private int y = 700;
    private final int PICTURE_MIDDLE = 50;
    private boolean canShoot;
    private Fuel fuel;


    public Player(String name, Grid grid) {
        this.grid = grid;
        this.name = name;
        this.plane = new Picture(x, y, "CloneWars/assets/player-plane.png");
        plane.draw();
        fuel = new Fuel();
    }

    public void increaseScore(int score) {
        this.score += score;
    }

    public Bullet shoot() {
        Bullet bullet = new Bullet(plane.getX(), plane.getY(), PICTURE_MIDDLE);
        setCanShoot();
        return bullet;
    }

    public void reShoot(Bullet bullet) {
        bullet.setBulletPos(plane.getX(), plane.getY(), PICTURE_MIDDLE);
    }

    public void die() {
        this.alive = false;
    }

    public Picture getPlane() {
        return this.plane;
    }

    public void translate(double x, double y) {
        int posX = plane.getX() + plane.getWidth();
        if (posX > grid.getWIDTH()) {
            if (x < 0) {
                plane.translate(x, y);
            }
            return;
        }
        if (plane.getX() + x < grid.getPADDING()) {
            if (x > 0) {
                plane.translate(x, y);
            }
            return;
        }
        plane.translate(x, y);
    }

    public void setCanShoot() {
        this.canShoot = !canShoot;
    }

    public boolean canShoot() {
        return canShoot;
    }

    public static int getScore() {
        return score;
    }

    public Fuel getFuel() {
        return fuel;
    }

}