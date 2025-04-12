package com.test01.Homework05;

import com.sun.media.jfxmediaimpl.HostUtils;

public class Teacher extends Employee{
    private int classDay;
    private double classSal;

    public Teacher(double sal, String name) {
        super(sal, name);
    }

    @Override
    public void printSal() {
        System.out.print("这是老师的信息");
        System.out.println(getName()+" 的工资为 "+(getSal()*getSalMonth()+classSal*classDay));

    }

    public int getClassDay() {
        return classDay;
    }

    public void setClassDay(int classDay) {
        this.classDay = classDay;
    }

    public double getClassSal() {
        return classSal;
    }

    public void setClassSal(double classSal) {
        this.classSal = classSal;
    }
}
