package Collection.Listinterface.Map;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class sortedmap {

    public static void main(String[] args) {

        SortedMap<Integer, String> map = new TreeMap<>();


        map.put(3, "C");
         map.put(1, "A");
         map.put(2, "B");
          map.put(5, "E");
         map.put(4, "D");

        System.out.println( map);


        System.out.println(map.get(3));


        map.remove(2);
         System.out.println(map);


        System.out.println(map.containsKey(1));
         System.out.println(map.containsValue("D"));


         System.out.println(map.size());

           System.out.println(map.isEmpty());



        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


        System.out.println(map.firstKey());

        System.out.println(map.lastKey());


        System.out.println( map.headMap(4));

        System.out.println(map.tailMap(3));
         System.out.println(map.subMap(1, 4));


        map.replace(3, "Z");


        System.out.println("After replacing key 3: " + map);


        map.putIfAbsent(6, "F");
         System.out.println(map);


        map.clear();

        System.out.println(map);





    }


}
