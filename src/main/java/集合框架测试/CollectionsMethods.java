package 集合框架测试;

public class CollectionsMethods {
/**
 * Collections工具类，操作set、list、map，类似Arrays
 * 以下均为静态方法
 *
 * 排序操作:
 * reverse(List):反转List中元素的顺序
 * shuffle(List):对List集合元素进行随机排序
 * sort(List):根据元素的自然顺序对指定List集合元素按升序排序
 * sort(List，Comparator):
 *      根据指定的Comparator产生的顺序对List集合元素进行排序
 * swap(List，int，int):将指定list集合中的i处元素和j处元素进行交换
 *
 * 查找
 * object max(Collection):根据元素的自然顺序，返回给定集合中的最大元素
 * object max(Collection，Comparator):
 *      根据Comparator 指定的顺序，返回给定集合中的最大元素
 * object min(Collection):根据元素的自然顺序，返回给定集合中的最小元素
 * object min(Collection，Comparator):
 *      根据Comparator指定的顺序，返回给定集合中的最小元素
 *
 * int binarySearch(List list,T key):
 *      在List集合中查找某个元素的下标，但是List的元素必须是T或T的子类对象
 *      ，而且必须是可比较大小的，即支持自然排序的。而且集合也事先必须是有序的
 *      ，否则结果不确定。
 * int binarySearch(List list,T key,Comparator c):
 *      在List集合中查找某个元素的下标，但是List的元素必须是T或T的子类对象
 *      ，而且集合也事先必须是按照c比较器规则进行排序过的，否则结果不确定。
 *
 * int frequency(Collection c，object o):返回指定集合中指定元素的出现次数
 *
 *
 * 复制、替换
 *  void copy(List dest,List src):将src中的内容复制到dest中
 *  boolean replaceAll(List list，object oldVal，object newVal):
 *      使用新值替换List对象的所有旧值
 *  提供了多个unmodifiableXxx()方法，该方法返回指定Xxx的不可修改的视图。
 *
 *
 * 添加
 * boolean addAll(Collection c,T... elements):
 *      将所有指定元素添加到指定collection 中。
 *
 *
 * 同步
 * Collections类中提供了多个synchronizedXx()方法，该方法可使将指定
 * 集合包装成线程同步的集合，从而可以解决多线程并发访问集合时的线程安全问题:
 */

}
