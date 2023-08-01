package Test195JDK8新特性.StreamAPIUse.emp;

import java.util.ArrayList;
import java.util.List;

public class EmpData {
    public static List<Emp> getEmps(){
        ArrayList<Emp> list = new ArrayList<>();
        list.add(new Emp(1001,"张三",22,7630.55));
        list.add(new Emp(1002,"李四",32,6220.00));
        list.add(new Emp(1003,"王五",28,8270.20));
        list.add(new Emp(1004,"赵六",42,8930.04));

        return list;
    }
}
