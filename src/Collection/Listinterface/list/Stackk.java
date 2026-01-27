package Collection.Listinterface.list;

import java.util.Stack;

public class Stackk {

    public static void main(String[] args) {

        Stack<Integer> demo = new Stack<>();

        demo.push(45);
        demo.push(23);
        demo.push(56);
        demo.push(12);
        demo.push(12);

        System.out.println(demo);

        demo.pop();
        demo.pop();

        System.out.println(demo);

        System.out.println(demo.peek());


    }



}
