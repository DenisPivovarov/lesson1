package ru.denis.java.homework2;

public class HomeWorkApp2 {
    public static void main(String[] args) {

        Staffer staffer1 = new Staffer("Вася", "1@mail.ru", 24, "Инженер программист");
        Staffer staffer2 = new Staffer("Петя", "2@mail.ru", 24, "Ведущий инженер программист");
        Staffer staffer3 = new Staffer("Максим", "3@mail.ru", 24, "Старший инженер программист");
        Staffer staffer4 = new Staffer("Люда", "4@mail.ru", 24, "Руководитель группы");

        staffer1.info();
        System.out.println("-------------------------------");

        Group group = new Group();
        group.addStaffer(staffer1);
        group.addStaffer(staffer2);
        group.addStaffer(staffer3);
        group.addStaffer(staffer4);
        group.printInfoStaffersAll();
        System.out.println("Печать после удаления 1 работника-------------------------------");
        group.deleteStaff(1);
        group.printInfoStaffersAll();
        System.out.println("Печать после удаления -------------------------------");
        group.allDeleteStaff();
        group.printInfoStaffersAll();
    }
}
