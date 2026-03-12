package java8.Questions;

import java.util.Optional;

public class Q3 {
    public static void main(String[] args) {
        Optional<String> opt =
                Optional.ofNullable(null);
        System.out.println(opt.isPresent());
    }
}

