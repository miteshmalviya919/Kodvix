package Collection.Listinterface.Map;

import java.util.LinkedHashMap;

public class LinkedHashmapp {


    public static void main(String[] args) {

        LinkedHashMap<Integer,String> demo = new LinkedHashMap<>(4,7,true);

        demo.put(34,"mtesh");
        demo.put(35,"miesh");
        demo.put(36,"mit");
        demo.put(33,"mitesh");
        demo.put(30,"mitesh");

        System.out.println(demo);

         demo.get(35);

        System.out.println(demo);
    }



}
