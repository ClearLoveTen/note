package 结构型模式.组合模式;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2020/1/3 12:46
 */
public class Client {

    //编写程序展示一个学校院系结构：需求是这样，要在一个页面中展示出学校的院系组成，一个学校有多个学院，一个学院有多个系
    public static void main(String[] args) {

        OrganizationComponent qingHuaUniversity = new QingHuaUniversity("清华大学", "一流学府");

        OrganizationComponent commercialDepartment = new CommercialDepartment("商学院", "商业人次");

        OrganizationComponent computerDepartment = new ComputerDepartment("计算机系", "修电脑");

        OrganizationComponent accountant = new Accountant("会计", "记账");

        OrganizationComponent softwareEngineering = new SoftwareEngineering("软基工程", "码农");


        //清华大学添加系别
        qingHuaUniversity.add(commercialDepartment);
        qingHuaUniversity.add(computerDepartment);

        //商学院添加专业
        commercialDepartment.add(accountant);

        //计算机系添加专业
        computerDepartment.add(softwareEngineering);

       // qingHuaUniversity.print();

        //计算机系层面打印

        computerDepartment.print();






    }
}
