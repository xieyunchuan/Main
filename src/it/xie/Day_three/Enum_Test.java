package it.xie.Day_three;
/**
 * @author : xiaoxie
 * @Des: java SE ：javaSE5的枚举类 代替之前手写抽象类来初始化常量
 */
public enum  Enum_Test {
    one,two;
    Enum_Test(){
        System.out.println("初始化");
    }
    String string;

    public void setString(String string) {
        this.string = string;
    }
}
class Test{
    public static void main(String[] args) {
        Enum_Test one=Enum_Test.one;
        System.out.println(one);
        one.setString("设置值");
        System.out.println(one.string);
    }
}

/************************/

/**
 * JDK5以前传统的实现枚举
 */

class ScoreOld{	//Class
    public static final ScoreOld A = new ScoreOld("100-90");	//A成绩Object
    private ScoreOld(String value){	//私有构造器
        this.value = value;
    };//主要是它的构造器只能自己使用
    private String value;		//封装每个对象的分数Field
    public String getValue(){	//Method
        return this.value;
    }
}

/**
 * JDK5以前传统的实现枚举II
 */
abstract class Enmu_Abs{
    String name;
    private Enmu_Abs(String name){
        this.name=name;
    }
    public abstract String getName();
    public static final Enmu_Abs one=new Enmu_Abs("one") {
        @Override
        public String getName() {
            return name;
        }
    };
}