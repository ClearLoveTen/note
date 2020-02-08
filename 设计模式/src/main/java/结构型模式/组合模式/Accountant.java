package 结构型模式.组合模式;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2020/1/3 13:29
 */
public class Accountant extends OrganizationComponent {
    public Accountant(String name, String dev) {
        super(name, dev);
    }


    @Override
    public void print() {

        System.out.println("------"+this.getName()+"------"+this.getDev());
    }
}
