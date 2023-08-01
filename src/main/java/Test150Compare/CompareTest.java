package Test150Compare;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

public class CompareTest {
    @Test
    public void test1(){
        String[] arr1=new String[]{"tom","jack","tony","lucy","rose"} ;
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        Arrays.sort(arr1);
        System.out.println("默认排序后：");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                String s1 = (String) o1;
                String s2 = (String) o2;
                int i = s1.compareTo(s2);
                return -i;
            }
        };
        Arrays.sort(arr1,comparator);
        System.out.println("修改排序后：");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }

    @Test
    public void test2(){
        Phone phone[] = new Phone[5];
        phone[0] = new Phone("xiaomi",2999);
        phone[1] = new Phone("rongyao",3299);
        phone[2] = new Phone("IPhone",9999);
        phone[3] = new Phone("oppo",1999);
        phone[4] = new Phone("Huaiwei",2999);

        Arrays.sort(phone);

        for (int i = 0; i < phone.length; i++) {
            System.out.println(phone[i].toString());
        }
    }

}

class Phone implements Comparable{
    String name;
    double price;

    public Phone(String name, double price) {
        this.name = name;
        this.price = price;
    }

    //按照价格递增排序重写
    @Override
    public int compareTo(Object o) {
        if(this == o){
            return 0;
        }
        //只比价格
//        if(o instanceof Phone){
//            Phone p = (Phone) o;
//            return Double.compare(this.price,p.price);
//
//        }
        //价格相同按照名字比
        if(o instanceof Phone){
            Phone p = (Phone) o;
            int i = Double.compare(this.price, p.price);
            if(i != 0){
//                return i;
                //降序
                return -i;
            }else{
                return this.name.compareTo(p.name);
            }

        }
        throw new RuntimeException("类型错误异常");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "name=" + name + ", price=" + price;
    }
}
