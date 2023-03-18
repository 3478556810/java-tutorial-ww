package chapter_02;

/**
 * @projectName: java-tutorial
 * @package: chapter_02
 * @className: java01_Variable
 * @author: tsukishiro
 * @description: 标识符
 * @date: 2023/3/18 12:46
 * @version: 1.0
 */
public class Java02_identifier {

    public static void main(String[] args) {

        //TODO 标识符
        // 通俗理解：标识数据的符号，变量名称=标识符
        String name = "keli";

        //TODO 标识符命名规则
        //1.英文拉丁字母
        //2.符号,只能使用美元符号$和下划线符号_
        //3.数字 可以作为标识符，但不能用于开头，会被识别为数据
        //4.在大括号范围内,标识符不得重复,标识符区分大小写
        //5.Java语言预先定义了一些标识符名称，称之为关键字或保留字，可使用首字母大写来实现关键字名称的定义，但不推荐
        String Public = "提瓦特";
        //6.驼峰命名法
        String userName = "keqing";
        //7.标识符无长度限制

        System.out.println(name+"和"+userName+"在"+Public+"欢乐的在一起");
    }

}
