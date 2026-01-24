package JavaMCQ;

// Loop inside loop is called as nested loop.


public class NestedLoop {
    public static void main(String[] args) {
        for (int i =1; i <=5; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");  // same line
            }
            System.out.println(); // next line
        }
    }
}


//public class NestedLoop {
//    public static void main(String[] args) {
//        for (int i =1; i <=5; i++){
//            for (int j = 1; j <= 5; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}


//public class NestedLoop {
//    public static void main(String[] args) {
//        for (int i =1; i <=5; i++){
//            for (int j = 1; j <= i; j++){
//                System.out.print(j);  // same line
//            }
//            System.out.println(); // next line
//        }
//    }
//}
//output
//        1
//        12
//        123
//        1234
//        12345


