package org.academiadecodigo.tailormoons.gameobjects.obstacle;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.tailormoons.Grid;
import org.academiadecodigo.tailormoons.gameobjects.GameObject;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Obstacle extends GameObject {

    private static int speed = 10;
    private static List<Obstacle> recycledObstacles = new LinkedList<>();
    private static List<Obstacle> placedObstacles = new LinkedList<>();

    private ObstacleType type;
    private final Grid grid;

    private Obstacle(ObstacleType type, Grid grid) {
        super(new Picture(0, 0, type.getImage()));
        this.type = type;
        this.grid = grid;
    }

    public static void placeObstacle(ObstacleType type, Grid grid, int posX) {
        for(Obstacle obstacle : recycledObstacles) {
            if(obstacle.getType() == type) {
                obstacle.place(posX);
                return;
            }
        }
        System.out.println("Created new Instance of: " + type.name());
        new Obstacle(type, grid).place(posX);
    }

    public static void moveAllObstacles() {
        List<Obstacle> obstacles = new LinkedList<>(placedObstacles);
        for(Obstacle obstacle : obstacles) {
            obstacle.move();
        }
    }

    private void place(int posX) {
        int yMove = 0;
        if(this.getY() != 0) {
            yMove = this.getY() > 0 ? -this.getY() : this.getY();
        }
        int xMove = 0;
        if(this.getX() != posX) {
            xMove = posX - this.getX();
        }
        this.picture.translate(xMove, yMove);
        recycledObstacles.remove(this);
        placedObstacles.add(this);
        this.picture.draw();
    }

    @Override
    public void move() {
        this.picture.translate(0, speed);

        if(this.getY() > grid.getHeight()) {
            this.picture.delete();
            placedObstacles.remove(this);
            recycledObstacles.add(this);
        }
    }

    public ObstacleType getType() {
        return type;
    }
}
