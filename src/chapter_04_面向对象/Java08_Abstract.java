package chapter_04_面向对象;

/**
 * @projectName: java-tutorial
 * @package: chapter_04
 * @className: Java08_Abstract
 * @author: tsukishiro
 * @description: TODO 抽象
 * @date: 2023/3/20 11:04
 * @version: 1.0
 */
public class Java08_Abstract {

    public static void main(String[] args) {

      //抽象 Abstract ：只有声明，没有实现的方法
      //抽象类 abstract class 类名
      //抽象方法：只有声明，没有实现的方法
      //abstract 返回值类型   方法名（参数）

        //抽象类无法直接构建对象，但是能通过子类间接构建对象
        new Child08().eat();
    }
}


abstract class Person08{

    //一个类中有抽象方法，那么该类必定为抽象类
    //一个类是抽象类，它的方法不一定是抽象方法

    //修饰方法时abstract 与 final 不能同时使用 ， abstract要求子类继承重写补充完整  final要求方法不能重写
    public  abstract void eat();

    public void test(){};
}


class Child08 extends Person08{

//如果抽象类中含有抽象方法,那么子类必须重写抽象方法，将其补充完整
    @Override
    public void eat() {
        System.out.println("Gala 还在杀疯");
    }
}