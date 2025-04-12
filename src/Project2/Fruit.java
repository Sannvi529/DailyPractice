package Project2;

/**
 * @author 张英琪
 */
public class    Fruit extends PiSa{
    private String peiliao;

    public String getPeiliao() {
        return peiliao;
    }

    public void setPeiliao(String peiliao) {
        this.peiliao = peiliao;
    }
    //
    //构造器

    public Fruit() {
    }

    public Fruit(String name, int size, int price, String peiliao) {
        super(name, size, price);
        this.peiliao = peiliao;
    }

    @Override
    public String show() {
        return "你要加入的配料为："+peiliao+"\n"+super.show();
    }
}
