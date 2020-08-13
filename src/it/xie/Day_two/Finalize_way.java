package it.xie.Day_two;
/*
 * @author : xiaoxie
 * @Des: 这个方法应该根据它调用的时间进行做程序的优化处理和检查！
 */
public class Finalize_way {
    public static void main(String[] args) {
      Book book=new Book();
      book.regist();
      book=null;
      book=new Book();
      book=null;
      System.gc();
    }
}
class Book{
    boolean flag;
    public Book(){
        flag=false;
    }
    void regist(){
        flag=true;
        System.out.println("必须进行在对象被销毁之前进行登记");
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        if(flag==false){
            System.out.println("注意没有登记");
        }
    }
}