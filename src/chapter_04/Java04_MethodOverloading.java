package chapter_04;

/**
 * @projectName: java-tutorial
 * @package: chapter_04
 * @className: Java04_MethodOverloading
 * @author: tsukishiro
 * @description: TODO 方法重载
 * @date: 2023/3/19 14:40
 * @version: 1.0
 */
public class Java04_MethodOverloading {
    public static void main(String[] args) {
        new User();
//        AAA aaa = new BBB ();//多态：限制了对象的使用场景，给予一个BBB对象，但会当成AAA对象使用
//        test(aaa);

BBB bbb =new BBB();
test(bbb);//虽然该方法没有BBB类型参数，但会自动提升数据类型至其父类 BBB->AAA->Object

    }
//方法的重载：方法名相同，参数列表不同（个数，顺序，类型）
    private static void test(AAA aaa) {
        System.out.println("aaa");
    }

//    private static void test(BBB bbb) {
//        System.out.println("bbb");
//    }


}

class User {

    User() {
        this("Gala");
    }

    User(String name) {

        this(name, "男");
    }

    User(String name, String sex) {

        System.out.println(name + ",性别：" + sex);

    }
}

class AAA
{


}

class BBB extends  AAA
{


}