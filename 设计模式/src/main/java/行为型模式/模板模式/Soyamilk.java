package 行为型模式.模板模式;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2020/1/3 16:20
 */
public abstract class Soyamilk {

    final void make() {

        //选择材料
        select();
        //

        if (CustomerWwanCondiments()) {
            addCondiments();
        }


        soak();

        beat();

    }

    //钩子方法
     boolean CustomerWwanCondiments(){
        return true;
     }


    protected abstract void addCondiments();

    void select() {
        System.out.println("选择新鲜的黄豆");
    }

    void soak() {

        System.out.println("第二步，开始浸泡 三小时");
    }


    void beat() {
        System.out.println("第四部黄豆和配料放入豆浆机中打碎");
    }


}
