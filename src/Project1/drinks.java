package Project1;

import java.util.Scanner;

/**
 * @author 张英琪
 */
public class drinks {
    private String  name;
    private double price;
    private String size;
    private String freezed;

    private String message;
    private int num;
    Scanner scanner = new Scanner(System.in);
    public void presentDrinkMessage(){
        setName();
    }
    public String getMessage() {
        return message;
    }

    public void setMessage() {
        message = scanner.next();//输入可口可乐，加冰
    }
    public void show(){
        System.out.println("订单信息：您购买了"+message+",购买的"+getSize()+"购买数量"+getNum());
    }

    public String getName() {
        return name;
    }

    public void setName() {
        System.out.println("选择：1.可乐 2.咖啡 3.奶茶：");
        int size1 = scanner.nextInt();
        switch(size1) {
            case 1:{  this.size = "可乐"; break;}
            case 2:{  this.size = "咖啡"; break;}
            case 3:{  this.size = "奶茶"; break;}
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize() {
        System.out.println("选择：1.中杯 2.大杯 3.超大杯：");
        System.out.println("请输入数字：");
        int size1 = scanner.nextInt();
        switch(size1) {
            case 1:{  this.size = "中杯"; break;}
            case 2:{  this.size = "大杯"; break;}
            case 3:{  this.size = "超大杯"; break;}
        }
    }

    public String getFreezed() {
        return freezed;
    }

    public void setFreezed(String freezed) {
        this.freezed = freezed;
    }

    public int getNum() {
        return num;
    }

    public void setNum() {
        System.out.println("购买数量：");
        int num1 = scanner.nextInt();
    }
}
