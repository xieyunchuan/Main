package it.xie.Day_7.annotation.Runtime_;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Class<Hello> helloClass=Hello.class;
        for (Method method : helloClass.getDeclaredMethods()){
            Test anno = method.getAnnotation(Test.class);
            if(anno != null){
                System.out.println(anno.massage());//打印注解值
            }
        }
    }
} 