package test01;

import java.util.Scanner;

/**
 * @author 张英琪
 */
public class divide {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int m = scanner.nextInt();
        int count = 0;
        while(m-n >= 0){
            m = m-n;
            count++;
        }
        System.out.println("商为count="+count+"余数为m="+m);
    }
}
