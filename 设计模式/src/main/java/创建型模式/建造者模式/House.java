package 创建型模式.建造者模式;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/12/27 10:46
 *
 * 产品类
 */
public class House {

    private String baise;
    private String wall;
    private String roofed;

    public String getBaise() {
        return baise;
    }

    public void setBaise(String baise) {
        this.baise = baise;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getRoofed() {
        return roofed;
    }

    public void setRoofed(String roofed) {
        this.roofed = roofed;
    }
}
