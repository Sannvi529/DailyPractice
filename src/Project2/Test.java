package Project2;

import java.util.Scanner;

/**
 * @author 张英琪
 */
public class Test {
    public static void main(String[] args) {
        //购买披萨
        Scanner scanner = new Scanner(System.in);
        System.out.println("请选择你想要购买的披萨：1.培根披萨 2.水果披萨：");
        int choice = scanner.nextInt();
        //通过工厂获取披萨
        PiSa ps  = PizzaStore.getPizza(choice);
        System.out.println(ps.show());
    }
}
