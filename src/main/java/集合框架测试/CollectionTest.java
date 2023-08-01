package 集合框架测试;

import org.junit.Test;

import java.util.*;

public class CollectionTest {
    /**
     * Collection接口的方法
     *
     * 1.添加
     * (1) add(object obj):添加元素对象到当前集合中
     * (2) addAll(Collection other):添加other集合中的所有元素对象到当前集合中
     *
     * 2.判断
     * (3) int size():获取当前集合中实际存储的元素个数
     * (4) boolean isEmpty():判断当前集合是否为空集合
     * (5) boolean contains(Object obj):
     *      判断当前集合中是否存在一个与obj对象equals返回true的元素
     * (6) boolean containsAll(Collection coll):
     *      判断coll集合中的元素是否在当前集合中都存在。
     * (7) boolean equals(Object obj):判断当前集合与obj是否相等
     *
     * 3.删除
     * (8) void clear():清空集合元素
     * (9) boolean remove(object obj):
     *      从当前集合中删除第一个找到的与obj对象equals返回true的元素。
     * (10) boolean removeAlL(Collection coll):
     *      从当前集合中删除所有与coll集合中相同的元素。
     * (11) boolean retainAll(Collection coll):
     *      从当前集合中删除两个集合中不同的元素，使得当前集合仅保留与coll集合
     *      中的元素相同的元素，即当前集合中仅保留两个集合的交集
     *
     * 4.其它
     * (12) Object[] toArray():集合==>数组
     * (13) hashCode():获取集合对象的哈希值
     * (14) iterator():返回迭代器对象，用于集合遍历
     *
     *
     *
     *
     * List接口方法
     * List除了从Collection集合继承的方法外，List集合里添加了一些根据索引来操作集合元素的方法。
     *
     * 1. void add(int index, Object ele):在index位置插入ele元素
     * 2. boolean addAll(int index, Collection eles):
     *      从index位置开始将eles中的所有元素添加进来
     * 3. Object get(int index):获取指定index位置的元素
     * 4. List subList(int fromIndex, int toIndex):
     *      返回从fromIndex到toIndex位置的子集合。
     * 5. int indexOf(Object obj):返回obj在集合中首次出现的位置
     * 6. int lastIndexOf(Object obj):返回obj在当前集合中末次出现的位置
     * 7. object remove(int index):移除指定index位置的元素，并返回此元素
     * 8. object set(int index，Object ele):设置指定index位置的元素为ele
     *
     *
     *
     * Set中常用方法就是Collection中的15个抽象方法
     * 主要方法 HashSet（数组+链表+红黑树），所在的类要重写hashCode和equals方法
     * 还有LinkedHashSet（数组+链表+红黑树+双向链表）、
     * 这俩需要重写equals和hashcode方法 （set不能放相同元素，用这俩去比较）
     * TreeSet（红黑树） 需要重写compare的方法
     *
     *
     *
     * Map
     *   |----HashMap:主要实现类
     *          特点：（线程不安全，效率高），可以添加null的key和value
     *          （数组+单向链表（哈希值相同）+红黑树（8.0的版本特性）
     *          key所在的类要重写hashCode和equals方法，value类重写equals
     *          |----LinkedHashMap:主要实现类
     *                  特点：（数组+链表+红黑树+双向链表），双向链表
     *                  用于记录添加元素的先后顺序，遍历元素时候可以
     *                  按照添加顺序遍历出来，对于频繁遍历建议用此类
     *   |----Hashtable:古老实现类
     *          特点：（线程安全，效率低），不能添加null的key和value
     *          （数组+单向链表（哈希值相同））
     *          |----Properties
     *                  特点：key和value都是String类型的,常用来处理属性文件
     *   |----TreeMap:实现了Comparable和Comparator（需要考虑自然排序和定制排序）,
     *          底层用红黑树(排序二叉树),可以按照添加的key-value中的
     *          key元素的指定的属性的大小顺序进行遍历
     * Map的常用方法
     * 添加、修改操作:
     * 1. Object put(Object key,Object value)
     *      将指定key-value添加到(或修改)当前map对象中
     * 2. void putAll(Map m):将m中的所有key-value对存放到当前map中
     *
     * -删除操作，
     * 3. Object remove(Object key):
     *      移除指定key的key-value对，并返回value
 *     4. void clear(),清空当前map中的所有数据
     *
     * -元素查询的操作:
     * 5. Object get(Object key)，获取指定key对应的value
     * 6. boolean containsKey(Object key):是否包含指定的key
     * 7. boolean containsValue(Object value):是否包含指定的value
     *
     * 8. int size():返回map中key-value对的个数
     * 9. boolean isEmpty():判断当前map是否为空
     * 10. boolean equals(Object obj):判断当前map和参数对象obj是否相等
     *
     * 元视图操作的方法:
     * 11. Set keySet(): 返回所有key构成的Set集合
     * 12. collection values(): 返回所有value构成的Collection集合
     * 13. Set entrySet(): 返回所有key-value对构成的Set集合
     */
    @Test
    public void test1(){
        String s ="hello";
        System.out.println(s.hashCode());
        System.out.println(System.identityHashCode(s));
        s="hi";
        System.out.println(s.hashCode());
        System.out.println(System.identityHashCode(s));
        System.out.println(System.identityHashCode(s));

    }
    @Test
    public void test2(){
        String arr[] = new String[]{"AA","BB"};
        //数组==>集合
        List<String> list = Arrays.asList(arr);
        System.out.println(list);
    }

