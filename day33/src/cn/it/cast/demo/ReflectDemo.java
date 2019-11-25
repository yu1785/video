package cn.it.cast.demo;
/*
    获取一个类的class文件对象的三种方式
        对象获取
        类名获取
        class类的静态方法获取
 */
public class ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        //对象获取
        Person p = new Person();
        //调用Person类的父类方法getClass
        Class c = p.getClass();
        System.out.println(c);

        //类名获取
        Class c1 = Person.class;
        System.out.println(c1);

        System.out.println(c == c1);
        System.out.println(c.equals(c1));

        //Class的静态方法获取 forName
        Class c2 = Class.forName("cn.it.cast.demo.Person");
        System.out.println(c2);
    }
}
