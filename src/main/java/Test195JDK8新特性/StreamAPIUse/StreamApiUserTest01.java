package Test195JDK8新特性.StreamAPIUse;

import Test195JDK8新特性.StreamAPIUse.emp.Emp;
import Test195JDK8新特性.StreamAPIUse.emp.EmpData;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiUserTest01 {
    //1.筛选与切片
    @Test
    public void test1(){
       // filter(Predicate p)——接收Lambda，从流中排除某些元素。
        // 练习:查询员工表中薪资大于7088的员工信息

        List<Emp> list = EmpData.getEmps();
        Stream<Emp> stream = list.stream();
        stream.filter(emp -> emp.getSalary() > 7088)
                //forEach终止操作，遍历(终止后不可再操作了)
                .forEach(System.out::println);

        System.out.println();

//        limit(n) 截断流，使得元素不超过给定数量
        list.stream().limit(4)
                .forEach(System.out::println);
        System.out.println();

//        skip(n)  跳过前n个元素，若不足n则返回空流
        System.out.println();

        //distinct()去重的，通过流生成元素的hashCode()和equals()去重元素
        Emp 田七 = new Emp(1005, "田七", 42, 8930.04);
        list.add(田七);
        list.add(new Emp(1005, "田七", 42, 8930.04));
        list.add(new Emp(1005, "田七", 42, 8930.04));
        list.add(田七);
        list.stream().distinct()
                .forEach(System.out::println);
                 System.out.println();


    }
    
//    2.映射  map，可以用lambda或者方法引用
        @Test
        public void test2(){
            List<String> list = Arrays.asList("aa", "bb", "cc");
            list.stream().map(map -> map.toUpperCase())
                    .forEach(System.out::println);
            list.stream().map(String::toUpperCase)
                    .forEach(System.out::println);
            System.out.println();
            //1.输出员工年龄大于20的员工姓名
            List<Emp> empList = EmpData.getEmps();
            empList.stream()
                    .filter(emp->(int)emp.getAge()>30)
                    .map(map->map.getName())
                    .forEach(System.out::println);

            //2.输出员工姓名有六的员工姓名
            empList.stream()
                    .map(map->map.getName())
                    .filter(name -> name.contains("六"))
                    .forEach(System.out::println);

            //3.输出员工姓名有六的员工姓名 法2
            empList.stream()
                    .map(Emp::getName)
                    .filter(name -> name.contains("四"))
                    .forEach(System.out::println);
        }

//    3.排序
    @Test
    public void test3(){
        //sorted-—自然排序
        Integer[] arr = new Integer[]{345,3,64,3 ,46,7,34,65,68};
        String[] arr1 = new String[ ]{"G6","DD","HM","SS","JJ"};
        Arrays.stream(arr).sorted()
                .forEach(System.out :: println);
        System.out.println(Arrays.toString(arr));

        //调用sorted的需要实现comparable接口 才能默认排序

        //sorted-—定制排序
        List<Emp> empList = EmpData.getEmps();
        Comparator<Emp> comparator = (e1,e2)->e1.getAge()-e2.getAge();
        empList.stream().sorted(comparator)
                .forEach(System.out :: println);
        
        Arrays.stream(arr).sorted(Integer::compare)
                .forEach(System.out :: println);

    }


    /**
     * Stream的终止操作
     * 
     */
//    1.匹配与查找
    @Test
    public void test4(){
//        allMatch(Predicate p)—-检查是否匹配所有元素。
//        练习:是否所有的员工的年龄都大于18
        List<Emp> list = EmpData.getEmps();
        System.out.println(
                list.stream()
                        //返回的是Boolean类型
                        .allMatch(emp -> emp.getAge() >18)
        );

//        anyMatch(Predicate p)—-检查是否存在一个匹配的元素。
//        练习:是否所有的员工的年龄都大于18
        System.out.println(
                list.stream()
                        //返回的是Boolean类型
                        .anyMatch(emp -> emp.getAge() >50)
        );
//          finFirst--返回首个元素,再.get可以获取这个对象

    }
    //1.2
    @Test
    public void test5(){
        //count  返回流中元素总个数
      //  max(Comparator c)   返回流中元素最大
      //  min(Comparator c)   返回流中元素最小
//        forEach(Consumer c) --内部迭代
//        jdk8增加了集合的遍历方法
//        list.forEach(System.out::println)
    }

//    2.规约
    @Test
    public void test6(){
//  reduce(T identity，BinaryOperator)—-可以将流中元素反复结合起来，得到一个值。
//  reduce(BinaryOperator)—-可以将流中元素反复结合起来，得到一个值。
//  identity,可以理解为初始值
//  BinaryOperator extends BiFunction
        /**
         * BiFunction<T, U, R> {
         *      R apply (T t, U u);}
         */

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println(
                list.stream()
                        .reduce(0,(x1,x2) -> x1 + x2)
                );
        System.out.println(
                list.stream()
                        .reduce(100,(x1,x2) -> Integer.sum(x1,x2))
        );
        System.out.println(
                list.stream()
                        .reduce(0,Integer:: sum)
        );

    }

    //3.收集
    @Test
    public void test7(){
    //    collect(Collector c)--将流转换为其他形式。
        //    接收一个Collector接口的实现，用于给Stream中元素做汇总的方法

        List<Emp> list = EmpData.getEmps();
//        练习1:查找工资大于6000的员工。结果返回为一个List或Set
        List<Emp> list1 = list.stream()
                .filter(emp -> emp.getSalary() > 6000)
                .collect(Collectors.toList());

        list1.forEach(System.out :: println) ;
        System.out.println();
        list.forEach(System.out :: println);


    }
}
