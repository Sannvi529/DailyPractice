package com.test01.Homework13;

public class Student extends Person{

    private String stu_id;

    public Student(String name, char sex, int age, String playGame, String stu_id) {
        super(name, sex, age, playGame);
        this.stu_id = stu_id;
    }

    public String getStu_id() {
        return stu_id;
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }

    @Override
    public void info() {
        System.out.println("学生的信息");
        super.info();
        System.out.println("学号："+stu_id);
        System.out.println(this.play());
    }

    public String play(){
        return this.study()+"\n"+super.play();
    }

    public String study(){
        return "我承诺，我会好好学习的";
    }

    @Override
    public String toString() {
        return "Student{" +
                "stu_id='" + stu_id + '\'' +
                '}'+super.toString();
    }
}
