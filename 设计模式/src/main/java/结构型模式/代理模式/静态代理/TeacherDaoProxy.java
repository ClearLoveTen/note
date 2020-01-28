package 结构型模式.代理模式.静态代理;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/12/28 16:37
 */
public class TeacherDaoProxy implements ITeacherDao {


    private ITeacherDao iTeacherDao;

    public TeacherDaoProxy(ITeacherDao iTeacherDao) {
        this.iTeacherDao = iTeacherDao;
    }

    @Override
    public void say() {

        System.out.println("讲课之前");
        iTeacherDao.say();
        System.out.println("讲课之后");


    }
}
