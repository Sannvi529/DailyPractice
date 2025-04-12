package Project2;

/**
 * @author 张英琪
 */
public class PeiGen extends PiSa{
    private  int mass;

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }
    //
    //构造器

    public PeiGen() {
    }

    public PeiGen(int mass) {
        this.mass = mass;
    }
    public PeiGen(String name, int size, int price, int mass) {
        super(name, size, price);
        this.mass = mass;
    }

    @Override
    public String show() {
        return "你要加入的培根克数："+mass+"克\n"+super.show();
    }
}
