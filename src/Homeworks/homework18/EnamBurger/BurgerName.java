package Homeworks.homework18.EnamBurger;

public enum BurgerName {
    NAME1("Стандарт", 50),
    NAME2("Двойной соус, котлета, сыр", 110),
    NAME3("Двойной соус", 60),
    NAME4("Двойная котлета", 80),
    NAME5("Двойной сыр", 70),
    NAME6("Двойной соус и сыр", 80),
    NAME7("Двойной соус и котлета", 90),
    NAME8("Двойная котлета и сыр", 100);


    private int price;
    private String nameBurger;


    BurgerName(String nameBurger, int price) {

        this.nameBurger = nameBurger;
        this.price = price;

    }

    public String getNameBurger() {
        return nameBurger;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "BurgerName{" +
                "price=" + price +
                ", nameBurger='" + nameBurger + '\'' +
                '}';

    }
}
