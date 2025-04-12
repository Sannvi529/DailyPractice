package com.test01.Homework10;

public class Doctor {
    private String name;
    private int age;

    public Doctor(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public boolean equals(Object object){
        if(this == object ){
            return true;
        }
        //判断object是否为Doctor类或子类
        if(!(object instanceof Doctor)){
            return false;
        }
        Doctor doctor = (Doctor)object;
        return this.name.equals(doctor.name)&&this.age==doctor.age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
