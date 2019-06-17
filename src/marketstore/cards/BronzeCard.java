package marketstore.cards;

import marketstore.cardholders.Cardholder;

public class BronzeCard extends Card {
    public BronzeCard(Cardholder cardHolder) {
        super(CardType.BRONZE, cardHolder, 0);
    }

    @Override
    public double currentRate() {
        if (getTurnover() < 100) {
            return getInitialRate();
        } else if (getTurnover() <= 300) {
            return 1;
        } else {
            return 2.5;
        }
    }
}