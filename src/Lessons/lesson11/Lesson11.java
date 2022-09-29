package Lessons.lesson11;

public class Lesson11 {
    public static void main(String[] args) {
        // Операторы и или
        int mouse;
        int weight;
        mouse = 5;
        weight = 45;
        if (mouse !=0 & weight < 100) {
            System.out.println("Можно кормить кота");
        }else {
            System.out.println("Error");
        }

        if (mouse == 7 | weight < 100) {
            System.out.println("Можно кормить кота");
        }else {
            System.out.println("Error");
        }


        int a = 10;
        if (++a == 10 && ++a == 12){
            ++a;
        }
        System.out.println(a);
    }
}
