package 创建型模式.建造者模式;

import java.security.PublicKey;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/12/27 11:18
 * 指挥者
 */
public class HouseDirector {

    HouseBuilder houseBuilder = null;

    /**
     * @param houseBuilder 传入抽象建造这
     */
    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }


    public House constructHouse() {

        houseBuilder.buildBaise();
        houseBuilder.buildRoofed();
        houseBuilder.buildWall();

        return houseBuilder.getHoust();
    }


}
