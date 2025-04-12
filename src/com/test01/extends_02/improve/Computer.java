package com.test01.extends_02.improve;

public class Computer {
    //属性
    private String pan;
    private double memory;
    private int cpu;
    //当父类的属性为私有时，需要建立public方法

    public Computer(int cpu,double memory,String pan){
        this.cpu=cpu;
        this.memory=memory;
        this.pan=pan;
    }//父类属性的初始化，在super调用的时候实现
    //如何使用父类的有参构造器
    public String getDetails(){
      return "内存="+getMemory()+" cpu="+getCpu()+" 硬盘="+getPan();
    }//父类的方法该如何使用

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public double getMemory() {
        return memory;
    }

    public void setMemory(double memory) {
        this.memory = memory;
    }

    public int getCpu() {
        return cpu;
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }
}
