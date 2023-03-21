package chapter_05_常见类和对象;

/**
 * @projectName: java-tutorial
 * @package: chapter_05_常见类和对象
 * @className: Java02_ArrayList
 * @author: tsukishiro
 * @description: TODO 数组
 * @date: 2023/3/20 15:31
 * @version: 1.0
 */
public class Java02_Array {

    public static void main(String[] args) {

        //数组声明：类型[] 变量 = new 类型[num]
        String[] names = new String[3];
        names[0] = "wuxing";
        names[1] = "uzi";
        names[2] = "gala";
        for (String name : names) {
            System.out.println(name);
        }
        //二维数组
        //String[][] namess={{"wuxing","uzi","gala"},{"wuxing"}};
int [][] num=new int[3][3];
        num[2][1]=0;
        for (int row=0;row< 3;row++) {
            for (int col = 0; col < 3; col++)
                System.out.printf(String.valueOf(num[row][col])+" ");
            System.out.println();
        }
    }
}


