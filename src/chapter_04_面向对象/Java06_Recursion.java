package chapter_04_面向对象;

/**
 * @projectName: java-tutorial
 * @package: chapter_04
 * @className: Java06_Recursion
 * @author: tsukishiro
 * @description: TODO 递归
 * @date: 2023/3/19 15:29
 * @version: 1.0
 */
public class Java06_Recursion {
    //递归 方法调用自身

    public static void main(String[] args) {
        System.out.println(compute(10));
    }

    public static int compute(int num) {
        num = num % 2 ==0 ? num - 1 : num;
        if (num == 1)
            return 1;
        else return num+ compute(num-2);



    }
}
