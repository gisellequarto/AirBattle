package org.academiadecodigo.tailormoons.gameobjects;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public enum ObstacleType {

    BUILDING("assests/predio.jpg");
    //SATELLITE();

    private String picturePath;

    ObstacleType(String picturePath) {
        this.picturePath = picturePath;
    }

    public String getImage() {
        return picturePath;
    }
}
