package Project2;

/**
 * @author 张英琪
 */
public class PiSa {
    //属性
    private String name;
    private int size;
    private int price;
    //方法
    //set get
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    //展示信息
    public String show(){
        return "你购买的是:"+name+"\n尺寸为："+size+"寸\n价格为："+price+"元";
    }
    //构造器
    public PiSa() {
    }

    public PiSa(String name, int size, int price) {
        this.name = name;
        this.size = size;
        this.price = price;
    }
}
