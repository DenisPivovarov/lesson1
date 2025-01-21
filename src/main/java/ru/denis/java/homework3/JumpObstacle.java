package ru.denis.java.homework3;

public class JumpObstacle implements Obstacle {
    private int height;


    public JumpObstacle(int height) {
        this.height = height;
    }

    @Override
    public boolean tryPass(Participant p) {
        return p.run(height);
    }
}
