package org.academiadecodigo.tailormoons.gameobjects.enemy;

public enum EnemyType {
    SPACESHIP(5, 10, 10, "CloneWars/assets/spaceship.png"),
    PLANE(2, 20, 10, "CloneWars/assets/enemy-plane.png"),
    HELICOPTER(2, 20, 10, "CloneWars/assets/aviao4.jpg"),
    BOAT(2, 20, 10, "assets/aviao4.png"),;

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
