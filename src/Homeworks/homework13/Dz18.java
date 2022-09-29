package Homeworks.homework13;

/*Написать программу, которая будет заменять все четные элементы массива на 0 и выводить результат в консоль!
Массив от 1 до 10!*/
public class Dz18 {
    public static void main(String[] args) {
        int[] interval = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i : interval) {
            if (i % 2 == 0) {
                i = 0;
                System.out.println(i);
            } else {
                System.out.println(i);
            }
        }
    }
}


