package com.test01.Object;

public class Test {
    public static void main(String[] args) {
        //（1）加载类信息
        //（2）初始化  2.1默认初始化 。2.2显示初始化 2.3构造器初始化
        //（3）返回类地址
       Person person = new Person(18,"张英琪");
       Person person1 = new Person(18,"张英琪");
        System.out.println(person==person1);
        System.out.println(person.equals(person1));

    }
}
class Person{
    private int age;
    private String name;
    public Person(int age,String name){
        this.name=name;
        this.age=age;
    }
    public boolean equals(Object obj){
        //判断如果比较的两个对象是同一个对象，则直接返回true
        if(this == obj){
            return true;
        }
        if(obj instanceof Person){//类型相同
            //进行 向下转型 目的：得到obj的各个属性
            Person p = (Person)obj;
            return this.name.equals(p.name)&&this.age==(p.age);
        }
        return false;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
