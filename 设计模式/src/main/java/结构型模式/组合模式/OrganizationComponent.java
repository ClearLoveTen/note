package 结构型模式.组合模式;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2020/1/3 12:50
 */
public abstract class OrganizationComponent {


    //名字
    private String name;
    //描述
    private String dev;

    public OrganizationComponent(String name, String dev) {
        this.name = name;
        this.dev = dev;
    }

    protected void add(OrganizationComponent organizationComponent) {

        throw new UnsupportedOperationException();
    }

    protected void remove(OrganizationComponent organizationComponent) {

        throw new UnsupportedOperationException();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDev() {
        return dev;
    }

    public void setDev(String dev) {
        this.dev = dev;
    }

    public abstract void print();

}
