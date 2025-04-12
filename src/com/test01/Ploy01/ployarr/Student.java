package com.test01.Ploy01.ployarr;

public class Student extends Person{
    private int score;

    public Student(String name, int age, int score) {
        super(name, age);
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    public String say(){//重写父类say（）方法
        return super.say()+" score="+score;
    }
    public void study(){
        System.out.println("学生"+getName()+"正在学习java。。。");
    }
}
