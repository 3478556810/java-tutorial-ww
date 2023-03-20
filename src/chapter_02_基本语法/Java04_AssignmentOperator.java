package chapter_02_基本语法;

/**
 * @projectName: java-tutorial
 * @package: chapter_02
 * @className: java04_Operator
 * @author: tsukishiro
 * @description: 运算符--赋值运算符
 * @date: 2023/3/18 14:41
 * @version: 1.0
 */
public class Java04_AssignmentOperator {

    public static void main(String[] args) {
        //复合赋值运算符：元素进行运算后重新赋值给自己，可以进行简化操作 元素 运算符= 元素
        int i = 0;
        i += 2;
        System.out.println(i);

        byte b =2;
        // b = b + 2; 这段语句是错误的，因为表达式结果为int型，不能用表示范围比它小的byte接数据
        b+=2;//使用复合赋值运算符，数据类型不会发生变化
        System.out.println(b);
    }


}
