package com.test01.Homework05;

public class Worker extends Employee{
    public Worker(double sal, String name) {
        super(sal, name);
    }
    public void printSal(){
        System.out.print("这是工人的信息 ");
        super.printSal();
    }
}
