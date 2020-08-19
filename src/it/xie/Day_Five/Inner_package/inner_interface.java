package it.xie.Day_Five.Inner_package;
/*
 * @author : xiaoxie
 * @Des:     内部类常见在一些开源框架里面所以需要格外重视
 *
 */
public class inner_interface {
    public String name;
    public inner_interface(String name){
        this.name=name;

    }
    private class Car_red implements Car{

        @Override
        public void show() {
            System.out.println("Car_red 在红停车场");
        }

        public inner_interface getOut(){
            return inner_interface.this; //返回上一层的引用
        }

    }

    public  Car getCar_red(){
        return this.new Car_red();//控制内部类的权限 结合 多态可以更加灵活的对这个类进行封装！
    }

}

class Main{
    public static void main(String[] args) {
        inner_interface inner=new inner_interface("车场1");
        Car car=inner.getCar_red();
        car.show();
        inner_interface inner_inte=car.getOut();
        System.out.println(inner_inte.name);
        System.out.println("内部类的好处相比组合 它具有对外部类的引用 结合多态可以发挥很好的效果");
    }
}