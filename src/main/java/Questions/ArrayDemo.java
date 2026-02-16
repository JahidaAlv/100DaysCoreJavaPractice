package Questions;

// 1
public class ArrayDemo {
    public static void main(String[] args) {

        // Create array of size 5
        int[] arr = new int[5];

        // Store values in array
        arr[0] = 100;
        arr[1] = 100;
        arr[2] = 100;

        // Print size of array
        System.out.println(arr.length);
    }
}

//Interview-ready explanation
//An array named arr is created with size 3.
//Values are stored at index 0, 1, and 2.
//A for loop is used to access and print each element.
//The length property is used to get the array size.
//Loop runs from index 0 to arr.length - 1.


// 2
//public class ArrayDemo {
//    public static void main(String[] args) {
//
//        // Create array of size 5
//        int[] arr = new int[3];
//
//        // Store values in array
//        arr[0] = 100;
//        arr[1] = 101;
//        arr[2] = 102;
//
//        // Print size of array
//       for(int i = 0; i < arr.length; i++){
//           System.out.println(arr[i]);
//       }
//    }
//}

//Interview-ready explanation (simple)
//An integer array of size 3 is created using new int[3].
//Values are stored using index positions (0, 1, 2).
//A for loop is used to access each element.
//The length property is used to get the array size.
//The loop runs from 0 to arr.length - 1 and prints all elements.


// 3
//public class ArrayDemo {
//    public static void main(String[] args) {
//
//        // create boolean array of size 3
//        boolean[] arr = new boolean[3];
//
//        // assign true to index 2
//        arr[2] = true;
//
//        // print all elements using for loop
//        for(int i = 0; i < arr.length; i++){
//            System.out.println(arr[i]);
//        }
//    }
//}

//Interview-ready explanation
//A boolean array of size 3 is created.
//By default, all boolean elements are initialized to false.
//The value true is assigned to index 2.
//A for loop is used to print all elements.
//The length property is used to get the size of the array.


// 4
//public class ArrayDemo {
//    public static void main(String[] args) {
//
//        // create boolean array of size 3
//        int [] arr = {101, 102, 103, 104};
//
//        // print array elements using for loop
//        for(int i = 0; i < arr.length; i++){
//            System.out.println(arr[i]);
//        }
//    }
//}

//Interview-ready explanation (best answer)
//This program creates an integer array using array literal, which automatically initializes the array with given values.
//The size of the array is determined by the number of elements.
//A for loop using the length property is used to access and print all elements of the array.

//import java.util.Arrays;

// 5
//public class ArrayDemo {
//    public static void main(String[] args) {
//        // create and initialize array
//        int [] arr = {15, 8, 9, 2, 11, 4};
//
//        // sort the array in ascending order
//        Arrays.sort(arr);
//
//        // minimum element is at index 0
//        System.out.println("Min Element: " + arr[0]);
//
//        // maximum element is at last index
//        System.out.println("Max Element: " + arr[arr.length - 1]);
//
//    }
//}
//        Min Element: 2
//        Max Element: 15



// 6
//public class ArrayDemo {
//    public static void main(String[] args) {
//        int [] arr = {15, 8, 9, 2, 11, 4};
//
//        int min = arr[0];
//        int max = arr[0];
//
//        // loop through array
//        for(int i = 0; i < arr.length; i++){
//            if (arr[i] < min){
//                min  = arr[i];
//            }
//            if (arr[i] > max){
//                max = arr[i];
//            }
//        }
//        System.out.println("Min Element: " + min);
//        System.out.println("Max Element: " + max);
//    }
//}
//        Min Element: 2
//        Max Element: 15

// Explanation:-
//        To find minimum and maximum without sorting, we traverse the array using a loop.
//        We assume the first element as min and max, then compare each element and update min and max accordingly.
//        This approach is efficient because it finds both values in a single traversal.

// 7
