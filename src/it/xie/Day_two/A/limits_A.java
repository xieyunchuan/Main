package it.xie.Day_two.A;
/*
 * @author : xiaoxie
 * @Des: 权限 ： public>protected>默认>私有
 *  protected>默认 前者在包外的子类也可以使用！后者不行！
 *
 *  但是类的权限只有public 和 友好  友好的类只是对于这个包里面的类友好！
 */
public class limits_A {
    private String string;//私有只是它的子类可以使用
    String string2;// 只能在这个包里面可以使用
    protected String string3;//包内都可以使用 但是 包外也可以使用但是只能是子类里面

    public limits_A(){
        string="one";
        string2="two";
        string3="three";
    }
}
class limit_Test{
    public static void main(String[] args) {
        limits_A limits_a=new limits_A();
        System.out.println(limits_a.string2);
        System.out.println(limits_a.string3);
    }
}