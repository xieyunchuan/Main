package it.xie.Day_one;

import java.io.UnsupportedEncodingException;

/**
 * java 的char数据类型一定是占2个字节吗？
 * 答案:no !
 * 虽然Java的char类型是使用的2个字节 同时使用的是unicode编码 但是unicode编码只是一种机制 而真正的编码方式是对应的utf-8 和 gbk ！
 */
public class TestChar {
    public static void main(String[] args) throws UnsupportedEncodingException {
        char s='谢';
        Character character=new Character(s);
        String s2=character.toString(); //按照本地的编码进行解码
        byte[] bytes=s2.getBytes("GBK");
        byte[] bytes1=s2.getBytes("UTF-8");// 编码
        System.out.println(bytes.length+""+bytes1.length);
        System.out.println(new String(bytes,"GBK")); //占用2个字节
        System.out.println(new String(bytes1,"UTF-8"));//占用3个字节
    }
} 