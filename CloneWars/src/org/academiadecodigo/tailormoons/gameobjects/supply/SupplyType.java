package org.academiadecodigo.tailormoons.gameobjects.supply;

public enum SupplyType {
    GAS_STATION(5, 8, "CloneWars/assets/gasStation.png"),
    BEER(5, 8, "CloneWars/assets/beer.png");

    private int scoreValue;
    private String picturePath;
    private int speed;

    SupplyType(int scoreValue, int speed, String picturePath) {
        this.scoreValue = scoreValue;
        this.speed = speed;
        this.picturePath = picturePath;
    }

    public int getScoreValue() {
        return scoreValue;
    }

    public int getSpeed() {
        return speed;
    }

    public String getPicturePath() {
        return picturePath;
    }
}
