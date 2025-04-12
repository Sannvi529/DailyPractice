package com.test01.Homework13;

public class Teacher extends Person{
    private int workTime;

    public Teacher(String name, char sex, int age, String playGame, int workTime) {
        super(name, sex, age, playGame);
        this.workTime = workTime;
    }

    @Override
    public void info() {
        System.out.println("老师的信息");
        super.info();
        System.out.println("工龄："+workTime);
        System.out.println(this.teach()+"\n"+this.play());
    }

    public String teach(){
        return "我承诺，我会好好教学的";
    }
    public String play(){
        return super.play();
    }

    public int getWorkTime() {
        return workTime;
    }

    public void setWorkTime(int workTime) {
        this.workTime = workTime;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "workTime=" + workTime +
                '}'+super.toString();
    }
}
