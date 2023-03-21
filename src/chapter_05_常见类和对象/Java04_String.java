package chapter_05_常见类和对象;

import java.io.UnsupportedEncodingException;


/**
 * @projectName: java-tutorial
 * @package: chapter_05_常见类和对象
 * @className: Java04_String
 * @author: tsukishiro
 * @description: TODO 字符串创建 字符串操作
 * @date: 2023/3/20 22:55
 * @version: 1.0
 */
public class Java04_String {

    public static void main(String[] args) throws UnsupportedEncodingException {
        System.out.println("--------字符串创建--------");
        //字符串 字符 字节
        //name 和name1指向不同字符串，内容相等
        String name = "Gala";//通过字符串直接赋值
        String name1 = new String("Gala");//通过创建新对象
        String name2 = "Gala";
        System.out.println("name 和 name2 内容相等：" + name.equals(name2));
        System.out.println("name 和 name1 内容相等：" + name.equals(name1));

        char[] cs = {'G', 'a', 'l', 'a'};
        String name3 = new String(cs);//通过字符数组创建

        byte[] bs = {-28, -72, -83, -27, -101, -67};//通过字节数组创建
        String name4 = new String(bs, "UTF-8");
        System.out.println(name4);

        String name5 = "\"";//转义字符：如\',\t,\n,\\
        System.out.println(name5);
        System.out.println("\'");
        System.out.println("a\tb");//制表符
        System.out.println("c\nd");//换行符
        System.out.println("e\\f");
        System.out.println("--------字符串创建--------");

        System.out.println("--------字符串操作--------");
        //字符串的拼接操作
        //加号两边任意一个运算数是字符串，则视为字符串拼接操作
        String s1 = 1 + "abc" + 2;//"1abc2"
        String s2 = 1 + 2 + "abc";//"3abc"
        String s3 = s1.concat(s2);//concat()字符串拼接操作
        System.out.println(s3);
        //字符串的比较操作 字符串的每一个字符相等
        String a = "a";
        String b = "A";
        System.out.println("a与b是否相等" + a.equals(b));
        String c = "A";
        //忽略大小写比较
        System.out.println("a与c是否相等" + a.equalsIgnoreCase(c));
        //compareTo():返回值正数，则a>b,返回值负数，则b<a,返回值为0，a=b
        System.out.println("a与b比大小" + a.compareTo(b));//ASill码，’a'大于‘A’
        //忽略大小写比较
        System.out.println("a与b比大小" + a.compareToIgnoreCase(b));
        //字符串的截取操作 substring(param1,param2)
        //param1:截取字符串的起始位置（索引，包含） param2：截取字符串的结束位置（索引，不包含）
        String s = "Hello World";
        System.out.println("substring():" + s.substring(0, s.length()));
        //substring()方法如果只传递一个参数,表示从指定位置开始截取字符串，然后截取到最后
        System.out.println("substring():" + s.substring(6));
        //字符串的分解操作 根据指定的规则将已给的字符串进行分解
        String[] strings = s.split(" ");
        for (String ss : strings
        ) {
            System.out.println("spilt():" + ss);
        }
        //trim() 去掉字符串的首尾空格
        String s4 = " a ";
        System.out.println("trim():-" + s4.trim()+"-");

        //replace() 字符串的替换 只能进行一次替换
        System.out.println("replace():"+s.replace("World","Java"));
        //repalceAll() 根据规则进行替换 进行多个子串替换
        System.out.println("replaceAll():"+s.replaceAll("Hello|World","Java"));//将Hello或World子串替换成Java

        //toLowerCase() toUpperCase() 大小写转换
        String userName="user";
        System.out.println("toUpperCase():"+userName.substring(0,1).toUpperCase().concat(userName.substring(1)));
        //charAt()查询指定位置的字符串
        //indexOf()用于获取子串在字符串中第一次出现的位置
        //lastIndexOf()用于获取子串在字符串中最后一次出现的位置
        //contains()是否包含指定子串，返回布尔类型
        //endWith()判断字符串是否以指定子串结尾
        //isEmpty()判断字符串是否为空

        //StringBuilder :构建字符串 底层用数组拼接字符串而不是构建大量新字符串
        StringBuilder stringBuilder=new StringBuilder();
//        for (int i=0;i<100;i++){
//            stringBuilder.append(i);
//
//        }
        stringBuilder.append("abc");
        System.out.println("stringBuilder:"+stringBuilder.toString());
        System.out.println("stringBuilder.length():"+stringBuilder.length());
        System.out.println("stringBuilder.reverse():"+stringBuilder.reverse());
        System.out.println("stringBuilder.insert():"+stringBuilder.insert(1,"d"));

        System.out.println("--------字符串操作--------");

    }
}
