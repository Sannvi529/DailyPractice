package com.test01.Homewor04;

public class Test {
    public static void main(String[] args) {
        Executive executive = new Executive("张英琪",200,20,1.2);
        executive.setReward(1000);
//        executive.introduce();

        executive.printSal();
        Worker worker = new Worker("刘备",100,20,1.0);
        worker.printSal();
    }
}
