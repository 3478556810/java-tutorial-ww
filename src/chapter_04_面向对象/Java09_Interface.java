package chapter_04_面向对象;

/**
 * @projectName: java-tutorial
 * @package: chapter_04_面向对象
 * @className: Java09_Interface
 * @author: tsukishiro
 * @description: TODO 接口
 * @date: 2023/3/20 14:06
 * @version: 1.0
 */
public class Java09_Interface {
    public static void main(String[] args) {
        //接口：相当于规则，抽象的，属性必须为固定值，不能被修改
        //属性和行为的访问权限必须为公共的
        //属性是静态的，行为是抽象的
        //接口和类是两个层面的东西，接口可以继承其他接口
        //类的对象需要遵循接口，这种遵循，称为类的实现，类可以实现多个接口
        //基本语法：interface 接口名称 {属性；行为；}

        Computer computer = new Computer();
        Light light1 = new Light();
        computer.usbReceive1 = light1;
        Light light2 = new Light();
        computer.usbReceive2 = light2;
        computer.powerSupply();
    }
}


interface USBInterface {
}

interface USBSupply extends USBInterface {
    public void powerSupply();


}

interface USBReceive extends USBInterface {
    public void powerReceive();
}

class Computer implements USBSupply {

    public USBReceive usbReceive1;
    public USBReceive usbReceive2;

    @Override
    public void powerSupply() {
        System.out.println("电脑提供能源");
        usbReceive1.powerReceive();
        usbReceive2.powerReceive();
    }
}


class Light implements USBReceive {


    @Override
    public void powerReceive() {
        System.out.println("电灯接收能源");
    }
}