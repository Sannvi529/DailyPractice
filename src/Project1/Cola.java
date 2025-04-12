package Project1;

import java.util.Scanner;

/**
 * @author 张英琪
 */
public class Cola extends drinks{
    String message;
    Scanner scanner = new Scanner(System.in);
    @Override
    public void presentDrinkMessage() {
        super.presentDrinkMessage();
        System.out.println("请录入你需要的可乐的信息：\n"+"备注可口可乐还是百事可乐，是否加冰：");
        setMessage();
        setSize();
        setNum();
        show();
    }

    @Override
    public void show() {
        super.show();
    }
}
