package org.academiadecodigo.tailormoons.gameobjects;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public enum ObstacleType {

    MOUNTAIN("assets/mountain.jpg"),
    ;


    private String picturePath;

    ObstacleType(String picturePath) {
        this.picturePath = picturePath;
    }

    public String getImage() {
        return picturePath;
    }
}
