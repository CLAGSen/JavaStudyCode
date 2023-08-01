package Test116;

public class Test {
    public static void main(String[] args) {

        //继承于C 的匿名子类的匿名对象
        new C(){
//            @Override
//            public void method2(){
//                System.out.println("main");
//            }
        }.method2();
    }
}
class C {
    public void method2(){
        System.out.println("cccc");
    }
}
