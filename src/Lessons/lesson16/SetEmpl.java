package Lessons.lesson16;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetEmpl {
    public static void main(String[] args) {

        HashSet<Integer> myHash = new HashSet<>();
        //LinkedHashSet<Integer> myHash = new HashSet<>(); - HashSet  и LinkedHashSet используют одни и те же методы


        myHash.add(1);
        myHash.add(2);
        myHash.add(3);

        System.out.println(myHash.contains(1));

        System.out.println("Hashset is empty? " + myHash.isEmpty());


        System.out.println("Before remove:");
        for (Integer i : myHash) {
            System.out.print(i + " ");
        }

        myHash.remove(1);

        System.out.println();
        System.out.println("After remove:");
        for (Integer i : myHash) {
            System.out.print(i + " ");

        }

        System.out.println();
        System.out.println(myHash.contains(1));
        System.out.println(myHash.size());

        myHash.clear();
        System.out.println(myHash.size());

        System.out.println("Hashset is empty? " + myHash.isEmpty());


    }
}
