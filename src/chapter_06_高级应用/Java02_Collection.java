package chapter_06_高级应用;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @projectName: java-tutorial
 * @package: chapter_06_高级应用
 * @className: Java02_ArrayList
 * @author: tsukishiro
 * @description: TODO 集合
 * @date: 2023/3/22 14:05
 * @version: 1.0
 */
public class Java02_Collection {

    public static void main(String[] args) {

        //集合：数据的容器，用来容纳数据
        //Java 提供了完整的集合框架 包含了对不确定个数的有关系数据处理的集合类

        //为什么引出集合
        //数组在创建时必须指明元素个数，在数据个数不确定的场合，数组使用起来不是很方便（初始指定元素个数多了浪费资源，少了越界异常）

        //根据数据的不同 Java集合分为2大体系
        //1.单一数据体系  Collection接口
        //常用子接口：
        // 1.List 按照插入顺序保存数据 数据可以重复 具体的实现类 ArrayList，LinkedList
        // 2.Set 集，无序，数据不重复 具体的实现类：HashSet
        // 3.Queue 队列 具体的实现类:ArrayBlockingQueue
        //2.键值对数据体系 Map接口 具体的实现类：HashMap HashTable

        //Collection - List
        //ArrayList: Array+List
        //Array:ArrayList底层使用数组进行存储操作
        //List:ArrayList按照数据插入顺序进行存储

        ArrayList list = new ArrayList(1);
        //1.无参构造，底层数组为空数组
        //2.传递一个int参数,用来设定底层数组的长度
        //3.传递一个集合类型的数据,相当于将其他集合的数据放置在当前集合中

        //ArrayList的基本操作
        System.out.println("-----ArrayList的基本操作-----");
        //增加数据
        //添加数据时，如果集合没有任何的数据，那么底层会创建长度为10的数组
        list.add("gala");
        list.add("uzi");//ArrayList 底层数组会进行扩容 ：扩容后的新数组索引指向旧元素和新元素 废弃旧数组
        //访问集合中的数据
//        for (int i=0;i<list.size();i++)
//            System.out.println("集合中的数据："+list.get(i));
        for (Object obj : list
        ) {
            System.out.println("集合中的数据：" + obj);
        }
        //修改集合中的数据
        //list.set() 第一个参数 索引 第二个参数 修改的值
        //返回结果：修改前的值

        System.out.println("修改前的值" + list.set(1, "wuxing"));

        //删除集合中的数据
        System.out.println("删除的值:" + list.remove(1));
        System.out.println(list);


        System.out.println("-----ArrayList的基本操作-----");
        //ArrayList的常用方法
        System.out.println("-----ArrayList的基本方法-----");
        ArrayList arrayList = new ArrayList();
        arrayList.add("uzi");
        arrayList.add("gala");

        arrayList.add(1, "wuxing");

        ArrayList otherArrayList = new ArrayList();
        otherArrayList.add("JokerLove");
        //添加集合中的数据
        arrayList.addAll(otherArrayList);
        //清空集合中的所有数据
        //arrayList.clear();
        //删除指定集合中的数据
        arrayList.removeAll(otherArrayList);
        System.out.println("集合是否为空：" + arrayList.isEmpty());
        //判断结合是否存在某条数据
        System.out.println("集合是否包含指定数据：" + arrayList.contains("gala"));
        //indexOf() 返回数据在索引第一个位置 否则返回-1 lastIndexOf() 返回数据在索引最后一个位置 否则返回-1
        System.out.println(arrayList);
        //Object[] objects = arrayList.toArray();
        Object clone = arrayList.clone();
        ArrayList arrayList1 = (ArrayList) clone;
        System.out.println("克隆数组：" + arrayList1);

        System.out.println("-----ArrayList的基本方法-----");


        System.out.println("-----LinkedList的基本操作-----");

        LinkedList linkedList = new LinkedList();
        linkedList.add("gala");
        linkedList.addFirst("wuxing");
        linkedList.add(1, "uzi");
        //获取头指针指向的数据
        System.out.println("首部数据" + linkedList.getFirst());
        //获取尾指针指向的数据
        System.out.println("尾部数据" + linkedList.getLast());
        System.out.println(linkedList);

        //修改数据
        linkedList.set(1,"xiaohu");
        //移除数据
        linkedList.remove("wuxing");

        for (Object obj :linkedList
        ) {
            System.out.println("集合元素："+obj);
        }

        System.out.println(linkedList);


        System.out.println("-----LinkedList的基本操作-----");
        System.out.println("-----LinkedList的基本方法-----");
        //其他同ArrayList
        //获取第一个元素
        System.out.println("首部数据"+linkedList.element());
        linkedList.removeFirst();
        linkedList.removeLast();

        System.out.println("集合是否为空"+linkedList.isEmpty());
        //等同于addFirst（）
        linkedList.push("gala");
        //等同于getFirst（）
        System.out.println("pop():"+linkedList.pop());
        System.out.println("-----LinkedList的基本方法-----");







    }
}
