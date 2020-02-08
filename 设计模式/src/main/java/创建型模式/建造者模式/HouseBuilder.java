package 创建型模式.建造者模式;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/12/27 11:07
 * 抽象建造者
 */

public abstract class  HouseBuilder {

    protected House house=new House();


    public abstract void buildBaise();
    public abstract void buildWall();
    public abstract void buildRoofed();


    public House getHoust(){


        return house;
    }




}
