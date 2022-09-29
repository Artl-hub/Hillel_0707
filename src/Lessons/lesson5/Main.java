package Lessons.lesson5;

import java.util.Arrays;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        int[][] twoDimArray = new int[3][4]; //3 строки и 4 солбца
        twoDimArray[0][0] = 5;
        twoDimArray[0][1] = 4;
        twoDimArray[0][2] = 4;
        twoDimArray[0][3] = 4;


        System.out.println(twoDimArray[0][1]);
        System.out.println(twoDimArray[1][1]); // В случае пустого элемента массива выводится 0,
        // в случае string null
        // в случае boolean folse
        // в случае float doble 0.0
        // char 0




        int[][] twoDimArray2 = {{2, 5, 7, 13},
                                {7, 4, 2, 3},
                                {2, 3, 4, 7}};
        for (int i = 0; i < twoDimArray2.length; i++) { // длинна строки равноа количеству столбцов, нам нужно что бы цикл отработал 3 раза так как у нас
            //  3 столбца
            for (int j = 0; j < twoDimArray2[i].length; j++) { //
                System.out.print(" " + twoDimArray2[i][j] + " ");

            }
            System.out.println();
        }
        int[][] twoDimArray3 = {{2, 5, 7}, {7, 4, 2, 3}, {2, 3}};
        System.out.println(Arrays.deepToString(twoDimArray3));

        sayHello();
        sayHello();

        mySum(3, 5);
        mySum(6, 5);

        int mathOperation = mySum2(10, 2);
        int finalResult = mathOperation + 7;
        System.out.println(finalResult);

        sayNameAnd("Alex", 33);

        // ниже представлены статические мотоды (значит уже вшитые в java) которые можно использовать сразу
        // при наведении на метод и нажатии на ctrl мы проваливаемся в сам метод
//------------------------------------------------------------------------------------

        String name = "Hello  i am Alex";
        System.out.println(name.length()); // ---------1 метод .lenth() для подсчета симовлов в строке пишется с скобочками
        //  для подсчета int скобки не пишутся .lenth---------

//------------------------------------------------------------------------------------

        String text1 = "Hello ";
        String text2 = "I am Maks ";
        System.out.println(text1.concat(text2)); // 2 метод .concat для конкантенации строк

//------------------------------------------------------------------------------------

        String text3 = "    Hello world  ";
        String text4 = "    Hello world  ";
        System.out.println(text3);
        System.out.println(text4.trim());  // 3 метод .trim убирает пробелы в начале и конце строки

//------------------------------------------------------------------------------------
        String text5 = "Hello i am Maks"; // 4 метод .endsWith проверят окончание текста
        boolean and1 = text5.endsWith("Maks"); // в этом случае текст заканчивается на Max - оно вернет true
        boolean and2 = text5.endsWith("Alex"); // в этом случае текст не заканчиваеся на Max - оно вернет false
        System.out.println(and1);
        System.out.println(and2);

//------------------------------------------------------------------------------------

        String text6 = "Hello studenTs"; // 5 и 6 -й методы
        System.out.println(text6.toUpperCase(Locale.ROOT));//5 метод .toUpperCase  выводит текст в верхнем регистре
        System.out.println(text6.toLowerCase(Locale.ROOT));//6 метод .toLowerCase выводит текст в нижнем регистре

//------------------------------------------------------------------------------------


        String text7 = "Alex";
        String text8 = "Maks";
        System.out.println(text7.equals(text8)); // метод 7 equals для сравнения стрингов- возвращает true или folse

//------------------------------------------------------------------------------------

        String text9 = "Alex, Hello";
        String text10 = "Alex";
        System.out.println(text9.contains(text10)); // метод 8 .contains проверяет содержится ли определенный текст в другом тексте

//------------------------------------------------------------------------------------

        String name2 = "Hello, i am Alex";
        System.out.println(name2.charAt(0)); // метод 9 charAt возвращает символ по индексу

        System.out.println(name2.indexOf("l")); // метод  10 вернет по первому вхождению в строке, должен быть индекс 2
        System.out.println(name2.lastIndexOf("l"));// вернет индекс последнего выбранного символа из строки, например последнюю l

        System.out.println(name2.substring(5)); // метод 11 отрежет 5 первых символов и вернет все остальные
        System.out.println(name2.substring(2, 6));

        //------------------------------------------------------------------------------------

        String name3 = "Hello, i am Maks";
        System.out.println(name3.replace("Maks", "Igor")); // Метод 12 замена одного слова другим

        //------------------------------------------------------------------------------------

        String name4 = "Hello, i am Maks, I am 34";
        System.out.println(name4.replaceAll(",", "!")); // Метод 13 замена всех зяпятых восклецательными знаками или че то другим

        //------------------------------------------------------------------------------------

        String text11 = "Hello people";
        char[] arr = text11.toCharArray();
        System.out.println(arr[2]); //Метод 14 выводит символ по индексу из текстового массива

        //------------------------------------------------------------------------------------

        char[] arrChar = {'H', 'e', 'l', 'l', 'o'};
        String temp = null;
        temp = temp.copyValueOf(arrChar); //Метод 14 соединяет в выводе элементы массива
        System.out.println(temp);





    }
    // -----------------------методы которые используем в методе Main---------------------

    static void sayHello() {
        System.out.println("Hello world");
    }


    static void mySum(int a, int b) {
        int sum = a + b;
        System.out.println(sum);

    }

    static int mySum2(int a, int b) {
        int sum = a + b;
        return sum;

    }
    //метод будет выводить в консоль имя

    static void sayNameAnd(String name, int age) {
        System.out.println(name + " " + age);
    }


}
