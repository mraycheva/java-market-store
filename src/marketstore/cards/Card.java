package marketstore.cards;

import marketstore.cardholders.Cardholder;

public abstract class Card {
    private CardType cardType;
    private Cardholder cardholder;
    private double initialRate;
    private double turnover;

    Card(CardType cardType, Cardholder cardHolder, double initialRate) {
        this.cardType = cardType;
        this.cardholder = cardHolder;
        this.initialRate = initialRate;
    }

    public abstract double currentRate();

    double getInitialRate() {
        return initialRate;
    }

    Cardholder getCardholder() {
        return cardholder;
    }

    double getTurnover() {
        return turnover;
    }

    public void setTurnover(double turnover) {
        this.turnover = turnover;
    }

    public CardType getCardType() {
        return cardType;
    }
}