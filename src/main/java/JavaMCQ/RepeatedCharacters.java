package JavaMCQ;

import java.util.stream.Collectors;

public class RepeatedCharacters {
    public static void main(String[] args) {
        String string = "programming";

        string.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        c -> c,
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 1)
                .forEach(e -> System.out.println(e.getKey() + " : " + e.getValue()));
    }
}
