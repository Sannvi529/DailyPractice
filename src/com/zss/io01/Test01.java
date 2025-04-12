package com.zss.io01;

import java.io.File;
import java.io.IOException;

/**
 * @author 张英琪
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        //将文件分装为一个file类的对象
        File file = new File("D:\\1.txt");
        //File.separator属性帮我们获取当前操作系统的路径拼接符号
        File file1 = new File("D:"+File.separator+"1.txt");
        //常用方法
        System.out.println("文件是否可读"+file1.canRead());
        System.out.println(file.canRead());

        System.out.println("文件的名字："+file1.getName());
        System.out.println("文件的上级目录："+file1.getParent());
        System.out.println("是否是一个目录："+file1.isDirectory());
        System.out.println("是否是文件："+file1.isFile());
        System.out.println("是否隐藏："+file1.isHidden());
        System.out.println("是否存在："+file1.exists());
//        if(file1.exists()){
//            System.out.println("删除");
//            file1.delete();
//        }else {
//            System.out.println("文件已不存在，同时创建了一个新文件");
//            boolean newFile = file1.createNewFile();
//            System.out.println(newFile);
//        }
        System.out.println(file1 == file);//比较地址
        System.out.println(file1.equals(file));//比较两个对象对应的文件的路径
        //跟路径相关的：
        System.out.println("绝对路径"+file1.getAbsolutePath());
        System.out.println("相对路径"+file1.getPath());
        String string = file1.toString();
        File f = new File("demo.text");//相对路径
        if(!f.exists()){
            boolean newFile = f.createNewFile();
        }
        System.out.println("绝对路径"+f.getAbsolutePath());
        System.out.println("相对路径"+f.getPath());
        String str = f.toString();
        System.out.println(str);
    }
}
