import java.util.Objects;

public class Constr {
//    @Override
//    public String toString() {
//        return "Constr{" +
//                "age=" + age +
//                '}';
//    }

    int age = 14;
    String name;
    static int sex = 0;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;

        }
        if (!(o instanceof Constr)){

            return false;

        }else{
            Constr constr = (Constr) o;
            if(this.age== constr.age && this.name.equals(constr.name)){
                    return true;
            }else {
                Objects.equals(name,constr.name);
                return false;

            }

        }


    }


}
