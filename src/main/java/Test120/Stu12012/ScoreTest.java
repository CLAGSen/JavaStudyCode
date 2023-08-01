package Test120.Stu12012;

import java.util.Scanner;
import java.util.Vector;

public class ScoreTest {
    public static void main(String[] args) {
        Vector v = new Vector();

        Scanner scanner = new Scanner(System.in);

//        System.out.println("请输入学生人数");
        System.out.println("输入成绩，负数结束:");
        int maxScore = 0;
        //循环获取成绩
        while (true){

            int i = scanner.nextInt();
            if(i>=0){
                if(maxScore<i){
                    maxScore=i;
                }

            Integer score = i;
            v.addElement(score);

            }else{
                break;
            }
        }
        System.out.println("MAX"+maxScore);
        for (int i = 0; i < v.size(); i++) {
            Object o = v.elementAt(i);
            int score = (Integer) o;

            char grade;

            if(maxScore-score<=10){
                grade = 'A';
            }else if (maxScore-score<=20){
                grade = 'B';
            }else if (maxScore-score<=30){
                grade = 'C';
            }else{
                grade = 'D';
            }
            System.out.println
                    ("student "+i+" score is "+score+" grade is "+grade);
        }











        scanner.close();
    }
}
