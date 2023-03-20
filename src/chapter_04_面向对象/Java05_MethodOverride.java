package chapter_04_面向对象;

/**
 * @projectName: java-tutorial
 * @package: chapter_04
 * @className: Java05_MethodOverride
 * @author: tsukishiro
 * @description: TODO 方法重写
 * @date: 2023/3/19 15:06
 * @version: 1.0
 */
public class Java05_MethodOverride {

    public static void main(String[] args) {
        Parent parent = new Child();
        parent.test();//一个对象能用什么属性和方法取决于引用数据类型，但具体方法执行取决于该具体对象
        Parent parent1 = new Child1();
        parent1.test();//调用父类方法输出父类名字，一个对象的属性具体使用需要看它在哪里声明，而不用看具体对象
    }

}


class Parent {
    String name = "gala";

    void test() {
        System.out.println(name + "没有杀疯");
    }
}

class Child extends Parent {


    //方法的重写：父类方法主要体现通用性，无法在特殊场合下使用，如果子类对象要在特殊场合下进行，那么就需要重写方法的逻辑
    //重写规则：方法名相同，返回值类型相同，参数列表相同
    String name = "gala";

    void test() {
        System.out.println(name + "杀疯了");
    }
}

class Child1 extends Parent {


    //        //方法的重写：父类方法主要体现通用性，无法在特殊场合下使用，如果子类对象要在特殊场合下进行，那么就需要重写方法的逻辑
//        //重写规则：方法名相同，返回值类型相同，参数列表相同
    String name = "gala1";
//        void test(){
//            System.out.println(name+"杀疯了");
//        }
}