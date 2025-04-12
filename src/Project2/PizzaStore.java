package Project2;

import java.util.Scanner;

/**
 * @author 张英琪
 */
public class PizzaStore {
    public static PiSa getPizza(int choice){
        Scanner scanner = new Scanner(System.in);
        PiSa ps = new PiSa();
        switch(choice){
            case 1:{
                System.out.println("请录入培根的克数：");
                int weight = scanner.nextInt();
                System.out.println("请录入披萨的大小：");
                int size = scanner.nextInt();
                System.out.println("请录入披萨的价格：");
                int price = scanner.nextInt();
                //将录入的信息封装进培根披萨的对象
                PeiGen pg = new PeiGen("培根披萨",size,price,weight);
                ps  = pg;
            }
            break;
            case 2:{
                System.out.println("请录入你要加入的水果配料：");
                String brodening  = scanner.next();
                System.out.println("请录入披萨的大小：");
                int size = scanner.nextInt();
                System.out.println("请录入披萨的价格：");
                int price = scanner.nextInt();
                //将录入的信息封装进培根披萨的对象
                Fruit fruit = new Fruit("水果披萨",size,price,brodening);
                ps = fruit;
            }
            break;
        }

        return ps;
    }
}
