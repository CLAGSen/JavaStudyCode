package Test195JDK8新特性.StreamAPIUse;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamApiCreateTest01 {
    //创建Stream方式1  通过集合
    @Test
    public void test1(){
        ArrayList list = new ArrayList();
        list.add("rose");
        list.add("lucy");
        list.add("jack");
        list.stream();

    }

    //创建Stream方式2  通过数组
    @Test
    public void test2(){
        Integer[] arr =  new Integer[]{1,2,3};
        Stream<Integer> stream = Arrays.stream(arr);
    }
    //创建Stream方式3  通过Stream的静态方法of
    @Test
    public void test3(){
        Stream<String> stream = Stream.of("AA", "BB");
    }
}
