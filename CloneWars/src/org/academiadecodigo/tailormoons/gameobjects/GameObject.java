package org.academiadecodigo.tailormoons.gameobjects;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public abstract class GameObject {

    protected Picture picture;

    public GameObject(Picture picture) {
        this.picture = picture;
    }

    public Picture getPicture() {
        return picture;
    }

    public abstract void move();

    public void place() {
        this.picture.draw();
    }

    public void recycle() {
        picture.delete();
        picture.translate(0, -(picture.getY()) + 30);

    }



}
