package com.test01.Houserent.service;

import com.test01.Houserent.domain.House;

/**
 * 房屋列表的完成
 * 1.创建数组 House[] house
 * 2.数组尺寸-构造器
 * 3.数组内部的数据获得 - 构造器
 * 定义House【】，保存house
 * 1.相应HouseView的调用
 * 2.完成对数据的crud
 */
public class HouseService {
    private House[] house;//房屋数组
    private int houseNums = 1;
    private int idCounter = 1;


    //findById 对象 House，返回对象或null

    public House findById(int findId){
        for (int i = 0; i < houseNums; i++) {
            //遍历数组
            if(findId == house[i].getId()){
                return house[i];
            }
        }
    return null;
    }

    public HouseService(int size) {//构造器
        house = new House[size];//创建房屋对象，指定数组大小
        house[0] = new House(1,"jack","123","汝南县",222,"未出租");
    }

    public boolean deleteHouse(int delId){
        //先找到删除的房屋信息对应的下标
        //下标和编号不是一回事
        int index = -1;
        for (int i = 0; i < houseNums; i++) {
            if(delId == house[i].getId()){
                index = i;//用index记录i
            }
        }
        if(index == -1){
            //说明delId在数组中不存在
            System.out.println("数组中不存在该房子");
            return false;
        }
        //将前一个元素删除后一个补上
        for (int i = 0; i < houseNums - 1; i++) {
            house[i] = house[i+1];
        }
        //最后一个元素house[houseNums-1] 置空  再自减
        house[--houseNums] = null;
        //houseNums--;
        return true;

    }
    public boolean add(House newHouse){
        //判断是否还可以继续添加（我们暂时不考虑扩容问题）
        if(houseNums == house.length){
            System.out.println("数组已满，无法再添加");
            return false;
        }
        //将newHouse对象加入到house中
        //后置++原因，默认数组下标0 开始，houseNums=1，则新加入的房子从1开始，再++
        house[houseNums++] = newHouse;
        //我们程序员需要设计一个id自增长的的机制,然后更新newHouse的id
        //先++原因 默认idCounter=1，新增ID必定为2
        newHouse.setId(++idCounter);
        return true;
    }
    public House[] list(){
        return house;
    }

    public House[] getHouse() {
        return house;
    }

    public void setHouse(House[] house) {
        this.house = house;
    }
}
