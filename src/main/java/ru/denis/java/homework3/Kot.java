package ru.denis.java.homework3;

public class Kot {
    private String name;
    private int maxRun;
    private int maxHeight;

    public Kot(String name, int maxRun, int maxHeight) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxHeight = maxHeight;
    }

    public void run (int distance){
        System.out.println("Кот пробежал " + distance);
    }

    public void jump (int height){
        System.out.println("Кот прыгнул на " + height);
    }


    public int getMaxRun() {
        return maxRun;
    }

    public int getMaxHeight() {
        return maxHeight;
    }
}
