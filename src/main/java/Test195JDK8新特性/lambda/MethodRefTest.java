package Test195JDK8新特性.lambda;

import org.junit.Test;

import java.util.Comparator;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class MethodRefTest {
    //1. 对象 :: 实例方法
    @Test
    public void test1(){
        //1.1 普通调用
        Consumer<String> con3 = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.print(s);
                System.out.print(s+s);
                System.out.println(s);
            }
        };
        con3.accept("123");

        //1.2 lambda
        Consumer<String> con4 =s-> System.out.println(s);
        con4.accept("789");

        //1.3 方法引用
        //要求，函数式接口中的抽象方法a与其内部
        // 实现时调用的对象的某个方法b的形参列表和返回值类型都一致(或父类)。
        // 此时，可以考虑使用方法b实现对方法a的替换、覆盖。
        // 此替换或覆盖即为方法引用。
        //b是非静态方法，需要对象调用
        Consumer<String> con5 = System.out ::println;
    }

    //2. 类:: 静态方法
    @Test
    public void test2(){
        Comparator<Integer> com1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1,o2);
            }
        };
        com1.compare(11,22);

        Comparator<Integer> com2 =(o1, o2) -> Integer.compare(o1,o2);

        //方法引用
        //要求，函数式接口中的抽象方法a与其内部
        // 实现时调用的类的某个静态方法b的形参列表和返回值类型都一致(或父类)。
        // 此时，可以考虑使用方法b实现对方法a的替换、覆盖。
        // 此替换或覆盖即为方法引用。
        //b是静态方法，需要类调用

        Comparator<Integer> com3 = Integer::compare;

    }


    //3. 类:: 实例方法
    @Test
    public void test3(){
        BiPredicate<String,String> bp = new BiPredicate<String, String>() {
            @Override
            public boolean test(String s, String s2) {
                return s.equals(s2);
            }
        }   ;

        //lambda
        BiPredicate<String,String> bp2 = (s1,s2) -> s1.equals(s2);

        // 方法引用
        BiPredicate<String,String> bp3 = String :: equals;

    }

}
