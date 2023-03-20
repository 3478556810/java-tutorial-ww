package chapter_04_面向对象;

/**
 * @projectName: java-tutorial
 * @package: chapter_04
 * @className: Java01_Object
 * @author: tsukishiro
 * @description: 面向对象 可变参数 静态方法
 * @date: 2023/3/18 22:48
 * @version: 1.0
 */
public class Java01_Object_MethodParam {
    public static void main(String[] args) {


        new Player().battle();


    }


}

class Player {
    //静态代码块
    //对象初始化，实例化对象时执行
    {
        System.out.println("彻底疯狂！");
    }
    //类初始化，使用类时执行
    static {
        System.out.println("此刻正是猎杀时刻！");//无论是否创建对象，优先级永远比对象初始化高
    }
    //静态属性
    static String type = "玩家";
    static String name;
    //先有类后有对象，成员方法可以访问静态属性和静态方法
    void battle() {
        name = "gala";
        battle1(name);
    }

//    //可变参数：当参数个数不确定，但类型相同，特殊的参数语法声明,如果还包括其他参数，应该将可变参数放在最后
//    void battle(String... name) {
//        System.out.println(name[0]);
//
//    }

    //静态方法，若与普通方法同名（参数类型及个数、返回类型），优先级高于普通方法
    static void battle1(String name) {
        System.out.println(name + "五杀了");


    }

}
