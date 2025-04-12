package com.test;

/**
 * @author 张英琪
 */
public class test1 {
    public static void main(String [] args){
        //正方形
        /*
          *      1  2  1
         ***     2  1  3
        *****    3  0  5
         ***
          *
        */
        //上三角形
        for (int j = 1; j <= 3; j++) {//控制行数
            //打印*之前的空格
            for (int i = 1; i <= (3-j) ; i++) {
                System.out.print(' ');
            }
            //打印*
            for(int i = 1; i <= (j*2-1); i++){
                //控制列数
                if((i == 1)||(i == 2*j-1)){
                    System.out.print('*');
                }else{
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
        //打印下三角
        /*
        1 1 3  1*2+3 = 5
        2 2 1   3 = 5-1*2
        */

        for (int j = 1; j <= 2; j++) {//控制行数
            //打印*之前的空格
            for (int i = 1; i <= j ; i++) {
                System.out.print(' ');
            }
            //打印*
            for(int i = 1; i <= (5-j*2); i++){
                //控制列数
                if((i == 1)||(i == 5-2*j)){
                    System.out.print('*');
                }else{
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
        //正方形
        int size = 5;
        boolean flag = true;
        int startNum = 5/2+1;
        int endNum = 5/2+1;
        for(int i = 1;i <= 5;i++){
            for (int j = 1; j <= 5 ; j++) {
                if((j >= startNum )&&(j <= endNum)){
                    System.out.print('*');
                }else{
                    System.out.print(' ');
                }
            }
            System.out.println();
            if(endNum==5){
                flag =false;
            }
            if(flag){
                startNum--;
                endNum++;
            }else{
                startNum++;
                endNum--;
            }
        }
    }
}
