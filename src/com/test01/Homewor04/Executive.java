package com.test01.Homewor04;

public class Executive extends Staff{
    private double reward;

    public Executive(String name, double perSalary, int dayWork,double grade) {
        super(name, perSalary, dayWork,grade);

    }

    public double getReward() {
        return reward;
    }

    public void setReward(double reward) {
        this.reward = reward;
    }
//    public String introduce(){
////        System.out.println("这是经理的介绍");
//        return ("经理"+getName()+"的工资为"+super.printSal()+reward+"，奖金为"+reward);
//    }
    //getDayWork()*getPerSalary()*getGrade()
    public void printSal(){
        System.out.println("经理 "+getName()+"工资为"+(getDayWork()*getPerSalary()*getGrade()+reward));

    }

}
