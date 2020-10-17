package org.academiadecodigo.tailormoons.gameobjects.enemy;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.tailormoons.gameobjects.Crashable;
import org.academiadecodigo.tailormoons.gameobjects.Shootable;

public abstract class Enemy implements Shootable, Crashable {

    private int health = 3;
    private int scoreValue = 10;
    private Picture picture;

    public boolean isDestroyed() {
        return this.health == 0;
    }

}
