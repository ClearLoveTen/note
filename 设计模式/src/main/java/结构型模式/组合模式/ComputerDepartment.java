package 结构型模式.组合模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2020/1/3 13:22
 */


//计算机系
public class ComputerDepartment extends OrganizationComponent {
    List<OrganizationComponent> list=new ArrayList<>();

    public ComputerDepartment(String name, String dev) {
        super(name, dev);
    }


    @Override
    protected void add(OrganizationComponent organizationComponent) {

        list.add(organizationComponent);


    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        list.remove(organizationComponent);
    }

    @Override
    public void print() {

        System.out.println("------"+this.getName()+"------"+this.getDev());
        for (OrganizationComponent organizationComponent : list) {

            organizationComponent.print();

        }


    }


}
