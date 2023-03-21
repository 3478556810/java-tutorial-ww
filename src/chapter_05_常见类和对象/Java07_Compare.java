package chapter_05_常见类和对象;

import java.util.HashMap;

/**
 * @projectName: java-tutorial
 * @package: chapter_05_常见类和对象
 * @className: Java07_Compare
 * @author: tsukishiro
 * @description: TODO 比较
 * @date: 2023/3/21 21:03
 * @version: 1.0
 */
public class Java07_Compare {

    public static void main(String[] args) {
        //比较
//        //基本数据类型 双等号比较数值
//        int i=10;
//        float j=10.0f;
//        System.out.println(i==j);
//        //引用数据类型 双等号比较变量的内存地址
//        String s1="abc";
//        String s2="abc";
//        String s3=new String("abc");//虽然内容相等，但创建了新的字符串对象，故与s1不等
//        System.out.println(s1==s2);
//        System.out.println(s1==s3);
//        System.out.println(s1.equals(s2));
//
//        User7 user1=new User7();
//        User7 user2=new User7();
//        System.out.println(user1==user2);
//        System.out.println(user1.equals(user2));//引用类型,如String 类重写了equals()，故可以比较内容，而自定义类创建对象的equals()等同于双等号（没有重写）
          //包装类型
          //int -> Integer -> JVM 为了操作方便 简化了很多操作
          //Integer缓存：-128~127 在该范围内无需创建新对象
         Integer i1= 100; //Integer i1= Integer.valueOf(200)
         Integer i2 = 100;
        System.out.println("Integer 比较是否相等（==）使用IntegerCache："+(i1==i2));
        Integer i3= 128;
        Integer i4 = 128;
        System.out.println("Integer 比较是否相等（equals（））比较内容："+(i3.equals(i4)));

    }
}

class User7{


    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }
}
