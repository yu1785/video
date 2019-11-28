package cn.it.cast.demo;

import java.lang.reflect.Method;
import java.util.ArrayList;

/*
    定义集合类，泛型String
    要求向集合添加integer类型

    反射方式 获取集合ArrayList类的class文件对象
    通过class文件对象，调用add方法
 */
public class ReflectTest {
    public static void main(String[] args) throws Exception {
        ArrayList<String> array = new ArrayList<String>();
        array.add("a");
        Class c = array.getClass();
        Method method = c.getMethod("add",Object.class);
        method.invoke(array,100);
        method.invoke(array,300);
        System.out.println(array);

    }
}
