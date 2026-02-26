package Questions;

import java.util.Arrays;

//Java Program to Sort Strings in Alphabetical Order
public class SortString {
    public static void main(String[] args) {
        String[] strings = {"orange", "apple", "banana", "grapes"};
        Arrays.sort(strings);
        System.out.println("Sorted Strings: ");

        for (String s : strings){
            System.out.println(s);
        }
    }
}

