package 创建型模式.建造者模式;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/12/27 11:29
 *
 * 例子 StringBuilder
 *
 */
public class Client {
    /**
     * 建造者模式
     * 1.产品类 需要按照一定顺序建造的产品
     * 2.抽象建造者 定义分别建造部件的抽象方法，设置返回产品的方法
     * 3.指挥者 传入抽象建造者的实现类，分别调用抽象方法，控制建造顺序，调用抽象建造者的返回方法，获取产品。
     * 4.抽象建造者的具体实现类 完成建造的具体细节方法
     *
     * @param args
     */

    public static void main(String[] args) {



        new HouseDirector(new HignBuilding()).constructHouse();
        new HouseDirector(new LowBuilding()).constructHouse();


    }
}
