package polymorphism;

public class Bike extends Vehicle {

    private boolean hashcarrier;

    public Bike(String brand, int speed, boolean hashcarrier) {
        super(brand, speed);
        this.hashcarrier = hashcarrier;
    }

    public boolean isHashcarrier() {
        return hashcarrier;
    }

    public void setHashcarrier(boolean hashcarrier) {
        this.hashcarrier = hashcarrier;
    }




}
