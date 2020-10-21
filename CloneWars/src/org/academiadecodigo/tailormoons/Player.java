package org.academiadecodigo.tailormoons;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Ellipse;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Player {

    private Grid grid;
    private int score = 0;
    private int fuel = 100;
    private boolean alive = true;
    private String name;
    private Picture plane;
    private int x = 130;
    private int y = 700;
    private final int PICTURE_MIDDLE = 50;
    private boolean canShoot;


    public Player(String name, Grid grid) {
        this.grid = grid;
        this.name = name;
        this.plane = new Picture(x, y, "CloneWars/assets/player-plane.png");
        plane.draw();
        playerInfo();
    }

    public void increaseScore(int score) {
        this.score += score;
    }

    public Bullet shoot() {
        Bullet bullet = new Bullet(plane.getX(), plane.getY(), PICTURE_MIDDLE);
        setCanShoot();
        return bullet;
    }

    public void reShoot(Bullet bullet){
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
        if(plane.getX() + x < grid.getPADDING()){
            if(x > 0){
                plane.translate(x,y);
            }
            return;
        }
        plane.translate(x,y);
    }

    public void setCanShoot() {
        this.canShoot = !canShoot;
    }

    public boolean canShoot() {
        return canShoot;
    }

    public void playerInfo() {
        Text fuelText = new Text(50, 16, "FUEL ");
        fuelText.setColor(Color.WHITE);
        fuelText.draw();

        if (fuel >= 20) {
            Rectangle status = new Rectangle(90, 19, 10, 10);
            status.setColor(Color.YELLOW);
            status.fill();
        }
        if (fuel >= 40) {
            Rectangle status = new Rectangle(100, 19, 10, 10);
            status.setColor(Color.YELLOW);
            status.fill();
        }
        if (fuel >= 60) {
            Rectangle status = new Rectangle(110, 19, 10, 10);
            status.setColor(Color.ORANGE);
            status.fill();
        }
        if (fuel >= 80) {
            Rectangle status = new Rectangle(120, 19, 10, 10);
            status.setColor(Color.ORANGE);
            status.fill();
        }

        Text scoreText = new Text(180, 16, ("SCORE: " + score) );
        scoreText.setColor(Color.WHITE);
        scoreText.draw();
    }
}
