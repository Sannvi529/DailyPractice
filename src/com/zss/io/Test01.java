package com.zss.io;

/**
 * @author 张英琪
 */
public class Test01 {
    public static void main(String[] args) {
        enumTest autumn = enumTest.AUTUMN;
        //获取对象的名字tostring
        System.out.println(autumn.toString());
        //values 获取枚举类中每一个对象的名字
        enumTest[] values = enumTest.values();
        for(enumTest a :values){
            System.out.println(a);
        }
        System.out.println(enumTest.valueOf("AUTUMN"));

    }
}
