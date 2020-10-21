package org.academiadecodigo.tailormoons;

import org.academiadecodigo.simplegraphics.graphics.Color;

import org.academiadecodigo.simplegraphics.graphics.Ellipse;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;


public class Bullet {

    private final int BULLET_SIZE = 10;
    private final int BULLET_SPEED = 10;
    private Ellipse bullet;
    private boolean canReuse;

    public Bullet(double v, double v1, int PICTURE_MIDDLE) {
        bullet = new Ellipse(v + PICTURE_MIDDLE, v1 - 30, BULLET_SIZE, BULLET_SIZE);
        bullet.setColor(Color.RED);
        bullet.fill();


    }

    public void move() {
        bullet.translate(0, -BULLET_SPEED);
        if (bullet.getY() <= 0) {
            bullet.delete();
            canReuse = true;
        }
    }

    public boolean getCanReuse(){
        return canReuse;
    }

    public void setBulletPos(int x, int y, int PICTURE_MIDDLE) {
        this.bullet.translate(x - this.bullet.getX() + PICTURE_MIDDLE, y - this.bullet.getY());
        this.canReuse = false;
        this.bullet.fill();
    }
}
