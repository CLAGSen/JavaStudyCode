package 泛型.P16617Test;

import java.util.*;

public class DAO<T> {
    Map<String,T> map;

    {
        map=new HashMap<>();
    }
    public Map<String,T> getMapInstance(){
        map=new HashMap<>();
        return map;
    }
    public DAO() {

    }

    public DAO(Map<String, T> map) {
        this.map = map;
    }

    public Map<String, T> getMap() {
        return map;
    }

    public void setMap(Map<String, T> map) {
        this.map = map;
    }
    public void save(String id,T entity){
        if(!map.containsKey(id)){
        map.put(id,entity);

        }
    }
    public T get(String id){
        return map.get(id);
    }

    public void update(String id,T entity){
        if(map.containsKey(id)){
        map.put(id,entity);}
    }

    public void delete(String id){
        map.remove(id);
    }
    public List<T> list(){
        Collection<T> values = map.values();
        List<T> list = new ArrayList<>();
        //方式2
//        List<T> list2 = new ArrayList<>(values);
        //方式3
//        list.addAll(values);
        //values 是Collection类，不能强制转成list
        //方式1
        for (T c :
                values) {
            list.add(c);
        }
        return  list;
    }

}
