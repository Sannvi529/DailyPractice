package com.test01.Houserent01.service;

import com.sun.media.jfxmediaimpl.HostUtils;
import com.test01.Houserent.domain.House;
import com.test01.Houserent.utils.Utility;

//public class Test {
//    private House[] house;
//    private int HouseNums = 1;
//    private int IdHouse = 1;
//    //add信息
//    public void addHouse1(){
//        System.out.println("-----------增加机制----------");
//        System.out.printf("姓名：");
//        String name  = Utility.readString(4);
//        System.out.printf("房号：");
//        String phone = Utility.readString(7);
//        System.out.printf("地址：");
//        String address = Utility.readString(7);
//        System.out.printf("租金：");
//        String rent = Utility.readString(7);
//        System.out.printf("状态：");
//        String state = Utility.readString(4);
//        House newHouse = new House(name,phone,address,rent,state);
//        //判断数组是否满了
//        if(add(newHouse)){
//            System.out.println("添加成功");
//        }else{
//            System.out.println("添加失败");
//        }
//
//
//    }
//    public boolean add(House newHouse){
//        if(HouseNums == house.length){
//            System.out.println("数组已满");
//            return false;
//        }
//        house[HouseNums++] = newHouse;
//        newHouse.setId(++IdHouse);
//        return true;
//    }
//}
