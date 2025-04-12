package com.test;

import java.util.Scanner;


/**
 * @author 张英琪
 */
public class TestArray01 {
    public static void main(String[] args) {
        int arr [] = {12,1,2,3};
        FindLocate();
        int addIndex = 2;
        Scanner scanner = new Scanner(System.in);
        int addNum = scanner.nextInt();
        addElem(addIndex,addNum,arr);
        printArray(arr);
    }
    public static void addElem(int index,int num,int[]arr){
        int i =0;
        for ( i = index; i < arr.length; i++) {
            arr[i+1] = arr[i];
        }
        arr[i] = num;
    }
    public static void printArray(int []arr){
        for (int i = 0; i < arr.length; i++) {
           if(i!=arr.length-1){
               System.out.print(arr[i]+',');
           }else{
               System.out.print(arr[i]);
           }
        }
    }
    //查询指定位置的元素
    public static void FindElem(){
        //给定一个数组
        int arr [] = {12,1,2,3};
        System.out.println(arr[1]);
        //上面的数组体现了数组的优点，按照位置查找元素时，直接一步到位，效率非常高
    }
    //查询指定元素的位置
    public static void FindLocate(){
        //给定一个数组
        int arr [] = {1,2,3,2,5};
        //功能：查询指定元素的索引；
        int index = -1;//这个数值只要不是数组的索引即可
        for(int i = 0;i < arr.length;i++){
            if(arr[i] == 2){
                index = i;//只要找到元素，那么index就变成了i
                break;//只要找到元素循环就停止
            }
        }
        if(index !=-1){
            System.out.println("元素对应的索引："+index);
        }else{
            System.out.println("无此元素");
        }
    }
}
