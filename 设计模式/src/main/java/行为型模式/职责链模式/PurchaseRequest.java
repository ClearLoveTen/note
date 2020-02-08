package 行为型模式.职责链模式;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/12/30 12:12
 * 请求类
 */
public class PurchaseRequest {

    private int type=0;
    //请求类型
    private float price=0.0f;
    //请求金额
    private int id=0;

    public PurchaseRequest(int type, float price, int id) {
        this.type = type;
        this.price = price;
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
