package poject3;

import java.util.Scanner;

/**
 * @author 张英琪
 */
public class drinkPlants {
    public static drinks getDrinks(int choice){
        Scanner scanner = new Scanner(System.in);
        drinks d = new drinks();
        switch(choice){
            case 1:{
                System.out.println("请录入你需要的可乐的信息：\n"+"备注可口可乐还是百事可乐，是否加冰：");
                String notes = scanner.next();
                System.out.println("选择：1.中杯 2.大杯 3.超大杯");
                int choice1 = scanner.nextInt();
                String  size = null;
                switch(choice1) {
                    case 1:{  size = "中杯"; break;}
                    case 2:{  size = "大杯"; break;}
                    case 3:{  size = "超大杯"; break;}
                }
                System.out.println("请录入价格：");
                int price = scanner.nextInt();
                System.out.println("请录入要购买的数量：");
                int num = scanner.nextInt();
                Cola cola = new Cola("可乐",price,size,notes,num);
                d = cola;
            }
            break;
            case 2:{
                System.out.println("请录入你需要的咖啡的信息：\n"+"备注蓝山咖啡还是猫屎咖啡，是否加冰：");
                String notes = scanner.next();
                System.out.println("选择：1.中杯 2.大杯 3.超大杯");
                int choice1 = scanner.nextInt();
                String  size = null;
                switch(choice1) {
                    case 1:{  size = "中杯"; break;}
                    case 2:{  size = "大杯"; break;}
                    case 3:{  size = "超大杯"; break;}
                }
                System.out.println("请录入价格：");
                int price = scanner.nextInt();
                System.out.println("请录入要购买的数量：");
                int num = scanner.nextInt();
                Coffee coffee = new Coffee("咖啡",price,size,notes,num);
                d = coffee;
            }
            break;
        }
        return d;
    }
}
