package chapter_04_面向对象;

/**
 * @projectName: java-tutorial
 * @package: chapter_04
 * @className: Java02_Instance
 * @author: tsukishiro
 * @description: TODO 构造方法 继承
 * @date: 2023/3/19 13:43
 * @version: 1.0
 */
public class Java02_Instance {

    public static void main(String[] args) {
        //当类中无构造方法，JVM会自动添加一个无参的构造方法
        //如果类中有构造方法，JVM不会提供默认的构造方法（公共无参）
        //Role role=new Role();
        //有参的构造方法，通常用于对象的属性初始化
        //Role role1=new Role("Gala");
        //子类通过传参
        new Player1().battle("Gala");
        //父类对象是在子类对象创建前完成的。创建子类对象，会调用父类对象的构造方法
        Player1 player1 =new Player1();
    }
}


class Role{
    String name;
    Role(){
        System.out.println("父类创建");
    }
    Role(String name){this.name=name;}

    void battle(){
        System.out.println(name+"杀疯了");
    }
    void battle(String name){
        System.out.println(name+"杀疯了");
    }
}

//面向对象三特性：继承、封装、多态
//extends 继承：一个子类只能继续一个父类，一个父类能同时拥有多个子类
//子类自动拥有父类的属性和方法(除构造方法)
class Player1 extends Role{
//super 上一级（父类） this 当前类
Player1(){
  //super() 进行父类的构造方法执行从而继承父类属性和方法（不会创建父类对象） 子类创建前会JVM会自动执行该语句进行父类无参构造（当父类不是只有有参构造时）
    System.out.println("子类创建");
}
    @Override
    void battle() {
        super.battle();
    }
}


