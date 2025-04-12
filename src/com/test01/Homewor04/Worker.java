package com.test01.Homewor04;

public class Worker extends Staff{
    public Worker(String name, double perSalary, int dayWork, double grade) {
        super(name, perSalary, dayWork, grade);
    }
   // +getName()+"工资为"+getDayWork()*getPerSalary()*getGrade()
    public void printSal(){
        System.out.println("员工");
      super.printSal();
    }
}
