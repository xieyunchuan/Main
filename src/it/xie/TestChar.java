package it.xie;

import java.io.UnsupportedEncodingException;

/**
 * https://www.cnblogs.com/wuqinglong/p/10329368.html
 * java 的char数据类型一定是占2个字节吗？
 * 答案:no !
 *
 */
public class TestChar {
    public static void main(String[] args) throws UnsupportedEncodingException {
        char s='谢';
        Character character=new Character(s);
        String s2=character.toString();
        byte[] bytes=s2.getBytes("GBK");
        byte[] bytes1=s2.getBytes("UTF-8");
        System.out.println(bytes.length+""+bytes1.length);
        System.out.println(new String(bytes,"GBK"));
    }
} 