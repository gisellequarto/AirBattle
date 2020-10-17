package org.academiadecodigo.tailormoons;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Ellipse;

public class Bullet extends Ellipse {

    private final int BULLET_SIZE = 10;
    private final int BULLET_SPEED = 10;

    //private Ellipse bullet;

    public Bullet(double v, double v1, int PICTURE_MIDDLE) {
        super(v + PICTURE_MIDDLE, v1 - 30, 10, 10);
        //this.bullet = new Ellipse(v, v1, 10, 10);

        this.setColor(Color.RED);
        this.fill();

        try {
            moving();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void moving() throws InterruptedException {

        while (this.getY() > 0) {
            Thread.sleep(100);
            this.fill();
            this.move();
        }
    }

    public void move() {
        this.translate(0, -BULLET_SPEED);

    }

}
