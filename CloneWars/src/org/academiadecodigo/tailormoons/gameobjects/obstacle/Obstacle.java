package org.academiadecodigo.tailormoons.gameobjects.obstacle;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.tailormoons.Grid;
import org.academiadecodigo.tailormoons.gameobjects.GameObject;

public class Obstacle extends GameObject {

    private static int speed = 10;

    private Grid grid;

    public Obstacle(ObstacleType obstacleType, int x) {
        super(new Picture(x, 0, obstacleType.getPicturePath()), obstacleType.name());
    }


    @Override
    public void move() {
        this.picture.translate(0, speed);

    /*    if(this.getY() > grid.getHeight()) {
            this.recycle();
        }*/
    }


}
