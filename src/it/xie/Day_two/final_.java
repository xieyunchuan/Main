package it.xie.Day_two;
/*
 * @author : xiaoxie
 * @Des: 1:编译时的常量:是基本数据类型 同时又别final修饰
 *       2：运行时的常量：是引用类型
 */
public class final_ {
    static final  int MaX=2;//编译时的常量 javac编译器就已经把该值确定 注意命名为大写
    final int x=2; //编译时的常量
    static final Book book=new Book();//在这个类初始化的时候才会初始化该常量！运行时的常量
    static {
        System.out.println(book==null);
    }

    public static void main(String[] args) {
        System.out.println(final_.MaX);
    }

    void show(final String  name){
        System.out.println("final String  name 表示不能改变name的引用值");
    }
} 