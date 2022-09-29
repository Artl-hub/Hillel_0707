package Homeworks.homework15;

import java.util.ArrayList;

public class ExtendMassive {


    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5, 6};
        addNewNumber(a, 7);
    }

    static void addNewNumber(int[] a, int b) {

        ArrayList<Integer> newArr = new ArrayList<Integer>();
        for (int x : a) {
            newArr.add(x);
        }
        newArr.add(b);

        System.out.print(newArr);
    }

}