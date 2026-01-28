package Encapsulation;




  class hello {
     private int speed;
      int carmodel;
      String carname;

      public hello(int speed, int carmodel, String carname) {
          this.speed = speed;
          this.carmodel = carmodel;
          this.carname = carname;
      }

      public hello(){

      }

      public int getSpeed() {
          return speed;
      }

      public void setSpeed(int speed) {
          this.speed = speed;
      }

      public int getCarmodel() {
          return carmodel;
      }

      public void setCarmodel(int carmodel) {
          this.carmodel = carmodel;
      }

      public String getCarname() {
          return carname;
      }

      public void setCarname(String carname) {
          this.carname = carname;
      }

      public void drive(){
          System.out.println(" "+ speed);
      }
  }

public class Encdemo {



    public static void main(String[] args) {

        hello car1  = new hello();

        car1.setSpeed(100);
       // System.out.println("car speed initially"+" " + car1.getSpeed());

         car1.drive();


         //  System.out.println("car speed initially"+" " + car1.getSpeed());

        //  car1.speed = 300;
       // System.out.println("car speed initially"+" " + car1.getSpeed());
    }




}
