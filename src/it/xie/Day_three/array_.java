package it.xie.Day_three;
/**
 * @author : xiaoxie
 * @Des: java 的动态数组
 *        为什么说java的数组是动态的呢？对于C/C++语言有过学习的就知道我们在编写C语言数组的时候需要静态的指定数组长度这样在编译运行时就可以在内存空间开启多少内存
 *        但是这样我们需要进行 int[2] i; int length=2; 不仅麻烦 而且还需要预测程序在这里的所需要的数组长度 也需要记录长度 但是java都解决了这个问题
 *        java的数组分配更加像是在灵活的使用malloc函数进行动态分配空间！
 */
public class array_ {
    public static void main(String[] args) {
        int[] as;
        int i=5;//程序动态执行到这里需要5个空间
        as=new int [i];//默认初始化全部为0  注意数组是一个对象 它不像普通的这个局部变量 是一个在堆空间存储的！ 这个对象默认初始化之后里面的元素为0！
        for (int p:as
             ) {
            System.out.println(p);
        }

        show(i);//  在java SE5.0 之后可以自动包装
    }
    static void show(Object i){
        System.out.println(i);
    }
} 