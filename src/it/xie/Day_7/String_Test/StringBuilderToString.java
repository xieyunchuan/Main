package it.xie.Day_7.String_Test;
/*
 * @author : xiaoxie
 * @Des:
 * 下面的2种写法都是等同的 只是java对java的+字符做了重载，进行编译之后会加上StringBuilder进行做对字符的拼接！ 这个应该是在早期的jdk版本
 *
 * String和StringBuilder的底层都是使用的是char[] 默认大小16
 * 那么String为什么就是不可变的呢？
 *查看源码就可以发现String对象里面存储使用的是final char[] 然后jvm又对final修饰的常量存储在常量池里面所以实现对所谓的String的复用！
 *
 * https://www.cnblogs.com/xiaoxi/p/6036701.html
 */
public class StringBuilderToString {
    public static void main(String[] args) {
//       append();
//       StringBuilder_append();
       test4();
    }

    //字符串的拼接！
    public static void append(){
        String str="xxx";
        str="zzz"+str+"ccc";
        System.out.println(str);
        System.out.println();
    }

    public static void StringBuilder_append(){
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("zzz");
        stringBuilder.append("xxx");
        stringBuilder.append("ccc");
        System.out.println(stringBuilder);
    }

    public static void test4(){
        String s0="hello"+"world";//由栈引用到方法区  编译时期就确定为helloworld了
        String s1=new String("helloworld");//引用指向堆
        String s2="hello" + new String("world");//这里就是用到了+号的重载最后返回一个新的String对象
        System.out.println("===========test4============");
        System.out.println( s0==s1 ); //false
        System.out.println( s0==s2 ); //false
        System.out.println( s1==s2 ); //false
        System.out.println("只不过他们3个的在常量池里面的指向都是一个");
    }
} 