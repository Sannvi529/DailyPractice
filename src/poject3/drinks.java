package poject3;

/**
 * @author 张英琪
 */
public class drinks {
    private String name;
    private int price;
    private String size;
    private String notes;
    private int num;
    //

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public drinks() {
    }

    public drinks(String name, int price, String size, String notes, int num) {
        this.name = name;
        this.price = price;
        this.size = size;
        this.notes = notes;
        this.num = num;
    }
    //展示信息
    public String show(){
        return "你购买的是："+name+"\n尺寸是："+size+"\n你的备注是："+notes+"\n你购买的数量为："+num+"杯\n价格为："+price*num+"元";
    }
}
