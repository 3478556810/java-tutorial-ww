package chapter_04_面向对象;

/**
 * @projectName: java-tutorial
 * @package: chapter_04_面向对象
 * @className: Java12_Bean
 * @author: tsukishiro
 * @description: TODO Bean
 * @date: 2023/3/20 14:53
 * @version: 1.0
 */
public class Java12_Bean {
    public static void main(String[] args) {





    }
}

//Java 两种类：
//1.用于编写逻辑，抽象类，接口
//2.用于建立数据模型，bean 类
//Bean 规范：
//1.类必须含有无参公共的构造方法
//2.属性必须私有化，然后提供公共的get，set方法 快捷键（alt insert）->lombok

class User1{
    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
