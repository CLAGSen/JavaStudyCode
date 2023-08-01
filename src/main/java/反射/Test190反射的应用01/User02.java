package 反射.Test190反射的应用01;

import java.util.Objects;

public class User02 {
  static private String name;
  public   int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private User02(String name, int age) {
        this.name = name;
        this.age = age;
    }

    static private String testMe(String name){
        return name+"这是静态方法";
    }

    private String showNameAndAge(String name,int age){
        return name+"+"+age;
    }
    public User02() {
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User02)) return false;
        User02 user = (User02) o;
        return age == user.age && name.equals(user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
