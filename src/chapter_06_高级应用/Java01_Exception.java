package chapter_06_高级应用;

/**
 * @projectName: java-tutorial
 * @package: chapter_06_高级应用
 * @className: Java01_Exception
 * @author: tsukishiro
 * @description: TODO 异常
 * @date: 2023/3/21 21:31
 * @version: 1.0
 */
public class Java01_Exception {
    public static void main(String[] args) throws Exception {

//        //1.类型转换错误 语法错误
//        //Integer i =(Integer) "s";
//        Integer i = Integer.parseInt("s");
//
//        //2.递归没有跳出逻辑，StackOverFloatError
//        //Error JVM自动停止 尽量避免
//        test();
//
//        //3.访问一个为空对象的成员方法或属性，java.lang.NullPointerException
//        //Exception 分为两大类
//        //1.运行期异常：可以通过代码恢复正常逻辑执行的异常 RuntimeException
//        //2.编译器异常：不可以通过代码恢复正常逻辑执行的异常 Exception
//        User user = null;
//        System.out.println(user.toString());



        /*
       异常处理语法：
       try{
       可能出现异常的代码
       如果出现异常，JVM会将异常进行封装，形成一个具体的异常类，然后将这个异常抛出
       所有的异常对象都可以抛出
       }
       //优先捕捉范围小的异常
       catch(抛出的异常对象 对象引用){
       异常的解决方案
       }
       catch(){}
       finally{
       最终执行的代码逻辑
       }
         */

//        int i1 = 0;
//        int j = 0;
//
//        try{
//            j=10/i1;
//        }catch (ArithmeticException e)
//        {
//            //错误的信息
//            e.getMessage();
//            e.getCause();
//            e.printStackTrace();
//            i1=10;
//            j=10/i1;
//
//        }finally {
//            System.out.println("最终执行的代码");
//        }
//
//        System.out.println(j);

        //1.算术异常：java.lang.ArithmeticException 运行期异常
        //2.空指针异常:java.lang.NullPointerException
//        User user1=null;
//
//        try {
//            //System.out.println(user1.toString());
//            //使用null对象的成员变量或方法会空指针异常，但使用其静态方法和属性则不会
//            System.out.println(user1.name);
//        }catch (NullPointerException e){
//            System.out.println("对象为空，需要分析原因");
//        }
        //3.索引越界 java.lang.ArrayIndexOutOfBoundsException
//        int[] array=new int[2];
//        array[0]=0;
//        array[1]=1;
//        array[3]=3;
//        //字符串索引越界 java.lang.StringIndexOutOfBoundsException
//        String s="abc";
//        System.out.println(s.charAt(3));
//        s.substring(3);//substring()的参数大于字符串长度才报错

//        //4.格式化异常 java.lang.NumberFormatException
//        String s4="avc";
//        System.out.println(Integer.parseInt(s4));

//        //5.类型转换异常 java.lang.ClassCastException
//        Object object =new User();
//        if(object instanceof Emp) {
//            Emp emp = (Emp) object;
//        }

//
//        User user = new User();
//
//        int i = 10;
//        int j = 0;
//
//        try {
//            user.test(i, j);
//        } catch (Exception e) {
//
//            e.printStackTrace();
//        }



        try {
            login("admin","1234");

        }catch (AccountException accountException){
            System.out.println("账号不正确");
        }catch (PasswordException passwordException){
            System.out.println("密码不正确");
        }catch (LoginException loginException){
            System.out.println("其他错误信息");
        }

    }


    public static void test() {
        System.out.println("静态方法调用");

    }

    public static void login(String account, String password) {
        if (!"admin".equals(account)) {
            throw new AccountException("账号不正确");
        }
        if (!"123".equals(password)) {
            throw new PasswordException("密码不正确");
        }

    }

}
//自定义异常类
class LoginException extends RuntimeException{
    public LoginException(String message){
        super(message);
    }
    }
    class AccountException extends LoginException{

        public AccountException(String message) {
            super(message);
        }
    }
    class PasswordException extends LoginException{

        public PasswordException(String message) {
            super(message);
        }
    }





class User {

    public static String name = "Gala";
    //throws
    //如果方法可能出现异常，需要提前声明 异常转换
    public void test(int i, int j) throws Exception {

        try {
            System.out.println(i / j);
        } catch (ArithmeticException e) {
            throw new Exception();//如果程序种需要手动抛出异常对象，那么需要使用throw new 异常对象
        }
    }
}

class Emp {


}