    @Test
    public void testIterator(){
        Collection collection = new ArrayList();
        collection.add("aa");
        collection.add("bb");
        collection.add("cc");
        collection.add("123");

        Iterator iterator = collection.iterator();
        /*System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());*/

        //iterator.hasNext()
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //增强for循环
        for(Object c: collection){
            System.out.println(c);
        }
        System.out.println(collection);
    }

    @Test
    public void testList(){
        List list = new ArrayList();
        list.add("AA");
        list.add("BB");
        list.add("AC    +-");
        list.add(2,"insert");
        System.out.println(list);
        list.add(2);
        System.out.println(list);
        list.remove(Integer.valueOf(2));
        System.out.println(list);

    }

    @Test
    public void test3(){
        TreeSet treeSet = new TreeSet(new Comparator() {
            @Override
            //重写Comparator接口的方法后直接放入构造器内即可定制排序
            public int compare(Object o1, Object o2) {
                return 0;
            }
        });


    }
    @Test
    public void test4(){
//        Collection collection = new Collection() {
//        }
        List list1 = new ArrayList();
        List list2 = new LinkedList();
        List list3 = new Vector();

        Set set1 = new HashSet();
        Set set2 = new LinkedHashSet();
        Set set3 = new TreeSet();

    }
    @Test
    public void test5(){
        Map map =new HashMap();
        map.put("aa",12);
        map.put(true,13);
        map.put(10,14);
        map.put("Dd",16);
        Set s = map.entrySet();
        //迭代器遍历
        Iterator iterator = s.iterator();
        while (iterator.hasNext()){
            //法1
//            System.out.println(iterator.next());
            //法2
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println(entry.getKey() + "--->" + entry.getValue());
        }
        System.out.println();
        //增强for循环遍历
        for (Object obj :
                s) {
            System.out.println(s);
        }
    }

    //添加歌手和歌曲
    @Test
    public void test6(){
        HashMap map = new LinkedHashMap();

        String singer01 = "周杰伦";
        List list01 = new ArrayList();
        list01.add("夜曲");
        list01.add("七里香");
        list01.add("青花瓷");
        list01.add("晴天");
        String singer02 = "林俊杰";

        List list02 = new ArrayList();
        list02.add("可惜没如果");
        list02.add("不为谁而作的歌");
        list02.add("美人鱼");
        list02.add("江南");

        map.put(singer01,list01);
        map.put(singer02,list02);

        Set entrySet = map.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()){
            //内部接口，得用接口名Map去调用
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        for (Object obj :
                entrySet) {
            System.out.println(obj);
        }
    }

}
