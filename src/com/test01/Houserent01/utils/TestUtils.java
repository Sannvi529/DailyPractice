package com.test01.Houserent01.utils;

public class TestUtils {
    public static void main(String[] args) {
        String s = Utility.readString(3);
        System.out.println("s="+s);
        //工具调用 static 静态直接调用方法 不需要再 创建对象
        String s1 = Utility.readString(3, "123");
        System.out.println("s1="+s1);
    }
}
