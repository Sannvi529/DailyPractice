package test02;

import java.util.Scanner;

/**
 * @author 张英琪
 */
public class exception {
    public static void main(String[] args) {
        int num;
        String name;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数字");
        name = scanner.next();
        while(true){
            try {
                num = Integer.parseInt(name);
                break;
            } catch (Exception e) {

                System.out.println("你输入的不是整数");
                break;
            }
        }

    }
}
