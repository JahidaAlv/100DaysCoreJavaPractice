package java8.Questions;

import java.util.Optional;

public class Q4 {
    public static void main(String[] args) {
        Optional<String> opt =Optional.of("CodingWorld");
        System.out.println(opt.get());

    }
}
// What will be the output of this code? 👇
// A. Optional, B. CodingWorld, C. Exception, D. null

