package poject3;

import java.util.Scanner;

/**
 * @author 张英琪
 */
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //购买种类
        System.out.println("请录入你要购买的饮品：1.可乐 2.咖啡");
        int choice = scanner.nextInt();
        drinks d = drinkPlants.getDrinks(choice);
        System.out.println(d.show());
    }
}
