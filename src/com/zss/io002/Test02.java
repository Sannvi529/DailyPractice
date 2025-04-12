package com.zss.io002;

import java.io.*;

/**
 * @author 张英琪
 */
public class Test02 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("D:\\4.txt")));
//        Person p = new Person(12,"足球");
        Person s = (Person)ois.readObject();
        System.out.println(s);
        ois.close();
    }
}
