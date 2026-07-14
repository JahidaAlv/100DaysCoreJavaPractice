package java8.Questions;

public class Q12 {
    interface A {
        void show();
    }

    public static void main(String[] args) {
        A obj = () -> System.out.println("Hii");
        obj.show();
    }
}

// Java 8 MCQ - Comment Output
//A. Hi
//B. Error
//C. Null
//D. show




