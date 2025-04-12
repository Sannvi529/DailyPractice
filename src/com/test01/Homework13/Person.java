package com.test01.Homework13;

public class Person {
    private String name;
    private char sex;
    private int age;
    private String playGame;

    public Person(String name, char sex, int age,String playGame) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.playGame = playGame;
    }
    public void info(){
        System.out.println("姓名："+name+"\n"+"性别："+sex+"\n"+"年龄："+age);
    }
    public String play(){
        return name+"爱玩"+playGame;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPlayGame() {
        return playGame;
    }

    public void setPlayGame(String playGame) {
        this.playGame = playGame;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", playGame='" + playGame + '\'' +
                '}';
    }
}
