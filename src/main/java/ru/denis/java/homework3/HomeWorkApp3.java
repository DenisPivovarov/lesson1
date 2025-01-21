package ru.denis.java.homework3;

public class HomeWorkApp3 {
    public static void main(String[] args) {
        var participants = new Participant[]{
                new Robot("Валли", 1, 1),
                new Robot("Терминатор", 10, 10),
                new Chelovek("Вася", 4, 5),
                new Chelovek("Петя", 5, 6),
                new Kot("Барсик", 6, 8)
        };

        var obstacles = new Obstacle[]{
                new JumpObstacle(5),
                new JumpObstacle(5),
                new RunObstacle(6)
        };


        for (var p : participants) {
            for (var o : obstacles)
                if (!o.tryPass(p)) {
                    break;
                }
        }
    }
}
