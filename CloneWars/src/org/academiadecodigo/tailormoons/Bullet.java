package org.academiadecodigo.tailormoons;

import org.academiadecodigo.simplegraphics.graphics.Ellipse;

public class Bullet extends Ellipse {

    private final int BULLET_SIZE = 10;
    private final int BULLET_SPEED = 10;
    //private Ellipse bullet;

    public Bullet(double v, double v1) {
        super(v, v1, 10, 10);
    }

    public void move() {
        super.translate(0, -BULLET_SPEED);
    }

}
