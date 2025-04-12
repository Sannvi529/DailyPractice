package com.test01.Homework05;

public class Employee {
    private double sal;
    private int salMonth = 12;
    private String name;

    public Employee(double sal, String name) {
        this.sal = sal;
        this.name = name;
    }
    public void printSal(){
        System.out.println("name "+name+"的全年工资是 "+sal*salMonth);
    }
    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public int getSalMonth() {
        return salMonth;
    }

    public void setSalMonth(int salMonth) {
        this.salMonth = salMonth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
