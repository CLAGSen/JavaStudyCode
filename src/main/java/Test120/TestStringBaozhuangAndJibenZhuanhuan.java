package Test120;

public class TestStringBaozhuangAndJibenZhuanhuan {
    @org.junit.Test
    public void test1(){
        //String转基本
        String s1 ="124";
        int is1 = Integer.parseInt(s1);
        System.out.println(is1);

        String s2 = "true";
        boolean bs2 = Boolean.parseBoolean(s2);
        System.out.println(bs2);

//        String转包装
        String s3 ="123";
        Integer is12 = Integer.valueOf(s3);
        System.out.println("is12:" + is12);

        Integer integer = Integer.parseInt(s1);
        System.out.println(integer);


    }
    @org.junit.Test
    public void test2(){

        //基本类型转String
        int i1 =10;
        String si1 = String.valueOf(i1);
        System.out.println("基本类型转String:  "+si1);

        boolean b1 =true;
        String sb1 = String.valueOf(b1);
        System.out.println(sb1);

        //包装类转String
        Boolean B1 = true;
        String sB1 = String.valueOf(B1);
        System.out.println(sB1);

        Integer I1 = 150;
        String sT1 = String.valueOf(I1);
        System.out.println(sT1);

        //轻巧方法
        String sq1 = i1+"";
    }

}
