package ArrayExample;

import java.util.ArrayList;

public class TrimToSizeExample {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Spring");
        list.add("Hibernate");

        System.out.println("Before trimToSize:");
        System.out.println(list);

        list.trimToSize();

        System.out.println("After trimToSize:");
        System.out.println(list);
    }
}