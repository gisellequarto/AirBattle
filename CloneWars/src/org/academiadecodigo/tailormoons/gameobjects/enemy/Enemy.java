package org.academiadecodigo.tailormoons.gameobjects.enemy;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.tailormoons.gameobjects.Crashable;
import org.academiadecodigo.tailormoons.gameobjects.GameObject;
import org.academiadecodigo.tailormoons.gameobjects.Shootable;

public abstract class Enemy extends GameObject implements Shootable, Crashable {

    private int health = 3;
    private int scoreValue = 10;
    private Picture picture;

    public Enemy(Picture picture) {
        super(picture);
    }

    public boolean isDestroyed() {
        return this.health == 0;
    }

}
