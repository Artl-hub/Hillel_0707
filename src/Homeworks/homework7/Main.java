package Homeworks.homework7;

public class Main {
    public static void main(String[] args) {
         /* ДЗ 13. ДЗ.13
         Заполнить массив из 10 элементов случайными целыми числами от 10(включительно)
         до 20(включительно). Вывести среднее арифметическое.*/

        arrAvr();

    }

    public static void arrAvr() {
        double sum = 0;
        double average = 0;
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 11 + 10);
            sum += array[i];
            average = sum / 10;
        }
        System.out.println("Среднее арифметическое 10 случайных чисел - " + average);

        //-----------------------------------------------------------------
//       Более подробно
//        public static void arrAvr() {
//            float sum = 0;
//            float average = 0;
//            int[] array = new int[10];
//            for (int i = 0; i < array.length; i++) {
//                array[i] = (int) (Math.random() * 11 + 10);
//                System.out.print((array[i] + " "));
//                sum += array[i];
//                average = sum / 10;
//            }
//            System.out.println();
//            System.out.println("Сумма случайных чисел " + sum + "" + " Среднее арифметическое " + average + " ");
//
//
//    }

    }
}
