package chapter_04_面向对象;

/**
 * @projectName: java-tutorial
 * @package: chapter_04_面向对象
 * @className: Java10_Enum
 * @author: tsukishiro
 * @description: TODO 枚举
 * @date: 2023/3/20 14:23
 * @version: 1.0
 */
public class Java10_Enum {

    public static void main(String[] args) {
        //枚举 特殊的类，包含了一组特定的对象，这些对象不会发生改变

        System.out.println(City.BEIJING.name);
        System.out.println(MyCity.BEIJING.name);
    }
}


class MyCity{

    public String name;

    public int code;


    private MyCity(String name,int code){
        this.name=name;
        this.code=code;
    }

    public static final MyCity BEIJING = new MyCity("北京",1001);
}


enum City
{
    //枚举类会将对象放在最前面，和后面的语法需要分号隔开
    //枚举类不能创建对象，它的对象是在内部自行创建
    BEIJING("北京",1001),SHANGHAI("上海",1002);

    City(String name,int code){
        this.name=name;
        this.code=code;
    }

    public String name;

    public int code;

}