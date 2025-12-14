package six;

import java.awt.print.Book;
@FunctionalInterface
interface BookAction{
    void perform();
}

@FunctionalInterface
interface Operation{
    int add(int a, int b);
}

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {

        // step - 1
        BookAction action = new BookAction() {
            @Override
            public void perform() {
                System.out.println("Action performed");
            }
        };
        // step - 2
        BookAction action2 = ()  -> {
            System.out.println("Action performed");
        };

        action2.perform();

        // step - 3

        // Functional interface with parameter
        Operation operation = (int a, int b) -> {
            return a + b;
        };

        System.out.println(operation.add(10,20));
    }
}
