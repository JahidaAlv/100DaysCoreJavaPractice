package four;

import java.util.ArrayList;
import java.util.List;

//List - interface, ordered,duplicated allowed

class Car{
    String brand;
    Car(String brand){
        this.brand = brand;
    }
}


public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList();

        list.add("Alice");
        list.add("Bob");
        list.add("Zaikab");
        list.add("Bob"); //duplicate allowed

        System.out.println("----All user list----");
        for (String user : list){
            System.out.println(user);
        }

        Car car1 = new Car("Toyota");
        Car car2 = new Car("Thar");

        List<Car> carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);

        System.out.println("----All Cars----");
        for (Car car : carList){
            System.out.println(car.brand);
        }
    }
}
