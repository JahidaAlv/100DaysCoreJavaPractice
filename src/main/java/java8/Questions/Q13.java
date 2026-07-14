package java8.Questions;

import java.util.Arrays;
import java.util.List;

public class Q13 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3);
        list.forEach(
                System.out::print
        );
    }
}
// Java 8 MCQ - Comment Output
//A. 123
//B. 321
//C. Error
//D. Null


