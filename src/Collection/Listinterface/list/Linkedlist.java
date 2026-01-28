package Collection.Listinterface.list;

import java.util.LinkedList;
import java.util.List;

public class Linkedlist {

    public static void main(String[] args) {

        LinkedList<Integer> demo = new LinkedList<>();

        demo.add(3);
        demo.add(45);
        demo.add(12);
        demo.add(300);
        demo.add(24);
        System.out.println(demo);
        demo.addFirst(45);
        demo.addLast(34);
        demo.getFirst();
        demo.getLast();

        System.out.println(demo);




    }






}
