package 结构型模式.代理模式.静态代理;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/12/28 16:36
 */
public class TeacherDao implements ITeacherDao {
    @Override
    public void say() {
        System.out.println("老师开始讲课");
    }
}
