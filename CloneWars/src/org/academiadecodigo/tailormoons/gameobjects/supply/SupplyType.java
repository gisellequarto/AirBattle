package org.academiadecodigo.tailormoons.gameobjects.supply;

public enum SupplyType {
    GAS_STATION(5, 8, 500, "CloneWars/assets/gasStation.png"),
    BEER(5, 8, 1000,  "CloneWars/assets/beer.png");

    private int scoreValue;
    private String picturePath;
    private int speed;
    private int fuelPump;

    SupplyType(int scoreValue, int speed, int fuelPump, String picturePath) {
        this.scoreValue = scoreValue;
        this.speed = speed;
        this.fuelPump = fuelPump;
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

    public int getFuelPump() {
        return fuelPump;
    }
}
