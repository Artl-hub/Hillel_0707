package Homeworks.homework5;

public class Main {
    public static void main(String[] args) {
//
//        int a = 0; // Приведение типов. пример
//        long b = 15;
//        a = (int) b;
//        System.out.println(a);

//        double a = 11.855;
//        int b = (int)  a;
//        System.out.println(b);

//        int a =129;
//        byte b = (byte) a;
//        System.out.println(b);
        // Дз 9
        String[][] array = {{"*", "*", "*", "*"}, {"*", "*", "*", "*"}, {"*", "*", "*", "*"}};
        for (int i = 0; i < array.length; i++) { // длинна строки равна количеству столбцов
            for (int j = 0; j < array[i].length; j++) { //
                System.out.print(" " + array[i][j] + " ");
            }
            System.out.println();
        }

        //ДЗ 8. ДЗ. 8
        //Необходимо написать метод, который бы возвращал из 2 чисел меньшее число.
        // Например, из двух чисел 7 и 3 метод должен вывести в консоль 3.

        int a = 7;
        int b = 3;
        minInt(a, b);
//        вариант 2 без создания метода
//        int min = Math.min(a, b);
//        System.out.println(min);


    }

    static void minInt(int a, int b) {
        int min = Math.min(a, b);
        System.out.println(min);


}




}

