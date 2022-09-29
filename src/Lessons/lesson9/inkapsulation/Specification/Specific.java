package Lessons.lesson9.inkapsulation.Specification;

public class Specific {
    public String fuel = "petrol"; // если удалить public то у класса bmw доступа не будет к полю fuel, public будет с дефолтным модификатором,

    public void color() {
        System.out.println("red");
    }

//    public void setFuel(String fuel){
//        this.fuel = fuel;
//    }
//
//    protected void setFuel(String s) {
//    }

//    public String getFuel();{
//
//            return fuel;
//    }
}

