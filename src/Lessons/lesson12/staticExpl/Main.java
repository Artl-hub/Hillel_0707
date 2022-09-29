package Lessons.lesson12.staticExpl;

public class Main {
    public static void main(String[] args) {
        Car.myStatic += 20;
        System.out.println(Car.myStatic);

        Car c1 = new Car();
        System.out.println("Статическая переменная объекта с1 " + c1.myStatic);
        c1.nonStatic +=20;
        System.out.println("Статическая переменная объекта с1 " + c1.nonStatic);

        Car c2 = new Car();
        System.out.println("Статическая переменная объекта с2 " + c2.myStatic);
        System.out.println("Статическая переменная объекта с2 " + c2.nonStatic);

    }
}
