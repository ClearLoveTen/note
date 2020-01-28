package 行为型模式.备忘录模式;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/12/30 11:29
 * 需要备忘的内容
 */
public class Originator {

    /**
     * 生命值
     */
    private int vit;
    /**
     * 能量
     */
    private int def;

    public Originator(int vit, int def) {
        this.vit = vit;
        this.def = def;
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
