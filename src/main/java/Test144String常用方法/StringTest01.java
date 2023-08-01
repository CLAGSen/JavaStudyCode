package Test144String常用方法;

import org.junit.Test;

public class StringTest01 {
/**
 * 1.
 * (1) boolean isEmpty():字符串是否为空
 * (2) int length():返回字符串的长度
 * (3) String concat(xx):拼接
 * (4) boolean equals(object obj):比较字符串是否相等，区分大小写
 * (5 boolean equalsIgnoreCase(Object obj):比较字符串是否相等，不区分大小写
 *
 * (6) int compareTo(String other):比较字符串大小，区分大小写，按照Unicode编码值比较大小
 * (7) int compareToIgnoreCase(String other):比较字符串大小，不区分大小写
 * (8  String toLowercase():将字符串中大写字母转为小写
 * (9 String toUppercase():将字符串中小写字母转为大写
 * (10) String trim():去掉字符串前后空白符
 * (11) public String intern():结果在常量池中共享
 *
 */
    @Test
    public void test1(){
        String s1 = "";
        String s2 = new String();
        String s3 = new String("");

        System.out.println(s1.isEmpty());//true
        System.out.println(s2.isEmpty());//true
        System.out.println(s3.isEmpty());//true

        s1="hello";
        s2="world";
        System.out.println(s1.length());//5
        System.out.println(s1.concat(s2));
    }

/**
 * 2.查找
 (11) boolean contains(xx):是否包含xx
 (12) int indexOf(x):从前往后找当前字符串中xx，
        即如果有返回第一次出现的下标，要是没有返回-1
 (13) int indexOf(String str, int fromIndex):
        返回指定子字符串在此字符串中第一次出现处的索引，从指定的索引开始
 (14) int lastIndexOf(x):从后往前找当前字符串中x，
    即如果有返回最后一次出现的下标，要是没有返回-1
 (15) int lastIndexOf(String str, int fromIndex):
    返回指定子字符串在此字符串中最后一次出现处的索引，从指定的索引开始反向搜索。

 * 
*/
    @Test
    public void test2(){
        String str = "hello";
        System.out.println(str.hashCode());
        str="gi";
        System.out.println(str.hashCode());
        System.out.println(str);

    }
/**
* 3.字符串截取
* (16) String substring(int beginIndex):
 *      返回一个新的字符串，它是此字符串的从beginIndex开始截取到最后的一个子字符串。
* (17) String substring(int beginIndex, int endIndex):
 *      返回一个新字符串，它是此字符串从beginIndex开始截取到
 *      endIndex(不包含)的一个子字符串。
*/

/**
* 4.和字符/字符数组相关
* (18) char charAt(index):返回[index]位置的字符
* (19) char[] toCharArray():将此字符串转换为一个新的字符数组返回
* (20) static String valueOf(char[] data):
 *          返回指定数组中表示该字符序列的 string
* (21) static String valueOf(char[] data, int offset, int count):
 *          返回指定数组中表示该字符序列的string
* (22) static String copyValueOf(char[] data):
 *          返回指定数组中表示该字符序列的 string
* (23) static String copyValueOf(char[] data, int offset, int count):
 *          返回指定数组中表示该字符序列的 string
 *
 * 5.开头与结尾
 * (24) boolean startsWith(xx):测试此字符串是否以指定的前缀开始
 * (25) boolean startsWith(String prefix, int toffset):
 *          测试此字符串从指定索引开始的子字符串是否以指定前缀开始
 * (26) boolean endsWith(xx):测试此字符串是否以指定的后缀结束
 *
 *
 * 6.替换
 * (27) String replace(char oldChar,char newChar):
 *      返回一个新的字符串，它是通过用newChar替换此字符串中出现的所有oldChar得到的。
 *      不支持正则。
 * (28) string replace(CharSequence target, CharSequence replacement):
 *      使用指定的字面值替换序列替换此字符串所有匹配字面值目标序列的子字符串。
 * (29) String replaceAll(String regex, String replacement):
 *      使用给定的replacement替换此字符串所有匹配给定的正则表达式的子字符串。
 * (30) String replaceFirst(String regex, String replacement):
 *      使用给定的replacement替换此字符串匹配给定的正则表达式的第一个子字符串。
*/
}
