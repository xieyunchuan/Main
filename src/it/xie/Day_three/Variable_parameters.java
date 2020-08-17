package it.xie.Day_three;
/**
 * @author : xiaoxie
 * @Des: java SE :可变参数 在一些源代码里面可以看到
 *                ：本质就是一个语法糖的效果
 */
public class Variable_parameters {
    static void show(Object... objects){
        for (String s:(String[]) objects
             ) {
            System.out.println(s);
        }
    }

    static void showII(String[] strings){
        for (String s: strings
        ) {
            System.out.println(s);
        }
    }

    static void show(Integer... integers){
        for (int i:integers
             ) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        String[] strings={"1","2"};
        show(strings);
        showII(strings);//等价
        show(1,2,3,4,5,6,7,7);// 自动包装和可变参数的完美结合  对应数组直接转换为对象包装数组
    }
} 