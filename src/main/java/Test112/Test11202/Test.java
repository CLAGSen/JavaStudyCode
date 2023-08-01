package Test112.Test11202;


import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Employee employees[] = new  Employee[2];
        employees[0]= new SalariedEmployee("zzz",
                1001,
                new MyDate(1992,2,13),
                5000);
        employees[1]= new HourlyEmployee("sss",
                4000, new MyDate(1993,3,12),
                12,
                8);

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输当前月份");
        int month = scanner.nextInt();

        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].toString());
            System.out.println("工资为：" + employees[i].earnings());

            if(month == employees[i].getBirthday().getMonth()){
                System.out.println("生日快乐");
            }
        }


    }
}
