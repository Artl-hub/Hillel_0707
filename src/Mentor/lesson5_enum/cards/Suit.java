package Mentor.lesson5_enum.cards;

public enum Suit {

    DIAMONDS(9),
    CLUBS(9),
    HEARTS(9),
    SPADES(9);

    private int cardCount;


    Suit(int cardCount) {
        this.cardCount = cardCount;
    }

    public int getCardCount() {
        return cardCount;
    }
}

