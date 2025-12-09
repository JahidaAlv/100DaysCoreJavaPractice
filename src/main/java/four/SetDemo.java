package four;

import java.util.HashSet;
import java.util.Set;

// Set - Interface, no duplicate, unordered
public class SetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Admin");
        set.add("User");
        set.add("Manager");
        set.add("Manager");

        for(String s : set)
            System.out.println("Role:" + s);
    }
}
