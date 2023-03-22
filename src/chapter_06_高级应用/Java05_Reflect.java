package chapter_06_高级应用;

import java.lang.reflect.*;

/**
 * @projectName: java-tutorial
 * @package: chapter_06_高级应用
 * @className: Java05_Reflect
 * @author: tsukishiro
 * @description: TODO 反射
 * @date: 2023/3/23 22:06
 * @version: 1.0
 */
public class Java05_Reflect {

    public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, ClassNotFoundException {
        System.out.println("------反射的基本方法------");
//        User5 user5=new Child();
//        user5.test1();
//        //user5.test2();//多态，被引用数据类型限制了方法的使用场景
//        //类对象
//        Class<? extends User5> aClass = user5.getClass();
//        //获取类的名称
//        System.out.println(aClass.getName());//获取类的完整名称（包括包名）
//        System.out.println(aClass.getSimpleName());//获取类名
//        System.out.println(aClass.getPackageName());//获取包名
//        System.out.println(aClass.getSuperclass());//获取父类
//        System.out.println(aClass.getInterfaces().length);//获取接口
//        //获取类的属性
//        Field f =aClass.getField("xxx");//public
//        Field f1 =aClass.getDeclaredField("xxx");//所有权限
//        Field[] fields = aClass.getFields();//public
//        Class<?>[] declaredClasses = aClass.getDeclaredClasses();//所有权限
//
//        //获取类的方法
//        Method method=aClass.getMethod("test1");
//        Method xxxx=aClass.getDeclaredMethod("xxxx");
//
//        Method[] methods = aClass.getMethods();
//        Method[] declaredMethods = aClass.getDeclaredMethods();
//
//        //构造方法
//        Constructor<? extends User5> constructor = aClass.getConstructor();
//        Constructor<?>[] constructors = aClass.getConstructors();
//
//        //获取权限 多个修饰符融合成一个int值
//        int modifiers = aClass.getModifiers();
//        boolean aPrivate = Modifier.isPrivate(modifiers);

        System.out.println("------反射的基本方法------");
        System.out.println("------类加载器------");
        //加载类
        //Java中的类主要分为三种：
        //1.Java核心类库：String Object
        //2.JVM 软件平台开发商
        //3.自定义类
        //对应类加载类也有3种
        //1.BootClassLoader:启动类加载器(加载时，使用操作系统的平台语言实现,Java语言获取值为null)
        //2.platformClassLoader:平台类加载器
        //3.AppClassLoader:应用类加载器
        //获取类的信息
        Class<Student> studentClass = Student.class;
        //获取类加载器对象
        System.out.println(studentClass.getClassLoader());
        System.out.println(studentClass.getClassLoader().getParent());
        //获取类的信息
        Class<String> stringClass = String.class;
        //获取类加载器对象
        System.out.println(stringClass.getClassLoader());

        //加载顺序：Java核心类库->平台类库->应用类库 （父类->子类）

        System.out.println("------类加载器------");

        System.out.println("------反射练习-------");
        //只使用反射实现员工的登录功能
        //构造方法对象
        //Class<Emp1> emp1Class = Emp1.class;
        Class<?> emp1Class = Class.forName("chapter_06_高级应用.Emp1");
        Constructor declaredConstructor = emp1Class.getDeclaredConstructor();
        //构建对象
        Object emp1 = declaredConstructor.newInstance();
        //获取对象的属性
        Field account = emp1Class.getField("account");
        Field password = emp1Class.getField("password");
        //给属性赋值
        account.set(emp1,"admin");
        password.set(emp1,"123");
        //获取登录方法
        Method login =emp1Class.getMethod("login");
        //调用方法
        Object result = login.invoke(emp1);
        System.out.println(result);
        System.out.println("------反射练习-------");



    }

}


class Emp1{
    public String account;
    public String password;

    public boolean login(){
        if("admin".equals(account)&&"123".equals(password))
            return true;
        else return false;
    }
}
class Student{

}
class User5{
    public void test1(){
        System.out.println("test1...");
    }
}

class Child extends User5{
    public void test2(){
        System.out.println("test2...");
    }
}
