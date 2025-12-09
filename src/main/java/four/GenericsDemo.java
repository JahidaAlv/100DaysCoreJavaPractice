package four;

import java.util.ArrayList;

// Generics - will implement Type Safety
public class GenericsDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        System.out.println("----String----");
        arrayList.add("Jahida Ali");

        String name = arrayList.get(0);
        System.out.println(name);

        System.out.println("----Integer----");
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);

        for(Integer i : al){
            System.out.println(i);
        }
    }
}
