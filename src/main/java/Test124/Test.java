package Test124;

import java.util.Scanner;

/**
 *
 */
public class Test {
    public static void main(String[] args) {
        //1、栈内存溢出 StackOverflowError 错误
        /**
        main(args);
        */
        //2、堆内存溢出 OutOfMemoryError 错误
        /**
         *  byte arr[] = new byte[1024*1024*100];//100mb
         */


//        java.lang.Throwable:异常体系的根父类
//        java.lang.Error: 错误
//        java.lang.Exception: 异常

        /**
         * 常见的异常以下
         * 编译时异常：
         * 本地文件输入输出异常：IOException  ==>找不到文件异常: FileNotFoundException
         * ----------------------------------->
         * 运行时异常：
         * 找不到类异常：ClassNotFoundException
         * 数组下标越界异常：ArrayIndexOutOfBoundsException
         * 空指针异常：NullPointerException
         * 类型转换异常：ClassCastException
         * 数字格式化异常：NumberFormatException
         * 输入类型不一致异常：InputMismatchException
         * 算数异常（除0异常）：ArithmeticException
         */



    }

    @org.junit.Test
    public void NullPointerExceptionT(){
        //1、空指针异常举例子
//        对象没有实体、去调用属性和方法就会空指针异常
        String s1 =  null;
        System.out.println(s1.equals(null));
    }

    @org.junit.Test
    public void InputMismatchExceptionT(){
//        输入类型不一致异常
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        System.out.println(i);

    }

    @org.junit.Test
    public void ClassNotFoundExceptionTest(){
        //找不到类异常
//        Class<?> name = Class.forName("java.lang.String");

    }



}
//class student{
//    String name;
//    int age;
//}
