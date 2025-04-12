package com.zss.io002;

import java.io.*;

/**
 * @author 张英琪
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("D:\\4.txt")));
        Person p = new Person(12,"足球");
        oos.writeObject(p);
        //关闭流
        oos.close();
    }
}
