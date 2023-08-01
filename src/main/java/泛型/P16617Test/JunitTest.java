package 泛型.P16617Test;

import org.junit.Test;

import java.util.List;
import java.util.Map;

public class JunitTest {
    @Test
    public void test1(){
     DAO<User> dao =new DAO<>();
//        Map map = dao.getMapInstance();
        dao.save("1",new User(1,"jett"));
     dao.save("2",new User(2,"cypher"));
        List<User> list = dao.list();
        System.out.println(list);
    }
}
