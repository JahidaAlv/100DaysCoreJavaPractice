package Questions;

//import java.util.Arrays;

import java.util.Arrays;

//1
public class Anagram {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "bca";

        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        if (Arrays.equals(a1,a2)){
            System.out.println("Anagram");
        }else {
            System.out.println("Not Anagram");
        }
    }
}

