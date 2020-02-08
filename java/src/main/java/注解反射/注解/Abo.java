package 注解反射.注解;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2020/1/31 10:04
 */

//定义作用域
@Target(ElementType.TYPE)

//作用于什么时候,一般使用run
@Retention(RetentionPolicy.RUNTIME)
public @interface Abo {

    String name ()default "武佳豪";
    int num ()default 5;


    //默认可以省略
    String value();

}
