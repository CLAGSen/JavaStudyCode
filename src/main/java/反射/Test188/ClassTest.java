package 反射.Test188;

import org.junit.Test;

public class ClassTest {
    @Test
    public void test1() throws ClassNotFoundException {
        //调用运行时类的静态属性:class
        Class<User> userClass1 = User.class;
        System.out.println(userClass1);

        //2.object的方法 getClass
        User user = new User();
        Class<? extends User> userClass2
                = user.getClass();

        //3.调用Class的静态方法,更体现动态性
        Class<?> aClass3
                = Class.forName("反射.Test188.User");

        //4.使用类的加载器
        Class<?> aClass4 = ClassLoader
                .getSystemClassLoader()
                .loadClass("反射.Test188.User");
    }

    /**
     * 类的加载器
     * BootstrapClassLoader
     *      引导类、启动类加载器  c、c++写的，不能通过java代码获取实例
     *      负责加载java的核心库
     * 继承于ClassLoader的类加载器
     *   >ExtensionClassLoader  扩展类加载器
     *   >ApplicationClassLoader  应用类加载器
     *      >自定义的类默认使用的加载器
     *   >自定义类加载器
     */
    @Test
    public void test2(){
        String s1 = new String("aa");
        String s2 =new String("aa");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}
