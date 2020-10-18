package org.academiadecodigo.tailormoons.gameobjects.obstacle;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.tailormoons.Grid;
import org.academiadecodigo.tailormoons.gameobjects.GameObject;

public class Obstacle extends GameObject {

    private static int speed = 10;

    private ObstacleType type;
    private final Grid grid;

    public Obstacle(ObstacleType type, Grid grid) {
        super(new Picture(0, 0, type.getImage()), type.name());
        this.type = type;
        this.grid = grid;
    }


    @Override
    public void move() {
        this.picture.translate(0, speed);

        if(this.getY() > grid.getHeight()) {
            this.recycle();
        }
    }

    public ObstacleType getType() {
        return type;
    }
}
