package it.xie.Day_one;
/**
 * @author : xiaoxie
 * @Des: Cut off and discard 截断和舍去
 */
public class Cut_off_discard {
    public static void main(String[] args) {
        double i=1.5;
        float x= 1.5f;// 要知道float只是占用了32bit 而double 是64bit
        System.out.println((int)i);
        System.out.println((int)x);
        i=1.8;
        System.out.println((int)i);
        System.out.println("向下转型就是只能进行截断");
        System.out.println(Math.round(i));// 需要4 舍5 入 使用方法
        i=Math.round(i);
        System.out.println(i);
    }
} 