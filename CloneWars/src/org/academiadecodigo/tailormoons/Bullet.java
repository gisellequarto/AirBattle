package org.academiadecodigo.tailormoons;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Bullet {

    private final int BULLET_SIZE = 10;
    private final int BULLET_SPEED = 10;
    private Rectangle bullet;

    public Bullet(double v, double v1) {
        bullet = new Rectangle(v, v1, 3, 10);
        bullet.setColor(Color.GRAY);
        bullet.fill();
    }

    public void move() {
        bullet.translate(0, -BULLET_SPEED);
    }

}
