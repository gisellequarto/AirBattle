package org.academiadecodigo.tailormoons.gameobjects;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Obstacles extends GameObject {

    public Obstacles(ObstacleType type, int posX, int posY) {
        super(new Picture(posX, posY, type.getImage()));
    }

    @Override
    public void move() {

    }
}
