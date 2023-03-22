package chapter_06_高级应用;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

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

    public static void main(String[] args) throws InterruptedException {

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
        linkedList.set(1, "xiaohu");
        //移除数据
        linkedList.remove("wuxing");

        for (Object obj : linkedList
        ) {
            System.out.println("集合元素：" + obj);
        }

        System.out.println(linkedList);


        System.out.println("-----LinkedList的基本操作-----");
        System.out.println("-----LinkedList的基本方法-----");
        //其他同ArrayList
        //获取第一个元素
        System.out.println("首部数据" + linkedList.element());
        linkedList.removeFirst();
        linkedList.removeLast();

        System.out.println("集合是否为空" + linkedList.isEmpty());
        //等同于addFirst（）
        linkedList.push("gala");
        //等同于getFirst（）
        System.out.println("pop():" + linkedList.pop());
        System.out.println("-----LinkedList的基本方法-----");
        System.out.println("-----泛型-----");
        //泛型语法
//        ArrayList arrayList2=new ArrayList();
//
//        User1 user1= new User1();
//        Person1 person1=new Person1();
//        arrayList2.add(user1);
//        arrayList2.add(person1);
//
//        //若未指定泛型,从集合中取出的对象类型为Object 多态
//        Object o = arrayList2.get(1);
//        //如果想执行对象的方法，必须进行强制类型转换
//        Person1 p =(Person1)o;
//        p.testPerson();
        ArrayList<Person1> arrayList3 = new ArrayList();
        arrayList3.add(new Person1());
        arrayList3.get(0).testPerson();
        //泛型和类型的区别
        //类型：用于约束外部对象的使用场景
        //泛型：用于约束内部对象的使用场景 有时也把泛型称作类型参数
        MyContainer<Person1> myContainer = new MyContainer();
        myContainer.data = new Person1();

//          test(myContainer);//类型存在多态的使用 而泛型没有多态

        System.out.println("-----泛型-----");
        System.out.println("-----排序-----");
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(1);
        arrayList4.add(3);
        arrayList4.add(2);

        //排序需要传递一个实现了比较器接口的对象
        arrayList4.sort(new NumberComparator());
        System.out.println(arrayList4);


        System.out.println("-----排序-----");
        //ArrayList和LinkedList比较
        //1.如果没有达到容量的阈值，追加数据ArrayList更快
        //2.当这次插入数据超过容量时，LinkedList效率更高
        //3.通过索引查找数据时，ArrayList更快，不通过索引时两者没有本质区别

        System.out.println("-----Set-----");
        //HashSet 底层数组+双向链表（通过链地址法解决哈希冲突） 通过Hash算法指定数据在哪个索引 无序去重
        HashSet hashSet = new HashSet();
        //增加数据
        hashSet.add("gala");
        hashSet.add("gala");
        hashSet.add("uzi");
        //修改数据
        //删除数据
        hashSet.remove("uzi");
        //添加集合中的元素
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add("uzi");
        hashSet.addAll(arrayList5);

        hashSet.clear();
        User1 user1=new User1();
        user1.id=1;
        user1.name="clearlove";
        User1 user2=new User1();
        user2.id=1;
        user2.name="uzi";
        User1 user3=new User1();
        user3.id=1;
        user3.name="uzi";
        hashSet.add(user1);
        hashSet.add(user2);
        hashSet.add(user3);


        //查询数据
        for (Object o : hashSet
        ) {
            System.out.println(o);
        }

        System.out.println("-----Set-----");

        System.out.println("-----Queue-----");

        ArrayBlockingQueue queue =new ArrayBlockingQueue(2);
        //add()数据超过容量 报错 java.lang.IllegalStateException: Queue full
//        queue.add("gala");
//        queue.add("uzi");
//        queue.add("wuxing");


//        //push()添加数据 （take()减少数据）超过容量上（下）限 将堵塞 不进行后续代码执行
//        queue.put("gala");
//        queue.put("uzi");
//        queue.put("wuxing");
        //push()数据超过容量 将返回false 不影响后续代码执行
        boolean gala = queue.offer("gala");
        System.out.println(gala);
        boolean uzi = queue.offer("uzi");
        System.out.println(uzi);
        boolean wuxing = queue.offer("wuxing");
        System.out.println(wuxing);
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue);



        System.out.println("-----Queue-----");

        System.out.println("-----Map-----");

        //HashMap 底层数组+单向链表 红黑树
        HashMap <String, Integer>hashMap=new HashMap();

        //添加数据 如果该键存在覆盖添加
        hashMap.put("gala",0);
        //添加重复键的键值对时，会进行覆盖操作
        System.out.println("修改前的值："+hashMap.put("gala", 1));

        hashMap.put("uzi",2);
        System.out.println("该键当前对应的值："+hashMap.get("gala"));
        hashMap.remove("uzi");

        //添加数据 如果该键不存在才添加
        hashMap.putIfAbsent("uzi",1);
        //替换并返回修改前的值 如果参数传递没有的键值，则不会进行修改
        System.out.println(hashMap.replace("uzi", -1));

        //获取HashMap的所有的Key
        Set keySet=hashMap.keySet();
        System.out.println("keySet:"+keySet);
        for (Object obj :keySet
             ) {
            System.out.println("value:"+hashMap.get(obj));
        }
        System.out.println("HashMap是否包含指定Key："+hashMap.containsKey("gala"));
        //获取键值对对象
        Set<Map.Entry<String,Integer>> entries=hashMap.entrySet();
        for (Map.Entry<String,Integer> entry:
             entries) {
            System.out.println("键值对："+entry);

        }

        System.out.println(hashMap);
        System.out.println("-----Map-----");
        System.out.println("-----HashTable-----");
        //1.实现方式不同，继承父类不一样
        //2.底层结构的容量不同，HashMap（16）,HashTable（11）
        //3.HashMap的K，V都可以是null，HashTable的K,V不能是null
        //4.HashMap数据定位采用的是Hash算法，而HashTable采用的仅仅是HashCode
        //5.多线程方面，HashMap的性能较高，在考虑并发执行时会有额外一些特殊的操作,HashTable性能较低

        Hashtable table =new Hashtable<>();
        System.out.println("-----HashTable-----");

        System.out.println("-----Iterator-----");
        HashMap map =new HashMap();
        map.put("gala",0);
        map.put("uzi",1);

        Set<String> keys =map.keySet();
        //HashMap 一旦循环遍历时，如果修改数据，就会发生错误
        //迭代器
        Iterator<String> iterator =keys.iterator();
        //hashNext方法判断是否存在下一条数据
        while (iterator.hasNext()){
           //获取下一条数据
            String key =iterator.next();
            if("b".equals(key)){
                //remove（）只能对当前数据删除 保护数据安全
                iterator.remove();
            }
            System.out.println(map.get(key));
        }
        System.out.println("-----Iterator-----");

        System.out.println("-----工具类-----");
        int[] is ={1,2,3,4,5};
        System.out.println("Arrays.asList()："+Arrays.asList(1, 2, 3, 4, 5));

        Arrays.sort(is);
        System.out.println(Arrays.toString(is));
        System.out.println("返回对应该关键字索引:"+Arrays.binarySearch(is,5));

        System.out.println("-----工具类-----");





    }


    public static void test(MyContainer<Object> myContainer) {
        System.out.println(myContainer);
    }
}

class User1 {
   public int id;
   public String name;


    @Override
    public int hashCode() {
        return id;
    }

    //判断两个对象的属性是否完全相同
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof User1) {
            User1 otherUser =(User1) obj;
            if(otherUser.id==this.id)
            if (otherUser.name.equals(this.name))
                return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "User["+id+","+name+"]";
    }

    public void testUser() {
        System.out.println("user...");
    }

}
class NumberComparator implements Comparator<Integer> {


    @Override
    public int compare(Integer o1, Integer o2) {

        //如果第一个数比第二个数大，返回值为正值，升序
        return o1 - o2;
//        //如果第二个数比第一个数大,返回值为负值，降序
//        return o2-o1;
    }
}


class MyContainer<C> {
    public C data;
}

class Person1 {

    public void testPerson() {
        System.out.println("person...");
    }

}

