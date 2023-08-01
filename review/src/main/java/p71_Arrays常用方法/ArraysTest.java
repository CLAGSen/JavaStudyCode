package p71_Arrays常用方法;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {
        int[] arr1={11,2,6,7,55,120,9};
        int[] arr2={11,2,6,7,55,120,9};
        int[] arr3=null;

        System.out.println(Arrays.equals(arr1, arr2));
        Arrays.fill(arr2,10);
        System.out.println(Arrays.toString(arr2));
        System.out.println(arr2.length);
        int[] ints = Arrays.copyOf(arr2, 3);
        System.out.println(Arrays.toString(ints));

    }

    /**
     * Arrays工具类常用方法
     * equals、toString、sort
     * fill（填充）、binarySearch(二分查找)、compare()、copyOf
     * 常见的异常
     * 数组角标越界异常：ArrayIndexOutOfBoundsException
     * 空指针异常：NullPointerException
     */
    @Test
    public void test1(){

    }
}
