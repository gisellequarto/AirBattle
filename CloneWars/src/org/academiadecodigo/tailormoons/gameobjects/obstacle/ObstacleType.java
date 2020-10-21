package org.academiadecodigo.tailormoons.gameobjects.obstacle;

public enum ObstacleType {

    MOUNTAIN("CloneWars/assets/mountain.png", 5),
    BUILDING("CloneWars/assets/building.png", 5),
    HELIX ("CloneWars/assets/helix.png", 5);


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
