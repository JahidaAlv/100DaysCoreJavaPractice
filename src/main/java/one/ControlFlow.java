package one;

// means how your program ex
public class ControlFlow {
    public static void main(String[] args) {

        int age = 20;
        if(age > 18){
            System.out.println("Welcome to our bank");
        }else
            System.out.println("Try again  when you turn 18");

        // if-else
        int marks = 90;
        if (marks > 90) {
            System.out.println("Grade A+");
        } else if (marks > 75) {
            System.out.println("Grade A");
        } else if (marks > 60) {
            System.out.println("Grade B");
        }

        //switch

        String day = "Monday";
        switch(day){
            case "Monday" -> System.out.println("Start of the week");
            case "Friday" -> System.out.println("Last day of the week");
            default -> System.out.println("Enjoy weekend");
        }

        //Loops

        // for
        for (int i = 0; i < 5; i++){
            System.out.println("Count:" + i);
        }

        //While
        int num = 3;
        while(num > 0){
            System.out.println("Num:" + num);
            num--;
        }

        // DO while
        int n = 2;
        do{
            System.out.println("n:" + n);
            n--;
        }while(n > 0);

        // Enhanced for each
        String[] fruit = {"Apples", "Banana"};
        for(String a : fruit){
            System.out.println("Fruits:" + a);
        }
        for(int i = 0; i < fruit.length; i++){
            System.out.println("Fruit:" + fruit[i]);
        }

        // JUMP statement
        //break
        for(int i = 0; i < 10; i++){
            if(i == 3)
                break;
            System.out.println("Count:" + i);
        }
    }
}
