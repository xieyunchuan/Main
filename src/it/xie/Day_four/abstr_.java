package it.xie.Day_four;

public abstract  class abstr_ {
    private String name;
    public abstr_(String name){
        this.name=name;
    }
    private void show(){
        System.out.println("可以自己定义");
    }
//    private abstract  void showIII();
    protected abstract void showII();
}
class A extends abstr_{
     public A(){
         super("abstract father class");
     }
    @Override
    protected void showII() {
        System.out.println("非法组合private abstract");
    }
}