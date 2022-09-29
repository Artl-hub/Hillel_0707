package Homeworks.homework11;

import java.util.Scanner;

public class TestCalculator {

    /*
    Метод int getInt() - должен считывать с консоли целое число и возвращать его
Метод char getOperation() - должен считывать с консоли какое-то значение и возвращать символ с операцией (+, -, * или /)
Метод int calc(int num1, int num2, char operation) - должен выполнять над числами num1 и num2 арифметическую операцию,
заданную operation.
Метод main() - должен считывать 2 числа (с помощью getInt()), считать операцию
(с помощью getOperation(), передать все методу calc() и вывести на экран результат*/


    public static void main(String[] args) {


        System.out.println("Введите первое число и нажмите \"Enter\"");

        int num1 = getInt();
        System.out.println("Введите второе число и нажмите \"Enter\"");
        int num2 = getInt();

        System.out.println("Выбирете оператор \"+\", \"-\", \"*\" или \"/\" и нажмите \"Enter\"");
        char operation = getOperation();

        int result = calc(num1, num2, operation);
        System.out.println(num1 + " " + operation + " " + num2 + " = " + result);
    }

    public static int calc(int num1, int num2, char operation) {
        switch (operation) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return num1 / num2;
        }
        System.out.println("Error");
        return 0;


    }


    public static int getInt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }


    public static char getOperation() {
        Scanner scanner = new Scanner(System.in);

        String operation = scanner.nextLine();
        return operation.charAt(0);


    }



}









