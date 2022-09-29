package Lessons.lesson11;

public class Zadachi {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        a = a + ++b;
        System.out.println(a + b);

        int x = 1;
        int y = 1;
        int z = 0;
        if (!(x++ > 1 & y++ > 1)) {
            z = x + y;
        }
        System.out.println(z);

        int t = 3;
        int c = 2;
        t = c;
        System.out.println(t + c);

        String[] p = {"M", "a", "k", "s"};
        String[] q = p;
        q[0] = "j";
        q[1] = "o";
        for (String s : q) {
            System.out.println(s);
        }

        int xx = 4;
        for (int i = 2; i <= 5; i++) {
            if (i % 2 == 0){
                xx = xx + i;
            }
        }
        System.out.println(xx);

        int sum = 0;
        int bum = 0;
        for (int i =1; i <=5; ++i)
            sum += i;
        for (int i = 1; i <= 5; i++)
            bum += i;
        if (sum ==bum)
            System.out.println("1");
        else
            System.out.println("0");


    }
}
