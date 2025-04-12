package com.test;

/**
 * @author 张英琪
 */
public class arrayTest {
    public static void main (String args[]){
        Test test = new Test();
        test.maxNum();
    }
}
class Test{

    char [] chars = new char [26];
    int maxIndex = 0;
    int arr[] = {4,-1,9, 10,23};
    public void sysChar(){
        //创建一个 char 类型的 26 个元素的数组，分别 放置'A'-'Z'。使用 for 循环访问所有元素并打印出来。
        // 提示：char 类型
        //数据运算 'A'+2 -> 'C'
        for(int i = 0;i < chars.length;i++) {
            chars[i] = (char) ('A' + i);
            System.out.print(chars[i]);
        }
    }
    //请求出一个数组 int[]的最大值 {4,-1,9, 10,23}，并得到对应的下标
    public void maxNum(){
        int max = arr[0];//假设第一个元素为最大值
        for(int i =1;i < arr.length;i++){
            if(arr[i]>max){//比较 遍历
                max = arr[i];
                maxIndex = i;
            }
        }
        System.out.println(max);
    }
}