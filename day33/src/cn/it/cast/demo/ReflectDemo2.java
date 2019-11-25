package cn.it.cast.demo;

import java.lang.reflect.Constructor;

public class ReflectDemo2 {
    public static void main(String[] args) throws Exception {
        Class c = Class.forName("cn.it.cast.demo.Person");
        //获取有参构造方法
        Constructor con = c.getConstructor(String.class,int.class);
        //运行构造方法
        Object obj = con.newInstance("zhagnsan",20);
        System.out.println(obj);
    }
}
