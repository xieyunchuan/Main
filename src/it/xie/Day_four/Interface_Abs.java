package it.xie.Day_four;

import it.xie.Day_four.B.inter_imp;

/*
 * @author : xiaoxie
 * @Des: 1;接口和抽象类的差异
 *       2：接口和抽象类的综合使用会在设计模式里面充分体现
 */
public class Interface_Abs {
    public static void main(String[] args) {
        interf inter=new inter_imp();
        inter.show();
        inter.showII();
        System.out.println("接口可以更加方便的使用多态的特性 接口的属性都是实现它的类共享的常量 所以接口就是一种规范");

        abstr_ abstr=new A();
        abstr.showII();
        System.out.println("抽象类也可以结合多态使用只不过抽象类会带有自己的属性给子类去独享 去控制 可以根据子类的需求去使用不同的方法 使得属性有不懂的含义 抽象类就是一个特殊的类");

    }
} 