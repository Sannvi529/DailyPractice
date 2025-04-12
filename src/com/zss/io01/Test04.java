package com.zss.io01;

import java.lang.String;

import java.io.*;

/**
 * @author 张英琪
 */
public class Test04 {
    public static void main(String[] args) throws IOException {
        //源文件
        File f1 = new File("D:\\1.txt");
        System.out.println(f1.getPath());
        //目标文件
        File f2 = new File("D:\\2.txt");
        //搞一个管 怼到源文件上
        FileReader fr = new FileReader(f1);
        FileWriter fw = new FileWriter(f2,true);
        //数组打包，直接带走
        char [] arr = new char[12];
        int len = fr.read(arr);
        while (len != -1){
//            fw.write(arr,0,len);
            String s = new String(arr,0,len);
            fw.write(arr);
            len = fr.read(arr);
            System.out.println(fr.read(arr));//人家总共就那抹点字符，你还想让他们有多少len的值
            System.out.print(s);
        }
        fr.close();
        fw.close();
    }
}
