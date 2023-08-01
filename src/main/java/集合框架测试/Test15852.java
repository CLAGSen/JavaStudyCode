package 集合框架测试;

import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Test15852 {
    @Test
    public void test1(){
//        double v = Math.random()*(M-N+1)+N;
        int i1 =(int) (Math.random()*(20-1+1)+1);
        int i2 =0;
        Random r =new Random();
        Set set = new HashSet();
        boolean flag = true;
        while (flag){
            int i = r.nextInt(20)+1;
            i2++;

            set.add(i);
            if(set.size()==10){
                break;
            }
        }

        System.out.println(set);
        System.out.println(i2);
    }
}
