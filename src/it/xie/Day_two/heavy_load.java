package it.xie.Day_two;
/*
 * @author : xiaoxie
 * @Des: 方法声明的两个组件构成了方法签名 - 方法的名称和参数列表  列表：类型和顺序都要一样！
 *       为什么Java不适用返回值作为区分重载方法的依据？  因为:Java 是强类型语言
 */
public class heavy_load {
    void show(){
        System.out.println("Java的方法重载是使用给方法签名");
    }
    int show(int i,String name){
        System.out.println("int show(int i,String name)");
        return 0;
    }
    int show(String name,int i){
        System.out.println("int show(String name,int i)");
        return 0;
    }
//    int show(){
//        System.out.println("java是强类型语言 所以不能使用返回值去添加一个重载的方法");
//    }
public static void main(String[] args) {
    heavy_load h=new heavy_load();
    h.show(1,"xxx");
    h.show("name",1);
}

} 