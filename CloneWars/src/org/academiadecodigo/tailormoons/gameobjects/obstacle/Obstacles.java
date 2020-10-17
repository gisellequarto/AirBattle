package org.academiadecodigo.tailormoons.gameobjects.obstacle;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.tailormoons.gameobjects.GameObject;

public class Obstacles extends GameObject {

    public Obstacles(ObstacleType type, int posX, int posY) {
        super(new Picture(posX, posY, type.getImage()));
    }

    @Override
    public void move() {

    }
}
