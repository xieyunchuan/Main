package it.xie.Day_four.B;

import it.xie.Day_four.interf;

public class inter_imp implements interf {

    @Override
    public void show() {
        System.out.println("默认这个方法的权限就是public 没有其他权限 这样做的目地就是接口本就是一种规范而已");
    }
}