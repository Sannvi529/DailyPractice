package com.test01.Houserent.domain;

/**
 * 一个house对象表明一个房屋的信息
 */
public class House {//1 设置属性
    //2, 给出合适的封装
    //3 toString 打印
    //4 确认 构造器的属性顺序 与 toString是否一致
   private int id;
   private String name;
   private String phone;
   private String address;
   private int rent;//租金
    private String state;//状态

    public House(int id,String name, String phone, String address, int rent, String state) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.rent = rent;
        this.state = state;
    }

    @Override
    public String toString() {
        return id +"\t\t" + name+ "\t"+phone + "\t\t" +  address + "\t" +rent +"\t\t"+ state ;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
