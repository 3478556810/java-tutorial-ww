package chapter_04_面向对象;

/**
 * @projectName: java-tutorial
 * @package: chapter_04_面向对象
 * @className: Java11_AnonymousClass
 * @author: tsukishiro
 * @description: TODO 匿名类
 * @date: 2023/3/20 14:36
 * @version: 1.0
 */
public class Java11_AnonymousClass {


    public static void main(String[] args) {
        new Me()
                .sayHello(new Gala());
        //匿名类 不关心具体类的名字，只使用抽象类(接口)的方法 只需补全抽象类（接口）的方法
        new Me()
                .sayHello(new Person11() {
                    @Override
                    public String name() {
                        return "Gala8";
                    }
                });
        new FiveKill(){

            @Override
            public void fiveKill() {
                System.out.println("Gala五杀了");
            }
        }.fiveKill();


    }
}


abstract class Person11 {
    public abstract String name();

}

class Me {

    public void sayHello(Person11 person11) {

        System.out.println("Hello" + person11.name());
    }
}

class Gala extends Person11 {

    public String name() {
        return "Gala";
    }
}

interface FiveKill{

    public void fiveKill();
}