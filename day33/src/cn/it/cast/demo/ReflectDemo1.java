package cn.it.cast.demo;

import java.lang.reflect.Constructor;

/*
    获取Class文件中的构造方法，运行构造方法
        获取class对象
        从class文件对象 获取成员
 */
public class ReflectDemo1 {
    public static void main(String[] args) throws Exception {
        Class c = Class.forName("cn.it.cast.demo.Person");
        //使用class文件对象，获取类中构造方法
        //Constructor[] getconstructors() 获取class文件对象中的所有公共构造函数
        /*Constructor[] cons = c.getConstructors();
        for (Constructor con:cons){
            System.out.println(con);
        }*/

        //获取指定构造方法 空参构造方法
        Constructor con = c.getConstructor();
        System.out.println(con);
        //运行构造方法
        Object obj = con.newInstance();
        System.out.println(obj);

    }
}
