package chapter_05_常见类和对象;

import java.util.HashMap;

/**
 * @projectName: java-tutorial
 * @package: chapter_05_常见类和对象
 * @className: Java01_Object
 * @author: tsukishiro
 * @description: TODO Object
 * @date: 2023/3/20 15:15
 * @version: 1.0
 */
public class Java01_Object {



    public static void main(String[] args) {
        //java.lang.Object 对象
        Object object =new Person();
        System.out.println(object);//十六进制哈希值
        //hashCode() 获取对象的内存地址
        System.out.println(object.hashCode());//十进制哈希值
        //equals() 判断两个对象是否相等 默认比较内存地址
        System.out.println(object.equals(new Person()));
        //getClass() 获取对象的类型信息
        System.out.println(object.getClass().getSimpleName());
        System.out.println(object.getClass().getPackageName());


    }

}

class Person{



//    //toString（）默认打印内存地址
//    @Override
//    public String toString() {
//        return String.valueOf(Person.class);
//    }


//    @Override
//    public boolean equals(Object obj) {
//        return super.equals(obj);
//    }
}

class User extends Person{


}