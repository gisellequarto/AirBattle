package org.academiadecodigo.tailormoons.gameobjects.obstacle;

public enum ObstacleType {

    MOUNTAIN("mountain.png", 5),
    BUILDING("building.png", 5),
    HELIX ("helix.png", 5);


    private String picturePath;
    private int speed;

    ObstacleType(String picturePath, int speed) {
        this.picturePath = picturePath;
        this.speed = speed;
    }

    public String getPicturePath() {
        return picturePath;
    }

    public int getSpeed() {
        return speed;
    }
}
