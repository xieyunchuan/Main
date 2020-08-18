package it.xie.Day_four;

import java.util.Random;

/*
 * @author : xiaoxie
 * @Des: 1;静态常量值的初始化即当类字段的字段标注为final之后，value的值在准备阶段初始化为自动的值
 */
public class final_ {
    static final int p = new Random().nextInt(); // 值在准备阶段初始化为自动的值
    // final 相比 static 会早一个阶段  当然也有书上说
    static final int p2 = 5;//在javac 编译的时候就已经把值写进去了！
    static int i = 100; // static准备阶段时数据是零值，在初始化阶段才会赋值。

    static final double PI;

    static {
        PI = 3.14159265;
        System.out.println("准备阶段");
    }
}