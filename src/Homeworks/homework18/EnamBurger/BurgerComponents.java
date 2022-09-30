package Homeworks.homework18.EnamBurger;

import java.util.HashMap;
import java.util.Map;

public enum BurgerComponents {
    sauce(1, 10),
    cheese(2,20),
    cutlet(3, 30);


    private int numComponent;
    private int price;


    BurgerComponents(int numComponent, int price) {
        this.numComponent = numComponent;
        this.price = price;
    }

    private static final Map<Integer,BurgerComponents> map;
    static {
        map = new HashMap<Integer,BurgerComponents>();
        for (BurgerComponents v : BurgerComponents.values()) {
            map.put(v.numComponent, v);
        }
    }

    public static BurgerComponents findByKey(int i) {
        return map.get(i);
    }
    public int getNumComponent() {
        return numComponent;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "BurgerComponents{" +
                "numComponent=" + numComponent +
                ", price=" + price +
                '}';
    }
}






