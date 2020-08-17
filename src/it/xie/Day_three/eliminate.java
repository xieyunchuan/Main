package it.xie.Day_three;
/**
 * @author : xiaoxie
 * @Des: 虽然有GC线程 但是我们的程序怎样多一个对象的销毁做正确的回收呢？
 *        建议手动清除的时候应该和构造方法初始顺序相反！
 *
 */
public class eliminate {
    public static void main(String[] args) {
        B b=new B();
        b.dispose();
    }
}

class A{
    String name;
//    A a=new A();//死循环 栈溢出...
    protected void dispose(){
        name=null;
        System.out.println("a的引用为null");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class B extends A{
    String name2;
    C c;
    public B(){
        super();
        c=new C(this);
        System.out.println("B含有A的引用但是不是这样存在 而是组合的方式等");
    }
    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    protected void dispose(){
      name2=null;
//        c.dispose();
        c.dispose();
        super.dispose();//建议就是需要把手动的清理放在最后 倒着来避免之前子类依赖前面的
        // 如果返过来那么就会产生在c还可能在使用a的时候但是已经别处理了！
    }
}

class C {
    A a;
    public C(A a){
        this.a=a;
    }

    protected void dispose(){
        a=null;
        System.out.println("C...");
    }


}