package it.xie.Day_six;

/**
 *  * @author : xiaoxie
 *  * @Des:
 *         Throwable这个Java类被用来表示任何可以作为异常被抛出的类。Throwable对象可分为两
 * 种类型(指从Throwable继承而得到的类型): Error用来表示编译时和系统错误(除特殊情况外，
 * 一般不用你关心) ; Exception是可以被抛出的基本类型，在Java类库、用户方法以及运行时故
 * 障中都可能抛出Exception型异常。所以Java程序 员关心的基类型通常是Exception。
 *
 *  而我们关心的Exception 异常又有2种分类 ：分检测异常和非检测异常，
 *  RuntimeException(直接或间接继承自该类，包括其本身都属于非检测异常)
 */
public class Exceptions {
    public static void main(String[] args) {
//        int i=1/0;//非检测异常
        String name=null;
        System.out.println(name.getBytes());// java.lang.NullPointerException
        System.out.println("非检测异常适合于" +
                "调用代码不能继续执行，需要立即终止。出现这种情况的可能性太多太多，" +
                "例如服务器连接不上、参数不正确等。这些时候都适用非检测异常，不需要调用代码的显式捕捉和处理");


    }

} 