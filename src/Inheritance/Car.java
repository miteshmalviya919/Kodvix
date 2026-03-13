package Inheritance;

public class Car extends Vehicle {

     public  int doors;

   public Car( String brand,int speed){
       super(brand,speed);

       //hello
   }

    public Car(int door){
        super("Unknown", 0);
       this.doors = door;
        System.out.println("number of doors called");

   }


    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    @Override
    public void display() {
        System.out.println("speed of car class"+" "+getBrand()+" "+ getSpeed()+" "+ getDoors() );
    }
}
