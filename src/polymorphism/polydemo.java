package polymorphism;


class Mathematician {

    public   int add(int a , int b){
        return a + b;
    }

    public   double add(double a , double b){
        return a + b;
    }





}







public class polydemo {

    public static void main(String[] args) {

     //   Car car1 = new Car();

        Vehicle car1 = new Car("innova",34);

     //   System.out.println(car1.getBrand());

        Car car2= new Car(23);

      //  System.out.println(car2.doors);

       // System.out.println();

      Mathematician math = new Mathematician();

        System.out.println(math.add(2.3,4.5));


    }



}
