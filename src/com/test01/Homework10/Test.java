package com.test01.Homework10;

public class Test {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("张英琪",18);
        Doctor doctor1 = new Doctor("jack",18);
        System.out.println(doctor.equals(doctor1));
    }
}
