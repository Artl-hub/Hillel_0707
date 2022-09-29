package Lessons.lesson6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String text = "Hello i am MAks";

        if (text.equals("Hello i am Maks")) { //Метод обращает внимание на структуру на регистр
            System.out.println("Ok");
        } else {
            System.out.println("Fail");
        }
        //-----------------------------------------------------------------------------

        if (text.equalsIgnoreCase("Hello i am Maks")) { //Метод equalsIgnoreCase сравнивает не обращая на регистр equalsIgnoreCase
            System.out.println("Ok");
        } else {
            System.out.println("Fail");
        }

        String text2 = "Hello i am Alex";
        System.out.println(text2.indexOf("l")); //1 Метод indexOf   возвращает индекс первого вхождения 2
        System.out.println(text2.lastIndexOf("l"));// возвращает lastIndexOf индекс последнего вхождения 12

        int num = 1256341;
        String temp = String.valueOf(num); //2 Метод valueOf преобразовывает число в текст
        System.out.println(temp);

        String num2 = "45463"; //привеведением типов не можем привести
        int temp2 = Integer.parseInt(num2); // Класс оболочки Integer.parseInt один из способов - приведение string в int
        System.out.println(temp2);

        double num3 = 5.49999;
        System.out.println(Math.round(num3)); // Метод Math.round округляет до ближайшего целого числа
        System.out.println(Math.floor(num3));// Метод Math.floor округляет до ближайшего меньшего числа и вернет duble 5.0
        System.out.println(Math.ceil(num3));// Метод Math.ceil округляет до ближайшего верхнего числа и вернет duble 6.0
//------------------------------------------------------------
//--------------------Формула n-i-1---------------------------------
        String[] myArr = {"Привет", "меня", "зовут", "Макс"};
        reverseArray(myArr);
        //  задача сделать такой порядок -Макс зовут меня Привет


    }

    // ниже запись вне главного метода
    public static void reverseArray(String[] arr) { // в параметр мы записали какую переменную может принимать этот метод. В данном случае
        int n = arr.length;
        System.out.println(n);

        String temp; // Maks - лежит здесь
        //[n-i-1] n- длинна массива; i - итератор

        for (int i = 0; i < n / 2; i++) {
            temp = arr[n - i - 1];   // в первой итерации записывается  Макс arr[3]
            arr[n - i - 1] = arr[i]; // в перовой итерацииа arr[0] = Привет  {"Привет", "меня", "зовут", "Привет"};
            arr[i] = temp; // arr[0] = {"Макс", "меня", "зовут", "Привет"};
        }

        for (String str : arr) { // используют для работы с массивами и колекциями, переменная равна каждому елементу массива
            System.out.print(str + " ");

        }
//--------------------------------------------------------------
//        public static void countWords() {
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Введите строку в консоль");
//
//            String input = scanner.nextLine();
//
//            int count = 0;
//
//            if (input.length() != 0) +{
//                count++;
//
//                for (int i = 0; i < input.length(); i++) {
//                    if (input.charAt(i) == ' ') {
//                        count++;
//                    }
//                }
//            }
//        }
    }

}
