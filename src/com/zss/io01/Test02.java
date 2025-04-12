package com.zss.io01;

import java.io.File;

/**
 * @author 张英琪
 */
public class Test02 {
    public static void main(String[] args) {
        //跟目录相关的方法
        //创建目录
        File j = new File("a\\demo");
//        j.mkdir();//创建单层目录，任意文件类型
        j.mkdirs();//创建多层文件夹
        j.delete();//只删除单层

    }
}
