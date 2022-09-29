package Lessons.lesson13.abstractExample;

public class Honda extends Car {
    @Override
    String maxSpeed() {
        return null;
    }

    @Override
    void drive() {

    }

    @Override
    void brake() {


    }

    public void aboutBmw(String[] args) {
        System.out.println("This is BMW");
        System.out.println("Wheels count ");
        countWheels();
    }
}
