package three.classdemo;

import java.io.File;

public class ClassesObjectDemo {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.brand = "Thar";
        car1.speed = 100;
        car1.color = "Black";
        car1.drive();

        Car car2 = new Car();
        car2.speed = 120;
        car2.brand = "Kia";
        car2.color = "White";
        car2.drive();

    }
}
