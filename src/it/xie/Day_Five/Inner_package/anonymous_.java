package it.xie.Day_Five.Inner_package;
/*
 * @author : xiaoxie
 * @Des:    这是一种很常见的内部类的写法
 *
 */
public class anonymous_ {
    public int i;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public Car getCar(String name){
        return new Car() {
            @Override
            public void show() {
                System.out.println("匿名内部类");
//                anonymous_.this.getCar();//栈溢出 但是匿名内部类也是有对外部类的引用的
//                name="xxx";
                System.out.println("这里是匿名内部类必须使用 外围类也就是调用外部类的那个类 的常量");
                System.out.println(name);//这里面的这个i是不能
            }

            public void show(String name) {
                System.out.println("匿名内部类使用外部类的参数必须是常数");
            }

            @Override
            public inner_interface getOut() {
                return null;
            }
        };
    } //这种写法不是很推荐 改为工厂方法写何不好呢？

    public  void show(Car car){
        car.show();//这里调用
    }

    public static void main(String[] args) {
        anonymous_ a = new anonymous_();
        a.show(new Car() {//这里实现
            @Override
            public void show() {
                System.out.println("使用时候注意多线程内存泄漏问题 因为它具有外部类的引用 导致外部类不能被及时回收");
            }

            @Override
            public inner_interface getOut() {
                return null;
            }
        });
        Car car=a.getCar("xxx");
        car.show();
    }
} 