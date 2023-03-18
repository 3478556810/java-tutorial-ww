package chapter_02;

/**
 * @projectName: java-tutorial
 * @package: chapter_02
 * @className: java04_Operator
 * @author: tsukishiro
 * @description: 运算符--算术运算符
 * @date: 2023/3/18 14:41
 * @version: 1.0
 */
public class Java04_ArithmeticOperator {

    public static void main(String[] args) {
        //TODO 运算符：参与数据或逻辑运算的符号，无法自行定义

        //TODO 表达式：采用运算符和数据连接在一起形成符合Java语法规范的代码
        //1. 二元运算符：两个元素参与运算 算术表达式=元素1 二元运算符 元素2，结果类型取参与元素类型最大的那个，最小的结果类型是int
        //2. 一元运算符：一个元素参与运算，
        //自增++，自增--
        int i = 0;
        //int j=i;
        //i = i + 1;
        int j = i++;
        System.out.println("i=" + i);
        System.out.println("j=" + j);
    }


}
