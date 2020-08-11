package it.xie.Day_one;
/**
 * @author : xiaoxie
 * @Des: 其实很重要的运算@
 */
public class Bit_operation {
    public static void main(String[] args) {
        int x,y,z;
        x=1;
        y=2;
        z=3;
        System.out.println(x|y);
        x=1;
        System.out.println(x ^ x);// 相同为0 相异为1
        System.out.println(~0);
        System.out.println("在做加密处理的时候很有用");
        System.out.println("------------------------");
        int a,s,d;
        a=2;
        System.out.println(a<<2);// s=a*4
        System.out.println(a>>2);
        System.out.println(a>>>1);// 注意它不是循环右移 而是无符号右移！

    }
} 