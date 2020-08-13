package it.xie.Day_two;
/*
 * @author : xiaoxie
 * @Des: 常常问的一个问题 ：Java有析构函数吗？
 *       GC 线程和 finalize(完成)
 *       1.对象可能不被垃圾回收
         2.垃圾回收并不等于析构

         finalize虽然是GC线程在清理对象时候去调用的该方法，但是这个方法不适合作为一个对象的资源释放！
         如需要释放资源就自己写一个释放资源的方法进行调用即可！ 因为finalize方法的调用时间是由GC线程去做！但是GC线程又不是我们可以直接管控的！
 */
public class GC_Finalize {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("调用该方法应该是由GC线程去调用，一旦垃圾回收器准\n" +
                "备好释放对象占用的存储空间，将首先调用其finalize0方法，并且在下-次垃圾回收动作发生\n" +
                "时，才会真正回收对象占用的内存。\n");
    }
}
class Main{
    public static void main(String[] args) throws Throwable {
        GC_Finalize gc_finalize=new GC_Finalize();
        gc_finalize=null;//模拟没有引用 符合GC算法！
        System.gc();//执行System.gc()函数的作用只是提醒或告诉虚拟机，希望进行一次垃圾回收。
                    // 至于什么时候进行回收还是取决于虚拟机，而且也不能保证一定进行回收（如果-XX:+DisableExplicitGC设置成true，则不会进行回收）
        Thread.sleep(5000);
        System.out.println("结束");
    }
}