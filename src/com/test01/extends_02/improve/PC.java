package com.test01.extends_02.improve;

public class PC extends Computer{
    private String brand;

    public PC(int cpu, double memory, String pan, String brand) {
        super(cpu, memory, pan);//父类属性初始化
        this.brand = brand;//子类属性的初始化
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void info(){
        System.out.println(getDetails()+" brand="+getBrand());
    }
}
