package it.xie.Day_one;
/**
 * @author : xiaoxie
 * @Des: replace goto
 */
public class goto_ {
    public static void main(String[] args) {
        int i=3;
        out:
        while(i>0){
            if(i==1){
                i--;
                System.out.println("代替 goto");
               break out;
            }
            System.out.println(i);
            i--;
        }

    }
} 