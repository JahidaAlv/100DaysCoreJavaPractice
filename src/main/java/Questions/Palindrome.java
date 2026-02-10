package Questions;

//public class Palindrome {
//    public static void main(String[] args) {
//        String s = "madam";
//
//        String rev = new StringBuilder(s).reverse().toString();
//
//        if (s.equals(rev)){
//            System.out.println("yes");
//        }else{
//            System.out.println("no");
//        }
//    }
//}

public class Palindrome {
    public static void main(String[] args) {
        String s = "madam";
        String rev = "";

        for (int i = s.length()-1; i >= 0; i--){
            rev = rev + s.charAt(i);
        }

        if (s.equals(rev)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
