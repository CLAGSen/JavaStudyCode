package 反射.Test189类加载器;

import org.junit.Test;

public class ClassLoaderTest {
    //jdk1.8 获取系统类加载器
    @Test
    public void test1(){
        //应用类加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);
        //扩展类加载器
        ClassLoader systemClassLoaderParent = systemClassLoader.getParent();

        //引导类加载器
        ClassLoader systemClassLoaderParentParent = systemClassLoaderParent.getParent();

    }
}
