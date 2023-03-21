package chapter_05_常见类和对象;

/**
 * @projectName: java-tutorial
 * @package: chapter_05_常见类和对象
 * @className: Java05_PackagingClass
 * @author: tsukishiro
 * @description: TODO 包装类
 * @date: 2023/3/21 15:07
 * @version: 1.0
 */
public class Java05_PackagingClass {
    public static void main(String[] args) {
        //byte short int long
        //float double
        //char
        //boolean
        //--包装类--
        //Byte Short Integer Long
        //Float Double
        //Character
        //Boolean
        int i=10;

        //自动装箱 基本数据类型->包装类型
        //Integer i1=Integer.valueOf(i);
        Integer i1=i;//JVM自动转换
        //自动拆箱 包装类型->基本数据类型
        //int i2=i1.intValue();
        int i2=i1;


    }
}
