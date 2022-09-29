package Lessons.lesson10;

public class Zadachisobes {
    public static void main(String[] args) {
        int a = 73;
        int b = 39;
        a = a + b;

        b = a - b;
        a = a - b;
        System.out.println(a);
//----------------------------------
        System.out.println("-------------------------------");
        int x = 0;
        int[] arr = {2, 3, 5};
        arr[x] = ++x;
        System.out.println(arr[x]);

//        for (int a : arr){
//            System.out.println(a);
//        }


        System.out.println("-------------------------------");

        int n = 0;
        int j = 7;
        int i = 3;
        if (i > 2) {
            n = 1;
            if (j > 4) {
                n = 2;
            } else {
                n = 3;
            }
        } else {
            if (j % 2 >= 2) {
                n = 5;
            }
        }
        System.out.println(n);
        System.out.println("-------------------------------");

        int q = 1;
        int y = 1;
        System.out.println("" + q + y);
        System.out.println("-------------------------------");

        int w = 4;
        int u = 2;
        System.out.println(4 % 2);

        System.out.println("-------------------------------");

        String text = "hi i am Maks";
        int l = text.length();
        System.out.println(l % 6);

        System.out.println("-------------------------------");

        int count=1;
        do {
            count +=3;

        }while (count<5);
        System.out.println(count);

    }

}









