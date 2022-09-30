package Homeworks.homework18.EnamBurger;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




public class Burger {
    public static void main(String[] args) {
        List<String> components = new ArrayList<>();
        String yesNo = "";
        do {
            System.out.println("Желаете выбрать доп. ингредиенты для бургера? Пожалуйста введите \"yes\" или \"no\" ");
            yesNo = getYesNo();
            if (yesNo.equals("yes")){
                System.out.println("Выбирите доп. ингридиент: \n1. sauce \n2. cheese \n3.cutlet \n" +
                        " Введите номер или название компонента и нажмитее \"Enter\"");
                components.add(getNameComponent());
            }
        } while (!yesNo.equals("no"));


        int result = sumComponents(components);
        System.out.println("Бургер стоит " + result);
    }


    public static int sumComponents(List<String> components) {
        int price = 50;
        String getNameComponent = null;
        System.out.println("Base price : " + price);
        for (String item: components){
            BurgerComponents ingridient = BurgerComponents.findByKey(Integer.parseInt(item));
            System.out.println(ingridient.name() + " : " + ingridient.getPrice());
            price += BurgerComponents.findByKey(Integer.parseInt(item)).getPrice();
        }
        System.out.println("-----------");
        return price;
    }

    public static String getYesNo() {
        Scanner scanner = new Scanner(System.in);

        String getYesNo = scanner.nextLine();
        return getYesNo;

    }

    public static String getNameComponent() {
        Scanner scanner = new Scanner(System.in);

        String getNameComponent = scanner.nextLine();
        return getNameComponent;

    }

}
