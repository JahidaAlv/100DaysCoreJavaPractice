package java8.Questions;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Filter even numbers from a list
public class Q15 {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(10,15,20,44,29,11,13);

        List<Integer> newArr = arr.stream()
                .filter(x -> x% 2== 0)
                .collect(Collectors.toList());
        System.out.println(newArr);
    }
}








