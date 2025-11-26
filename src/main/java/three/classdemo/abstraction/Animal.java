package three.classdemo.abstraction;

/** Animal is an abstract class because:
- It has an abstract method: sound()
- It also has a normal method: sleep()
- Dog and Cat provide the actual implementation of sound().**/

abstract class Animal {

    abstract void sound();

    void sleep(){
        System.out.println("Animal sleep..");
    }
}
