package Test125;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest01 {
    @org.junit.Test
    public void InputMismatchExceptionTest(){
//        输入类型不一致异常
        try {
            Scanner scanner = new Scanner(System.in);
            int i = scanner.nextInt();
            System.out.println(i);
        } catch (InputMismatchException e) {
            System.out.println("出现了InputMismatch的异常");
        }catch (NullPointerException e){
            System.out.println("出现了NullPointer的异常");
        }catch (RuntimeException e){
            System.out.println("出现了Runtime的异常");
        }
        System.out.println("异常处理结束");

    }

    @org.junit.Test
    public void NullPointerExceptionTest(){
        //1、空指针异常举例子
//        对象没有实体、去调用属性和方法就会空指针异常
        try {
            String s1 =  null;
            System.out.println(s1.equals(null));
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("捉到异常");
        }
        System.out.println("结束");
    }
}
