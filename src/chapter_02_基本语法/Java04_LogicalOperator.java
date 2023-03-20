package chapter_02_基本语法;

/**
 * @projectName: java-tutorial
 * @package: chapter_02
 * @className: java04_Operator
 * @author: tsukishiro
 * @description: 运算符--逻辑运算符
 * @date: 2023/3/18 14:41
 * @version: 1.0
 */
public class Java04_LogicalOperator {

    public static void main(String[] args) {
       //逻辑运算符:用于描述多个条件表达式之间的关系的运算符
        // &,与运算，参与运算的的表达式都为真，结果为真
        int i = 6;
        System.out.println((i>5)&(i<7));//true
        // |,或运算，参与运算的的表达式一个为真，结果为真
        System.out.println((i>5)|(i<5));//true
        // &&,短路与运算，根据第一个表达式结果判断是否执行第二个表达式，节省资源
        int j = 6;
        System.out.println((i>6)&&(++j<7));//false
        System.out.println(j);//上一行第一个表达式为false，短路与运算结果直接为false，不会执行第二个表达式，故j的值仍为6
        System.out.println((i==6)||(++j<7));//true
        System.out.println(j);//上一行第一个表达式为true，短路或运算结果直接为true，不会执行第二个表达式，故j的值仍为6
        //!, 逻辑非运算
        System.out.println(!(10==10));//false
    }


}
