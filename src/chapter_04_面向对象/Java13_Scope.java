package chapter_04_面向对象;

/**
 * @projectName: java-tutorial
 * @package: chapter_04_面向对象
 * @className: Java13_Scope
 * @author: tsukishiro
 * @description: TODO 作用域
 * @date: 2023/3/20 15:02
 * @version: 1.0
 */
public class Java13_Scope {


    public static void main(String[] args) {
        User13.test();
    }
}


class Person13 {
    public static String name;
}

class User13 extends Person13 {
    public static String name = "Gala";

    public static void test() {
        //静态方法不允许访问成员方法和变量
//        System.out.println(this.name);//同理 super.name也无法使用
        System.out.println(name);
    }

}