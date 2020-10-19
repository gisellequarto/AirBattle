package org.academiadecodigo.tailormoons;

import org.academiadecodigo.simplegraphics.graphics.Color;

import org.academiadecodigo.simplegraphics.graphics.Ellipse;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;


public class Bullet{

    private final int BULLET_SIZE = 10;
    private final int BULLET_SPEED = 10;
    private Ellipse bullet;

    public Bullet(double v, double v1, int PICTURE_MIDDLE) {
        bullet = new Ellipse(v + PICTURE_MIDDLE, v1 - 30, BULLET_SIZE, BULLET_SIZE);
        bullet.setColor(Color.RED);
        bullet.fill();

        try {
            moving();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void moving() throws InterruptedException {

        while (bullet.getY() > 0) {
            Thread.sleep(100);
            bullet.fill();
            this.move();
        }
    }

    public void move() {
        bullet.translate(0, -BULLET_SPEED);

    }




}
