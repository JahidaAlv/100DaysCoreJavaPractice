package java8.Questions;

import java.util.Arrays;
import java.util.List;

public class Q5 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,3,7,1);

        list.stream()
                .sorted()
                .forEach(System.out::print);
    }
}



//A. 5371
//B. 1357
//C. 7531
//D. Error