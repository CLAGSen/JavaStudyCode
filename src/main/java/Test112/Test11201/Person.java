package Test112.Test11201;

public abstract class Person {
    public void me(){
        code();
    }
    abstract void code();
    public static  void meth(){

    }
    final void meth2(){

    }
    static {
        System.out.println("静态代码块");
    }
    {
        System.out.println("代码块");
    }
}
