package four;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//Iterator is an interface in Java used to iterate (loop) through elements of a collection one by one.
public class IteratingDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");

        // Using Iterator
        Iterator<String> it = list.iterator();

        // Using while loop
        System.out.println("Using while loop---->");
        while (it.hasNext()){
            System.out.println(it.next());
        }

        // Using for loop

        System.out.println("Using for-each loop---->");
        for (String item : list){
            System.out.println(item);
        }

        // using for loop
        System.out.println("Using for loop---->");
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

    }
}
