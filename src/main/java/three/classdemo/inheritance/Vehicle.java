package three.classdemo.inheritance;

public class Vehicle {

    private String brand;
    private int speed;
    private String honda;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getPerson() {
        return honda;
    }

    public void setPerson(String person) {
        this.honda = person;
    }

    public  void displayInfo(){
        System.out.println("Brand: " + brand + ", Speed:" + speed + " km/hr" );
    }
}
