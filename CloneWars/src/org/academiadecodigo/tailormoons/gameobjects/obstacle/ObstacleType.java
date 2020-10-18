package org.academiadecodigo.tailormoons.gameobjects.obstacle;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public enum ObstacleType {

    MOUNTAIN("assets/mountain.png"),
    BUILDING("assets/building.png"),
    PYRAMID ("assets/miniPyramid.png");


    private String picturePath;

    ObstacleType(String picturePath) {
        this.picturePath = picturePath;
    }

    public String getImage() {
        return picturePath;
    }
}
