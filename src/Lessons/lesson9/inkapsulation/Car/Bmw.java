package Lessons.lesson9.inkapsulation.Car;

import Lessons.lesson9.inkapsulation.Specification.Specific;

public class Bmw extends Specific {
    public static void main(String[] args) {
        Specific specific = new Specific();
        specific.color();
        System.out.println(specific.fuel);

        specific.fuel = "Diesel";
        System.out.println(specific.fuel);
        //если вывести другой класс от специфика то будет уже петрол

        Specific specific2 = new Specific();
        System.out.println(specific2.fuel);




    }
}
