package com.test01.maopao;



public class maoPao {
    public static void main(String[]args) {
        int arr[] = {12, -12, 334, 13};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];//先把小一点的数交换到前面
                    arr[j + 1] = temp;//注意是j
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }
}
