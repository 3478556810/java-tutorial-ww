package chapter_02;

/**
 * @projectName: java-tutorial
 * @package: chapter_02
 * @className: java03_Datatype
 * @author: tsukishiro
 * @description: 基本数据类型
 * @date: 2023/3/18 13:22
 * @version: 1.0
 */
public class Java03_FundamentalDatatype {

    public static void main(String[] args) {
        //TODO 1.整数类型
        //byte :8位
        byte b = 10;
        //short :16位
        short s = 10;
        //int :32位
        int i = 10;
        //long :64位
        long lon = 10;

        //TODO 2.浮点类型：含有小数点的数据类型
        //根据精度分为：
        // float：单精度；
        float f = 1.0f;
        // double：双精度，浮点数默认双精度
        double d= 2.0;

        //TODO 3.字符类型:用符号标识文字内容
        char c = '@';

        //TODO 4.布尔类型：表示判断条件是否成立，如果成立，取值为true，否则为false
        boolean bln = true;


    }
}
