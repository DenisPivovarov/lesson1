package ru.denis.java.homework3;

public class Chelovek {
    private String name;
    private int maxRun;
    private int maxHeight;

    public Chelovek(String name, int maxRun, int maxHeight) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxHeight = maxHeight;
    }

    public void run (int distance){
        System.out.println("Человек пробежал " + distance);
    }

    public void jump (int height){
        System.out.println("Человек прыгнул на " + height);
    }


    public int getMaxRun() {
        return maxRun;
    }

    public int getMaxHeight() {
        return maxHeight;
    }
}
