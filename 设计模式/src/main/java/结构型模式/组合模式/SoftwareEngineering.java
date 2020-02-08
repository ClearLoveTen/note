package 结构型模式.组合模式;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2020/1/3 13:26
 */
//软件工程专业
public class SoftwareEngineering extends OrganizationComponent {
    public SoftwareEngineering(String name, String dev) {
        super(name, dev);
    }


    @Override
    public void print() {

        System.out.println("------"+this.getName()+"------"+this.getDev());
    }
}
