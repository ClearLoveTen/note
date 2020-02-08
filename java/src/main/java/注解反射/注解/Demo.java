package 注解反射.注解;

import jdk.nashorn.internal.objects.annotations.SpecializedFunction;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2020/1/31 10:05
 */
@Abo("f")

//振压警告
@SuppressWarnings("all")
public class Demo  {


    //过期注解
    @Deprecated
    public void hello(){};

    @Override
    public String toString() {
        return super.toString();
    }
}
