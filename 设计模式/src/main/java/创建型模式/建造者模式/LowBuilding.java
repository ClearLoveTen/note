package 创建型模式.建造者模式;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/12/27 11:32
 */
public class LowBuilding extends HouseBuilder {
    @Override
    public void buildBaise() {
        System.out.println("建造低级房子");
    }

    @Override
    public void buildWall() {
        System.out.println("建造低级房子");
    }

    @Override
    public void buildRoofed() {
        System.out.println("建造低级房子");
    }
}
