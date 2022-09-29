package Lessons.lesson2;

public class Main {

    public static void main(String[] args) {
        int k = 10;
        System.out.println(k);

        int m;
        m = 2 + 7;
        System.out.println(m);

        int l = 2;
        //l = l + 2; нижняя строчка это тоже самое что l += 2;

        l += 2;
        System.out.println("l =" + " " + l);

        int n = 2;
        n++;
        System.out.println("n =" + " " + n);

        int g = 2;
        g--;
        System.out.println("g =" + " " + g);

        System.out.println("------------------------------");
        int t = 2;
        int r = 2;
        int a = 2 * t++; //постфиксный инкремент, с декрементом тоже самое
        int b = 2 * ++r; // префиксный инкремент, с декрементом тоже самое
        System.out.println("a =" + " " + a++);
        System.out.println("a =" + " " + a);
        System.out.println("t =" + " " + t);
        System.out.println("b =" + " " + b);
        System.out.println("r =" + " " + r);



    }
}
