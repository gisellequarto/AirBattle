package org.academiadecodigo.tailormoons.gameobjects.enemy;

public enum EnemyType {
    SPACESHIP(4, 20, 10, "CloneWars/assets/spaceship.png"),
    PLANE(2, 20, 10, "CloneWars/assets/enemy-plane.png"),
    SATELLITE(2, 20, 10, "CloneWars/assets/satellite.png"),
    UFO(2, 20, 10, "CloneWars/assets/ufo.png");


    private int health;
    private int scoreValue;
    private String picturePath;
    private int speed;

    EnemyType(int health, int scoreValue, int speed, String picturePath) {
        this.health = health;
        this.scoreValue = scoreValue;
        this.speed = speed;
        this.picturePath = picturePath;
    }

    public int getHealth() {
        return health;
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
