package chapter_06_高级应用;

import javax.xml.crypto.Data;
import java.io.*;
import java.util.Date;

/**
 * @projectName: java-tutorial
 * @package: chapter_06_高级应用
 * @className: Java03_IO
 * @author: tsukishiro
 * @description: TODO IO
 * @date: 2023/3/22 21:54
 * @version: 1.0
 */
public class Java03_IO {
    public static void main(String[] args) throws IOException {
        //Java数据流转操作
        System.out.println("-------文件流------");

        //File:文件类型（文件，文件目录），属于Java.io
        //创建文件对象，使用文件路径关联系统文件
        File file = new File("C:\\java-tutorial\\java-tutorial\\data");
        System.out.println(file);
        //文件对象的操作
//        //判断当前文件对象是否是文件
//        System.out.println(file.isFile());
//        //判断当前文件对象是否是目录
//        System.out.println(file.isDirectory());
//        //判断文件对象是否存在关联
//        System.out.println(file.exists());
        if (file.exists()) {
            System.out.println("文件对象存在");
            if (file.isFile()) {
                System.out.println("该对象是一个文件");
                System.out.println(file.getName());
                System.out.println(file.length());
                System.out.println(file.lastModified());
                System.out.println(file.getAbsolutePath());
            } else if (file.isDirectory()) {
                System.out.println("该对象是一个文件目录");
                System.out.println("目录名：" + file.getName());
                Date date = new Date();
                date.setTime(file.lastModified());
                System.out.println("上次修改的时间：" + date);
                System.out.println("文件的绝对路径:" + file.getAbsolutePath());
                //获取该目录下的文件名并转为字符串数组
                String[] list = file.list();
                for (String s : list
                ) {
                    System.out.println("包含文件名：" + s);
                }

            }


        } else System.out.println("文件对象不存在");

        String filePath = "C:\\java-tutorial\\java-tutorial\\data\\newFile\\word.txt";
        File newFile = new File(filePath);
        //创建多级文件目录
        //newFile.mkdirs();
        //创建新文件
        newFile.createNewFile();

        System.out.println("-------文件流------");
        System.out.println("-------文件复制------");
        //数据源文件对象
        File srcFile =new File("C:\\java-tutorial\\java-tutorial\\data\\word.txt");
        //数据目的地文件对象（自动生成）
        File destFile =new File("C:\\java-tutorial\\java-tutorial\\data\\word.txt.copy");
        //文件输入流（管道对象）
        FileInputStream fileInputStream=null;
        //文件输出流（管道对象）
        FileOutputStream fileOutputStream=null;
        try {
            fileInputStream=new FileInputStream(srcFile);
            fileOutputStream=new FileOutputStream(destFile);
            //如果文件数据全部读取完毕，那么再去读取数据，读取的结果就是-1，表示无效（结尾）
            //打开阀门，流转数据(输入)

            int data;
            while ((data=fileInputStream.read())!=-1)
            //打开阀门，流转数据(输出)
            {
                fileOutputStream.write(data);

            }

            System.out.println("文件复制完成");

        }catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }finally {
            if(fileInputStream!=null)
                try {
                    fileInputStream.close();
                }catch (IOException e)
                {
                    throw new RuntimeException(e);
                }

            if(fileOutputStream!=null)
                try {
                    fileOutputStream.close();
                }catch (IOException e)
                {
                    throw new RuntimeException(e);
                }

        }


        System.out.println("-------文件复制------");

        System.out.println("-------缓冲区------");
        //数据源文件对象
        File srcFile1 = new File("C:\\java-tutorial\\java-tutorial\\data\\newFile\\word.txt");
        //数据目的地文件对象（自动生成）
        File destFile1 = new File("C:\\java-tutorial\\java-tutorial\\data\\newFile\\word.txt.copy");
        //文件输入流（管道对象）
        FileInputStream fileInputStream1 = null;
        //文件输出流（管道对象）
        FileOutputStream fileOutputStream1 = null;
        fileInputStream1 = new FileInputStream(srcFile1);
        fileOutputStream1 = new FileOutputStream(destFile1);


        //缓存输入流（管道对象）
        BufferedInputStream bufferedInputStream = null;
        //缓存输出流（管道对象）
        BufferedOutputStream bufferedOutputStream = null;
        //缓冲区
        byte[] cache = new byte[1024];


        try {
            bufferedInputStream = new BufferedInputStream(fileInputStream1);
            bufferedOutputStream = new BufferedOutputStream(fileOutputStream1);
            int data;

            while ((data = bufferedInputStream.read(cache)) != -1) {     //打开阀门，流转数据(输出)
                bufferedOutputStream.write(cache, 0, data);

            }

            System.out.println("缓冲区下的文件复制完成");

        } finally {
            if (bufferedInputStream != null)
                try {
                    bufferedInputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

            if (bufferedOutputStream != null)
                try {
                    bufferedOutputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

        }


        System.out.println("-------缓冲区------");
        System.out.println("-------字符流------");
        //数据源文件对象
        File srcFile2 =new File("C:\\java-tutorial\\java-tutorial\\data\\word1.txt");
        //数据目的地文件对象（自动生成）
        File destFile2 =new File("C:\\java-tutorial\\java-tutorial\\data\\word2.txt.copy");
        //字符输入流（管道对象）
        BufferedReader bufferedReader=null;
        //字符输出流（管道对象）
        PrintWriter printWriter=null;
        try {
            bufferedReader=new BufferedReader(new FileReader(srcFile2));
            printWriter=new PrintWriter(destFile2);
            //如果文件数据全部读取完毕，那么再去读取数据，读取的结果就是-1，表示无效（结尾）
            //打开阀门，流转数据(输入)
            //读取文件的一行数据（字符串）
            String line=null;
            while ((line=bufferedReader.readLine())!=null)
            //打开阀门，流转数据(输出)
            {
                System.out.println("bufferedReader.readLine():"+line);
                printWriter.println(line);

            }
            //刷写数据
            printWriter.flush();


        }catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }finally {
            if(bufferedReader!=null)
                    bufferedReader.close();
            if(printWriter!=null)
                    printWriter.close();
        }
        System.out.println("-------字符流------");
        System.out.println("-------序列化------");
        //数据文件对象
        File dataFile =new File("C:\\java-tutorial\\java-tutorial\\data\\obj.txt");
        //对象输出流（管道对象）
        ObjectOutputStream objectOutputStream =null;
        //文件输出流（管道对象）
        FileOutputStream fileOutputStream3=null;
        //对象输入流（管道对象）
        ObjectInputStream objectInputStream =null;
        //文件输出流（管道对象）
        FileInputStream fileInputStream3=null;

        try {

            fileOutputStream3=new FileOutputStream(dataFile);
            objectOutputStream=new ObjectOutputStream(fileOutputStream3);
            User3 user3=new User3();
            objectOutputStream.writeObject(user3);
            objectOutputStream.flush();
            fileInputStream3=new FileInputStream(dataFile);
            objectInputStream=new ObjectInputStream(fileInputStream3);
            Object o=objectInputStream.readObject();
            System.out.println("反序列化对象："+o);


        }catch (Exception e){
            throw new RuntimeException(e);
        }finally {


            if(objectOutputStream!=null)
                try {
                    objectOutputStream.close();
                }catch (IOException e)
                {
                    throw new RuntimeException(e);
                }

        }






        System.out.println("-------序列化------");



    }
}

class User3 implements Serializable{

}