package tryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author 张英琪
 */
public class Test {
    public static void main(String[] args) {
        //实现一个功能，键盘录入两个数，求商
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("请录入第一个数：");
            int num1 = scanner.nextInt();
            System.out.println("请录入第二个数：");
            int num2 = scanner.nextInt();
            System.out.println("商："+num1/num2);
        }catch(InputMismatchException ex1){
            System.out.println("请录入整数！！");
//            System.out.println(ex1);
        }catch(ArithmeticException ex2){
           ex2.printStackTrace();
//            System.out.println(ex2.toString());
        }finally{
            System.out.println("欢迎下次使用！！");
        }
    }
}
