package ru.denis.java.homework3;

public class RunObstacle implements Obstacle {
    private int distance;


    public RunObstacle(int distance) {
        this.distance = distance;
    }

    @Override
    public boolean tryPass(Participant p) {
        return p.jump(distance);
    }
}
