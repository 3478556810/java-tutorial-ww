package chapter_06_高级应用;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @projectName: java-tutorial
 * @package: chapter_06_高级应用
 * @className: Java04_Thread
 * @author: tsukishiro
 * @description: TODO 线程
 * @date: 2023/3/23 14:49
 * @version: 1.0
 */
public class Java04_Thread {

    public static void main(String[] args) throws InterruptedException {

        //线程
        //Thread 线程类
        //currentThread 方法用于获取当前正在运行的线程
        //getName()获取线程的名称
        //main方法运行在main线程中
        //1.Java程序在运行时默认产生一个进程
        //2.这个进程会有一个主线程
        //3.代码都在主线程中执行
        //main线程优先于其他子线程开始运行

        System.out.println("-------线程的基本操作------");

        //创建线程
        MyThread thread = new MyThread();
        //启动线程（异步）
        thread.start();
        System.out.println(Thread.currentThread().getName());

        System.out.println("-------线程的基本操作------");

        System.out.println("-------线程的执行方式------");
        //执行方式 串行、并行
        //串行执行：多个线程连接成串 顺序执行
        //并发执行：多个线程独立 谁争夺了处理机资源 谁就能进行
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.start();
        t1.join();//join() 在t.join()之后的代码都随着main线程陷入等待而无法继续执行 从而实现进程的串行
        t2.start();
        t2.join();

        System.out.println("-------线程的执行方式------");


        System.out.println("-------线程的休眠------");

        Thread.sleep(3000);//线程的状态进入定时等待状态

        System.out.println("main线程执行完毕");

        System.out.println("-------线程的休眠------");
        System.out.println("-------线程的构建------");
        //构建线程对象时，可以只把逻辑传递给这个对象
        //语法 （）->{逻辑}
        Thread thread1 = new Thread(() -> {
            System.out.println("线程thread1执行");
        });
        thread1.start();
        thread1.join();
        //构建线程对象时，可以传递实现Runnable接口的类的对象 匿名类 new Interface(){重写方法}
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程thread2执行");
            }
        });
        thread2.start();
        thread2.join();
        System.out.println("-------线程的构建------");
        System.out.println("-------线程池------");
        //线程池：线程对象的容器
        //可以根据需要，在启动时，创建一个或多个线程对象
        //Java有四种比较常见的线程对象
        //1.创建固定数量的线程对象
        //ExecutorService 线程服务对象
        //ExecutorService executorService = Executors.newFixedThreadPool(3);
        //2.根据需求动态创建线程 会根据情况重复使用线程
        //ExecutorService executorService = Executors.newCachedThreadPool();
        //3.单一线程
        //ExecutorService executorService = Executors.newSingleThreadExecutor();
        //4.定时调度线程 每个线程什么时候执行可以去定义
        ExecutorService executorService = Executors.newScheduledThreadPool(3);
        for (int i = 0; i < 5; i++)
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName());
                }
            });


        System.out.println("-------线程池------");
        System.out.println("-------线程同步------");

        //synchronized 同步关键字
        //多个线程访问同步方法，只能一个一个访问，同步操作 如HashTable 优点：安全
        //synchronized修饰代码块，成为同步代码块
        //语法:synchronized(用于同步的对象){处理逻辑}

        Num num = new Num();

        new User6(num)
                .start();

        new Bank(num)
                .start();

        System.out.println("-------线程同步------");
        System.out.println("-------线程堵塞------");
        //wait() sleep()
        //1.实质
        //wait:等待
        //sleep:休眠
        //2.从属关系
        //wait:Object 成员方法
        //sleep:Thread 静态方法
        //3.使用方式
        //wait:只能使用在同步代码中
        //sleep:可以在任意地方使用
        //4.堵塞时间
        //wait:超时时间 会发生错误
        //sleep:休眠时间 不会发生错误
        //5.同步处理
        //wait:如果执行wait(),其他进程有机会执行同步操作
        //sleep:如果执行sleep(),其他进程没有机会执行同步操作



        System.out.println("-------线程堵塞------");
        System.out.println("-------线程安全------");
        //所谓的线程安全问题，其实就是多个线程在并发执行时，修改了共享内存中共享对象的属性，从而导致的数据冲突问题
        User6 user61=new User6();

        Thread t6 =new Thread(()->{
            user61.name="Gala";
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(user61.name);
        });

        t6.start();
        Thread t7 =new Thread(()->{
            user61.name="Uzi";
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(user61.name);
        });

        t7.start();
        //结果：返回两个字符串都为“uzi“
        //原理：每创建一个线程，JVM会在栈内存分配一个独立空间
        //而创建一个对象，会在堆内存创建一个对象，两个线程并发执行,共享一个堆内存的同一个对象
        //修改了共享对象的属性,发生数据冲突
        System.out.println("main线程执行完毕");
        System.out.println("-------线程安全------");


    }


}

class Num {
}

class Bank extends Thread {
    private Num num;

    public Bank(Num num) {
        this.num = num;
    }

    public void run() {
        synchronized (num) {


            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("开门，开始叫号");
            num.notifyAll();//唤醒所有堵塞进程
        }
    }
}

class User6 extends Thread {
    public String name;
    private Num num;
    User6(){}
    public User6(Num num){
        this.num = num;
    }

    public void run() {

        synchronized (num){
            System.out.println("我是号码1，银行还没开门，我需要等一会儿");
            try {
                num.wait();//将进程进入堵塞状态
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("叫到我的号了,该我办业务了");
        }
    }
//    public synchronized  void test(){
//
//    }

}


class MyThread extends Thread {


    @Override
    public void run() {
        System.out.println("MyThread:" + Thread.currentThread().getName());
    }
}


