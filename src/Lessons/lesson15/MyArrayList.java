package Lessons.lesson15;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;

public class MyArrayList {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();

        name.add("Alex");
        name.add("Maks");
        name.add("Jeka");

//        name.add(1,"Sasha");// добавление по индексу элемента
//
//
//        System.out.println(name.get(1)); // возвращаем элемент по индексу в консоли будет Alex
//
//        name.set(1, "Ira");
//
//        System.out.println(name.get(1)); // Sasha изменится на Иру так как мы выше заменили первый индекс на Иру
//
//        System.out.println(name.indexOf("Alex")); //возвращаем индекс элемента - будет 0 так как Алекс у нас под нулевым индексом
//        System.out.println(name.indexOf("Ira")); //возвращаем индекс элемента - -1 так как Алекс у нас под нулевым индексом

        name.remove("Alex");
        System.out.println(name.get(0));
        name.remove(0);
        System.out.println(name.get(0));
    }
}
