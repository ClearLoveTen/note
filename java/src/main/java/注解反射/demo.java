package 注解反射;


import lombok.Data;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Field;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2020/1/31 10:04
 *
 * 通过 反射获取注解的值
 *
 * invoke -> 调用 , xxxMethod.invoke(对象名，参数值) 调用方法
 *
 * Accessible:允许访问的/可访问的/可连接的/可取数的
 * setAccessible(true) -> 设置为可直接访问的
 */
public class demo {

    public static void main(String[] args) throws ClassNotFoundException {
        Class aClass = Class.forName("注解反射.Product");


        for (Field declaredField : aClass.getDeclaredFields()) {
            System.out.println(declaredField.getName());

        }

        for (AnnotatedType annotatedInterface : aClass.getAnnotatedInterfaces()) {
            System.out.println(annotatedInterface.getType());
        }

        Table table = (Table) aClass.getAnnotation(Table.class);
        String s = table.tableName();
        System.out.println(s);
    }
}


@Table(tableName = "table")
class Product{
    public Product() {

    }

    public Product(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Fiel(columnName = "id",type = "String")
    private String id;
    @Fiel(columnName = "id",type = "String")
    private String name;

}

//表注解
//定义作用域
@Target(ElementType.TYPE)

//作用于什么时候,一般使用run
@Retention(RetentionPolicy.RUNTIME)
@interface Table{


    String tableName() ;

}


//作用于什么时候,一般使用run
@Retention(RetentionPolicy.RUNTIME)
@interface Fiel{

String columnName() ;
String type() ;

}