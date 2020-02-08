package 行为型模式.备忘录模式;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/12/30 11:31
 */
public class Memento {


    /**
     * 生命值
     */
    private int vit;
    /**
     * 能量
     */
    private int def;

    public Memento(int vit, int def) {
        this.vit = vit;
        this.def = def;
    }




    //保存当前备忘录对象
    public Memento saveMemento(){


        return  new Memento(this.vit,this.def) ;
    }

    //恢复当前对象到某个对象
    public Memento recover(Originator originator){

        this.def=originator.getDef();
        this.vit=originator.getVit();

        return this;
    }



}
