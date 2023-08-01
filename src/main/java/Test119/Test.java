package Test119;

public class Test {
    public static void main(String[] args) {
//        String i1 = "120";
        int i1 =120;
        //法1
        Integer ii1 = new Integer(i1);
        System.out.println(ii1.toString());
        //法2
        Integer ii2 = Integer.valueOf(i1);
        System.out.println(ii2.toString());

        System.out.println(Integer.MAX_VALUE);
        System.out.println('\n');

        //包装类转普通
        int i2 = ii1.intValue();
        System.out.println(i2);

        //自动装箱
        int i3 = 12;
        Integer ii3 = i3;

//        自动拆箱
        int i4 = ii3;
    }
}
