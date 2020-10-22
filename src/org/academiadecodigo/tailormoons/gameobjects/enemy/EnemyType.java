package org.academiadecodigo.tailormoons.gameobjects.enemy;

public enum EnemyType {
    SPACESHIP(4, 20, 15, "spaceship.png"),
    PLANE(2, 20, 15, "enemy-plane.png"),
    SATELLITE(2, 20, 15, "satellite.png"),
    UFO(2, 20, 15, "ufo.png");


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
