package Lessons.lesson13.emumExample;

public enum Country {
    CANADA("CAD"),
    POLAND("PLN"),
    GERMANY("EUR"),
    ZIMBVU;

    String currency;

    Country() { //не явный конструктор

    }

    Country(String currency){ //явный конструктор
        this.currency =currency;
    }
}
