package Collection.Listinterface.list;

import java.util.ArrayList;

public class Arrlist {

    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(5);
        list.add(6);
        list.add(7);
        System.out.println(list);

        // iterate the given list

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // for each loop
        for ( int x : list ){
            System.out.println(x);
        }

        // bollen values
        System.out.println(list.contains(3));
        System.out.println(list.contains(5));

        // add element
        list.add(2,4);

        System.out.println(list);

        // add method

        list.set(3,45);

        System.out.println(list);



    }





}
