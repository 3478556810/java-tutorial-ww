package chapter_04_面向对象;

/**
 * @projectName: java-tutorial
 * @package: chapter_04
 * @className: Java01_Object
 * @author: tsukishiro
 * @description: 面向对象 分析问题时，以问题涉及到的事物为中心的分析方式
 * @date: 2023/3/18 22:48
 * @version: 1.0
 */
public class Java01_Object {
    public static void main(String[] args) {

        //TODO 类和对象
        //类 表示对象的归纳整合 对象表示拥有类的属性和方法的具体事物
//        class 类名{
//            属性，
//            方法
//        }

        Character character =new Character();
        character.name ="Gala";
        character.battle();


    }




}
class Character{

    String name;

    public void battle() {
        System.out.println(name+"五杀了");
    }
}