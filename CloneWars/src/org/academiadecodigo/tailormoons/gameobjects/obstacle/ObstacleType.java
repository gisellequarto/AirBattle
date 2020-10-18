package org.academiadecodigo.tailormoons.gameobjects.obstacle;

public enum ObstacleType {

    MOUNTAIN("CloneWars/assets/mountain.png"),
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
