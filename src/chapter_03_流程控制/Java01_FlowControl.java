package chapter_03_流程控制;

/**
 * @projectName: java-tutorial
 * @package: chapter_03
 * @className: java01_FlowControl
 * @author: tsukishiro
 * @description: TODO 流程控制 对指令代码的执行顺序进行控制
 * @date: 2023/3/18 22:01
 * @version: 1.0
 */
public class Java01_FlowControl {
    public static void main(String[] args) {
        //1.顺序执行
        //2.分支执行
        //双分支
        if(10==10)
        System.out.println("1");
       else System.out.println("2");
       //多分支(只执行第一个条件为true的表达式)
        if(10==10)
            System.out.println("1");
        else if(20==20) System.out.println("2");
        else System.out.println("3");
        //特殊分支 switch语句 如果不加break,第一个case匹配正确后面代码将不进行判断便顺序执行

        switch (40){
            case 10:
                System.out.println(1);
                break;
            case 20 :
                System.out.println(2);
                break;
            case 30:
                System.out.println(3);
                break;
            default:
                System.out.println("其他分支");//默认执行
        }

        //3.循环执行
        //1.while
       int  b=0;
        while (--b<0) //b=-1
        {
            System.out.println("wwwhile");
            b++;//b=0
            b++;//b=1
        }
        //b=0
        //2.do...while 无论while判断条件结果是否为true，do里面的代码块至少执行一次

        do{

            System.out.println("dowhile");
        }
        while (b!=0);
        //3.for(初始化表达式；条件表达式；更新表达式)
        for(int i =0;i<1;i++){
            System.out.println("for");
        }
        //4. break 跳出循环 continue 跳出本次循环

    }
}
