package ru.denis.java.homework2;

public class Staffer {
    private String name;
    private String email;
    private int age;
    private String post;

    public Staffer(String name, String email, int age, String post) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.post = post;
    }

    public void info (){
        System.out.println("Имя - " + name + "; e-mail - " +email + "; Возраст - " + age + "; Должность - " + post );
    }
}
