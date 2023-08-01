package Test112.Test11201;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
//        student.me();
        Person person = new Student();
        Student student1 = (Student) person;



        System.out.println(person);
        System.out.println(student1);



    }
}
