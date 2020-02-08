package 结构型模式.桥接模式;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2020/1/3 12:16
 *
 *
 *   现在对不同手机类型的不同品牌实现操作编程(比如:开机、关机、上网，打电话等)
 *   1)扩展性问题(类爆炸)，如果我们再增加手机的样式(旋转式)，就需要增加各个品牌手机的类，同样如果我们增加一个手机品牌，也要在各个手机样式类下增加。
 *   2)违反了单一职责原则，当我们增加手机样式时，要同时增加所有品牌的手机，这样增加了代码维护成本.
 *   3)解决方案-使用桥接模式
 */
public class Client {

    public static void main(String[] args) {

        Brand xiaoMi = new XiaoMi();
        Brand vivo = new Vivo();
        // phone phone=new UpRightPhone(xiaoMi)  不能用抽象类接受 ，负责 没有办法调用
        UpRightPhone upRightPhone = new UpRightPhone(xiaoMi);
        upRightPhone.open();
        upRightPhone.call();
        upRightPhone.close();
        FoldedPhone foldedPhone=new FoldedPhone(vivo);
        foldedPhone.open();
        foldedPhone.call();
        foldedPhone.close();



    }}
