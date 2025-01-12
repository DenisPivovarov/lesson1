package ru.denis.java.homework2;


import java.util.Arrays;

public class Group {
    private int counter = 0;
    private String nameGroup;
    private Staffer[] staffers = new Staffer[10];


    public void addStaffer(Staffer staffer) {
        if (counter < 10) {
            staffers[counter] = staffer;
            counter++;
        }
    }


    public void deleteStaff(int index) {
        if (index < counter) {
            for (int i = index; i < staffers.length - 1; i++) {
                staffers[i] = staffers[i + 1];
            }
            counter--;
        }
    }

    public void allDeleteStaff() {
        for (int i = 0; i < staffers.length - 1; i++) {
            staffers[i] = null;
        }
        counter = 0;
    }

    public void printInfoStaffersAll() {
        for (int i = 0; i < counter; i++) {
            staffers[i].info();
        }
    }


}
