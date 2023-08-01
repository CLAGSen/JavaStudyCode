
import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 *
 */
public class HelloW {
    public static void main(String[] args) {

        Constr constr;
        constr = new Constr();

        System.out.println(constr.getAge());
        T.me();
        System.out.println(T.age);

        int arr[]={1,2,3,};
        System.out.println(arr.length);

        String st1 = new String("he");
        System.out.println(st1);
        T t =new T();
        t.me2();
        t.me();
        System.out.println("==================");

        System.out.println(constr.hashCode());
    }

}
class T {
    static int age;
    static void me(){
        System.out.println("ceshi");
    }
    void me2(){
        me();
    }
}