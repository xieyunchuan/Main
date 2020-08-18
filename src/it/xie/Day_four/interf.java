package it.xie.Day_four;


import java.util.Random;

public interface interf {
    String Des="The default is a static constant";
    Random r=new Random();
    int i=r.nextInt();//动态指定
    void show();
    default void showII() {
        System.out.println("接口的默认实现 这是javaSE7 引入的新特征");
    }
}
