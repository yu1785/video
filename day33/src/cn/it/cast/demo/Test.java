package cn.it.cast.demo;

import java.io.FileReader;
import java.lang.reflect.Method;
import java.util.Properties;

public class Test {
    public static void main(String[] args) throws Exception {
        //IO流读取配置文件
        FileReader r = new FileReader("day33\\config.properties");
        //创建集合对象
        Properties pro = new Properties();
        //调用集合方法load 传递流对象
        pro.load(r);
        r.close();
        //通过键获取值
        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");
        //反射获取指定类的class文件对象
        Class c = Class.forName(className);
        Object obj = c.newInstance();
        //获取指定方法名
        Method method = c.getMethod(methodName);
        method.invoke(obj);

    }
}
