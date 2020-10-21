package org.academiadecodigo.tailormoons.gameobjects.obstacle;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.tailormoons.Grid;
import org.academiadecodigo.tailormoons.gameobjects.Crashable;
import org.academiadecodigo.tailormoons.gameobjects.GameObject;

public class Obstacle extends GameObject implements Crashable {

    ObstacleType type;

    public Obstacle(ObstacleType obstacleType, int x) {
        super(new Picture(x, 0, obstacleType.getPicturePath()));
        type = obstacleType;
    }


    @Override
    public void move() {
        this.picture.translate(0, type.getSpeed());

        if (picture.getMaxY() >= Grid.HEIGHT) {
            this.recycle();

        }
    }

}
