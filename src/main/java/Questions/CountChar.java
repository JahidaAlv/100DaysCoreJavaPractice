package Questions;

//public class CountChar {
//    public static void main(String[] args) {
//        String str = "programming";
//        char c = 'g';
//        int count = 0;
//
//        for (int i = 0; i < str.length(); i++){
//            if(str.charAt(i) == c)
//                count++;
//        }
//        System.out.println(count);
//    }
//}


public class CountChar {
    public static void main(String[] args) {
        String str = "java";
        char c = 'a';
        char arr[] = str.toCharArray();
        int count = 0;

        for (int i = 0; i< arr.length;i++){
            if (arr[i] == 'a'){
                count++;
            }
        }
        System.out.println(count);
    }
}