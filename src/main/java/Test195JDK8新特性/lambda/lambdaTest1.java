package Test195JDK8新特性.lambda;

import org.junit.Test;

import java.util.Comparator;
import java.util.function.Consumer;

public class lambdaTest1 {
    //1.无参数，无返回值
    @Test
    public void test1(){
        Runnable r1 = new Runnable(){
            @Override
            public void run() {
                System.out.println("test1");
            }
        };


        Runnable r2 = ()-> System.out.println("test1");
        r2.run();

    }
    //2.lambda需要一个参数但是无返回值
    @Test
    public void test2(){
        Consumer<String> con = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.print(s);
                System.out.print(s);
                System.out.print(s);
                System.out.print(s);
                System.out.print(s);
                System.out.println(s);
            }
        };
        con.accept("123");

        Consumer<String> con2 = (String s)-> System.out.println(s);
        con2.accept("456");
    }

    //3.数据类型可以省略，因为编译器可以推断出来 “类型推断

    @Test
    public void test3(){
        Consumer<String> con3 = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.print(s);
                System.out.print(s);
                System.out.print(s);
                System.out.println(s);
            }
        };
        con3.accept("123");

        Consumer<String> con4 =(s)-> System.out.println(s);
        con4.accept("789");
    }

    //4.只需要一个参数时候括号也可以省略(无参数或超过1个不能省)

    @Test
    public void test4(){
        Consumer<String> con3 = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.print(s);
                System.out.print(s);
                System.out.println(s);
            }
        };
        con3.accept("123");

        Consumer<String> con4 =s-> System.out.println(s);
        con4.accept("789");
    }

    //5.lambda需要两个或以上的参数，多执行语句，且可以有返回值

    //6. 当lambda体只有一条语句，return与大括号可以省略
    @Test
    public void test5(){
        Comparator<Integer> com1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                System.out.println(o1);
                System.out.println(o2);
                return o2;
            }
        };


        com1.compare(11,22);


        Comparator<Integer> com2 =(o1, o2) -> o2.compareTo(o1);

    }


    /**
     * 四个基本的函数式接口
     */
/*

    消费型接口:Consumer<T>       void accept(T t)
    供给型接口:Supplier<T>       T get()
    函数型接口:Function<T,R>     R apply(T t)
    判断型接口:Predicate<T>      boolean test(T t)
*/

}
