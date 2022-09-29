package Homeworks.homework13.luckyNumber;

public class luckyNumber {

    public static void main(String[] args) {

        int[] interval = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int c : interval) {
            if (c == 3){
                System.out.println(" Вот счастливое число!");
                break;
            }

        }

    }
}

