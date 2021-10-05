package 字符串;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName GsonTest
 * @Description TODO
 * @Author 昝亚杰
 * @Date 2021/6/18 16:25
 * Version 1.0
 **/
public class GsonTest {
    static class Person {
        private int age;
        private String name;

        public Person() {
// TODO Auto-generated constructor stub
        }

        public Person(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person [age=" + age + ", name=" + name + "]";
        }
    }

    public static void main(String[] args) {
        Gson gson = new Gson();
        Person person = new Person(12,"昝亚杰");
        String personGson = gson.toJson(person);
        System.out.println(personGson);
        System.out.println("----------------------------");

        Person person1 = gson.fromJson(personGson, Person.class);
        System.out.println(person);
        System.out.println("---------------------------");

        List<Person> personList = new ArrayList<Person>();
        for(int i = 0; i < 3; i++){
            personList.add(new Person(i,"name_" + i));
        }
        System.out.println(personList);
        String listGson = gson.toJson(personList);
        System.out.println(listGson);
        System.out.println("------------------------------");

        Map<String, Person> mapPerson = new HashMap<String, Person>();
// 添加 person 到 map 中
        mapPerson.put("p1", new Person(1, "person-1"));
        mapPerson.put("p2", new Person(2, "person-2"));
// 把 map 转换成为 json 对象
        String jsonMapString = gson.toJson(mapPerson);
        System.out.println(jsonMapString);
    }
}
