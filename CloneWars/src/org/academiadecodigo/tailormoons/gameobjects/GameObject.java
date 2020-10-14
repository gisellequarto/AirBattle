package org.academiadecodigo.tailormoons.gameobjects;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public abstract class GameObject {

    private Picture picture;

    public GameObject(Picture picture) {
        this.picture = picture;
    }

    public int getX() {
        return picture.getX();
    }

    public int getY() {
        return picture.getY();
    }

    public abstract void move();

}
