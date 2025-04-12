package com.test01.Houserent01.service;

import com.test01.Houserent.domain.House;

public class HouseService {
    private House[] house ;
    private int houseNums = 1;
    private int IdCounter = 1;

    public House update(int UpdateId){
        for (int i = 0; i < houseNums; i++) {
            if(UpdateId == house[i].getId()){
                return house[i];
            }
        }
        return null;
    }


    public House findBybId(int findId){
        //遍历数组
        for (int i = 0; i < houseNums; i++) {
            if(findId == house[i].getId()){
                return house[i];
            }
        }
        return null;
    }


    public boolean delHouse(int delId){
        int index = -1;
        //遍历数组
        for (int i = 0; i < houseNums; i++) {
            if(delId == house[i].getId()){
                index = i;
            }
        }
        if(index == -1){
            System.out.println("数组中不存在该房子");
            return false;
        }
        //实现房子的变动
        for (int i = 0; i < houseNums - 1; i++) {
            house[i] = house[i+1];
        }
        house[--houseNums] = null;
        return true;
    }

    public boolean add(House newHouse){
        if(houseNums == house.length){
            System.out.println("===============数组已满，无法再添加=============");
            return false;
        }
        house[houseNums++] = newHouse;
        newHouse.setId(++IdCounter);
        return true;
    }
    public HouseService(int size){
        house = new House[size];//创建房屋 初始化数组大小
        house[0] = new House(1,"jack","123","汝南县",123,"出租");
    }
    public House[] list(){
        return house;
    }
}
