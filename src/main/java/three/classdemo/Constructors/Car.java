package three.classdemo.Constructors;

public class Car {
    String brand;
    String color;
    int speed;

//    public void setBrand(String brand) {
//        this.brand = brand;
//    }

//    public Car(){
//   java provides a constructor by default without any parameters.
//    }

        public Car(String brand, String color, int speed){
//        System.out.println("Constructor Called");
       this.brand = brand;
       this.color = color;
       this.speed = speed;
    }

    public void drive(){
        System.out.println(brand + " is driving at " + speed);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
