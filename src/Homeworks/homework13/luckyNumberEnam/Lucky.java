package Homeworks.homework13.luckyNumberEnam;

public class Lucky {
    public static void main(String[] args) {
        for (Interval lucky : Interval.values()) {
            if (lucky.name().equals("THREE")) {
                break;
            }
        }
    }
}
