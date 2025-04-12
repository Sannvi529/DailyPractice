package com.test01.OverrideExercise;

public class Over {
    public static void main(String[] args) {
        Person person = new Person("张英琪",18);
        System.out.println(person.say());
        Student student = new Student("张英琪",13,"12345",590);
        System.out.println(student.say());

    }
}
