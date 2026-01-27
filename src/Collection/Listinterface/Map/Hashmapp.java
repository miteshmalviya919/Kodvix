package Collection.Listinterface.Map;

import java.util.HashMap;
import java.util.Map;

public class Hashmapp {

    public static void main(String[] args) {

        HashMap<Integer,String> demo = new HashMap<>();

         demo.put(23,"mitesh");
        demo.put(24,"mitesh");
        demo.put(25,"mitesh");
        demo.put(26,"mitesh");
        demo.put(27,"mitesh");
        demo.put(28,"mitesh");

        System.out.println(demo);

        // iterate it

        for (int i : demo.keySet()){
            System.out.println(demo.get(i));
        }

        for (int i : demo.keySet()){
            System.out.println(i);
        }

        demo.containsKey(1);    // true
        demo.containsValue("Java"); // true

        demo.size();    // 1
        demo.isEmpty(); // false

        for (Map.Entry<Integer, String> entry : demo.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }


        demo.putIfAbsent(3, "Backend");

        demo.replace(1, "Spring Boot");

    }







}
