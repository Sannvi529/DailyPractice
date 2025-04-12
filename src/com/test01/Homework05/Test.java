package com.test01.Homework05;

public class Test {
    public static void main(String[] args) {
        Teacher teacher = new Teacher(2000,"jack");
        teacher.setClassDay(100);
        teacher.setClassSal(100);
        teacher.printSal();

        Worker worker = new Worker(5000,"mack");
        worker.printSal();

        Scientist scientist = new Scientist(8000,"smith");
        scientist.setBonus(200000);
        scientist.printSal();
    }
}
