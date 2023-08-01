package 集合框架测试.二级联动;

import org.junit.Test;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CityMap {
    public static Map model = new HashMap();
    static {
        model.put("北京",new String[] {"北京"});
        model.put("辽宁",new String[]{"沈阳","盘锦","铁岭","丹东","大连","锦州","营口"});
        model.put("吉林",new String[]{"长春","延边","吉林","白山","白城", "四平","松原"});
        model.put("河北",new String[]{"承德","沧州","邯郸","邢台","唐山","保定","石家庄"});
        model.put("河南",new String[]{"郑州","许昌","开封", "洛阳", "商丘","南阳","新乡"});
        model.put("山东",new String[]{"济南","青岛","日照","临沂","泰安","聊城","德州"});

    }

    public static void main(String[] args) {
        Set keySet = model.keySet();
        for (Object o :
                keySet) {
            System.out.print(o+"\t"+"\t");

        }
        System.out.println();

        System.out.println("请选择你所在的省份:");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        try {
                String[] s2 = (String[]) model.get(s);
                System.out.println(s);
                for (int i = 0; i < s2.length; i++) {
                    System.out.print(s2[i]+"\t"+"\t");

                }
                System.out.println();
                System.out.println("请选择你所在的城市:");
                String s1 = scanner.next();
                boolean flag =false;
                for (int i = 0; i < s2.length; i++) {
                    if(s1.equals(s2[i])){
                        flag=true;
                        break;
                    }
                }
                if(flag){
                    System.out.println("录入成功");
                }else {
                    System.out.println("没有录入此城市");
                }

        } catch (Exception e) {
            System.out.println("没有录入此省份");
        }

        scanner.close();
    }
}