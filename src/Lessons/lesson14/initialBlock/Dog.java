package Lessons.lesson14.initialBlock;

public class Dog {
    private String name;
    private String poroda;
    private int age;

    {
        name = "Шарик";
        poroda = "овчарка";
        age = 2;
        System.out.println("Не статтический блок инициализации");


    }

    public Dog(String name, String poroda, int age) {
        this.name = name;
        this.poroda = poroda;
        this.age = age;

    }

    public Dog() {

    }

}
