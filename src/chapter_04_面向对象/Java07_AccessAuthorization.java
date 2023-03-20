package chapter_04_面向对象;

/**
 * @projectName: java-tutorial
 * @package: chapter_04
 * @className: Java07_AccessAuthotion
 * @author: tsukishiro
 * @description: TODO 访问权限 单例模式 final
 * @date: 2023/3/19 15:44
 * @version: 1.0
 */
public class Java07_AccessAuthorization {
    public static void main(String[] args) {

        //private:私有的，同一个类中可以使用
        //适用情况:1.类的创建过程复杂 2.类的对象消耗资源
        //default:默认权限，当不设定任何权限，JVM会默认提供权限，包（路径）权限，子包不能访问
        //protected:受保护的权限，子类可以访问
        //public:公共的，访问权限修饰符，公共类只能有一个,而且必须与源码文件名相同
        //        //main方法是由JVM调用的，JVM应该任意调用，故用public修饰

        //外部类 - 内部类
        //外部类，源码中直接声明的类
        //内部类，类中声明的类
//        OuterClass outer =new OuterClass();
//        OuterClass.InnerClass innerClass = outer.new InnerClass();
        //一般的，使用两次构造方法创建的对象并不一样，但OuterClass使用了单例模式的构造模式，保证每次取到的是同一个对象（实例）
        System.out.println((OuterClass.getInstance()).equals(OuterClass.getInstance()));
        new Parent1("gala");
    }
}


final class OuterClass {


    private static OuterClass outerClass = null;//静态方法不能直接访问成员属性，需要static修饰


    private OuterClass() {
    }

    public static OuterClass getInstance() {
        if (outerClass == null) {
            outerClass = new OuterClass();

        }

        return outerClass;
    }


    public class InnerClass {

    }
}

//final修饰类，该类将不会有子类
final class Parent1 {
    //final:数据初始化后不能修改，可以修饰属性，那么JVM无法自动初始化，需要自己进行初始化
    //如果该类被设计为单例模式构造，final无法在构造方法初始化
    public final String name;

    public Parent1(String name) {
        this.name = name;
    }

    //方法可以用final修饰，但不能让子类重写，构造方法不能被final修饰
    public final void test() {


    }
}