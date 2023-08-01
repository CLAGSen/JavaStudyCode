package 反射.Test190反射的应用01;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class NewInstanceTest {
    // 创建运行时类的对象
    @Test
    public void test1() throws InstantiationException, IllegalAccessException {
        Class<User02> aClass = User02.class;

        //创建User02类的实例,调用newInstance()方法
        User02 userInstance = aClass.newInstance();
        //条件1：运行时类必须提供个空参构造器
        //   2: 构造器权限需要够


        System.out.println(userInstance);



    }
    @Test
    public void test2(){
        Class<User02> aClass = User02.class;
        //getFields获取运行时类本身及其所有父类中  声明为public权限的属性
        Field[] fields = aClass.getFields();
        for (Field f :
                fields) {
            System.out.println(f);

        }

        //getDeclaredFields获取当前运行时类所有属性
        Field[] fields1 = aClass.getDeclaredFields();
        for (Field f :
                fields1) {
            System.out.println(f);

        }

        //getMethods()获取运行时类本身及其所有父类中  声明为public权限的方法
        //getDeclaredMethods获取当前运行时类所有方法
//        getAnnotations获取方法上面的注解
        //getReturnType()获取返回值类型
    }
    //获取运行时类的内部结构2：父类、接口们、包、带泛型的父类、父类的泛型
    @Test
    //获取父类
    public void test3() throws ClassNotFoundException {
        Class<?> clazz = Class.forName("反射.Test190反射的应用01.User02");
        Class<?> clazzSuperclass = clazz.getSuperclass();
        System.out.println(clazzSuperclass);
        //getGenericSuperclass  获取带泛型的父类
        //getInterfaces 获取实现的接口
    }


    @Test
    public void test4() throws Exception {
        /**
         * 调用指定的属性
         */
        Class<User02> user02Class = User02.class;
        User02 instance = user02Class.newInstance();

        //1.获取运行时类指定名的public的属性
        Field age = user02Class.getField("age");

        //2.获取值，放入对象,拿属性去调用对象
        age.set(instance,2);
        System.out.println(age.get(instance));

        //或2.getDeclaredField获取所有属性
        Field name = user02Class.getDeclaredField("name");
        //3.权限不足，设置权限
        name.setAccessible(true);
        //4.set get属性
        name.set(instance,"zhs");
        System.out.println(name.get(instance));

    }
        /**
         * 对于静态属性
         */
        @Test
        public void test5() throws  Exception{
            //1.获取实例
            Class<User02> user02Class = User02.class;
            //2.通过class调用属性
            Field name = user02Class.getDeclaredField("name");
            //3.确保属性可以访问，权限够
            name.setAccessible(true);
            //4.调用时候填类.class ,静态变量  填null也可以
            name.set(User02.class,"zzz");
            System.out.println(name.get(User02.class));

        }

    /**
     * 调用指定的普通方法
     */
    @Test
    public void test6() throws  Exception{
        //1.获取实例
        Class<User02> user02Class = User02.class;
        //2.new 一个对象
        User02 instance = user02Class.newInstance();
        //3.通过class调用方法
        Method method = user02Class
                .getDeclaredMethod
                ("showNameAndAge", String.class, int.class);
        //4.确保属性可以访问，权限够
        method.setAccessible(true);

        //5.调用方法invoke(调用的对象,形参...)
        Object returnValue = method.invoke(instance, "ccc", 15);
        System.out.println(returnValue);
    }

    /**
     * 调用指定的静态方法
     */
    @Test
    public void test7() throws  Exception{
        //1.获取实例
        Class<User02> user02Class = User02.class;
        //2.通过class调用方法
        Method method = user02Class
                .getDeclaredMethod
                        ("testMe", String.class);
        //3.确保属性可以访问，权限够
        method.setAccessible(true);

        //4.调用方法invoke(调用的对象,形参...)
        Object returnValue = method.invoke(null, "++");
        System.out.println(returnValue);
    }

    /**
     * 调用指定的构造器
     */
    @Test
    public void test8() throws  Exception{
        //1.获取实例
        Class<User02> user02Class = User02.class;
        //2.通过class调用方法
        Constructor<User02> constructor = user02Class
                //直接写参数就行
                .getDeclaredConstructor(String.class,int.class);
        //3.确保属性可以访问，权限够
        constructor.setAccessible(true);


        //4  new一个实例
        User02 user02 = constructor.newInstance("Tom", 12);
        System.out.println(user02);
    }
    /**
     * 使用constructor替换Class.newInstance的方式去创建对象
     */
    @Test
    public void test9() throws  Exception{
        //1.获取实例
        Class<User02> user02Class = User02.class;
        //2.通过class调用方法
        Constructor<User02> constructor = user02Class
                //直接写参数就行
                .getDeclaredConstructor();
        //3.确保属性可以访问，权限够
        constructor.setAccessible(true);


        //4  new一个实例
        User02 user02 = constructor.newInstance();
        System.out.println(user02);
    }

    /**
     * 反射的动态性
     */
    public <T> T getInstance(String className) throws Exception{
        //获取类的实例
        Class<?> name = Class.forName(className);
        //获得空参构造器
        Constructor<?> constructor = name.getDeclaredConstructor();
        //给予权限
        constructor.setAccessible(true);
        //返回对象
        return (T) constructor.newInstance();
    }

}
