package cn.it.cast.demo;

import java.lang.reflect.Field;

/*
    反射获取成员变量，修改
 */
public class ReflectDemo5 {
    public static void main(String[] args) throws Exception {
        Class c = Class.forName("cn.it.cast.demo.Person");
        Object obj = c.newInstance();
        //获取成员变量
       /* Field[] fields = c.getFields(); //getDeclaredFields()获取所有 包括私有的
        for (Field f:fields){
            System.out.println(f);
        }*/

        //获取指定的成员变量
        Field field = c.getField("name");
        System.out.println(field);

        //修改
        field.set(obj,"xiaoer");
        System.out.println(obj);
    }
}
