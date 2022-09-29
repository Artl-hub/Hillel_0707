package Lessons.lesson15;

public class Zadachi15 {
    public static void main(String[] args) {
        String s1 = "a1";
        String s2 = "a" + 1;
        System.out.println(s1.equals(s2));
//---------------------------------------------------
        int i;
        int o = 12;
        for (i = 1; i <= 10; i++) {
            o--;

        }
        System.out.println(o);
        //---------------------------------------------------
        String s = "hello";
        s = s.concat("world");
        System.out.println(s);

        String a = "Alex teacher";
        System.out.println(a.equals("alex teacher"));
        //---------------------------------------------------

        int[] [] arr ={{0, 1, 2}, {0, 1, 2, 3, 4, 5}};
        System.out.println(arr[1][2]);
        //---------------------------------------------------





    }
}
