package it.xie.Day_one;
/**
 * @author : xiaoxie
 * @Des: 对于变量的值 由于短路效应的影响可能得到的不是想要的结果值！ 值得注意！
 * Short circuit effect
 */
public class Short_circuit {
    public static void main(String[] args) {
        int x,y,z;
        x=1;
        y=2;
        z=3;
        if(++x>0 || ++y>2 && ++z>3){
            System.out.println(x+" "+y+" "+z);
        }
        if(++x>0 && ++y>2 || ++z>3){
            System.out.println(x+" "+y+" "+z);
        }
        System.out.println("与或运算是平级的所以在进行判断的时候一定要注意逻辑 也要注意短路效应");
    }
} 