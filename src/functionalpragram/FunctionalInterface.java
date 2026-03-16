package functionalpragram;

import java.util.function.Predicate;

public class FunctionalInterface   {


    public static void main(String[] args) {

        maths m = () -> System.out.println("hello buddy");

        m.mathematics();

        // *PREDICATE INBUILD INTERFACE*

        Predicate<Integer> hello = x -> x%2==0 ;

        System.out.println(hello.negate());

     Predicate<String> hel = x-> x.toLowerCase().startsWith("M");

       Predicate<String> and = hel.and(hel);



        Predicate<String> startsWithH = s -> s.startsWith("H");
        Predicate<String> endsWithO = s -> s.endsWith("o");

        Predicate<String> combined = startsWithH.and(endsWithO);

        System.out.println(combined.test("Hello")); // true
        System.out.println(combined.test("Hi"));    // false

    }


/*
    interface  maths {

        int mathematics(int a , int b);

    }
*/


}

/*
interface  maths {

 int mathematics(int a , int b);

}
*/
