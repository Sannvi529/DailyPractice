package com.test01.Homework05;

public class Scientist extends Employee{
    private double bonus;

    public Scientist(double sal, String name) {
        super(sal, name);
    }

    @Override
    public void printSal() {
        System.out.print("这是科学家的信息");
        System.out.println(getName()+" 的工资 "+(getSal()*getSalMonth()+bonus));
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
