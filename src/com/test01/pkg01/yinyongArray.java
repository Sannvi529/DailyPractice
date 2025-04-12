package com.test01.pkg01;

import java.util.Arrays;

public class yinyongArray { public static void main(String[]args){
    int arr[]={1,23,24,21};//static 千万别忘了
    //忘了就无法运行了！！！
    //Arrays类完成排序
    Arrays.sort(arr);
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+" ");
    }
}
}
