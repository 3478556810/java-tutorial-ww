package chapter_05_常见类和对象;

import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

/**
 * @projectName: java-tutorial
 * @package: chapter_05_常见类和对象
 * @className: Java06_OtherClass
 * @author: tsukishiro
 * @description: TODO 其他类
 * @date: 2023/3/21 15:14
 * @version: 1.0
 */
public class Java06_OtherClasses {

    public static void main(String[] args) throws ParseException {

        System.out.println("-------日期类&日历类--------");
        //时间戳 ms
        System.out.println(System.currentTimeMillis());

        //Date 日期类

        Date date = new Date();
        System.out.println(date);
        //Java 格式化日期格式：
        //y(Y)->年 yyyy（四位）
        //m(M)->MM:月份 mm：分钟
        //d(D)->dd:一个月中的日期 D:一年中的日期
        //h(H)->h:12进制 H:24进制
        //s(S)->s:秒 S:毫秒
        //日期->字符串
        System.out.println((new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:sss")).format(date));

        //字符串->日期
        System.out.println(new SimpleDateFormat("yyyy-MM-dd").parse("2022-06-01"));


        //根据时间戳构建指定的日期对象
        //date.setTime(System.currentTimeMillis());
        //获取时间戳
        //date.getTime();

        //before() after() 判断日期的早晚


        //Calendar 日历类
        //打印当前日期
        System.out.println("周一\t周二\t周三\t周四\t周五\t周六\t周日");
        //获取当前日期的日历对象
        Calendar firstDate = Calendar.getInstance();
        //把日历对象设定为当前月的第一天
        firstDate.set(Calendar.DAY_OF_MONTH, 1);
        //获取当前月的最大日期
        int maxDay = firstDate.getActualMaximum(Calendar.DAY_OF_MONTH);
        for (int i = 0; i < maxDay; i++) {
            //当前日期是周几
            int weekX = firstDate.get(Calendar.DAY_OF_WEEK);
            //当前日期是几号
            int monthY = firstDate.get(Calendar.DAY_OF_MONTH);

            if (i == 0) {
                if (weekX == Calendar.SUNDAY) {
                    for (int j = 0; j < 6; j++)
                        System.out.print("\t");
                    System.out.println(monthY);

                } else {
                    for (int j = 0; j < weekX - 2; j++)
                        System.out.print("\t");
                    System.out.print(monthY);
                    System.out.print("\t");
                }
            } else {

                if (weekX == Calendar.SUNDAY)
                    System.out.println(monthY);
                else {
                    System.out.print(monthY);
                    System.out.print("\t");
                }
            }
            firstDate.add(Calendar.DATE, 1);
        }
        System.out.println("\n-------日期类&日历类--------");
        System.out.println("-------工具类--------");

        System.out.println("StringUtil.isEmpty：" + StringUtil.isEmpty(null));
        System.out.println("StringUtil.isEmpty：" + StringUtil.isEmpty(""));
        System.out.println("StringUtil.isEmpty：" + StringUtil.isEmpty("  "));
        System.out.println(StringUtil.makeString());
        System.out.println(StringUtil.makeString("abbvddf232232", 6));
        System.out.println(StringUtil.formatDate(new Date(), "yyyy-MM-dd"));
        System.out.println(StringUtil.parseDate("2023-06-01", "yyyy-MM-dd"));
        System.out.println("-------工具类--------");
    }

}

class StringUtil {
    //非空判断
    public static boolean isEmpty(String str) {

        if (str == null || "".equals(str.trim()))
            return true;
        return false;
    }

    //生成字符串
    public static String makeString() {
        return UUID.randomUUID().toString();
    }

    public static String makeString(String from,int len) {
        if(len < 1){
            return "";
        }else {
            char[] chars=from.toCharArray();
            StringBuilder stringBuilder =new StringBuilder();

            for(int i=0;i<len;i++){
                Random random =new Random();
                int j =random.nextInt(chars.length);
                char c =chars[j];
                stringBuilder.append(c);
            }
            return stringBuilder.toString();
        }


    }

    //转换字符串 ISO08859-1 -> str -> UTF-8
    public static String transform(String source,String encodeFrom,String encodeTo) throws UnsupportedEncodingException {
     byte[] bytes =source.getBytes(encodeFrom);
     return new String(bytes,encodeTo);

    }
   //日期<->字符串
    public static Date parseDate(String dateString,String format) throws ParseException {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat(format);
        return simpleDateFormat.parse(dateString);
    }
    public static String formatDate(Date date,String format) throws ParseException {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat(format);
        return simpleDateFormat.format(date);
    }
}