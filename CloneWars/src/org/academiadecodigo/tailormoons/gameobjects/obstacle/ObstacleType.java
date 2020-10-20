package org.academiadecodigo.tailormoons.gameobjects.obstacle;

public enum ObstacleType {

    MOUNTAIN("CloneWars/assets/mountain.png"),
    BUILDING("CloneWars/assets/building.png"),
    HELIX ("CloneWars/assets/helix.png");


    private String picturePath;

    ObstacleType(String picturePath) {
        this.picturePath = picturePath;
    }

    public String getPicturePath() {
        return picturePath;
    }


}
