package chapter_04;

/**
 * @projectName: java-tutorial
 * @package: chapter_04
 * @className: Java03_Polymorphism
 * @author: tsukishiro
 * @description: TODO 多态
 * @date: 2023/3/19 14:23
 * @version: 1.0
 */
public class Java03_Polymorphism {

    public static void main(String[] args) {
//多态 一个对象在不同场景下表现出来的不同状态和形态

        Person p = new Person();

        p.battle();
        Person p1 = new Boy();
        p1.battle();
        Person p2 = new Girl();
        p2.battle();
//p2.girlBattle();//这段语句无法执行，因为p2是person类型，只能使用其类的方法 多态特性：对对象的使用场景进行约束，即一个对象能使用的功能取决于引用变量的类型

    }


}

class Person {
    void battle() {
        System.out.println(this.getClass() + "杀疯了");
    }

}

class Boy extends Person {
    void battle() {
        System.out.println(this.getClass() + "杀疯了");
    }
}

class Girl extends Person {

    void girlBattle() {
        System.out.println(this.getClass() + "杀疯了");
    }

    void battle() {
        System.out.println(this.getClass() + "杀疯了");
    }
}