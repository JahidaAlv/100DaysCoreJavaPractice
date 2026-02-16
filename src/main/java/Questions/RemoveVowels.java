package Questions;

public class RemoveVowels {
    public static void main(String[] args) {
        String string = "Hey, This is java programming";

        string = string.replaceAll("[aeiouAEIOU]", "");
        System.out.println(string);
    }
}
