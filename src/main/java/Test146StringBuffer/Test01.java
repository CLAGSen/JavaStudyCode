package Test146StringBuffer;

import org.junit.Test;

public class Test01 {
/**
* 1、常用API
*(1) stringBuffer append(ox):提供了很多的append()方法，
*          用于进行字符串追加的方式拼接
*(2) StringBuffer delete(int start, int end):删除[start,end)之间字符
*(3) StringBuffer deleteCharAt(int index):删除[index]位置字符
*(4) StringBuffer replace(int start, int end, String str):
*          替换[start,end)范围的字符序列为str
*(5) void setCharAt(int index, char c):替换[index]位置字符
*(6) char charAt(int index):查找指定index位置上的字符
*(7) stringBuffer insert(int index, x):在[index]位置插入xx
*(8) int length():返回存储的字符数据的长度
*(9) StringBuffer reverse():反转
*/


    @Test
    public void test1(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("hello").append(",").append("world");
        System.out.println(stringBuilder);

    }
/**
* 2、其它API
* (1) int indexOf(String str):在当前字符序列中查询str的第一次出现下标
* (2) int indexOf(String str, int fromIndex):
 *      在当前字符序列[fromIndex,最后]中查询str的第一次出现下标
* (3) int lastIndexOf(String str):在当前字符序列中查询str的最后一次出现下标
* (4) int lastIndexOf(String str, int fromIndex):
*       在当前字符序列[fromIndex,最后]中查询str的最后一次出现下标
* (5) string substring(int start):截取当前字符序列[start,最后]
* (6) String substring(int start, int end):
*       截取当前字符序列[start,end)
* (7) String toString0:返回此序列中数据的字符串表示形式
* (8) void setLength(int newLength):设置当前字符序列长度为newLength
*/

}
