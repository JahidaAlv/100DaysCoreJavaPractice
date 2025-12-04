package three.classdemo.interfaces;

//Interface contains abstract methods (without body).

public class InterfaceDemo {
    public static void main(String[] args) {
        ElectricCar e1 = new ElectricCar();
        e1.applyBrakes();

        CarControls myCar = new ElectricCar();
        myCar.turnLeft();
        myCar.turnRight();
    }
}
