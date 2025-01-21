package ru.denis.java.homework3;

public class Robot implements Participant {
    private String name;
    private int maxRun;
    private int maxHeight;

    public Robot(String name, int maxRun, int maxHeight) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxHeight = maxHeight;
    }

    public boolean run(int distance) {
        if (distance > maxRun) {
            System.out.println("Робот " + name + " не пробежал");
            return false;
        }
        System.out.println("Робот " + name + " пробежал");
        return true;
    }

    public boolean jump(int height) {
        if (height > maxHeight) {
            System.out.println("Робот " + name + " не перепрыгнул");
            return false;
        }
        System.out.println("Робот " + name + " перепрыгнул");
        return true;
    }
}
