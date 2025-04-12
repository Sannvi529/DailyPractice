package Project1;

/**
 * @author 张英琪
 */
public class Coffee extends drinks{
    @Override
    public void presentDrinkMessage() {
        super.presentDrinkMessage();
        System.out.println("请录入你需要的咖啡的信息：\n"+"备注雀巢咖啡还是蓝猫咖啡，是否加冰：");
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
